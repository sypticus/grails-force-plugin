package com.riptide.grails.salesforce;

import grails.util.Environment;

import com.sforce.soap.partner.DescribeSObjectResult;

import groovy.text.SimpleTemplateEngine;

import java.util.Map;

import org.codehaus.groovy.grails.commons.ConfigurationHolder;

/**
 * this service is to be only used internally by the plugin. It takes care of source code 
 * generation for the plugin.
 * @author Carlos.Munoz
 *
 */
public class SalesforceGenService extends SalesforceService {
    
    /* Default package to use if none is configured */
    private static final String DEFAULT_PKG = "com.salesforce.sobject";
    
    
    /**
     * Applies a template given a context and an output file location.
     */
    private void applyTemplate(Map binding, String templateLoc, String outputLoc) {

        // Generation Engine
        def engine = new SimpleTemplateEngine()
    
        // Generate a class file for the object
    
        // Get the template
        def templateFile = new File("${templateLoc}")
        def template = engine.createTemplate(templateFile).make(binding)
    
        // Build the file path
        log.info "Generating: " + outputLoc
        // print the file
        def classFile = new File(outputLoc)
        try {
            // create the new file if it does not exist
            if( !classFile.exists() ) {
                classFile.getParentFile().mkdirs()
                classFile.createNewFile()
            }
            classFile.withPrintWriter{ pwriter ->
                pwriter.println template.toString()
            }
        }
        catch( Exception ex ) {
            log.error "Error generating file: " + ex.getMessage()
        }

    }
    
    
    /**
     * Generates a single class from the Salesforce org given a Type Description
     */
    private void generateObject( DescribeSObjectResult typeDesc, String pluginBasedir, String appDir, boolean generateDomainClass ) {
        
        // Get the necessary configuration parameters
        String pkg = DEFAULT_PKG
        if( ConfigurationHolder.config.riptide."${Environment.current.name}".salesforce.codegen.pkg ) {
            pkg = ConfigurationHolder.config.salesforce.codegen.pkg
        }
        log.info "package used: " + pkg
        
        // Description was found
        if( typeDesc ) {
            String type = typeDesc.getName()
            
            // Create a new file based on the template and the binding below
            def context = [TYPE_NAME: type,
                           PACKAGE: pkg,
                           TYPE_DESC: typeDesc,
                           IS_DOMAIN_CLASS: generateDomainClass]

            // Get the class template
            def templateFileName = "${pluginBasedir}${File.separator}grails-app${File.separator}templates" +
                File.separator + "SforceObject.tmpl"

            def pkgToDir = pkg.replace('.' as char, File.separatorChar)

            // Remove the '__c' from the class' file name if needed
            String gClassName = type
            if( gClassName.endsWith("__c") ) {
                gClassName = gClassName.substring(0, gClassName.length()-3)
            }

            // Build the class file path
            String classFileName =
                appDir + File.separator + "src" + File.separator + "groovy" + File.separator +
                pkgToDir + File.separator + gClassName + ".groovy"
                
            // If it is a domain class, generate in the apps domain class dir
            if(generateDomainClass) {
                classFileName =
                    appDir + File.separator + "grails-app" + File.separator + "domain" + File.separator +
                    pkgToDir + File.separator + gClassName + ".groovy"
            }


            // print the file
            try {
                this.applyTemplate(context, templateFileName, classFileName)
            }
            catch( Exception ex ) {
                log.error "Error generating file: " + ex.getMessage()
            }
        }
        else {
            log.error "Object with name ${typeDesc.getName()} not found in Salesforce org."
        }
    }
    
    
    def generateAll(String pluginBasedir, String appDir, boolean generateDomainClass) {
        /** @TODO Implement this method*/ 
        throw new UnsupportedOperationException("Method generateAll is not yet supported");
    }
    
    
    def generateSingle( String sObjName, String pluginBasedir, String appDir, boolean generateDomainClass ) {
        
        // Get the object to generate's description
        DescribeSObjectResult typeDesc = this.describeSObject(sObjName);
        
        // Generate
        this.generateObject(typeDesc, pluginBasedir, appDir, generateDomainClass);
    }

}
