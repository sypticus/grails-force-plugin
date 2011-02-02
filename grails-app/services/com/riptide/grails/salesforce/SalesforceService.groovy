package com.riptide.grails.salesforce;

import grails.util.Environment;

import org.codehaus.groovy.grails.commons.ConfigurationHolder;

import org.springframework.beans.factory.InitializingBean;

/**
 * Provides access to a Salesforce Org.
 * @author Carlos.Munoz
 *
 */
class SalesforceService extends com.riptide.salesforce.provider.SalesforceService implements InitializingBean {
    
    /**
     * Initializes the properties for the service
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        
        // Get the environment based configuration
        String currentEnv = Environment.current.name
        
        def config = ConfigurationHolder.config.riptide?."${currentEnv}"
        
        this.setUserName( config?.salesforce.userName )
        this.setPassword( config?.salesforce.password )
        this.setApiToken( config?.salesforce.apiToken )
        this.setSandbox( config?.salesforce.isSandbox )
    }

}
