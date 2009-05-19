
/**
 * UnexpectedErrorFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

package com.sforce.soap.partner;

public class UnexpectedErrorFault extends java.lang.Exception{
    
    private com.sforce.soap.partner.fault.UnexpectedErrorFaultE faultMessage;
    
    public UnexpectedErrorFault() {
        super("UnexpectedErrorFault");
    }
           
    public UnexpectedErrorFault(java.lang.String s) {
       super(s);
    }
    
    public UnexpectedErrorFault(java.lang.String s, java.lang.Throwable ex) {
      super(s, ex);
    }
    
    public void setFaultMessage(com.sforce.soap.partner.fault.UnexpectedErrorFaultE msg){
       faultMessage = msg;
    }
    
    public com.sforce.soap.partner.fault.UnexpectedErrorFaultE getFaultMessage(){
       return faultMessage;
    }
}
    