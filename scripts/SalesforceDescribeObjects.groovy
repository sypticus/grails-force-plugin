import org.codehaus.groovy.grails.commons.GrailsClassUtils as GCU

pluginHome = new File("./plugins").listFiles().find { it.name.startsWith('salesforce-')}
if(pluginHome == null) pluginHome = "."

includeTargets << grailsScript( "SalesforceInit" )

target('default': "Describes the Salesforce instance.") {
    describe()
}

target(describe: "The implementation task") {
    depends(initSalesforceService)
    salesForceCodeGenService.dumpObjectNames()
    event('StatusFinal', ['Done'])
}