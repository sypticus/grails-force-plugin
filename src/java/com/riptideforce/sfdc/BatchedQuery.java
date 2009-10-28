package com.riptideforce.sfdc;

import com.sforce.soap.partner.QueryLocator;

public class BatchedQuery {

    String query;
    QueryLocator currentQueryLocator;
    boolean done = false;
    Class<?> sfdcClass;
    
    /**
     * Protected Constructor. This class should not be available to construct
     * from outside the package.
     */
    BatchedQuery() {
    }
    
    public boolean isDone() {
        return done;
    }
    
}
