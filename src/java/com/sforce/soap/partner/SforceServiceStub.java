
/**
 * SforceServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5  Built on : Apr 30, 2009 (06:07:24 EDT)
 */
        package com.sforce.soap.partner;

        

        /*
        *  SforceServiceStub java implementation
        */

        
        public class SforceServiceStub extends org.apache.axis2.client.Stub
        implements SforceService{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("SforceService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[30];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "search"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "resetPassword"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieve"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "process"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "undelete"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryMore"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getDeleted"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "logout"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryAll"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLead"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "setPassword"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[14]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSoftphoneLayout"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[15]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "invalidateSessions"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[16]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObject"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[17]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeTabs"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[18]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObjects"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[19]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getUserInfo"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[20]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "emptyRecycleBin"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[21]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeGlobal"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[22]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sendEmail"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[23]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "query"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[24]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "login"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[25]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[26]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getServerTimestamp"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[27]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getUpdated"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[28]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeLayout"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[29]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.fault.InvalidFieldFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.fault.InvalidFieldFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedSearchFault"),"com.sforce.soap.partner.MalformedSearchFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedSearchFault"),"com.sforce.soap.partner.MalformedSearchFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedSearchFault"),"com.sforce.soap.partner.fault.MalformedSearchFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.fault.InvalidFieldFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedQueryFault"),"com.sforce.soap.partner.MalformedQueryFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedQueryFault"),"com.sforce.soap.partner.MalformedQueryFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedQueryFault"),"com.sforce.soap.partner.fault.MalformedQueryFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.fault.InvalidFieldFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.fault.InvalidFieldFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidQueryLocatorFault"),"com.sforce.soap.partner.InvalidQueryLocatorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidQueryLocatorFault"),"com.sforce.soap.partner.InvalidQueryLocatorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidQueryLocatorFault"),"com.sforce.soap.partner.fault.InvalidQueryLocatorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedQueryFault"),"com.sforce.soap.partner.MalformedQueryFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedQueryFault"),"com.sforce.soap.partner.MalformedQueryFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedQueryFault"),"com.sforce.soap.partner.fault.MalformedQueryFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.fault.InvalidFieldFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidQueryLocatorFault"),"com.sforce.soap.partner.InvalidQueryLocatorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidQueryLocatorFault"),"com.sforce.soap.partner.InvalidQueryLocatorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidQueryLocatorFault"),"com.sforce.soap.partner.fault.InvalidQueryLocatorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidNewPasswordFault"),"com.sforce.soap.partner.InvalidNewPasswordFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidNewPasswordFault"),"com.sforce.soap.partner.InvalidNewPasswordFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidNewPasswordFault"),"com.sforce.soap.partner.fault.InvalidNewPasswordFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.fault.InvalidFieldFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedQueryFault"),"com.sforce.soap.partner.MalformedQueryFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedQueryFault"),"com.sforce.soap.partner.MalformedQueryFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedQueryFault"),"com.sforce.soap.partner.fault.MalformedQueryFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.fault.InvalidFieldFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidQueryLocatorFault"),"com.sforce.soap.partner.InvalidQueryLocatorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidQueryLocatorFault"),"com.sforce.soap.partner.InvalidQueryLocatorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidQueryLocatorFault"),"com.sforce.soap.partner.fault.InvalidQueryLocatorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","LoginFault"),"com.sforce.soap.partner.LoginFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","LoginFault"),"com.sforce.soap.partner.LoginFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","LoginFault"),"com.sforce.soap.partner.fault.LoginFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.fault.InvalidFieldFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public SforceServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public SforceServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public SforceServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://www.salesforce.com/services/Soap/u/16.0" );
                
    }

    /**
     * Default Constructor
     */
    public SforceServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("https://www.salesforce.com/services/Soap/u/16.0" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public SforceServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * Update or insert a set of sObjects based on object id
                     * @see com.sforce.soap.partner.SforceService#upsert
                     * @param upsert104
                    
                     * @param sessionHeader105
                    
                     * @param callOptions106
                    
                     * @param assignmentRuleHeader107
                    
                     * @param mruHeader108
                    
                     * @param allowFieldTruncationHeader109
                    
                     * @param debuggingHeader110
                    
                     * @param packageVersionHeader111
                    
                     * @param emailHeader112
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.UpsertResponse upsert(

                            com.sforce.soap.partner.Upsert upsert104,com.sforce.soap.partner.SessionHeader sessionHeader105,com.sforce.soap.partner.CallOptions callOptions106,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader107,com.sforce.soap.partner.MruHeader mruHeader108,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader109,com.sforce.soap.partner.DebuggingHeader debuggingHeader110,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader111,com.sforce.soap.partner.EmailHeader emailHeader112)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:upsertRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    upsert104,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "upsert")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader105!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader105 = toOM(sessionHeader105, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert")));
                                                    addHeader(omElementsessionHeader105,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions106!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions106 = toOM(callOptions106, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert")));
                                                    addHeader(omElementcallOptions106,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (assignmentRuleHeader107!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementassignmentRuleHeader107 = toOM(assignmentRuleHeader107, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert")));
                                                    addHeader(omElementassignmentRuleHeader107,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (mruHeader108!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementmruHeader108 = toOM(mruHeader108, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert")));
                                                    addHeader(omElementmruHeader108,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (allowFieldTruncationHeader109!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader109 = toOM(allowFieldTruncationHeader109, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert")));
                                                    addHeader(omElementallowFieldTruncationHeader109,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader110!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader110 = toOM(debuggingHeader110, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert")));
                                                    addHeader(omElementdebuggingHeader110,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader111!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader111 = toOM(packageVersionHeader111, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert")));
                                                    addHeader(omElementpackageVersionHeader111,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (emailHeader112!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementemailHeader112 = toOM(emailHeader112, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert")));
                                                    addHeader(omElementemailHeader112,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.UpsertResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.UpsertResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidSObjectFault){
                          throw (com.sforce.soap.partner.InvalidSObjectFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidIdFault){
                          throw (com.sforce.soap.partner.InvalidIdFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidFieldFault){
                          throw (com.sforce.soap.partner.InvalidFieldFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Update a set of sObjects
                     * @see com.sforce.soap.partner.SforceService#update
                     * @param update114
                    
                     * @param sessionHeader115
                    
                     * @param callOptions116
                    
                     * @param assignmentRuleHeader117
                    
                     * @param mruHeader118
                    
                     * @param allowFieldTruncationHeader119
                    
                     * @param debuggingHeader120
                    
                     * @param packageVersionHeader121
                    
                     * @param emailHeader122
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.UpdateResponse update(

                            com.sforce.soap.partner.Update update114,com.sforce.soap.partner.SessionHeader sessionHeader115,com.sforce.soap.partner.CallOptions callOptions116,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader117,com.sforce.soap.partner.MruHeader mruHeader118,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader119,com.sforce.soap.partner.DebuggingHeader debuggingHeader120,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader121,com.sforce.soap.partner.EmailHeader emailHeader122)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:updateRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    update114,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "update")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader115!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader115 = toOM(sessionHeader115, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update")));
                                                    addHeader(omElementsessionHeader115,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions116!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions116 = toOM(callOptions116, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update")));
                                                    addHeader(omElementcallOptions116,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (assignmentRuleHeader117!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementassignmentRuleHeader117 = toOM(assignmentRuleHeader117, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update")));
                                                    addHeader(omElementassignmentRuleHeader117,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (mruHeader118!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementmruHeader118 = toOM(mruHeader118, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update")));
                                                    addHeader(omElementmruHeader118,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (allowFieldTruncationHeader119!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader119 = toOM(allowFieldTruncationHeader119, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update")));
                                                    addHeader(omElementallowFieldTruncationHeader119,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader120!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader120 = toOM(debuggingHeader120, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update")));
                                                    addHeader(omElementdebuggingHeader120,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader121!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader121 = toOM(packageVersionHeader121, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update")));
                                                    addHeader(omElementpackageVersionHeader121,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (emailHeader122!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementemailHeader122 = toOM(emailHeader122, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update")));
                                                    addHeader(omElementemailHeader122,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.UpdateResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.UpdateResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidSObjectFault){
                          throw (com.sforce.soap.partner.InvalidSObjectFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidIdFault){
                          throw (com.sforce.soap.partner.InvalidIdFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidFieldFault){
                          throw (com.sforce.soap.partner.InvalidFieldFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Search for sObjects
                     * @see com.sforce.soap.partner.SforceService#search
                     * @param search124
                    
                     * @param sessionHeader125
                    
                     * @param callOptions126
                    
                     * @param packageVersionHeader127
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.MalformedSearchFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.SearchResponse search(

                            com.sforce.soap.partner.Search search124,com.sforce.soap.partner.SessionHeader sessionHeader125,com.sforce.soap.partner.CallOptions callOptions126,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader127)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.MalformedSearchFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:searchRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    search124,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "search")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader125!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader125 = toOM(sessionHeader125, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "search")));
                                                    addHeader(omElementsessionHeader125,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions126!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions126 = toOM(callOptions126, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "search")));
                                                    addHeader(omElementcallOptions126,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader127!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader127 = toOM(packageVersionHeader127, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "search")));
                                                    addHeader(omElementpackageVersionHeader127,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.SearchResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.SearchResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidSObjectFault){
                          throw (com.sforce.soap.partner.InvalidSObjectFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.MalformedSearchFault){
                          throw (com.sforce.soap.partner.MalformedSearchFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidFieldFault){
                          throw (com.sforce.soap.partner.InvalidFieldFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Reset a user's password
                     * @see com.sforce.soap.partner.SforceService#resetPassword
                     * @param resetPassword129
                    
                     * @param sessionHeader130
                    
                     * @param callOptions131
                    
                     * @param emailHeader132
                    
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.ResetPasswordResponse resetPassword(

                            com.sforce.soap.partner.ResetPassword resetPassword129,com.sforce.soap.partner.SessionHeader sessionHeader130,com.sforce.soap.partner.CallOptions callOptions131,com.sforce.soap.partner.EmailHeader emailHeader132)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:resetPasswordRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    resetPassword129,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "resetPassword")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader130!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader130 = toOM(sessionHeader130, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "resetPassword")));
                                                    addHeader(omElementsessionHeader130,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions131!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions131 = toOM(callOptions131, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "resetPassword")));
                                                    addHeader(omElementcallOptions131,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (emailHeader132!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementemailHeader132 = toOM(emailHeader132, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "resetPassword")));
                                                    addHeader(omElementemailHeader132,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.ResetPasswordResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.ResetPasswordResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidIdFault){
                          throw (com.sforce.soap.partner.InvalidIdFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Get a set of sObjects
                     * @see com.sforce.soap.partner.SforceService#retrieve
                     * @param retrieve134
                    
                     * @param sessionHeader135
                    
                     * @param callOptions136
                    
                     * @param queryOptions137
                    
                     * @param mruHeader138
                    
                     * @param packageVersionHeader139
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.MalformedQueryFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.RetrieveResponse retrieve(

                            com.sforce.soap.partner.Retrieve retrieve134,com.sforce.soap.partner.SessionHeader sessionHeader135,com.sforce.soap.partner.CallOptions callOptions136,com.sforce.soap.partner.QueryOptions queryOptions137,com.sforce.soap.partner.MruHeader mruHeader138,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader139)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.MalformedQueryFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:retrieveRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    retrieve134,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "retrieve")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader135!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader135 = toOM(sessionHeader135, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieve")));
                                                    addHeader(omElementsessionHeader135,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions136!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions136 = toOM(callOptions136, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieve")));
                                                    addHeader(omElementcallOptions136,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (queryOptions137!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementqueryOptions137 = toOM(queryOptions137, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieve")));
                                                    addHeader(omElementqueryOptions137,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (mruHeader138!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementmruHeader138 = toOM(mruHeader138, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieve")));
                                                    addHeader(omElementmruHeader138,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader139!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader139 = toOM(packageVersionHeader139, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieve")));
                                                    addHeader(omElementpackageVersionHeader139,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.RetrieveResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.RetrieveResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidSObjectFault){
                          throw (com.sforce.soap.partner.InvalidSObjectFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.MalformedQueryFault){
                          throw (com.sforce.soap.partner.MalformedQueryFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidIdFault){
                          throw (com.sforce.soap.partner.InvalidIdFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidFieldFault){
                          throw (com.sforce.soap.partner.InvalidFieldFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Submit an entity to a workflow process or process a workitem
                     * @see com.sforce.soap.partner.SforceService#process
                     * @param process141
                    
                     * @param sessionHeader142
                    
                     * @param callOptions143
                    
                     * @param allowFieldTruncationHeader144
                    
                     * @param debuggingHeader145
                    
                     * @param packageVersionHeader146
                    
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.ProcessResponse process(

                            com.sforce.soap.partner.Process process141,com.sforce.soap.partner.SessionHeader sessionHeader142,com.sforce.soap.partner.CallOptions callOptions143,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader144,com.sforce.soap.partner.DebuggingHeader debuggingHeader145,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader146)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:processRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    process141,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "process")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader142!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader142 = toOM(sessionHeader142, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "process")));
                                                    addHeader(omElementsessionHeader142,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions143!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions143 = toOM(callOptions143, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "process")));
                                                    addHeader(omElementcallOptions143,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (allowFieldTruncationHeader144!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader144 = toOM(allowFieldTruncationHeader144, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "process")));
                                                    addHeader(omElementallowFieldTruncationHeader144,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader145!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader145 = toOM(debuggingHeader145, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "process")));
                                                    addHeader(omElementdebuggingHeader145,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader146!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader146 = toOM(packageVersionHeader146, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "process")));
                                                    addHeader(omElementpackageVersionHeader146,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.ProcessResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.ProcessResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidIdFault){
                          throw (com.sforce.soap.partner.InvalidIdFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Undelete a set of sObjects
                     * @see com.sforce.soap.partner.SforceService#undelete
                     * @param undelete148
                    
                     * @param sessionHeader149
                    
                     * @param callOptions150
                    
                     * @param allowFieldTruncationHeader151
                    
                     * @param debuggingHeader152
                    
                     * @param packageVersionHeader153
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.UndeleteResponse undelete(

                            com.sforce.soap.partner.Undelete undelete148,com.sforce.soap.partner.SessionHeader sessionHeader149,com.sforce.soap.partner.CallOptions callOptions150,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader151,com.sforce.soap.partner.DebuggingHeader debuggingHeader152,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader153)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:undeleteRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    undelete148,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "undelete")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader149!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader149 = toOM(sessionHeader149, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "undelete")));
                                                    addHeader(omElementsessionHeader149,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions150!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions150 = toOM(callOptions150, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "undelete")));
                                                    addHeader(omElementcallOptions150,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (allowFieldTruncationHeader151!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader151 = toOM(allowFieldTruncationHeader151, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "undelete")));
                                                    addHeader(omElementallowFieldTruncationHeader151,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader152!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader152 = toOM(debuggingHeader152, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "undelete")));
                                                    addHeader(omElementdebuggingHeader152,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader153!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader153 = toOM(packageVersionHeader153, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "undelete")));
                                                    addHeader(omElementpackageVersionHeader153,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.UndeleteResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.UndeleteResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Gets the next batch of sObjects from a query
                     * @see com.sforce.soap.partner.SforceService#queryMore
                     * @param queryMore155
                    
                     * @param sessionHeader156
                    
                     * @param callOptions157
                    
                     * @param queryOptions158
                    
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     * @throws com.sforce.soap.partner.InvalidQueryLocatorFault : 
                     */

                    

                            public  com.sforce.soap.partner.QueryMoreResponse queryMore(

                            com.sforce.soap.partner.QueryMore queryMore155,com.sforce.soap.partner.SessionHeader sessionHeader156,com.sforce.soap.partner.CallOptions callOptions157,com.sforce.soap.partner.QueryOptions queryOptions158)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault
                        ,com.sforce.soap.partner.InvalidQueryLocatorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:queryMoreRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryMore155,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "queryMore")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader156!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader156 = toOM(sessionHeader156, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryMore")));
                                                    addHeader(omElementsessionHeader156,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions157!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions157 = toOM(callOptions157, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryMore")));
                                                    addHeader(omElementcallOptions157,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (queryOptions158!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementqueryOptions158 = toOM(queryOptions158, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryMore")));
                                                    addHeader(omElementqueryOptions158,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.QueryMoreResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.QueryMoreResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidFieldFault){
                          throw (com.sforce.soap.partner.InvalidFieldFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidQueryLocatorFault){
                          throw (com.sforce.soap.partner.InvalidQueryLocatorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Get the IDs for deleted sObjects
                     * @see com.sforce.soap.partner.SforceService#getDeleted
                     * @param getDeleted160
                    
                     * @param sessionHeader161
                    
                     * @param callOptions162
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.GetDeletedResponse getDeleted(

                            com.sforce.soap.partner.GetDeleted getDeleted160,com.sforce.soap.partner.SessionHeader sessionHeader161,com.sforce.soap.partner.CallOptions callOptions162)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:getDeletedRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getDeleted160,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "getDeleted")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader161!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader161 = toOM(sessionHeader161, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getDeleted")));
                                                    addHeader(omElementsessionHeader161,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions162!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions162 = toOM(callOptions162, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getDeleted")));
                                                    addHeader(omElementcallOptions162,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.GetDeletedResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.GetDeletedResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidSObjectFault){
                          throw (com.sforce.soap.partner.InvalidSObjectFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Logout the current user, invalidating the current session.
                     * @see com.sforce.soap.partner.SforceService#logout
                     * @param logout164
                    
                     * @param sessionHeader165
                    
                     * @param callOptions166
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.LogoutResponse logout(

                            com.sforce.soap.partner.Logout logout164,com.sforce.soap.partner.SessionHeader sessionHeader165,com.sforce.soap.partner.CallOptions callOptions166)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:logoutRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    logout164,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "logout")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader165!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader165 = toOM(sessionHeader165, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "logout")));
                                                    addHeader(omElementsessionHeader165,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions166!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions166 = toOM(callOptions166, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "logout")));
                                                    addHeader(omElementcallOptions166,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.LogoutResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.LogoutResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Delete a set of sObjects
                     * @see com.sforce.soap.partner.SforceService#delete
                     * @param delete168
                    
                     * @param sessionHeader169
                    
                     * @param callOptions170
                    
                     * @param packageVersionHeader171
                    
                     * @param userTerritoryDeleteHeader172
                    
                     * @param emailHeader173
                    
                     * @param allowFieldTruncationHeader174
                    
                     * @param debuggingHeader175
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.DeleteResponse delete(

                            com.sforce.soap.partner.Delete delete168,com.sforce.soap.partner.SessionHeader sessionHeader169,com.sforce.soap.partner.CallOptions callOptions170,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader171,com.sforce.soap.partner.UserTerritoryDeleteHeader userTerritoryDeleteHeader172,com.sforce.soap.partner.EmailHeader emailHeader173,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader174,com.sforce.soap.partner.DebuggingHeader debuggingHeader175)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:deleteRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    delete168,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "delete")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader169!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader169 = toOM(sessionHeader169, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete")));
                                                    addHeader(omElementsessionHeader169,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions170!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions170 = toOM(callOptions170, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete")));
                                                    addHeader(omElementcallOptions170,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader171!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader171 = toOM(packageVersionHeader171, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete")));
                                                    addHeader(omElementpackageVersionHeader171,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (userTerritoryDeleteHeader172!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserTerritoryDeleteHeader172 = toOM(userTerritoryDeleteHeader172, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete")));
                                                    addHeader(omElementuserTerritoryDeleteHeader172,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (emailHeader173!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementemailHeader173 = toOM(emailHeader173, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete")));
                                                    addHeader(omElementemailHeader173,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (allowFieldTruncationHeader174!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader174 = toOM(allowFieldTruncationHeader174, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete")));
                                                    addHeader(omElementallowFieldTruncationHeader174,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader175!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader175 = toOM(debuggingHeader175, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete")));
                                                    addHeader(omElementdebuggingHeader175,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.DeleteResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.DeleteResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Create a Query Cursor, including deleted sObjects
                     * @see com.sforce.soap.partner.SforceService#queryAll
                     * @param queryAll177
                    
                     * @param sessionHeader178
                    
                     * @param callOptions179
                    
                     * @param queryOptions180
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.MalformedQueryFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     * @throws com.sforce.soap.partner.InvalidQueryLocatorFault : 
                     */

                    

                            public  com.sforce.soap.partner.QueryAllResponse queryAll(

                            com.sforce.soap.partner.QueryAll queryAll177,com.sforce.soap.partner.SessionHeader sessionHeader178,com.sforce.soap.partner.CallOptions callOptions179,com.sforce.soap.partner.QueryOptions queryOptions180)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.MalformedQueryFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault
                        ,com.sforce.soap.partner.InvalidQueryLocatorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:queryAllRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryAll177,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "queryAll")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader178!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader178 = toOM(sessionHeader178, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryAll")));
                                                    addHeader(omElementsessionHeader178,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions179!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions179 = toOM(callOptions179, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryAll")));
                                                    addHeader(omElementcallOptions179,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (queryOptions180!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementqueryOptions180 = toOM(queryOptions180, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryAll")));
                                                    addHeader(omElementqueryOptions180,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.QueryAllResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.QueryAllResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidSObjectFault){
                          throw (com.sforce.soap.partner.InvalidSObjectFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.MalformedQueryFault){
                          throw (com.sforce.soap.partner.MalformedQueryFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidIdFault){
                          throw (com.sforce.soap.partner.InvalidIdFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidFieldFault){
                          throw (com.sforce.soap.partner.InvalidFieldFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidQueryLocatorFault){
                          throw (com.sforce.soap.partner.InvalidQueryLocatorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * convert a set of leads
                     * @see com.sforce.soap.partner.SforceService#convertLead
                     * @param convertLead182
                    
                     * @param sessionHeader183
                    
                     * @param callOptions184
                    
                     * @param allowFieldTruncationHeader185
                    
                     * @param debuggingHeader186
                    
                     * @param packageVersionHeader187
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.ConvertLeadResponse convertLead(

                            com.sforce.soap.partner.ConvertLead convertLead182,com.sforce.soap.partner.SessionHeader sessionHeader183,com.sforce.soap.partner.CallOptions callOptions184,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader185,com.sforce.soap.partner.DebuggingHeader debuggingHeader186,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader187)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:convertLeadRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    convertLead182,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "convertLead")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader183!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader183 = toOM(sessionHeader183, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLead")));
                                                    addHeader(omElementsessionHeader183,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions184!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions184 = toOM(callOptions184, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLead")));
                                                    addHeader(omElementcallOptions184,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (allowFieldTruncationHeader185!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader185 = toOM(allowFieldTruncationHeader185, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLead")));
                                                    addHeader(omElementallowFieldTruncationHeader185,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader186!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader186 = toOM(debuggingHeader186, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLead")));
                                                    addHeader(omElementdebuggingHeader186,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader187!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader187 = toOM(packageVersionHeader187, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLead")));
                                                    addHeader(omElementpackageVersionHeader187,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.ConvertLeadResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.ConvertLeadResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Set a user's password
                     * @see com.sforce.soap.partner.SforceService#setPassword
                     * @param setPassword189
                    
                     * @param sessionHeader190
                    
                     * @param callOptions191
                    
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     * @throws com.sforce.soap.partner.InvalidNewPasswordFault : 
                     */

                    

                            public  com.sforce.soap.partner.SetPasswordResponse setPassword(

                            com.sforce.soap.partner.SetPassword setPassword189,com.sforce.soap.partner.SessionHeader sessionHeader190,com.sforce.soap.partner.CallOptions callOptions191)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault
                        ,com.sforce.soap.partner.InvalidNewPasswordFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:setPasswordRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    setPassword189,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "setPassword")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader190!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader190 = toOM(sessionHeader190, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "setPassword")));
                                                    addHeader(omElementsessionHeader190,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions191!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions191 = toOM(callOptions191, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "setPassword")));
                                                    addHeader(omElementcallOptions191,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.SetPasswordResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.SetPasswordResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidIdFault){
                          throw (com.sforce.soap.partner.InvalidIdFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidNewPasswordFault){
                          throw (com.sforce.soap.partner.InvalidNewPasswordFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Create a set of new sObjects
                     * @see com.sforce.soap.partner.SforceService#create
                     * @param create193
                    
                     * @param sessionHeader194
                    
                     * @param callOptions195
                    
                     * @param assignmentRuleHeader196
                    
                     * @param mruHeader197
                    
                     * @param allowFieldTruncationHeader198
                    
                     * @param debuggingHeader199
                    
                     * @param packageVersionHeader200
                    
                     * @param emailHeader201
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.CreateResponse create(

                            com.sforce.soap.partner.Create create193,com.sforce.soap.partner.SessionHeader sessionHeader194,com.sforce.soap.partner.CallOptions callOptions195,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader196,com.sforce.soap.partner.MruHeader mruHeader197,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader198,com.sforce.soap.partner.DebuggingHeader debuggingHeader199,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader200,com.sforce.soap.partner.EmailHeader emailHeader201)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:createRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    create193,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "create")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader194!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader194 = toOM(sessionHeader194, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create")));
                                                    addHeader(omElementsessionHeader194,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions195!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions195 = toOM(callOptions195, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create")));
                                                    addHeader(omElementcallOptions195,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (assignmentRuleHeader196!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementassignmentRuleHeader196 = toOM(assignmentRuleHeader196, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create")));
                                                    addHeader(omElementassignmentRuleHeader196,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (mruHeader197!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementmruHeader197 = toOM(mruHeader197, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create")));
                                                    addHeader(omElementmruHeader197,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (allowFieldTruncationHeader198!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader198 = toOM(allowFieldTruncationHeader198, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create")));
                                                    addHeader(omElementallowFieldTruncationHeader198,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader199!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader199 = toOM(debuggingHeader199, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create")));
                                                    addHeader(omElementdebuggingHeader199,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader200!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader200 = toOM(packageVersionHeader200, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create")));
                                                    addHeader(omElementpackageVersionHeader200,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (emailHeader201!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementemailHeader201 = toOM(emailHeader201, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create")));
                                                    addHeader(omElementemailHeader201,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.CreateResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.CreateResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidSObjectFault){
                          throw (com.sforce.soap.partner.InvalidSObjectFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidIdFault){
                          throw (com.sforce.soap.partner.InvalidIdFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidFieldFault){
                          throw (com.sforce.soap.partner.InvalidFieldFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Describe the layout of the SoftPhone
                     * @see com.sforce.soap.partner.SforceService#describeSoftphoneLayout
                     * @param describeSoftphoneLayout203
                    
                     * @param sessionHeader204
                    
                     * @param callOptions205
                    
                     * @param packageVersionHeader206
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.DescribeSoftphoneLayoutResponse describeSoftphoneLayout(

                            com.sforce.soap.partner.DescribeSoftphoneLayout describeSoftphoneLayout203,com.sforce.soap.partner.SessionHeader sessionHeader204,com.sforce.soap.partner.CallOptions callOptions205,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader206)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:describeSoftphoneLayoutRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    describeSoftphoneLayout203,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "describeSoftphoneLayout")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader204!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader204 = toOM(sessionHeader204, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSoftphoneLayout")));
                                                    addHeader(omElementsessionHeader204,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions205!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions205 = toOM(callOptions205, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSoftphoneLayout")));
                                                    addHeader(omElementcallOptions205,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader206!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader206 = toOM(packageVersionHeader206, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSoftphoneLayout")));
                                                    addHeader(omElementpackageVersionHeader206,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.DescribeSoftphoneLayoutResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.DescribeSoftphoneLayoutResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Logs out and invalidates session ids
                     * @see com.sforce.soap.partner.SforceService#invalidateSessions
                     * @param invalidateSessions208
                    
                     * @param sessionHeader209
                    
                     * @param callOptions210
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.InvalidateSessionsResponse invalidateSessions(

                            com.sforce.soap.partner.InvalidateSessions invalidateSessions208,com.sforce.soap.partner.SessionHeader sessionHeader209,com.sforce.soap.partner.CallOptions callOptions210)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:invalidateSessionsRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    invalidateSessions208,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "invalidateSessions")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader209!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader209 = toOM(sessionHeader209, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "invalidateSessions")));
                                                    addHeader(omElementsessionHeader209,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions210!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions210 = toOM(callOptions210, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "invalidateSessions")));
                                                    addHeader(omElementcallOptions210,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.InvalidateSessionsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.InvalidateSessionsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Describe an sObject
                     * @see com.sforce.soap.partner.SforceService#describeSObject
                     * @param describeSObject212
                    
                     * @param sessionHeader213
                    
                     * @param callOptions214
                    
                     * @param packageVersionHeader215
                    
                     * @param localeOptions216
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.DescribeSObjectResponse describeSObject(

                            com.sforce.soap.partner.DescribeSObject describeSObject212,com.sforce.soap.partner.SessionHeader sessionHeader213,com.sforce.soap.partner.CallOptions callOptions214,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader215,com.sforce.soap.partner.LocaleOptions localeOptions216)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:describeSObjectRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    describeSObject212,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "describeSObject")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader213!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader213 = toOM(sessionHeader213, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObject")));
                                                    addHeader(omElementsessionHeader213,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions214!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions214 = toOM(callOptions214, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObject")));
                                                    addHeader(omElementcallOptions214,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader215!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader215 = toOM(packageVersionHeader215, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObject")));
                                                    addHeader(omElementpackageVersionHeader215,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (localeOptions216!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementlocaleOptions216 = toOM(localeOptions216, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObject")));
                                                    addHeader(omElementlocaleOptions216,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.DescribeSObjectResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.DescribeSObjectResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidSObjectFault){
                          throw (com.sforce.soap.partner.InvalidSObjectFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Describe the tabs that appear on a users page
                     * @see com.sforce.soap.partner.SforceService#describeTabs
                     * @param describeTabs218
                    
                     * @param sessionHeader219
                    
                     * @param callOptions220
                    
                     * @param packageVersionHeader221
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.DescribeTabsResponse describeTabs(

                            com.sforce.soap.partner.DescribeTabs describeTabs218,com.sforce.soap.partner.SessionHeader sessionHeader219,com.sforce.soap.partner.CallOptions callOptions220,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader221)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:describeTabsRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    describeTabs218,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "describeTabs")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader219!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader219 = toOM(sessionHeader219, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeTabs")));
                                                    addHeader(omElementsessionHeader219,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions220!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions220 = toOM(callOptions220, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeTabs")));
                                                    addHeader(omElementcallOptions220,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader221!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader221 = toOM(packageVersionHeader221, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeTabs")));
                                                    addHeader(omElementpackageVersionHeader221,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.DescribeTabsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.DescribeTabsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Describe a number sObjects
                     * @see com.sforce.soap.partner.SforceService#describeSObjects
                     * @param describeSObjects223
                    
                     * @param sessionHeader224
                    
                     * @param callOptions225
                    
                     * @param packageVersionHeader226
                    
                     * @param localeOptions227
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.DescribeSObjectsResponse describeSObjects(

                            com.sforce.soap.partner.DescribeSObjects describeSObjects223,com.sforce.soap.partner.SessionHeader sessionHeader224,com.sforce.soap.partner.CallOptions callOptions225,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader226,com.sforce.soap.partner.LocaleOptions localeOptions227)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:describeSObjectsRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    describeSObjects223,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "describeSObjects")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader224!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader224 = toOM(sessionHeader224, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObjects")));
                                                    addHeader(omElementsessionHeader224,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions225!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions225 = toOM(callOptions225, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObjects")));
                                                    addHeader(omElementcallOptions225,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader226!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader226 = toOM(packageVersionHeader226, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObjects")));
                                                    addHeader(omElementpackageVersionHeader226,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (localeOptions227!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementlocaleOptions227 = toOM(localeOptions227, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObjects")));
                                                    addHeader(omElementlocaleOptions227,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.DescribeSObjectsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.DescribeSObjectsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidSObjectFault){
                          throw (com.sforce.soap.partner.InvalidSObjectFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Returns standard information relevant to the current user
                     * @see com.sforce.soap.partner.SforceService#getUserInfo
                     * @param getUserInfo229
                    
                     * @param sessionHeader230
                    
                     * @param callOptions231
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.GetUserInfoResponse getUserInfo(

                            com.sforce.soap.partner.GetUserInfo getUserInfo229,com.sforce.soap.partner.SessionHeader sessionHeader230,com.sforce.soap.partner.CallOptions callOptions231)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:getUserInfoRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getUserInfo229,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "getUserInfo")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader230!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader230 = toOM(sessionHeader230, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getUserInfo")));
                                                    addHeader(omElementsessionHeader230,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions231!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions231 = toOM(callOptions231, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getUserInfo")));
                                                    addHeader(omElementcallOptions231,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.GetUserInfoResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.GetUserInfoResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Empty a set of sObjects from the recycle bin
                     * @see com.sforce.soap.partner.SforceService#emptyRecycleBin
                     * @param emptyRecycleBin233
                    
                     * @param sessionHeader234
                    
                     * @param callOptions235
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.EmptyRecycleBinResponse emptyRecycleBin(

                            com.sforce.soap.partner.EmptyRecycleBin emptyRecycleBin233,com.sforce.soap.partner.SessionHeader sessionHeader234,com.sforce.soap.partner.CallOptions callOptions235)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:emptyRecycleBinRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    emptyRecycleBin233,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "emptyRecycleBin")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader234!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader234 = toOM(sessionHeader234, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "emptyRecycleBin")));
                                                    addHeader(omElementsessionHeader234,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions235!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions235 = toOM(callOptions235, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "emptyRecycleBin")));
                                                    addHeader(omElementcallOptions235,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.EmptyRecycleBinResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.EmptyRecycleBinResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Describe the Global state
                     * @see com.sforce.soap.partner.SforceService#describeGlobal
                     * @param describeGlobal237
                    
                     * @param sessionHeader238
                    
                     * @param callOptions239
                    
                     * @param packageVersionHeader240
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.DescribeGlobalResponse describeGlobal(

                            com.sforce.soap.partner.DescribeGlobal describeGlobal237,com.sforce.soap.partner.SessionHeader sessionHeader238,com.sforce.soap.partner.CallOptions callOptions239,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader240)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:describeGlobalRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    describeGlobal237,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "describeGlobal")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader238!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader238 = toOM(sessionHeader238, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeGlobal")));
                                                    addHeader(omElementsessionHeader238,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions239!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions239 = toOM(callOptions239, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeGlobal")));
                                                    addHeader(omElementcallOptions239,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader240!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader240 = toOM(packageVersionHeader240, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeGlobal")));
                                                    addHeader(omElementpackageVersionHeader240,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.DescribeGlobalResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.DescribeGlobalResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Send outbound email
                     * @see com.sforce.soap.partner.SforceService#sendEmail
                     * @param sendEmail242
                    
                     * @param sessionHeader243
                    
                     * @param callOptions244
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.SendEmailResponse sendEmail(

                            com.sforce.soap.partner.SendEmail sendEmail242,com.sforce.soap.partner.SessionHeader sessionHeader243,com.sforce.soap.partner.CallOptions callOptions244)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:sendEmailRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    sendEmail242,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "sendEmail")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader243!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader243 = toOM(sessionHeader243, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sendEmail")));
                                                    addHeader(omElementsessionHeader243,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions244!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions244 = toOM(callOptions244, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sendEmail")));
                                                    addHeader(omElementcallOptions244,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.SendEmailResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.SendEmailResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Create a Query Cursor
                     * @see com.sforce.soap.partner.SforceService#query
                     * @param query246
                    
                     * @param sessionHeader247
                    
                     * @param callOptions248
                    
                     * @param queryOptions249
                    
                     * @param mruHeader250
                    
                     * @param packageVersionHeader251
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.MalformedQueryFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     * @throws com.sforce.soap.partner.InvalidQueryLocatorFault : 
                     */

                    

                            public  com.sforce.soap.partner.QueryResponse query(

                            com.sforce.soap.partner.Query query246,com.sforce.soap.partner.SessionHeader sessionHeader247,com.sforce.soap.partner.CallOptions callOptions248,com.sforce.soap.partner.QueryOptions queryOptions249,com.sforce.soap.partner.MruHeader mruHeader250,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader251)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.MalformedQueryFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault
                        ,com.sforce.soap.partner.InvalidQueryLocatorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:queryRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    query246,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "query")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader247!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader247 = toOM(sessionHeader247, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "query")));
                                                    addHeader(omElementsessionHeader247,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions248!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions248 = toOM(callOptions248, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "query")));
                                                    addHeader(omElementcallOptions248,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (queryOptions249!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementqueryOptions249 = toOM(queryOptions249, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "query")));
                                                    addHeader(omElementqueryOptions249,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (mruHeader250!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementmruHeader250 = toOM(mruHeader250, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "query")));
                                                    addHeader(omElementmruHeader250,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader251!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader251 = toOM(packageVersionHeader251, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "query")));
                                                    addHeader(omElementpackageVersionHeader251,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.QueryResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.QueryResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidSObjectFault){
                          throw (com.sforce.soap.partner.InvalidSObjectFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.MalformedQueryFault){
                          throw (com.sforce.soap.partner.MalformedQueryFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidIdFault){
                          throw (com.sforce.soap.partner.InvalidIdFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidFieldFault){
                          throw (com.sforce.soap.partner.InvalidFieldFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidQueryLocatorFault){
                          throw (com.sforce.soap.partner.InvalidQueryLocatorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Login to the Salesforce.com SOAP Api
                     * @see com.sforce.soap.partner.SforceService#login
                     * @param login253
                    
                     * @param loginScopeHeader254
                    
                     * @param callOptions255
                    
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     * @throws com.sforce.soap.partner.LoginFault : 
                     */

                    

                            public  com.sforce.soap.partner.LoginResponse login(

                            com.sforce.soap.partner.Login login253,com.sforce.soap.partner.LoginScopeHeader loginScopeHeader254,com.sforce.soap.partner.CallOptions callOptions255)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault
                        ,com.sforce.soap.partner.LoginFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:loginRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    login253,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "login")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (loginScopeHeader254!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementloginScopeHeader254 = toOM(loginScopeHeader254, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "login")));
                                                    addHeader(omElementloginScopeHeader254,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions255!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions255 = toOM(callOptions255, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "login")));
                                                    addHeader(omElementcallOptions255,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.LoginResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.LoginResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidIdFault){
                          throw (com.sforce.soap.partner.InvalidIdFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.LoginFault){
                          throw (com.sforce.soap.partner.LoginFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Merge and update a set of sObjects based on object id
                     * @see com.sforce.soap.partner.SforceService#merge
                     * @param merge257
                    
                     * @param sessionHeader258
                    
                     * @param callOptions259
                    
                     * @param assignmentRuleHeader260
                    
                     * @param mruHeader261
                    
                     * @param allowFieldTruncationHeader262
                    
                     * @param debuggingHeader263
                    
                     * @param packageVersionHeader264
                    
                     * @param emailHeader265
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.MergeResponse merge(

                            com.sforce.soap.partner.Merge merge257,com.sforce.soap.partner.SessionHeader sessionHeader258,com.sforce.soap.partner.CallOptions callOptions259,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader260,com.sforce.soap.partner.MruHeader mruHeader261,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader262,com.sforce.soap.partner.DebuggingHeader debuggingHeader263,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader264,com.sforce.soap.partner.EmailHeader emailHeader265)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:mergeRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    merge257,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "merge")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader258!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader258 = toOM(sessionHeader258, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge")));
                                                    addHeader(omElementsessionHeader258,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions259!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions259 = toOM(callOptions259, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge")));
                                                    addHeader(omElementcallOptions259,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (assignmentRuleHeader260!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementassignmentRuleHeader260 = toOM(assignmentRuleHeader260, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge")));
                                                    addHeader(omElementassignmentRuleHeader260,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (mruHeader261!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementmruHeader261 = toOM(mruHeader261, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge")));
                                                    addHeader(omElementmruHeader261,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (allowFieldTruncationHeader262!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader262 = toOM(allowFieldTruncationHeader262, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge")));
                                                    addHeader(omElementallowFieldTruncationHeader262,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader263!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader263 = toOM(debuggingHeader263, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge")));
                                                    addHeader(omElementdebuggingHeader263,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader264!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader264 = toOM(packageVersionHeader264, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge")));
                                                    addHeader(omElementpackageVersionHeader264,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (emailHeader265!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementemailHeader265 = toOM(emailHeader265, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge")));
                                                    addHeader(omElementemailHeader265,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.MergeResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.MergeResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidSObjectFault){
                          throw (com.sforce.soap.partner.InvalidSObjectFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidIdFault){
                          throw (com.sforce.soap.partner.InvalidIdFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidFieldFault){
                          throw (com.sforce.soap.partner.InvalidFieldFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Gets server timestamp
                     * @see com.sforce.soap.partner.SforceService#getServerTimestamp
                     * @param getServerTimestamp267
                    
                     * @param sessionHeader268
                    
                     * @param callOptions269
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.GetServerTimestampResponse getServerTimestamp(

                            com.sforce.soap.partner.GetServerTimestamp getServerTimestamp267,com.sforce.soap.partner.SessionHeader sessionHeader268,com.sforce.soap.partner.CallOptions callOptions269)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:getServerTimestampRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getServerTimestamp267,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "getServerTimestamp")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader268!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader268 = toOM(sessionHeader268, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getServerTimestamp")));
                                                    addHeader(omElementsessionHeader268,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions269!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions269 = toOM(callOptions269, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getServerTimestamp")));
                                                    addHeader(omElementcallOptions269,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.GetServerTimestampResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.GetServerTimestampResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Get the IDs for updated sObjects
                     * @see com.sforce.soap.partner.SforceService#getUpdated
                     * @param getUpdated271
                    
                     * @param sessionHeader272
                    
                     * @param callOptions273
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.GetUpdatedResponse getUpdated(

                            com.sforce.soap.partner.GetUpdated getUpdated271,com.sforce.soap.partner.SessionHeader sessionHeader272,com.sforce.soap.partner.CallOptions callOptions273)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:getUpdatedRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getUpdated271,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "getUpdated")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader272!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader272 = toOM(sessionHeader272, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getUpdated")));
                                                    addHeader(omElementsessionHeader272,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions273!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions273 = toOM(callOptions273, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getUpdated")));
                                                    addHeader(omElementcallOptions273,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.GetUpdatedResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.GetUpdatedResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidSObjectFault){
                          throw (com.sforce.soap.partner.InvalidSObjectFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Describe the layout of an sObject
                     * @see com.sforce.soap.partner.SforceService#describeLayout
                     * @param describeLayout275
                    
                     * @param sessionHeader276
                    
                     * @param callOptions277
                    
                     * @param packageVersionHeader278
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.DescribeLayoutResponse describeLayout(

                            com.sforce.soap.partner.DescribeLayoutE describeLayout275,com.sforce.soap.partner.SessionHeader sessionHeader276,com.sforce.soap.partner.CallOptions callOptions277,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader278)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
              _operationClient.getOptions().setAction("urn:partner.soap.sforce.com:Soap:describeLayoutRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    describeLayout275,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "describeLayout")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader276!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader276 = toOM(sessionHeader276, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeLayout")));
                                                    addHeader(omElementsessionHeader276,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions277!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions277 = toOM(callOptions277, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeLayout")));
                                                    addHeader(omElementcallOptions277,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (packageVersionHeader278!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementpackageVersionHeader278 = toOM(packageVersionHeader278, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeLayout")));
                                                    addHeader(omElementpackageVersionHeader278,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.sforce.soap.partner.DescribeLayoutResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.sforce.soap.partner.DescribeLayoutResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidSObjectFault){
                          throw (com.sforce.soap.partner.InvalidSObjectFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.InvalidIdFault){
                          throw (com.sforce.soap.partner.InvalidIdFault)ex;
                        }
                        
                        if (ex instanceof com.sforce.soap.partner.UnexpectedErrorFault){
                          throw (com.sforce.soap.partner.UnexpectedErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://www.salesforce.com/services/Soap/u/16.0
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.Upsert param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.Upsert.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.UpsertResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.UpsertResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.fault.InvalidSObjectFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.fault.InvalidSObjectFaultE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.fault.InvalidIdFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.fault.InvalidIdFaultE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.fault.InvalidFieldFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.fault.InvalidFieldFaultE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.fault.UnexpectedErrorFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.fault.UnexpectedErrorFaultE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.SessionHeader param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.SessionHeader.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.CallOptions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.CallOptions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.AssignmentRuleHeader param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.AssignmentRuleHeader.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.MruHeader param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.MruHeader.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.AllowFieldTruncationHeader param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.AllowFieldTruncationHeader.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DebuggingHeader param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DebuggingHeader.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.PackageVersionHeader param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.PackageVersionHeader.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.EmailHeader param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.EmailHeader.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DebuggingInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DebuggingInfo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.Update param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.Update.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.UpdateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.UpdateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.Search param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.Search.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.SearchResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.SearchResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.fault.MalformedSearchFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.fault.MalformedSearchFaultE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.ResetPassword param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.ResetPassword.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.ResetPasswordResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.ResetPasswordResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.Retrieve param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.Retrieve.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.RetrieveResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.RetrieveResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.fault.MalformedQueryFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.fault.MalformedQueryFaultE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.QueryOptions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.QueryOptions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.Process param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.Process.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.ProcessResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.ProcessResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.Undelete param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.Undelete.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.UndeleteResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.UndeleteResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.QueryMore param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.QueryMore.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.QueryMoreResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.QueryMoreResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.fault.InvalidQueryLocatorFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.fault.InvalidQueryLocatorFaultE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.GetDeleted param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.GetDeleted.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.GetDeletedResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.GetDeletedResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.Logout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.Logout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.LogoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.LogoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.Delete param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.Delete.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DeleteResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DeleteResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.UserTerritoryDeleteHeader param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.UserTerritoryDeleteHeader.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.QueryAll param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.QueryAll.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.QueryAllResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.QueryAllResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.ConvertLead param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.ConvertLead.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.ConvertLeadResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.ConvertLeadResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.SetPassword param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.SetPassword.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.SetPasswordResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.SetPasswordResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.fault.InvalidNewPasswordFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.fault.InvalidNewPasswordFaultE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.Create param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.Create.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.CreateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.CreateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DescribeSoftphoneLayout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DescribeSoftphoneLayout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DescribeSoftphoneLayoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DescribeSoftphoneLayoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.InvalidateSessions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.InvalidateSessions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.InvalidateSessionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.InvalidateSessionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DescribeSObject param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DescribeSObject.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DescribeSObjectResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DescribeSObjectResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.LocaleOptions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.LocaleOptions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DescribeTabs param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DescribeTabs.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DescribeTabsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DescribeTabsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DescribeSObjects param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DescribeSObjects.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DescribeSObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DescribeSObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.GetUserInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.GetUserInfo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.GetUserInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.GetUserInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.EmptyRecycleBin param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.EmptyRecycleBin.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.EmptyRecycleBinResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.EmptyRecycleBinResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DescribeGlobal param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DescribeGlobal.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DescribeGlobalResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DescribeGlobalResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.SendEmail param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.SendEmail.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.SendEmailResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.SendEmailResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.Query param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.Query.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.QueryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.QueryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.Login param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.Login.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.LoginResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.LoginResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.fault.LoginFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.fault.LoginFaultE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.LoginScopeHeader param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.LoginScopeHeader.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.Merge param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.Merge.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.MergeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.MergeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.GetServerTimestamp param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.GetServerTimestamp.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.GetServerTimestampResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.GetServerTimestampResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.GetUpdated param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.GetUpdated.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.GetUpdatedResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.GetUpdatedResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DescribeLayoutE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DescribeLayoutE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DescribeLayoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DescribeLayoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.Upsert param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.Upsert.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.Update param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.Update.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.Search param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.Search.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.ResetPassword param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.ResetPassword.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.Retrieve param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.Retrieve.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.Process param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.Process.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.Undelete param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.Undelete.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.QueryMore param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.QueryMore.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.GetDeleted param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.GetDeleted.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.Logout param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.Logout.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.Delete param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.Delete.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.QueryAll param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.QueryAll.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.ConvertLead param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.ConvertLead.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.SetPassword param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.SetPassword.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.Create param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.Create.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.DescribeSoftphoneLayout param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.DescribeSoftphoneLayout.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.InvalidateSessions param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.InvalidateSessions.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.DescribeSObject param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.DescribeSObject.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.DescribeTabs param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.DescribeTabs.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.DescribeSObjects param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.DescribeSObjects.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.GetUserInfo param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.GetUserInfo.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.EmptyRecycleBin param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.EmptyRecycleBin.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.DescribeGlobal param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.DescribeGlobal.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.SendEmail param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.SendEmail.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.Query param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.Query.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.Login param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.Login.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.Merge param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.Merge.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.GetServerTimestamp param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.GetServerTimestamp.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.GetUpdated param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.GetUpdated.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sforce.soap.partner.DescribeLayoutE param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.sforce.soap.partner.DescribeLayoutE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.sforce.soap.partner.Upsert.class.equals(type)){
                
                           return com.sforce.soap.partner.Upsert.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.UpsertResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.UpsertResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidSObjectFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidSObjectFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidIdFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidIdFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidFieldFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidFieldFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.AssignmentRuleHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.AssignmentRuleHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.MruHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.MruHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.AllowFieldTruncationHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.AllowFieldTruncationHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.EmailHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.EmailHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.Update.class.equals(type)){
                
                           return com.sforce.soap.partner.Update.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.UpdateResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.UpdateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidSObjectFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidSObjectFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidIdFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidIdFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidFieldFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidFieldFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.AssignmentRuleHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.AssignmentRuleHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.MruHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.MruHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.AllowFieldTruncationHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.AllowFieldTruncationHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.EmailHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.EmailHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.Search.class.equals(type)){
                
                           return com.sforce.soap.partner.Search.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SearchResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.SearchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidSObjectFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidSObjectFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.MalformedSearchFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.MalformedSearchFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidFieldFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidFieldFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.ResetPassword.class.equals(type)){
                
                           return com.sforce.soap.partner.ResetPassword.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.ResetPasswordResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.ResetPasswordResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidIdFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidIdFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.EmailHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.EmailHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.Retrieve.class.equals(type)){
                
                           return com.sforce.soap.partner.Retrieve.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.RetrieveResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.RetrieveResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidSObjectFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidSObjectFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.MalformedQueryFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.MalformedQueryFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidIdFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidIdFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidFieldFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidFieldFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.QueryOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.QueryOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.MruHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.MruHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.Process.class.equals(type)){
                
                           return com.sforce.soap.partner.Process.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.ProcessResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.ProcessResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidIdFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidIdFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.AllowFieldTruncationHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.AllowFieldTruncationHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.Undelete.class.equals(type)){
                
                           return com.sforce.soap.partner.Undelete.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.UndeleteResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.UndeleteResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.AllowFieldTruncationHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.AllowFieldTruncationHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.QueryMore.class.equals(type)){
                
                           return com.sforce.soap.partner.QueryMore.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.QueryMoreResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.QueryMoreResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidFieldFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidFieldFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidQueryLocatorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidQueryLocatorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.QueryOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.QueryOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.GetDeleted.class.equals(type)){
                
                           return com.sforce.soap.partner.GetDeleted.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.GetDeletedResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.GetDeletedResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidSObjectFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidSObjectFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.Logout.class.equals(type)){
                
                           return com.sforce.soap.partner.Logout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.LogoutResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.LogoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.Delete.class.equals(type)){
                
                           return com.sforce.soap.partner.Delete.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DeleteResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.DeleteResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.UserTerritoryDeleteHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.UserTerritoryDeleteHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.EmailHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.EmailHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.AllowFieldTruncationHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.AllowFieldTruncationHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.QueryAll.class.equals(type)){
                
                           return com.sforce.soap.partner.QueryAll.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.QueryAllResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.QueryAllResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidSObjectFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidSObjectFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.MalformedQueryFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.MalformedQueryFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidIdFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidIdFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidFieldFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidFieldFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidQueryLocatorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidQueryLocatorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.QueryOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.QueryOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.ConvertLead.class.equals(type)){
                
                           return com.sforce.soap.partner.ConvertLead.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.ConvertLeadResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.ConvertLeadResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.AllowFieldTruncationHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.AllowFieldTruncationHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SetPassword.class.equals(type)){
                
                           return com.sforce.soap.partner.SetPassword.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SetPasswordResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.SetPasswordResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidIdFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidIdFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidNewPasswordFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidNewPasswordFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.Create.class.equals(type)){
                
                           return com.sforce.soap.partner.Create.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CreateResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.CreateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidSObjectFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidSObjectFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidIdFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidIdFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidFieldFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidFieldFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.AssignmentRuleHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.AssignmentRuleHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.MruHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.MruHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.AllowFieldTruncationHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.AllowFieldTruncationHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.EmailHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.EmailHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DescribeSoftphoneLayout.class.equals(type)){
                
                           return com.sforce.soap.partner.DescribeSoftphoneLayout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DescribeSoftphoneLayoutResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.DescribeSoftphoneLayoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.InvalidateSessions.class.equals(type)){
                
                           return com.sforce.soap.partner.InvalidateSessions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.InvalidateSessionsResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.InvalidateSessionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DescribeSObject.class.equals(type)){
                
                           return com.sforce.soap.partner.DescribeSObject.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DescribeSObjectResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.DescribeSObjectResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidSObjectFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidSObjectFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.LocaleOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.LocaleOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DescribeTabs.class.equals(type)){
                
                           return com.sforce.soap.partner.DescribeTabs.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DescribeTabsResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.DescribeTabsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DescribeSObjects.class.equals(type)){
                
                           return com.sforce.soap.partner.DescribeSObjects.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DescribeSObjectsResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.DescribeSObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidSObjectFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidSObjectFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.LocaleOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.LocaleOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.GetUserInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.GetUserInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.GetUserInfoResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.GetUserInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.EmptyRecycleBin.class.equals(type)){
                
                           return com.sforce.soap.partner.EmptyRecycleBin.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.EmptyRecycleBinResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.EmptyRecycleBinResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DescribeGlobal.class.equals(type)){
                
                           return com.sforce.soap.partner.DescribeGlobal.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DescribeGlobalResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.DescribeGlobalResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SendEmail.class.equals(type)){
                
                           return com.sforce.soap.partner.SendEmail.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SendEmailResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.SendEmailResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.Query.class.equals(type)){
                
                           return com.sforce.soap.partner.Query.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.QueryResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.QueryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidSObjectFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidSObjectFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.MalformedQueryFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.MalformedQueryFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidIdFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidIdFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidFieldFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidFieldFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidQueryLocatorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidQueryLocatorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.QueryOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.QueryOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.MruHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.MruHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.Login.class.equals(type)){
                
                           return com.sforce.soap.partner.Login.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.LoginResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.LoginResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidIdFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidIdFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.LoginFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.LoginFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.LoginScopeHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.LoginScopeHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.Merge.class.equals(type)){
                
                           return com.sforce.soap.partner.Merge.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.MergeResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.MergeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidSObjectFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidSObjectFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidIdFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidIdFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidFieldFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidFieldFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.AssignmentRuleHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.AssignmentRuleHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.MruHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.MruHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.AllowFieldTruncationHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.AllowFieldTruncationHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.EmailHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.EmailHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.GetServerTimestamp.class.equals(type)){
                
                           return com.sforce.soap.partner.GetServerTimestamp.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.GetServerTimestampResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.GetServerTimestampResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.GetUpdated.class.equals(type)){
                
                           return com.sforce.soap.partner.GetUpdated.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.GetUpdatedResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.GetUpdatedResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidSObjectFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidSObjectFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DescribeLayoutE.class.equals(type)){
                
                           return com.sforce.soap.partner.DescribeLayoutE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DescribeLayoutResponse.class.equals(type)){
                
                           return com.sforce.soap.partner.DescribeLayoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidSObjectFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidSObjectFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.InvalidIdFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.InvalidIdFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.fault.UnexpectedErrorFaultE.class.equals(type)){
                
                           return com.sforce.soap.partner.fault.UnexpectedErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.SessionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.SessionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.CallOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.CallOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.PackageVersionHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.PackageVersionHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   