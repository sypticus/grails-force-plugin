
/**
 * SforceServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
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

        private static synchronized String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return Long.toString(System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("SforceService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[30];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getUserInfo"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSoftphoneLayout"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "setPassword"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "logout"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieve"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryAll"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getUpdated"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "undelete"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sendEmail"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "search"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "query"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getDeleted"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[14]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "process"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[15]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "resetPassword"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[16]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeGlobal"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[17]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeLayout"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[18]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeTabs"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[19]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getServerTimestamp"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[20]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "invalidateSessions"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[21]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObject"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[22]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "login"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[23]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryMore"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[24]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObjects"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[25]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "emptyRecycleBin"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[26]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[27]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLead"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[28]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete"));
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
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
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
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidNewPasswordFault"),"com.sforce.soap.partner.InvalidNewPasswordFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidNewPasswordFault"),"com.sforce.soap.partner.InvalidNewPasswordFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidNewPasswordFault"),"com.sforce.soap.partner.fault.InvalidNewPasswordFaultE");
           
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
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedSearchFault"),"com.sforce.soap.partner.MalformedSearchFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedSearchFault"),"com.sforce.soap.partner.MalformedSearchFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","MalformedSearchFault"),"com.sforce.soap.partner.fault.MalformedSearchFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.InvalidFieldFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidFieldFault"),"com.sforce.soap.partner.fault.InvalidFieldFaultE");
           
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
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
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
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.InvalidSObjectFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidSObjectFault"),"com.sforce.soap.partner.fault.InvalidSObjectFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
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
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.InvalidIdFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","InvalidIdFault"),"com.sforce.soap.partner.fault.InvalidIdFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","UnexpectedErrorFault"),"com.sforce.soap.partner.fault.UnexpectedErrorFaultE");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","LoginFault"),"com.sforce.soap.partner.LoginFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","LoginFault"),"com.sforce.soap.partner.LoginFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:fault.partner.soap.sforce.com","LoginFault"),"com.sforce.soap.partner.fault.LoginFaultE");
           
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
        
	
        configurationContext = _serviceClient.getServiceContext().getConfigurationContext();

        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public SforceServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://www.salesforce.com/services/Soap/u/14.0" );
                
    }

    /**
     * Default Constructor
     */
    public SforceServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("https://www.salesforce.com/services/Soap/u/14.0" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public SforceServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * Merge and update a set of sObjects based on object id
                     * @see com.sforce.soap.partner.SforceService#merge
                     * @param merge81
                    
                     * @param sessionHeader82
                    
                     * @param callOptions83
                    
                     * @param assignmentRuleHeader84
                    
                     * @param mruHeader85
                    
                     * @param debuggingHeader86
                    
                     * @param emailHeader87
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.MergeResponse merge(

                            com.sforce.soap.partner.Merge merge81,com.sforce.soap.partner.SessionHeader sessionHeader82,com.sforce.soap.partner.CallOptions callOptions83,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader84,com.sforce.soap.partner.MruHeader mruHeader85,com.sforce.soap.partner.DebuggingHeader debuggingHeader86,com.sforce.soap.partner.EmailHeader emailHeader87)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    merge81,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "merge")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader82!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader82 = toOM(sessionHeader82, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge")));
                                                    addHeader(omElementsessionHeader82,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions83!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions83 = toOM(callOptions83, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge")));
                                                    addHeader(omElementcallOptions83,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (assignmentRuleHeader84!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementassignmentRuleHeader84 = toOM(assignmentRuleHeader84, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge")));
                                                    addHeader(omElementassignmentRuleHeader84,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (mruHeader85!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementmruHeader85 = toOM(mruHeader85, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge")));
                                                    addHeader(omElementmruHeader85,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader86!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader86 = toOM(debuggingHeader86, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge")));
                                                    addHeader(omElementdebuggingHeader86,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (emailHeader87!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementemailHeader87 = toOM(emailHeader87, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "merge")));
                                                    addHeader(omElementemailHeader87,env);
                                                
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
                     * Returns standard information relevant to the current user
                     * @see com.sforce.soap.partner.SforceService#getUserInfo
                     * @param getUserInfo89
                    
                     * @param sessionHeader90
                    
                     * @param callOptions91
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.GetUserInfoResponse getUserInfo(

                            com.sforce.soap.partner.GetUserInfo getUserInfo89,com.sforce.soap.partner.SessionHeader sessionHeader90,com.sforce.soap.partner.CallOptions callOptions91)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getUserInfo89,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "getUserInfo")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader90!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader90 = toOM(sessionHeader90, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getUserInfo")));
                                                    addHeader(omElementsessionHeader90,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions91!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions91 = toOM(callOptions91, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getUserInfo")));
                                                    addHeader(omElementcallOptions91,env);
                                                
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
                     * Describe the layout of the SoftPhone
                     * @see com.sforce.soap.partner.SforceService#describeSoftphoneLayout
                     * @param describeSoftphoneLayout93
                    
                     * @param sessionHeader94
                    
                     * @param callOptions95
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.DescribeSoftphoneLayoutResponse describeSoftphoneLayout(

                            com.sforce.soap.partner.DescribeSoftphoneLayout describeSoftphoneLayout93,com.sforce.soap.partner.SessionHeader sessionHeader94,com.sforce.soap.partner.CallOptions callOptions95)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    describeSoftphoneLayout93,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "describeSoftphoneLayout")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader94!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader94 = toOM(sessionHeader94, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSoftphoneLayout")));
                                                    addHeader(omElementsessionHeader94,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions95!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions95 = toOM(callOptions95, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSoftphoneLayout")));
                                                    addHeader(omElementcallOptions95,env);
                                                
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
                     * Update a set of sObjects
                     * @see com.sforce.soap.partner.SforceService#update
                     * @param update97
                    
                     * @param sessionHeader98
                    
                     * @param callOptions99
                    
                     * @param assignmentRuleHeader100
                    
                     * @param mruHeader101
                    
                     * @param debuggingHeader102
                    
                     * @param emailHeader103
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.UpdateResponse update(

                            com.sforce.soap.partner.Update update97,com.sforce.soap.partner.SessionHeader sessionHeader98,com.sforce.soap.partner.CallOptions callOptions99,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader100,com.sforce.soap.partner.MruHeader mruHeader101,com.sforce.soap.partner.DebuggingHeader debuggingHeader102,com.sforce.soap.partner.EmailHeader emailHeader103)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    update97,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "update")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader98!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader98 = toOM(sessionHeader98, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update")));
                                                    addHeader(omElementsessionHeader98,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions99!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions99 = toOM(callOptions99, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update")));
                                                    addHeader(omElementcallOptions99,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (assignmentRuleHeader100!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementassignmentRuleHeader100 = toOM(assignmentRuleHeader100, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update")));
                                                    addHeader(omElementassignmentRuleHeader100,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (mruHeader101!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementmruHeader101 = toOM(mruHeader101, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update")));
                                                    addHeader(omElementmruHeader101,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader102!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader102 = toOM(debuggingHeader102, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update")));
                                                    addHeader(omElementdebuggingHeader102,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (emailHeader103!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementemailHeader103 = toOM(emailHeader103, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "update")));
                                                    addHeader(omElementemailHeader103,env);
                                                
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
                     * Set a user's password
                     * @see com.sforce.soap.partner.SforceService#setPassword
                     * @param setPassword105
                    
                     * @param sessionHeader106
                    
                     * @param callOptions107
                    
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     * @throws com.sforce.soap.partner.InvalidNewPasswordFault : 
                     */

                    

                            public  com.sforce.soap.partner.SetPasswordResponse setPassword(

                            com.sforce.soap.partner.SetPassword setPassword105,com.sforce.soap.partner.SessionHeader sessionHeader106,com.sforce.soap.partner.CallOptions callOptions107)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault
                        ,com.sforce.soap.partner.InvalidNewPasswordFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    setPassword105,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "setPassword")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader106!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader106 = toOM(sessionHeader106, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "setPassword")));
                                                    addHeader(omElementsessionHeader106,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions107!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions107 = toOM(callOptions107, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "setPassword")));
                                                    addHeader(omElementcallOptions107,env);
                                                
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
                     * Logout the current user, invalidating the current session.
                     * @see com.sforce.soap.partner.SforceService#logout
                     * @param logout109
                    
                     * @param sessionHeader110
                    
                     * @param callOptions111
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.LogoutResponse logout(

                            com.sforce.soap.partner.Logout logout109,com.sforce.soap.partner.SessionHeader sessionHeader110,com.sforce.soap.partner.CallOptions callOptions111)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    logout109,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "logout")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader110!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader110 = toOM(sessionHeader110, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "logout")));
                                                    addHeader(omElementsessionHeader110,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions111!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions111 = toOM(callOptions111, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "logout")));
                                                    addHeader(omElementcallOptions111,env);
                                                
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
                     * Get a set of sObjects
                     * @see com.sforce.soap.partner.SforceService#retrieve
                     * @param retrieve113
                    
                     * @param sessionHeader114
                    
                     * @param callOptions115
                    
                     * @param queryOptions116
                    
                     * @param mruHeader117
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.MalformedQueryFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.RetrieveResponse retrieve(

                            com.sforce.soap.partner.Retrieve retrieve113,com.sforce.soap.partner.SessionHeader sessionHeader114,com.sforce.soap.partner.CallOptions callOptions115,com.sforce.soap.partner.QueryOptions queryOptions116,com.sforce.soap.partner.MruHeader mruHeader117)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.MalformedQueryFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    retrieve113,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "retrieve")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader114!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader114 = toOM(sessionHeader114, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieve")));
                                                    addHeader(omElementsessionHeader114,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions115!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions115 = toOM(callOptions115, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieve")));
                                                    addHeader(omElementcallOptions115,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (queryOptions116!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementqueryOptions116 = toOM(queryOptions116, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieve")));
                                                    addHeader(omElementqueryOptions116,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (mruHeader117!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementmruHeader117 = toOM(mruHeader117, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "retrieve")));
                                                    addHeader(omElementmruHeader117,env);
                                                
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
                     * Create a Query Cursor, including deleted sObjects
                     * @see com.sforce.soap.partner.SforceService#queryAll
                     * @param queryAll119
                    
                     * @param sessionHeader120
                    
                     * @param callOptions121
                    
                     * @param queryOptions122
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.MalformedQueryFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     * @throws com.sforce.soap.partner.InvalidQueryLocatorFault : 
                     */

                    

                            public  com.sforce.soap.partner.QueryAllResponse queryAll(

                            com.sforce.soap.partner.QueryAll queryAll119,com.sforce.soap.partner.SessionHeader sessionHeader120,com.sforce.soap.partner.CallOptions callOptions121,com.sforce.soap.partner.QueryOptions queryOptions122)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.MalformedQueryFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault
                        ,com.sforce.soap.partner.InvalidQueryLocatorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryAll119,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "queryAll")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader120!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader120 = toOM(sessionHeader120, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryAll")));
                                                    addHeader(omElementsessionHeader120,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions121!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions121 = toOM(callOptions121, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryAll")));
                                                    addHeader(omElementcallOptions121,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (queryOptions122!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementqueryOptions122 = toOM(queryOptions122, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryAll")));
                                                    addHeader(omElementqueryOptions122,env);
                                                
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
                     * Get the IDs for updated sObjects
                     * @see com.sforce.soap.partner.SforceService#getUpdated
                     * @param getUpdated124
                    
                     * @param sessionHeader125
                    
                     * @param callOptions126
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.GetUpdatedResponse getUpdated(

                            com.sforce.soap.partner.GetUpdated getUpdated124,com.sforce.soap.partner.SessionHeader sessionHeader125,com.sforce.soap.partner.CallOptions callOptions126)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getUpdated124,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "getUpdated")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader125!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader125 = toOM(sessionHeader125, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getUpdated")));
                                                    addHeader(omElementsessionHeader125,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions126!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions126 = toOM(callOptions126, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getUpdated")));
                                                    addHeader(omElementcallOptions126,env);
                                                
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
                     * Undelete a set of sObjects
                     * @see com.sforce.soap.partner.SforceService#undelete
                     * @param undelete128
                    
                     * @param sessionHeader129
                    
                     * @param callOptions130
                    
                     * @param debuggingHeader131
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.UndeleteResponse undelete(

                            com.sforce.soap.partner.Undelete undelete128,com.sforce.soap.partner.SessionHeader sessionHeader129,com.sforce.soap.partner.CallOptions callOptions130,com.sforce.soap.partner.DebuggingHeader debuggingHeader131)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    undelete128,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "undelete")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader129!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader129 = toOM(sessionHeader129, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "undelete")));
                                                    addHeader(omElementsessionHeader129,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions130!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions130 = toOM(callOptions130, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "undelete")));
                                                    addHeader(omElementcallOptions130,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader131!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader131 = toOM(debuggingHeader131, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "undelete")));
                                                    addHeader(omElementdebuggingHeader131,env);
                                                
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
                     * Create a set of new sObjects
                     * @see com.sforce.soap.partner.SforceService#create
                     * @param create133
                    
                     * @param sessionHeader134
                    
                     * @param callOptions135
                    
                     * @param assignmentRuleHeader136
                    
                     * @param mruHeader137
                    
                     * @param debuggingHeader138
                    
                     * @param emailHeader139
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.CreateResponse create(

                            com.sforce.soap.partner.Create create133,com.sforce.soap.partner.SessionHeader sessionHeader134,com.sforce.soap.partner.CallOptions callOptions135,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader136,com.sforce.soap.partner.MruHeader mruHeader137,com.sforce.soap.partner.DebuggingHeader debuggingHeader138,com.sforce.soap.partner.EmailHeader emailHeader139)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    create133,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "create")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader134!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader134 = toOM(sessionHeader134, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create")));
                                                    addHeader(omElementsessionHeader134,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions135!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions135 = toOM(callOptions135, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create")));
                                                    addHeader(omElementcallOptions135,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (assignmentRuleHeader136!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementassignmentRuleHeader136 = toOM(assignmentRuleHeader136, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create")));
                                                    addHeader(omElementassignmentRuleHeader136,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (mruHeader137!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementmruHeader137 = toOM(mruHeader137, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create")));
                                                    addHeader(omElementmruHeader137,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader138!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader138 = toOM(debuggingHeader138, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create")));
                                                    addHeader(omElementdebuggingHeader138,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (emailHeader139!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementemailHeader139 = toOM(emailHeader139, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "create")));
                                                    addHeader(omElementemailHeader139,env);
                                                
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
                     * Send outbound email
                     * @see com.sforce.soap.partner.SforceService#sendEmail
                     * @param sendEmail141
                    
                     * @param sessionHeader142
                    
                     * @param callOptions143
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.SendEmailResponse sendEmail(

                            com.sforce.soap.partner.SendEmail sendEmail141,com.sforce.soap.partner.SessionHeader sessionHeader142,com.sforce.soap.partner.CallOptions callOptions143)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    sendEmail141,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "sendEmail")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader142!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader142 = toOM(sessionHeader142, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sendEmail")));
                                                    addHeader(omElementsessionHeader142,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions143!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions143 = toOM(callOptions143, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sendEmail")));
                                                    addHeader(omElementcallOptions143,env);
                                                
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
                     * Search for sObjects
                     * @see com.sforce.soap.partner.SforceService#search
                     * @param search145
                    
                     * @param sessionHeader146
                    
                     * @param callOptions147
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.MalformedSearchFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.SearchResponse search(

                            com.sforce.soap.partner.Search search145,com.sforce.soap.partner.SessionHeader sessionHeader146,com.sforce.soap.partner.CallOptions callOptions147)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.MalformedSearchFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    search145,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "search")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader146!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader146 = toOM(sessionHeader146, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "search")));
                                                    addHeader(omElementsessionHeader146,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions147!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions147 = toOM(callOptions147, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "search")));
                                                    addHeader(omElementcallOptions147,env);
                                                
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
                     * Create a Query Cursor
                     * @see com.sforce.soap.partner.SforceService#query
                     * @param query149
                    
                     * @param sessionHeader150
                    
                     * @param callOptions151
                    
                     * @param queryOptions152
                    
                     * @param mruHeader153
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.MalformedQueryFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     * @throws com.sforce.soap.partner.InvalidQueryLocatorFault : 
                     */

                    

                            public  com.sforce.soap.partner.QueryResponse query(

                            com.sforce.soap.partner.Query query149,com.sforce.soap.partner.SessionHeader sessionHeader150,com.sforce.soap.partner.CallOptions callOptions151,com.sforce.soap.partner.QueryOptions queryOptions152,com.sforce.soap.partner.MruHeader mruHeader153)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.MalformedQueryFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault
                        ,com.sforce.soap.partner.InvalidQueryLocatorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    query149,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "query")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader150!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader150 = toOM(sessionHeader150, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "query")));
                                                    addHeader(omElementsessionHeader150,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions151!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions151 = toOM(callOptions151, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "query")));
                                                    addHeader(omElementcallOptions151,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (queryOptions152!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementqueryOptions152 = toOM(queryOptions152, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "query")));
                                                    addHeader(omElementqueryOptions152,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (mruHeader153!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementmruHeader153 = toOM(mruHeader153, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "query")));
                                                    addHeader(omElementmruHeader153,env);
                                                
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
                     * Get the IDs for deleted sObjects
                     * @see com.sforce.soap.partner.SforceService#getDeleted
                     * @param getDeleted155
                    
                     * @param sessionHeader156
                    
                     * @param callOptions157
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.GetDeletedResponse getDeleted(

                            com.sforce.soap.partner.GetDeleted getDeleted155,com.sforce.soap.partner.SessionHeader sessionHeader156,com.sforce.soap.partner.CallOptions callOptions157)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getDeleted155,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "getDeleted")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader156!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader156 = toOM(sessionHeader156, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getDeleted")));
                                                    addHeader(omElementsessionHeader156,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions157!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions157 = toOM(callOptions157, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getDeleted")));
                                                    addHeader(omElementcallOptions157,env);
                                                
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
                     * Submit an entity to a workflow process or process a workitem
                     * @see com.sforce.soap.partner.SforceService#process
                     * @param process159
                    
                     * @param sessionHeader160
                    
                     * @param callOptions161
                    
                     * @param debuggingHeader162
                    
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.ProcessResponse process(

                            com.sforce.soap.partner.Process process159,com.sforce.soap.partner.SessionHeader sessionHeader160,com.sforce.soap.partner.CallOptions callOptions161,com.sforce.soap.partner.DebuggingHeader debuggingHeader162)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    process159,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "process")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader160!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader160 = toOM(sessionHeader160, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "process")));
                                                    addHeader(omElementsessionHeader160,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions161!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions161 = toOM(callOptions161, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "process")));
                                                    addHeader(omElementcallOptions161,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader162!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader162 = toOM(debuggingHeader162, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "process")));
                                                    addHeader(omElementdebuggingHeader162,env);
                                                
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
                     * Reset a user's password
                     * @see com.sforce.soap.partner.SforceService#resetPassword
                     * @param resetPassword164
                    
                     * @param sessionHeader165
                    
                     * @param callOptions166
                    
                     * @param emailHeader167
                    
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.ResetPasswordResponse resetPassword(

                            com.sforce.soap.partner.ResetPassword resetPassword164,com.sforce.soap.partner.SessionHeader sessionHeader165,com.sforce.soap.partner.CallOptions callOptions166,com.sforce.soap.partner.EmailHeader emailHeader167)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    resetPassword164,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "resetPassword")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader165!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader165 = toOM(sessionHeader165, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "resetPassword")));
                                                    addHeader(omElementsessionHeader165,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions166!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions166 = toOM(callOptions166, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "resetPassword")));
                                                    addHeader(omElementcallOptions166,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (emailHeader167!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementemailHeader167 = toOM(emailHeader167, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "resetPassword")));
                                                    addHeader(omElementemailHeader167,env);
                                                
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
                     * Describe the Global state
                     * @see com.sforce.soap.partner.SforceService#describeGlobal
                     * @param describeGlobal169
                    
                     * @param sessionHeader170
                    
                     * @param callOptions171
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.DescribeGlobalResponse describeGlobal(

                            com.sforce.soap.partner.DescribeGlobal describeGlobal169,com.sforce.soap.partner.SessionHeader sessionHeader170,com.sforce.soap.partner.CallOptions callOptions171)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    describeGlobal169,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "describeGlobal")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader170!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader170 = toOM(sessionHeader170, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeGlobal")));
                                                    addHeader(omElementsessionHeader170,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions171!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions171 = toOM(callOptions171, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeGlobal")));
                                                    addHeader(omElementcallOptions171,env);
                                                
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
                     * Describe the layout of an sObject
                     * @see com.sforce.soap.partner.SforceService#describeLayout
                     * @param describeLayout173
                    
                     * @param sessionHeader174
                    
                     * @param callOptions175
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.DescribeLayoutResponse describeLayout(

                            com.sforce.soap.partner.DescribeLayoutE describeLayout173,com.sforce.soap.partner.SessionHeader sessionHeader174,com.sforce.soap.partner.CallOptions callOptions175)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    describeLayout173,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "describeLayout")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader174!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader174 = toOM(sessionHeader174, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeLayout")));
                                                    addHeader(omElementsessionHeader174,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions175!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions175 = toOM(callOptions175, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeLayout")));
                                                    addHeader(omElementcallOptions175,env);
                                                
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
                     * Auto generated method signature
                     * Describe the tabs that appear on a users page
                     * @see com.sforce.soap.partner.SforceService#describeTabs
                     * @param describeTabs177
                    
                     * @param sessionHeader178
                    
                     * @param callOptions179
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.DescribeTabsResponse describeTabs(

                            com.sforce.soap.partner.DescribeTabs describeTabs177,com.sforce.soap.partner.SessionHeader sessionHeader178,com.sforce.soap.partner.CallOptions callOptions179)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    describeTabs177,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "describeTabs")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader178!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader178 = toOM(sessionHeader178, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeTabs")));
                                                    addHeader(omElementsessionHeader178,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions179!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions179 = toOM(callOptions179, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeTabs")));
                                                    addHeader(omElementcallOptions179,env);
                                                
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
                     * Gets server timestamp
                     * @see com.sforce.soap.partner.SforceService#getServerTimestamp
                     * @param getServerTimestamp181
                    
                     * @param sessionHeader182
                    
                     * @param callOptions183
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.GetServerTimestampResponse getServerTimestamp(

                            com.sforce.soap.partner.GetServerTimestamp getServerTimestamp181,com.sforce.soap.partner.SessionHeader sessionHeader182,com.sforce.soap.partner.CallOptions callOptions183)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getServerTimestamp181,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "getServerTimestamp")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader182!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader182 = toOM(sessionHeader182, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getServerTimestamp")));
                                                    addHeader(omElementsessionHeader182,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions183!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions183 = toOM(callOptions183, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "getServerTimestamp")));
                                                    addHeader(omElementcallOptions183,env);
                                                
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
                     * Logs out and invalidates session ids
                     * @see com.sforce.soap.partner.SforceService#invalidateSessions
                     * @param invalidateSessions185
                    
                     * @param sessionHeader186
                    
                     * @param callOptions187
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.InvalidateSessionsResponse invalidateSessions(

                            com.sforce.soap.partner.InvalidateSessions invalidateSessions185,com.sforce.soap.partner.SessionHeader sessionHeader186,com.sforce.soap.partner.CallOptions callOptions187)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    invalidateSessions185,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "invalidateSessions")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader186!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader186 = toOM(sessionHeader186, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "invalidateSessions")));
                                                    addHeader(omElementsessionHeader186,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions187!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions187 = toOM(callOptions187, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "invalidateSessions")));
                                                    addHeader(omElementcallOptions187,env);
                                                
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
                     * @param describeSObject189
                    
                     * @param sessionHeader190
                    
                     * @param callOptions191
                    
                     * @param localeOptions192
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.DescribeSObjectResponse describeSObject(

                            com.sforce.soap.partner.DescribeSObject describeSObject189,com.sforce.soap.partner.SessionHeader sessionHeader190,com.sforce.soap.partner.CallOptions callOptions191,com.sforce.soap.partner.LocaleOptions localeOptions192)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    describeSObject189,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "describeSObject")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader190!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader190 = toOM(sessionHeader190, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObject")));
                                                    addHeader(omElementsessionHeader190,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions191!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions191 = toOM(callOptions191, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObject")));
                                                    addHeader(omElementcallOptions191,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (localeOptions192!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementlocaleOptions192 = toOM(localeOptions192, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObject")));
                                                    addHeader(omElementlocaleOptions192,env);
                                                
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
                     * Login to the Salesforce.com SOAP Api
                     * @see com.sforce.soap.partner.SforceService#login
                     * @param login194
                    
                     * @param loginScopeHeader195
                    
                     * @param callOptions196
                    
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     * @throws com.sforce.soap.partner.LoginFault : 
                     */

                    

                            public  com.sforce.soap.partner.LoginResponse login(

                            com.sforce.soap.partner.Login login194,com.sforce.soap.partner.LoginScopeHeader loginScopeHeader195,com.sforce.soap.partner.CallOptions callOptions196)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault
                        ,com.sforce.soap.partner.LoginFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    login194,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "login")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (loginScopeHeader195!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementloginScopeHeader195 = toOM(loginScopeHeader195, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "login")));
                                                    addHeader(omElementloginScopeHeader195,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions196!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions196 = toOM(callOptions196, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "login")));
                                                    addHeader(omElementcallOptions196,env);
                                                
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
                     * Gets the next batch of sObjects from a query
                     * @see com.sforce.soap.partner.SforceService#queryMore
                     * @param queryMore198
                    
                     * @param sessionHeader199
                    
                     * @param callOptions200
                    
                     * @param queryOptions201
                    
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     * @throws com.sforce.soap.partner.InvalidQueryLocatorFault : 
                     */

                    

                            public  com.sforce.soap.partner.QueryMoreResponse queryMore(

                            com.sforce.soap.partner.QueryMore queryMore198,com.sforce.soap.partner.SessionHeader sessionHeader199,com.sforce.soap.partner.CallOptions callOptions200,com.sforce.soap.partner.QueryOptions queryOptions201)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault
                        ,com.sforce.soap.partner.InvalidQueryLocatorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryMore198,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "queryMore")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader199!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader199 = toOM(sessionHeader199, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryMore")));
                                                    addHeader(omElementsessionHeader199,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions200!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions200 = toOM(callOptions200, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryMore")));
                                                    addHeader(omElementcallOptions200,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (queryOptions201!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementqueryOptions201 = toOM(queryOptions201, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "queryMore")));
                                                    addHeader(omElementqueryOptions201,env);
                                                
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
                     * Describe a number sObjects
                     * @see com.sforce.soap.partner.SforceService#describeSObjects
                     * @param describeSObjects203
                    
                     * @param sessionHeader204
                    
                     * @param callOptions205
                    
                     * @param localeOptions206
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.DescribeSObjectsResponse describeSObjects(

                            com.sforce.soap.partner.DescribeSObjects describeSObjects203,com.sforce.soap.partner.SessionHeader sessionHeader204,com.sforce.soap.partner.CallOptions callOptions205,com.sforce.soap.partner.LocaleOptions localeOptions206)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    describeSObjects203,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "describeSObjects")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader204!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader204 = toOM(sessionHeader204, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObjects")));
                                                    addHeader(omElementsessionHeader204,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions205!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions205 = toOM(callOptions205, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObjects")));
                                                    addHeader(omElementcallOptions205,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (localeOptions206!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementlocaleOptions206 = toOM(localeOptions206, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "describeSObjects")));
                                                    addHeader(omElementlocaleOptions206,env);
                                                
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
                     * Empty a set of sObjects from the recycle bin
                     * @see com.sforce.soap.partner.SforceService#emptyRecycleBin
                     * @param emptyRecycleBin208
                    
                     * @param sessionHeader209
                    
                     * @param callOptions210
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.EmptyRecycleBinResponse emptyRecycleBin(

                            com.sforce.soap.partner.EmptyRecycleBin emptyRecycleBin208,com.sforce.soap.partner.SessionHeader sessionHeader209,com.sforce.soap.partner.CallOptions callOptions210)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    emptyRecycleBin208,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "emptyRecycleBin")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader209!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader209 = toOM(sessionHeader209, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "emptyRecycleBin")));
                                                    addHeader(omElementsessionHeader209,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions210!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions210 = toOM(callOptions210, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "emptyRecycleBin")));
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
                     * Update or insert a set of sObjects based on object id
                     * @see com.sforce.soap.partner.SforceService#upsert
                     * @param upsert212
                    
                     * @param sessionHeader213
                    
                     * @param callOptions214
                    
                     * @param assignmentRuleHeader215
                    
                     * @param mruHeader216
                    
                     * @param debuggingHeader217
                    
                     * @param emailHeader218
                    
                     * @throws com.sforce.soap.partner.InvalidSObjectFault : 
                     * @throws com.sforce.soap.partner.InvalidIdFault : 
                     * @throws com.sforce.soap.partner.InvalidFieldFault : 
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.UpsertResponse upsert(

                            com.sforce.soap.partner.Upsert upsert212,com.sforce.soap.partner.SessionHeader sessionHeader213,com.sforce.soap.partner.CallOptions callOptions214,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader215,com.sforce.soap.partner.MruHeader mruHeader216,com.sforce.soap.partner.DebuggingHeader debuggingHeader217,com.sforce.soap.partner.EmailHeader emailHeader218)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.InvalidSObjectFault
                        ,com.sforce.soap.partner.InvalidIdFault
                        ,com.sforce.soap.partner.InvalidFieldFault
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    upsert212,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "upsert")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader213!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader213 = toOM(sessionHeader213, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert")));
                                                    addHeader(omElementsessionHeader213,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions214!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions214 = toOM(callOptions214, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert")));
                                                    addHeader(omElementcallOptions214,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (assignmentRuleHeader215!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementassignmentRuleHeader215 = toOM(assignmentRuleHeader215, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert")));
                                                    addHeader(omElementassignmentRuleHeader215,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (mruHeader216!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementmruHeader216 = toOM(mruHeader216, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert")));
                                                    addHeader(omElementmruHeader216,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader217!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader217 = toOM(debuggingHeader217, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert")));
                                                    addHeader(omElementdebuggingHeader217,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (emailHeader218!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementemailHeader218 = toOM(emailHeader218, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "upsert")));
                                                    addHeader(omElementemailHeader218,env);
                                                
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
                     * convert a set of leads
                     * @see com.sforce.soap.partner.SforceService#convertLead
                     * @param convertLead220
                    
                     * @param sessionHeader221
                    
                     * @param callOptions222
                    
                     * @param debuggingHeader223
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.ConvertLeadResponse convertLead(

                            com.sforce.soap.partner.ConvertLead convertLead220,com.sforce.soap.partner.SessionHeader sessionHeader221,com.sforce.soap.partner.CallOptions callOptions222,com.sforce.soap.partner.DebuggingHeader debuggingHeader223)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    convertLead220,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "convertLead")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader221!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader221 = toOM(sessionHeader221, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLead")));
                                                    addHeader(omElementsessionHeader221,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions222!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions222 = toOM(callOptions222, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLead")));
                                                    addHeader(omElementcallOptions222,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader223!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader223 = toOM(debuggingHeader223, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLead")));
                                                    addHeader(omElementdebuggingHeader223,env);
                                                
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
                     * Delete a set of sObjects
                     * @see com.sforce.soap.partner.SforceService#delete
                     * @param delete225
                    
                     * @param sessionHeader226
                    
                     * @param callOptions227
                    
                     * @param userTerritoryDeleteHeader228
                    
                     * @param emailHeader229
                    
                     * @param debuggingHeader230
                    
                     * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
                     */

                    

                            public  com.sforce.soap.partner.DeleteResponse delete(

                            com.sforce.soap.partner.Delete delete225,com.sforce.soap.partner.SessionHeader sessionHeader226,com.sforce.soap.partner.CallOptions callOptions227,com.sforce.soap.partner.UserTerritoryDeleteHeader userTerritoryDeleteHeader228,com.sforce.soap.partner.EmailHeader emailHeader229,com.sforce.soap.partner.DebuggingHeader debuggingHeader230)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.sforce.soap.partner.UnexpectedErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    delete225,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                    "delete")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (sessionHeader226!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementsessionHeader226 = toOM(sessionHeader226, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete")));
                                                    addHeader(omElementsessionHeader226,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (callOptions227!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcallOptions227 = toOM(callOptions227, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete")));
                                                    addHeader(omElementcallOptions227,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (userTerritoryDeleteHeader228!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserTerritoryDeleteHeader228 = toOM(userTerritoryDeleteHeader228, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete")));
                                                    addHeader(omElementuserTerritoryDeleteHeader228,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (emailHeader229!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementemailHeader229 = toOM(emailHeader229, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete")));
                                                    addHeader(omElementemailHeader229,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (debuggingHeader230!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementdebuggingHeader230 = toOM(debuggingHeader230, optimizeContent(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "delete")));
                                                    addHeader(omElementdebuggingHeader230,env);
                                                
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
     //https://www.salesforce.com/services/Soap/u/14.0
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
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.DebuggingHeader param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.DebuggingHeader.MY_QNAME,
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
        
            private  org.apache.axiom.om.OMElement  toOM(com.sforce.soap.partner.fault.InvalidQueryLocatorFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sforce.soap.partner.fault.InvalidQueryLocatorFaultE.MY_QNAME,
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
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.EmailHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.EmailHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.EmailHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.EmailHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.EmailHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.EmailHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (com.sforce.soap.partner.LocaleOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.LocaleOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (com.sforce.soap.partner.LocaleOptions.class.equals(type)){
                
                           return com.sforce.soap.partner.LocaleOptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.EmailHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.EmailHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (com.sforce.soap.partner.UserTerritoryDeleteHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.UserTerritoryDeleteHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.EmailHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.EmailHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingHeader.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sforce.soap.partner.DebuggingInfo.class.equals(type)){
                
                           return com.sforce.soap.partner.DebuggingInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   