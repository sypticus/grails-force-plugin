import org.codehaus.groovy.grails.commons.GrailsClassUtils as GCU

pluginHome = new File("./plugins").listFiles().find { it.name.startsWith('salesforce-')}
if(pluginHome == null) pluginHome = "."

includeTargets << grailsScript( "Init" )
includeTargets << new File("${pluginHome}/scripts/SalesforceInit.groovy")

target('default': "Describes the Salesforce instance.") {
    describeSingle()
}

target(describeSingle: "The implementation task") {
    depends(parseArguments, initSalesforceService)
    
    // in case there was no name provided
    def params = argsMap["params"] 
    if( params[0] == null ) {
    	println "An object name must be provided."
    }
    
    salesForceCodeGenService.dumpObjectDescription(params[0])
    event('StatusFinal', ['Done'])
}