package com.riptideforce.sfdc;

import java.util.ArrayList;
import java.util.List;

public class OperationResult {
    
    /** Indicates if the executed Operation was successful */
    private boolean success;
    
    /** Salesforce Id of the object that was just operated on (may be null) */
    private String targetSalesforceId;
    
    /** Validation result (may be null) */
    private List<String> errors = new ArrayList<String>();

    /** Salesforce object that was sent for the update */
    private Object salesforceObject;
    
    
    public Object getSalesforceObject() {
        return salesforceObject;
    }

    public void setSalesforceObject(Object salesforceObject) {
        this.salesforceObject = salesforceObject;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getTargetSalesforceId() {
        return targetSalesforceId;
    }

    public void setTargetSalesforceId(String targetSalesforceId) {
        this.targetSalesforceId = targetSalesforceId;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
    
}
