
/**
 * LoginFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

package com.sforce.soap.partner;

public class LoginFault extends java.lang.Exception{
    
    private com.sforce.soap.partner.fault.LoginFaultE faultMessage;
    
    public LoginFault() {
        super("LoginFault");
    }
           
    public LoginFault(java.lang.String s) {
       super(s);
    }
    
    public LoginFault(java.lang.String s, java.lang.Throwable ex) {
      super(s, ex);
    }
    
    public void setFaultMessage(com.sforce.soap.partner.fault.LoginFaultE msg){
       faultMessage = msg;
    }
    
    public com.sforce.soap.partner.fault.LoginFaultE getFaultMessage(){
       return faultMessage;
    }
}
    