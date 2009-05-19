import org.codehaus.groovy.grails.commons.GrailsClassUtils as GCU

grailsHome = Ant.project.properties."environment.GRAILS_HOME"

// Plugin home dir
pluginHome = new File("./plugins").listFiles().find { it.name.startsWith('salesforce-')}
if(pluginHome == null) pluginHome = "."

includeTargets << grailsScript ( "Init" )
includeTargets << grailsScript ( "SalesforceInit" )
includeTargets << grailsScript ( "SalesforceClean" )

target('default': "Default target") {
    generateAll()
}

target(generateAll: "Generate code for all Salesforce objects.") {
    depends(initSalesforceService)
    depends(cleanSalesforceArtifacts)
    salesForceCodeGenService.generateCode( "${pluginHome}", "${basedir}" )
    event('StatusFinal', ['Done'])
}