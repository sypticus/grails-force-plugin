import org.codehaus.groovy.grails.commons.GrailsClassUtils as GCU

grailsHome = Ant.project.properties."environment.GRAILS_HOME"

// Plugin home dir
pluginHome = "${salesforcePluginDir}" + File.separator

includeTargets << grailsScript( "Init" )
includeTargets << new File("${pluginHome}/scripts/SalesforceInit.groovy")

target('default': "Default target") {
    generateAll()
}

target(generateAll: "Generate code for all Salesforce objects.") {
    depends(parseArguments)
    depends(initSalesforceService)
    
    // Expected Parameters
    boolean genDomainClass = false

    // Read all other arguments
    if( argsMap.d ) {
        genDomainClass = true
    }

    salesForceCodeGenService.generateCode( "${pluginHome}", "${basedir}", genDomainClass )
    event('StatusFinal', ['Done'])
}