package com.riptideforce.sfdc

import com.sforce.soap.partner.*

import org.springframework.beans.factory.InitializingBean
import org.codehaus.groovy.grails.commons.ConfigurationHolder
import com.sforce.soap.partner.sobject.SObject
import grails.util.GrailsUtil


class SalesForceBaseService implements InitializingBean {

    /** Maximim number of updateable objects in a single call */
    private static final int BATCH_UPDATE_LIMIT = 200;

    def String userName
    def String password
    def boolean isSandbox = false
    def SforceServiceStub serviceStub
    def SessionHeader sessionHeader
    def String sessionId
    def GetUserInfoResult userInfo
    def long lastLoginTimestamp
    def long loginThreshold


    void afterPropertiesSet() {
        
        // Check for environment based configuration first
        def env = GrailsUtil.getEnvironment()
        
        if( ConfigurationHolder.config.salesforce."${env}" ) {
            this.userName = ConfigurationHolder.config.salesforce."${env}".user
            this.password = ConfigurationHolder.config.salesforce."${env}".password
            if( ConfigurationHolder.config.salesforce."${env}".loginThreshold ) {
                this.loginThreshold = ConfigurationHolder.config.salesforce."${env}".loginThreshold
            }
            else {
                this.loginThreshold = 3600000
            }
            
            if( ConfigurationHolder.config.salesforce."${env}".sandbox ) {
                this.isSandbox = ConfigurationHolder.config.salesforce."${env}".sandbox
            }
        }
        // Otherwise, check for the absolute configuration 
        // (Deprecated. Only for backwards compatibility)
        else {
            this.userName = ConfigurationHolder.config.salesforce.user
            this.password = ConfigurationHolder.config.salesforce.password
            if( ConfigurationHolder.config.salesforce.loginThreshold ) {
                this.loginThreshold = ConfigurationHolder.config.salesforce.loginThreshold
            }
            else {
                this.loginThreshold = 3600000
            }
            
            if( ConfigurationHolder.config.salesforce.sandbox ) {
                this.isSandbox = ConfigurationHolder.config.salesforce.sandbox
            }
        }
    }


    /*
     * Breaks an array in segments and returns a list of these segments
     */
    private List segment( Object[] array, int breakSize ) {
        def objSegments = []
        int idx = 0;
        while( idx < array.length ) {
            int end = Math.min(idx + breakSize - 1, array.length - 1)
            objSegments << array[idx..end]

            idx += breakSize
        }

        return objSegments
    }


    /*
     * Check if Login is required
     */
    protected boolean loginRequired() {

        if( sessionHeader == null ) {
            return true;
        }
        else if( System.currentTimeMillis() - lastLoginTimestamp > this.loginThreshold ) {
            return true;
        }

        return false;
    }

    /*
     * Login to the Sales force instance
     */
    protected boolean login() {

        if(this.isSandbox) {
            this.serviceStub = new SforceServiceStub("https://test.salesforce.com/services/Soap/u/16.0");
        }
        else {
            this.serviceStub = new SforceServiceStub();
        }
        
        Login login = new Login();
        login.setUsername( this.userName );
        login.setPassword( this.password );

        boolean loggedIn = false;

        try {
            System.out.println("LOGGING IN...");
            LoginResponse response =
                this.serviceStub.login(login, null, null);
            LoginResult loginResult =
                response.getResult();

            // An unsuccesful login should cause a LoginFault and skip this code
            System.out.println("LOGGED IN SUCCESSFULLY");
            loggedIn = true;
            this.lastLoginTimestamp = System.currentTimeMillis();

            // Keep the session header
            sessionHeader = new SessionHeader();
            sessionHeader.setSessionId(loginResult.getSessionId());

            // Reconnect with the new server url and options
            this.serviceStub = new SforceServiceStub(loginResult.getServerUrl());

            // set configuration options for the stub
            serviceStub._getServiceClient().getOptions().setManageSession(true);
            serviceStub._getServiceClient().getOptions().setTimeOutInMilliSeconds(this.loginThreshold);
        }
        catch( InvalidIdFault flt ) {
            System.out.println("InvalidIdFault caught while attempting to log into SalesForce.");
            System.out.println(flt.getFaultMessage().getInvalidIdFault().getExceptionMessage());
        }
        catch( UnexpectedErrorFault flt ) {
            System.out.println("UnexpectedErrorFault caught while attempting to log into SalesForce.");
            System.out.println(flt.getFaultMessage().getUnexpectedErrorFault().getExceptionMessage());
        }
        catch( LoginFault flt ) {
            System.out.println("LoginFault caught while attempting to log into SalesForce.");
            System.out.println(flt.getFaultMessage().getLoginFault().getExceptionMessage());
        }

        return loggedIn;
    }
    
    
    /**
     * Manually sets the Session id
     */
    public void setSessionId( String sId ) {
        // Create the session Header
        this.sessionHeader = new SessionHeader();
        sessionHeader.setSessionId(sId);
        
        // Inactivate the login timeout (it should be manually controlled)
        this.lastLoginTimestamp = System.currentTimeMillis()
        this.loginThreshold = -1
    }
    
    
    /*
     * Return the Session Header
     */
    protected SessionHeader getSessionHeader() {
        return this.sessionHeader
    }


