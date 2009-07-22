
/**
 * MalformedSearchFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5  Built on : Apr 30, 2009 (06:07:24 EDT)
 */

package com.sforce.soap.partner;

public class MalformedSearchFault extends java.lang.Exception{
    
    private com.sforce.soap.partner.fault.MalformedSearchFaultE faultMessage;

    
        public MalformedSearchFault() {
            super("MalformedSearchFault");
        }

        public MalformedSearchFault(java.lang.String s) {
           super(s);
        }

        public MalformedSearchFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MalformedSearchFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.sforce.soap.partner.fault.MalformedSearchFaultE msg){
       faultMessage = msg;
    }
    
    public com.sforce.soap.partner.fault.MalformedSearchFaultE getFaultMessage(){
       return faultMessage;
    }
}
    