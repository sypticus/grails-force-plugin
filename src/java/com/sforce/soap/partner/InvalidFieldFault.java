
/**
 * InvalidFieldFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5  Built on : Apr 30, 2009 (06:07:24 EDT)
 */

package com.sforce.soap.partner;

public class InvalidFieldFault extends java.lang.Exception{
    
    private com.sforce.soap.partner.fault.InvalidFieldFaultE faultMessage;

    
        public InvalidFieldFault() {
            super("InvalidFieldFault");
        }

        public InvalidFieldFault(java.lang.String s) {
           super(s);
        }

        public InvalidFieldFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidFieldFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.sforce.soap.partner.fault.InvalidFieldFaultE msg){
       faultMessage = msg;
    }
    
    public com.sforce.soap.partner.fault.InvalidFieldFaultE getFaultMessage(){
       return faultMessage;
    }
}
    