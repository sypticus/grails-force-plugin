package com.riptideforce.sfdc.soap.util;


import org.apache.axiom.om.util.Base64;
import org.apache.axis2.databinding.utils.ConverterUtil;

public class SObjectConversionUtil {

    public static
    Object convertToJavaType( String str, String javaType ) {
        
        Object returnVal = null;
        
        if( javaType.equals("Integer") ) {
            try {
                returnVal =  new Integer(str);
            }
            catch( Exception ex ) {
                // Ignore
            }
        }
        else if ( javaType.equals("Double") ) {
            try {
                returnVal =  new Double(str);
            }
            catch( Exception ex ) {
                // Ignore
            }
        }
        else if ( javaType.equals("Boolean") ) {
            try {
                returnVal =  new Boolean(str);
            }
            catch( Exception ex ) {
                // Ignore
            }
        }
        else if ( javaType.equals("Date") ) {
            try {
                returnVal =  ConverterUtil.convertToDate(str);
            }
            catch( Exception ex ) {
                // Ignore
            }
        }
        else if ( javaType.equals("Calendar") ) {
            try {
                returnVal =  ConverterUtil.convertToDateTime(str);
            }
            catch( Exception ex ) {
                // Ignore
            }
        }
        else if ( javaType.equals("String") ) {
            returnVal = str;
        }
        else if ( javaType.equals("byte[]") ) {
            try {
                returnVal =  Base64.decode(str);
            }
            catch( Exception ex ) {
                // Ignore
            }
        }
        else {
            returnVal = null;
        }
        
        return returnVal;
    }
	
}
