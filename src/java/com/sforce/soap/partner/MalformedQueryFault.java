
/**
 * MalformedQueryFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5  Built on : Apr 30, 2009 (06:07:24 EDT)
 */

package com.sforce.soap.partner;

public class MalformedQueryFault extends java.lang.Exception{
    
    private com.sforce.soap.partner.fault.MalformedQueryFaultE faultMessage;

    
        public MalformedQueryFault() {
            super("MalformedQueryFault");
        }

        public MalformedQueryFault(java.lang.String s) {
           super(s);
        }

        public MalformedQueryFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MalformedQueryFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.sforce.soap.partner.fault.MalformedQueryFaultE msg){
       faultMessage = msg;
    }
    
    public com.sforce.soap.partner.fault.MalformedQueryFaultE getFaultMessage(){
       return faultMessage;
    }
}
    