    /*
     * Returns the user Id from the Salesforce instance
     */
    def String getUserId() {

        // Log in if not done before
        if(this.loginRequired()) {
            if(!login()) {
                return null;
            }

            this.userInfo = null; // Reset the user info
        }

        // Get the user info if not done yet
        if( this.userInfo == null ) {
            GetUserInfo params = new GetUserInfo();

            this.userInfo = serviceStub.getUserInfo(params, this.sessionHeader, null).getResult();
        }

        return this.userInfo.getUserId().getID();
    }


    /*
     * Return all the registered instance object names
     */
    def String[] getObjectNames() {

        if(this.loginRequired()) {
            if(!login()) {
                return null;
            }
        }

        DescribeGlobal params = new DescribeGlobal();
        try {
            DescribeGlobalResponse response =
                this.serviceStub.describeGlobal( params, this.sessionHeader, null, null );
            DescribeGlobalResult result = response.getResult();

            return result.getTypes();
        }
        catch( UnexpectedErrorFault flt ) {
            System.out.println("UnexpectedErrorFault caught:");
            System.out.println(flt.getFaultMessage());
        }
        catch( java.rmi.RemoteException ex ) {
            System.out.println("RemoteException caught:");
            System.out.println(ex.getMessage());
        }

        return null
    }


    /*
     * Print all the registered object names
     */
    def dumpObjectNames() {
        String[] types = this.getObjectNames();
        for( String type : types ) {
            System.out.println( type );
        }
    }
    
    
    /*
     * Print a description for the given object name
     */
    def dumpObjectDescription( String objectName ) {
        
        DescribeSObjectResult[] results = getFieldsForObjectTypes( objectName )
        DescribeSObjectResult result = results[0];

        println "Fields for ${objectName}:"
        result.getFields().each() { field ->
            println field.getName() + " - TYPE: " + field.getType().toString()
        }
    }


    /*
     * Return a description for the given object names
     */
    protected DescribeSObjectResult[] getFieldsForObjectTypes( String[] typeNames ) {

        if(this.loginRequired()) {
            if(!login()) {
                return null
            }
        }

        System.out.println("Loading Objects from Salesforce...");

        // Process in 100-element segments as the Salesforce service does not
        // allow more than that
        int totalTypes = typeNames.length;
        int totalSegments = totalTypes / 100;

        if( totalTypes % 100 > 0 ) {
            totalSegments++;
        }

        // global results
        DescribeSObjectResult[] globalResults =
        new DescribeSObjectResult[ totalTypes ];

        // each 100-element segment
        for( int s = 0; s < totalSegments; s++ ) {

            // segment size
            int segmentSize;
            if( s == totalSegments - 1 ) {
                segmentSize = totalTypes % 100;
            }
            else {
                segmentSize = 100;
            }

            // Segment
            String[] typesSegment = new String[segmentSize];


            // each type within a segment
            for( int i = 0 ; i<segmentSize; i++ ) {

                // adjusted index
                int adjIdx = s*100 + i;

                typesSegment[i] = typeNames[adjIdx];
            }

            // once the segment is built, make the call
            DescribeSObjectResult[] partialResults;
            try {
                DescribeSObjects params = new DescribeSObjects()
                params.setSObjectType( typesSegment )

                DescribeSObjectsResponse response =
                this.serviceStub.describeSObjects(params, this.sessionHeader, null, null, null)
                partialResults = response.getResult()

            }
            catch( InvalidSObjectFault flt ) {
                System.out.println("InvalidSObjectFault caught:");
                System.out.println(flt.getFaultMessage());
                return null
            }
            catch( UnexpectedErrorFault flt ) {
                System.out.println("UnexpectedErrorFault caught:");
                System.out.println(flt.getFaultMessage());
                return null
            }
            catch( java.rmi.RemoteException ex ) {
                System.out.println("RemoteException caught:");
                System.out.println(ex.getMessage());
                return null
            }

            // Add the results to the global set of results
            for( int i = 0 ; i<partialResults.length; i++ ) {
                // adjusted index
                int adjIdx = s*100 + i;

                globalResults[adjIdx] = partialResults[i];
            }

        }

        System.out.println("Finished loading Salesforce objects.");

        return globalResults
    }


