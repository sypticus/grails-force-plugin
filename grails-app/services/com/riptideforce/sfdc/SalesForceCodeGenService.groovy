package com.riptideforce.sfdc

import groovy.text.SimpleTemplateEngine
import org.codehaus.groovy.grails.commons.ConfigurationHolder
import com.sforce.soap.partner.DescribeSObjectResult

class SalesForceCodeGenService extends SalesForceBaseService {

    boolean transactional = true
    
    /* Default package to use if none is configured */
    private static final String DEFAULT_PKG = "com.riptideforce.sfdc";

    def generateCode(String pluginBasedir, String appDir) {

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
            def templateFile = new File("${pluginBasedir}${File.separator}grails-app${File.separator}templates"
                + File.separator + "SforceObject.tmpl")

            // Create a new file based on the template and the binding below
            def binding = [TYPE_NAME: type,
                           PACKAGE: pkg,
                           TYPE_DESC: typeDesc ]

            def template = engine.createTemplate(templateFile).make(binding)
            def pkgToDir = pkg.replace('.' as char, File.separatorChar)
            // Build the class file path
            String classFileName =
                pluginBasedir + File.separator + "src" + File.separator + "groovy" + File.separator +
                pkgToDir + File.separator + type + ".groovy"

            System.out.println("Generating: " + classFileName)
            // print the file
            def classFile = new File(classFileName)
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
