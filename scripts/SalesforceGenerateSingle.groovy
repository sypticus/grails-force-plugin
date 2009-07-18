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
    boolean genDomainConversion
    boolean scaffold

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
    (1..<params.length).each {
        def param = params[it]

        // -c : Create conversion code to domain object
        if( param == "-c" ) {
            genDomainConversion = true
        }
        // -s : Scaffold generated objects after conversion
        else if( param == "-s" ) {
            scaffold = true
        }
    }

    salesForceCodeGenService.generateCodeForSingleObject( objectName, "${pluginHome}", "${basedir}" )
    event('StatusFinal', ['Done'])
}