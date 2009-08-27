package com.riptideforce.sfdc;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

/**
 * Returns validation messages for a salesforce object.
 * @author RiptideForce
 */
public class ValidationResult {

    private Hashtable<String, String> validationMessages;
    
    
    public ValidationResult() {
        this.validationMessages = new Hashtable<String, String>();
    }
    
    public boolean isValid() {
        return validationMessages.size() == 0;
    }
    
    public List<String> getAllMessages() {
        ArrayList<String> retVal = new ArrayList<String>();
        Enumeration<String> elems = this.validationMessages.elements();
        while( elems.hasMoreElements() ) {
            retVal.add( elems.nextElement() );
        }
        
        return retVal;
    }
    
    public void addMessage(String field, String message) {
        this.validationMessages.put(field, message);
    }
    
    public String getMessage(String field) {
        return this.validationMessages.get(field);
    }
    
}