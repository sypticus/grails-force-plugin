package com.riptideforce.sfdc

import groovy.text.SimpleTemplateEngine
import org.codehaus.groovy.grails.commons.ConfigurationHolder
import com.sforce.soap.partner.DescribeSObjectResult

class SalesForceCodeGenService extends SalesForceBaseService {

    boolean transactional = true
    
    /* Default package to use if none is configured */
    private static final String DEFAULT_PKG = "com.riptideforce.sfdc";


    /**
     * Applies a template to given type Description.
     */
    private void applyTemplate(Map binding, String templateLoc, String outputLoc) {

        // Generation Engine
        def engine = new SimpleTemplateEngine()

        // Generate a class file for the object

        // Get the template
        def templateFile = new File("${templateLoc}")
        def template = engine.createTemplate(templateFile).make(binding)

        // Build the file path
        System.out.println("Generating: " + outputLoc)
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
            System.out.println("Error generating file: " + ex.getMessage())
        }

    }
    

    def generateCode(String pluginBasedir, String appDir, boolean generateDomainClass) {

        if (this.loginRequired()) {
            if (!login()) {
                println "Could not login to Salesforce web service."
                return;
            }
        }
        
        // Get the object names
        String[] objectNames = this.getObjectNames()
        // Get the objects Descriptions
        DescribeSObjectResult[] objectDescs =
            this.getFieldsForObjectTypes( objectNames )

        // Get the necessary configuration parameters
        String pkg = DEFAULT_PKG
        if( ConfigurationHolder.config.salesforce.codegen.pkg ) {
            pkg = ConfigurationHolder.config.salesforce.codegen.pkg
        }
        println "package used: " + pkg

        // Generation Engine
        def engine = new SimpleTemplateEngine()

        // Generate a class file for each object
        for( DescribeSObjectResult typeDesc : objectDescs ) {

            String type = typeDesc.getName()

            // Get the class template
            def templateFileName = "${pluginBasedir}${File.separator}grails-app${File.separator}templates" +
                    File.separator + "SforceObject.tmpl"

            // Create a new file based on the template and the binding below
            def binding = [TYPE_NAME: type,
                           PACKAGE: pkg,
                           TYPE_DESC: typeDesc ]

            def pkgToDir = pkg.replace('.' as char, File.separatorChar)

            // Remove the '__c' from the class' file name if needed
            String gClassName = type
            if( gClassName.endsWith("__c") ) {
                gClassName = gClassName.substring(0, gClassName.length()-3)
            }

            // Build the class file path
            String classFileName =
                pluginBasedir + File.separator + "src" + File.separator + "groovy" + File.separator +
                pkgToDir + File.separator + gClassName + ".groovy"


            // print the file
            try {
                this.applyTemplate(binding, templateFileName, classFileName)
            }
            catch( Exception ex ) {
                System.out.println("Error generating file: " + ex.getMessage())
            }


            // Generate the Domain class if so requested
            if(generateDomainClass) {
                templateFileName = "${pluginBasedir}${File.separator}grails-app${File.separator}templates" +
                    File.separator + "SforceDomainObject.tmpl"
                classFileName =
                    "${appDir}${File.separator}grails-app${File.separator}domain${File.separator}" +
                    "${pkgToDir}${File.separator}SF${gClassName}.groovy"

                // print the file
                try {
                    this.applyTemplate(binding, templateFileName, classFileName)
                }
                catch( Exception ex ) {
                    System.out.println("Error generating Domain class file: " + ex.getMessage())
                }
            }

        }

    }


    def generateCodeForSingleObject(String objectName, String pluginBasedir,
                                    String appDir, boolean generateDomainClass) {

        if (this.loginRequired()) {
            if (!login()) {
                println "Could not login to Salesforce web service."
                return;
            }
        }

        // Get the object names
        String[] objectNames = [objectName] as String[]
        // Get the objects Descriptions
        DescribeSObjectResult[] objectDescs =
            this.getFieldsForObjectTypes( objectNames )

        // Get the necessary configuration parameters
        String pkg = DEFAULT_PKG
        if( ConfigurationHolder.config.salesforce.codegen.pkg ) {
            pkg = ConfigurationHolder.config.salesforce.codegen.pkg
        }
        println "package used: " + pkg

        // Find the object description to be generated
        def typeDesc
        boolean found = false
        for( DescribeSObjectResult d : objectDescs ) {
            if( d.getName() == objectName ) {
                found = true
                typeDesc = d
                break
            }
        }

        // Generate a class file for the found object, if any
        if( found ) {

            String type = typeDesc.getName()

            // Create a new file based on the template and the binding below
            def binding = [TYPE_NAME: type,
                           PACKAGE: pkg,
                           TYPE_DESC: typeDesc ]

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
                pluginBasedir + File.separator + "src" + File.separator + "groovy" + File.separator +
                pkgToDir + File.separator + gClassName + ".groovy"


            // print the file
            try {
                this.applyTemplate(binding, templateFileName, classFileName)
            }
            catch( Exception ex ) {
                System.out.println("Error generating file: " + ex.getMessage())
            }


            // Generate the Domain class if so requested
            if(generateDomainClass) {
                templateFileName = "${pluginBasedir}${File.separator}grails-app${File.separator}templates" +
                    File.separator + "SforceDomainObject.tmpl"
                classFileName =
                    "${appDir}${File.separator}grails-app${File.separator}domain${File.separator}" +
                    "${pkgToDir}${File.separator}SF${gClassName}.groovy"

                // print the file
                try {
                    this.applyTemplate(binding, templateFileName, classFileName)
                }
                catch( Exception ex ) {
                    System.out.println("Error generating Domain class file: " + ex.getMessage())
                }
            }

        }
        // Otherwise, it was not found
        else {
            System.out.println("Object with name ${objectName} not found in Salesforce org.")
        }
    }


    def cleanSalesforceArtifacts(String pluginBasedir, String appDir) {

        // Get the necessary configuration parameters
        String pkg = DEFAULT_PKG
        if( ConfigurationHolder.config.salesforce.codegen.pkg ) {
            pkg = ConfigurationHolder.config.salesforce.codegen.pkg
        }

        // Delete every file under the generated salesforce package
        File objDir = new File(
            pluginBasedir + File.separator + "src" + File.separator + "groovy" + File.separator +
            pkg.replace('.' as char, File.separatorChar) )

        objDir.listFiles().each { child ->
            try {
                if( child.exists() ) {
                    child.delete()
                }
            }
            catch( Exception ex ) {
                println "Could not delete ${child.getName()}. Reason: " + ex.getMessage()
            }
        }
    }
    
}
