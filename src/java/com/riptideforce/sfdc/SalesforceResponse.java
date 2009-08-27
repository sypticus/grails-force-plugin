package com.riptideforce.sfdc;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class SalesforceResponse {

    /** Set of Operation results indexed by the target object */
    private HashMap<Object, OperationResult> objectIndex;
    
    /** Set of Operation results indexed by the Salesforce Id */
    private HashMap<String, OperationResult> salesforceIdIndex;
    
    /** List of Operation results */
    private Vector<OperationResult> operationResults;

    public SalesforceResponse(Collection<OperationResult> operationResults) {
        this.operationResults = new Vector<OperationResult>( operationResults );
        this.objectIndex = new HashMap<Object, OperationResult>();
        this.salesforceIdIndex = new HashMap<String, OperationResult>();
        
        for( OperationResult or : this.operationResults ) {
            this.objectIndex.put(or.getSalesforceObject(), or);
            this.salesforceIdIndex.put(or.getTargetSalesforceId(), or);
        }
    }
    
    public OperationResult getBySalesforceId(String sfid) {
        return this.salesforceIdIndex.get(sfid);
    }
    
    public OperationResult getByTargetObject( Object target ) {
        return this.objectIndex.get(target);
    }
    
    public List<OperationResult> getAllResults() {
        return new Vector<OperationResult>( this.operationResults );
    }
    
    public OperationResult getResultAt( int index ) {
        return this.operationResults.elementAt(index);
    }
    
    public int getResultCount() {
        return this.operationResults.size();
    }
    
}
