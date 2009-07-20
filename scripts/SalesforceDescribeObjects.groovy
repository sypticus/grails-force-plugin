import org.codehaus.groovy.grails.commons.GrailsClassUtils as GCU

pluginHome = "${salesforcePluginDir}" + File.separator

includeTargets << new File("${pluginHome}/scripts/SalesforceInit.groovy")

target('default': "Describes all Salesforce objects in the instance.") {
    describe()
}

target(describe: "The implementation task") {
    depends(initSalesforceService)
    salesForceCodeGenService.dumpObjectNames()
    event('StatusFinal', ['Done'])
}