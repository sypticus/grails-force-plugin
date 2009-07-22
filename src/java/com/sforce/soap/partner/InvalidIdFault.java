
/**
 * InvalidIdFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5  Built on : Apr 30, 2009 (06:07:24 EDT)
 */

package com.sforce.soap.partner;

public class InvalidIdFault extends java.lang.Exception{
    
    private com.sforce.soap.partner.fault.InvalidIdFaultE faultMessage;

    
        public InvalidIdFault() {
            super("InvalidIdFault");
        }

        public InvalidIdFault(java.lang.String s) {
           super(s);
        }

        public InvalidIdFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidIdFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.sforce.soap.partner.fault.InvalidIdFaultE msg){
       faultMessage = msg;
    }
    
    public com.sforce.soap.partner.fault.InvalidIdFaultE getFaultMessage(){
       return faultMessage;
    }
}
    