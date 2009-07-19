import org.codehaus.groovy.grails.commons.GrailsClassUtils as GCU

grailsHome = Ant.project.properties."environment.GRAILS_HOME"

// Plugin home dir
pluginHome = new File("./plugins").listFiles().find { it.name.startsWith('salesforce-')}
if(pluginHome == null) pluginHome = "."

includeTargets << grailsScript( "Init" )
includeTargets << new File("${pluginHome}/scripts/SalesforceInit.groovy")

target('default': "Generates a single object from Salesforce") {
    generateSingle()
}

target(generateSingle: "The implementation task") {
    depends(parseArguments, initSalesforceService)

    // Expected Parameters
    def objectName
    boolean genDomainClass = false

    // in case there was no name provided
    def params = argsMap["params"]
    if( params[0] == null ) {
    	println "An object name must be provided."
        return
    }
    else {
        objectName = params[0]
    }

    // Read all other arguments
    if( argsMap.d ) {
        genDomainClass = true
    }

    salesForceCodeGenService.generateCodeForSingleObject( objectName, "${pluginHome}", "${basedir}", genDomainClass )
    event('StatusFinal', ['Done'])
}