    // Base SObject services ***************************************************

    /*
     * Fetch a list of objects
     */
    public List<SObject> fetchAll(String query){

        if (this.loginRequired()) {
            if (!login()) {
                return null;
            }
        }

        if (query == null){
            return null
        }
        try {
            println "FetchAll Query: " + query

            Query params = new Query()
            params.setQueryString(query)

            QueryResponse response =
            this.serviceStub.query(params, this.sessionHeader, null, null, null, null);

            if (response != null && response.getResult() != null){
                
                // Collect all the results if it exceeds the API source limits
                def allRecords = []
                if( response.getResult().getRecords() != null ) {
                    allRecords += response.getResult().getRecords() as List
                }
                boolean done = response.getResult().getDone()
                def qLocator = response.getResult().getQueryLocator()
                                  
                while(!done) {
                    QueryMore moreParams = new QueryMore()
                    moreParams.setQueryLocator( qLocator )
                    
                    def moreResponse = this.serviceStub.queryMore (moreParams, sessionHeader, null, null)
                    done = moreResponse.getResult().getDone()
                    qLocator = moreResponse.getResult().getQueryLocator()
                    
                    allRecords += moreResponse.getResult().getRecords() as List
                }
                
                return allRecords
            }
        }
        catch (Exception e) {
            e.printStackTrace()
        }
        return null;
    }
    
    
    /**
     * Fetches based on a query locator. This is for batched queries.
     * @param query Query to fetch. May be null if a query locator is being provided
     * @param locator The locator where to start searching (null if this is the first batch)
     */
    protected List<SObject> fetchNextBatch(BatchedQuery batch) {
        
        if (this.loginRequired()) {
            if (!login()) {
                return null;
            }
        }

        // The locator or the query must be provided
        if ( batch.query == null && batch.currentQueryLocator == null){
            throw new RuntimeException("Either a QueryLocator or a Salesforce query must be provided")
        }
        // If the query is given, and the not the locator
        else if( batch.query != null && batch.currentQueryLocator == null ) {
            println "FetchBatch Query: " + batch.query

            Query params = new Query()
            params.setQueryString(batch.query)

            QueryResponse response =
            this.serviceStub.query(params, this.sessionHeader, null, null, null, null);
            
            // Update the batched query
            batch.currentQueryLocator = response.getResult().getQueryLocator()
            batch.done = response.getResult().getDone()

            // check for empty results
            if( response.getResult().getRecords() != null ) {
                return response.getResult().getRecords() as List
            }
            else {
                return []
            }
        }
        // Otherwise, the query locator is given
        else {
            QueryMore moreParams = new QueryMore()
            moreParams.setQueryLocator( batch.currentQueryLocator )
            
            QueryMoreResponse moreResponse = 
                this.serviceStub.queryMore (moreParams, sessionHeader, null, null)
                
            // Update the batched query
            batch.currentQueryLocator = moreResponse.getResult().getQueryLocator()
            batch.done = moreResponse.getResult().getDone()

            // check for empty results
            if( moreResponse.getResult().getRecords() != null ) {
                return moreResponse.getResult().getRecords() as List
            }
            else {
                return []
            }
        }
        
        
    }


