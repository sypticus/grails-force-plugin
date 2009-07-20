import org.codehaus.groovy.grails.commons.GrailsClassUtils as GCU

grailsHome = Ant.project.properties."environment.GRAILS_HOME"

// Plugin home dir
pluginHome = "${salesforcePluginDir}" + File.separator

includeTargets << new File("${pluginHome}/scripts/SalesforceInit.groovy")

target('default': "The description of the script goes here!") {
    cleanSalesforceArtifacts()
}

target(cleanSalesforceArtifacts: "Cleans the generated Salesforce artifacts") {
    depends(initSalesforceService)
    salesForceCodeGenService.cleanSalesforceArtifacts( "${pluginHome}", "${basedir}" )
    event('StatusFinal', ['Done Cleaning'])
}