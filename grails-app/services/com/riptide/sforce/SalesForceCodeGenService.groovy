package com.riptide.sforce

import groovy.text.SimpleTemplateEngine
import org.codehaus.groovy.grails.commons.ConfigurationHolder
import com.sforce.soap.partner.DescribeSObjectResult

class SalesForceCodeGenService extends SalesForceBaseService {

    boolean transactional = true

    def generateCode(String pluginBasedir, String appDir) {

        // Get the object names
        String[] objectNames = this.getObjectNames()
        // Get the objects Descriptions
        DescribeSObjectResult[] objectDescs =
            this.getFieldsForObjectTypes( objectNames )

        // Get the necessary configuration parameters
        String pkg = ConfigurationHolder.config.salesforce.codegen.pkg

        
        // Generate the Base Service
        def serviceTemplateFile = new File("${pluginBasedir}${File.separator}grails-app${File.separator}templates"
                + File.separator + "SforceService.tmpl")
        def serviceBinding = [PACKAGE: pkg,
                              TYPE_DESCS: objectDescs ]
        def engine = new SimpleTemplateEngine()
        def serviceTemplate = engine.createTemplate(serviceTemplateFile).make(serviceBinding)

        String serviceClassName = pluginBasedir + File.separator + "grails-app" +
                File.separator + "services" + File.separator + pkg.replace('.' as char, File.separatorChar) +
                File.separator + "SalesForceService.groovy"
        System.out.println("Generating: " + serviceClassName)
        // print the file
        def serviceFile = new File(serviceClassName)
        
        try {
            // create the new file if it does not exist
            if( !serviceFile.exists() ) {
                serviceFile.getParentFile().mkdirs()
                serviceFile.createNewFile()
            }
            serviceFile.withPrintWriter{ pwriter ->
                pwriter.println serviceTemplate.toString()
            }
        }
        catch( Exception ex ) {
            System.out.println("Error generating file: " + ex.getMessage())
        }



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
        String pkg = ConfigurationHolder.config.salesforce.codegen.pkg

        // Delete the Service class
        String serviceClassName = pluginBasedir + File.separator + "grails-app" +
                File.separator + "services" + File.separator + pkg.replace('.' as char, File.separatorChar) +
                File.separator + "SalesForceService.groovy"

        File serviceFile = new File(serviceClassName)
        if( serviceFile.exists() ) {
            try {
                serviceFile.delete()
            }
            catch( Exception ex ) {
                println "Could not delete service file. Reason: " + ex.getMessage()
            }
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