    /*
     * Fetch a single object. If more than one is specified for the query,
     * the first one is returned.
     */
    protected SObject fetch(String query){
        if (this.loginRequired()) {
            if (!login()) {
                return null;
            }
        }
        if (query == null){
            return null
        }
        QueryResult qr = null;

        // call the query saving the results in qr
        try {
            println "Fetch Query: " + query

            Query params = new Query()
            params.setQueryString(query)

            QueryResponse response =
                this.serviceStub.query(params, this.sessionHeader, null, null, null, null);
            if( response != null ) {
                qr = response.getResult()
            }

        } catch (Exception e) {
            e.printStackTrace()
        }
        // Return the first SObject if there are any
        if (qr != null){
            List<SObject> records = qr.getRecords();
            if (records && !records.isEmpty()) {
                for (SObject sobj : records) {
                    return sobj;
                }
            }
        }
        else {
            return null;
        }
    }


    /*
     * Creates a new set of objects
     */
    protected SaveResult[] create(SObject ... objs){

        if (this.loginRequired()) {
            if (!login()) {
                return null
            }
        }
        if (objs == null){
            println "SObject passed for creation was null"
            return null
        }

        // Break the array of objects
        def objSegments = this.segment(objs, BATCH_UPDATE_LIMIT)


        try {

            // SaveResults object
            def cumulativeResults = []

            // For each segment, make a call to the Salesforce API
            objSegments.each { segment ->

                Create createParams = new Create();
                createParams.setSObjects( segment as SObject[] );

                CreateResponse createResp =
                    serviceStub.create( createParams, sessionHeader, null, null, null, null, null, null, null );


                SaveResult[] saveResults = createResp.getResult();

                if (saveResults != null){
                    cumulativeResults += saveResults as List;
                }
                else {
                    log.error("The create SaveResult was null")
                    System.out.println("The create SaveResult was null");
                }
            }

            // Return the cumulative results
            return cumulativeResults as SaveResult[]
        }
        catch (Exception ex) {
            ex.printStackTrace()
        }

        return null;
    }


    /*
     * Updates a set of SObjects
     */
    protected SaveResult[] update(SObject ... objs){

        if (this.loginRequired()) {
            if (!login()) {
                return null;
            }
        }

        // Break the object array into segments
        def objSegments = this.segment(objs, BATCH_UPDATE_LIMIT)

        try{
            // SaveResults object
            def cumulativeResults = []
            
            // For each object Segment, make one update call
            objSegments.each { segment ->

                Update updateParams = new Update();
                updateParams.setSObjects( segment as SObject[] );

                UpdateResponse updateResp =
                    serviceStub.update( updateParams, sessionHeader, null, null, null, null, null, null, null );
                SaveResult[] saveResults = updateResp.getResult();

                if (saveResults != null){
                    cumulativeResults += saveResults as List;
                }
                else {
                    System.out.println("The create SaveResult was null");
                }
            }

            // Return the cumulative results
            return cumulativeResults as SaveResult[]

        }
        catch (Exception ex){
            ex.printStackTrace()
        }

        return null;
    }


    /*
     * Deletes a series of SObjects given multiple Ids
     */
    public SalesforceResponse delete(String ... ids){
        if (this.loginRequired()) {
            if (!login()) {
                return;
            }
        }

        // Break the object array into segments
        def idSegments = this.segment(ids, BATCH_UPDATE_LIMIT)

        // Cumulative Results
        def cumulativeResults = []

        // For each id segment, make a delete call
        idSegments.each { segment ->
            Delete deleteParams = new Delete();
            
            for( String id : segment ) {
                ID newId = new ID();
                newId.setID(id);
                deleteParams.addIds( newId );
            }

            DeleteResponse deleteResp =
                serviceStub.delete(deleteParams, sessionHeader, null, null, null, null, null, null);
            DeleteResult[] deleteResults = deleteResp.getResult();

            if (deleteResults != null) {
                cumulativeResults += deleteResults as List;
            }
            else {
                System.out.println("The DeleteResults were null");
            }
            
        }
        
        // Convert to an OperationResult object
        def results = []
        cumulativeResults.eachWithIndex { it, idx ->
            
            OperationResult objResult = new OperationResult();
            
            objResult.setSuccess(it.success)
            objResult.setTargetSalesforceId(it.getId()?.getID())
            
            if(!it.success) {
                for( Error err : it.getErrors() ) {
                    objResult.getErrors().add(err.getMessage())
                } 
            }
            
            results << objResult
        }
        
        // Return a SF response
        return new SalesforceResponse(results)
    }

    
    /**
     * Overloading method that takes a list of objects
     */
    public SalesforceResponse delete( List objIds ) {
        return this.delete( objIds as String[] )
    }
}
