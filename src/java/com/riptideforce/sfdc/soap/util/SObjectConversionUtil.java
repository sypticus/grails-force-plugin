package com.riptideforce.sfdc.soap.util;


import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.apache.axiom.om.util.Base64;
import org.apache.axis2.databinding.utils.ConverterUtil;

public class SObjectConversionUtil {

    /**
     * Converts a string to a java type.
     * @param str The string holding the value to convert
     * @param javaType The java class to convert to
     * @return
     */
    public static
    Object convertToJavaType( String str, Class javaType ) {

        Object returnVal = null;

        if( javaType.equals( Integer.class ) ) {
            try {
                returnVal =  new Integer(str);
            }
            catch( Exception ex ) {
                // Ignore
            }
        }
        else if ( javaType.equals( Double.class ) ) {
            try {
                returnVal =  new Double(str);
            }
            catch( Exception ex ) {
                // Ignore
            }
        }
        else if ( javaType.equals( Boolean.class ) ) {
            try {
                returnVal =  new Boolean(str);
            }
            catch( Exception ex ) {
                // Ignore
            }
        }
        else if ( javaType.equals( Date.class ) ) {
            try {
                returnVal =  ConverterUtil.convertToDate(str);
            }
            catch( Exception ex ) {
                // Ignore
            }
        }
        else if ( javaType.equals( Calendar.class ) ) {
            try {
                returnVal =  ConverterUtil.convertToDateTime(str);
            }
            catch( Exception ex ) {
                // Ignore
            }
        }
        else if ( javaType.equals( String.class ) ) {
            returnVal = str;
        }
        else if ( javaType.equals( byte[].class ) ) {
            try {
                returnVal =  Base64.decode(str);
            }
            catch( Exception ex ) {
                // Ignore
            }
        }
        else if ( javaType.equals( List.class ) ) {
            try {
                returnVal = Arrays.asList( str.split(";") );
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

    /**
     * Converts a java object to an SObject accepted string
     * @param obj The java object to converted
     * @return A string representation of the object's value that can be
     * used as an sObject field value.
     */
    public static
    String convertToString( Object obj ) {

        String retVal = "";

        if( obj == null ) {
          // Ignore
        }
        else if( obj instanceof Integer ) {
            retVal = ConverterUtil.convertToString( (Integer)obj );
        }
        else if( obj instanceof Double ) {
            retVal = ConverterUtil.convertToString( (Double)obj );
        }
        else if( obj instanceof Boolean ) {
            retVal = ConverterUtil.convertToString( (Boolean)obj );
        }
        else if( obj instanceof Date ) {
            retVal = ConverterUtil.convertToString( (Date)obj );
        }
        else if( obj instanceof Calendar ) {
            retVal = ConverterUtil.convertToString( (Calendar)obj );
        }
        else if( obj instanceof String ) {
            retVal = obj.toString();
        }
        else if( obj instanceof byte[] ) {
            retVal = ConverterUtil.convertToString( (byte[])obj );
        }
        else if( obj instanceof List ) {
            List array = (List)obj;
            for( int i=0; i< array.size(); i++ ) {
                retVal += array.get(i);
                if( i < array.size()-1 ) {
                  retVal += ";";
                }
            }
        }
        else {
            retVal = obj.toString();
        }

        return retVal;
    }


    public static
    String getDynamicSetterForField( String fieldName ) {

        fieldName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);

        return "set" + fieldName;
    }


    public static
    String getDynamicGetterForField( String fieldName ) {
        fieldName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);

        return "get" + fieldName;
    }

}
