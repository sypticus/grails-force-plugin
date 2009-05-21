package com.riptideforce.sfdc

import com.sforce.soap.partner.*
import com.sforce.soap.partner.DescribeSObjectResult
import org.springframework.beans.factory.InitializingBean
import org.codehaus.groovy.grails.commons.ConfigurationHolder
import com.sforce.soap.partner.sobject.SObject


class SalesForceBaseService implements InitializingBean {

    def String userName
    def String password
    def boolean loggedIn
    def SforceServiceStub serviceStub
    def SessionHeader sessionHeader


    void afterPropertiesSet() {
        this.userName = ConfigurationHolder.config.salesforce.user
        this.password = ConfigurationHolder.config.salesforce.password
    }

    /*
     * Login to the Sales force instance
     */
    protected boolean login() {

        this.serviceStub = new SforceServiceStub();
        Login login = new Login();
        login.setUsername( this.userName );
        login.setPassword( this.password );

        try {
            System.out.println("LOGGING IN...");
            LoginResponse response =
                this.serviceStub.login(login, null, null);
            LoginResult loginResult =
                response.getResult();

            this.loggedIn = true;

            if( this.loggedIn ) {
                System.out.println("LOGGED IN SUCCESSFULLY");

                // Keep the session header
                sessionHeader = new SessionHeader();
                sessionHeader.setSessionId(loginResult.getSessionId());

                // Reconnect with the new server url
                this.serviceStub = new SforceServiceStub(loginResult.getServerUrl());
            }
        }
        catch( InvalidIdFault flt ) {
            this.loggedIn = false;
            System.out.println("InvalidIdFault caught while attempting to log into SalesForce.");
            System.out.println(flt.getFaultMessage());
        }
        catch( UnexpectedErrorFault flt ) {
            this.loggedIn = false;
            System.out.println("UnexpectedErrorFault caught while attempting to log into SalesForce.");
            System.out.println(flt.getFaultMessage());
        }
        catch( LoginFault flt ) {
            this.loggedIn = false;
            System.out.println("LoginFault caught while attempting to log into SalesForce.");
            System.out.println(flt.getFaultMessage());
        }

        return this.loggedIn;
    }
    
    /*
     * Return the Session Header
     */
    protected SessionHeader getSessionHeader() {
        return this.sessionHeader
    }


    /*
     * Return all the registered instance object names
     */
    def String[] getObjectNames() {

        if(!this.loggedIn) {
            if(!login()) {
                return null;
            }
        }

        DescribeGlobal params = new DescribeGlobal();
        try {
            DescribeGlobalResponse response =
                this.serviceStub.describeGlobal( params, this.sessionHeader, null );
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

        if(!this.loggedIn) {
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
                this.serviceStub.describeSObjects(params, this.sessionHeader, null, null)
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

        if (!this.loggedIn) {
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
            this.serviceStub.query(params, this.sessionHeader, null, null, null);

            if (response != null && response.getResult() != null){
                return response.getResult().getRecords();
            }
        }
        catch (Exception e) {
            e.printStackTrace()
        }
        return null;
    }

    /*
     * Fetch a single object. If more than one is specified for the query,
     * the first one is returned.
     */
    protected SObject fetch(String query){
        if (!this.loggedIn) {
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
                this.serviceStub.query(params, this.sessionHeader, null, null, null);
            if( response != null ) {
                qr = response.getResult()
            }

        } catch (Exception e) {
            e.printStackTrace()
        }
        // Return the first SObject if there are any
        if (qr != null){
            List<SObject> records = qr.getRecords();
            if (!records.isEmpty()) {
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

        if (!this.loggedIn) {
            if (!login()) {
                return null
            }
        }
        if (o == null){
            println "SObject passed for creation was null"
            return null
        }


        try {

            Create createParams = new Create();
            createParams.setSObjects( objs );

            CreateResponse createResp =
                serviceStub.create( createParams, sessionHeader, null, null, null, null, null );


            SaveResult[] saveResults = createResp.getResult();

            if (saveResults != null){
                return saveResults;
            }
            else {
                log.error("The create SaveResult was null")
                System.out.println("The create SaveResult was null");
            }
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

        if (!this.loggedIn) {
            if (!login()) {
                return null;
            }
        }


        try{

            Update updateParams = new Update();
            updateParams.setSObjects( objs );

            UpdateResponse updateResp =
                serviceStub.update( updateParams, sessionHeader, null, null, null, null, null );
            SaveResult[] saveResults = updateResp.gtResult();

            if (saveResults != null){
                return saveResults;
            }
            else {
                System.out.println("The create SaveResult was null");
            }
        }
        catch (Exception ex){
            ex.printStackTrace()
        }

        return null;
    }


    /*
     * Deletes a series of SObjects given multiple Ids
     */
    private DeleteResult[] delete(String ... ids){
	    if (!this.loggedIn) {
            if (!login()) {
                return;
            }
        }

        Delete deleteParams = new Delete();
        DeleteResponse deleteResp =
            serviceStub.delete(deleteParams, sessionHeader, null, null, null, null);
        DeleteResult[] deleteResults = deleteResp.getResult();

        if (deleteResults != null) {
            return deleteResults;
        }
        else {
            System.out.println("The DeleteResults were null");
        }
        return null;
    }

}
