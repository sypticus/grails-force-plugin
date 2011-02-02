/**
 * Gant Script to generate a single object from the Salesforce org. In order to generate
 * objects, the plugin's Salesforce configuration must be complete in the Config.groovy file.
 * 
 * @author Carlos.Munoz
 */
includeTargets << grailsScript("_GrailsSettings")
includeTargets << grailsScript("_GrailsBootstrap")
includeTargets << grailsScript("_GrailsArgParsing")
includeTargets << grailsScript("_GrailsEvents")

target(default:"Generates a single Salesforce object") {
    depends(checkVersion, configureProxy, packageApp, classpath, loadApp, configureApp, parseArguments)
    
    // Expected Parameters
    def objectName
    boolean genDomainClass = false

    // in case there was no name provided
    def params = argsMap["params"]
    if( params[0] == null ) {
        ant.echo(message: "ERROR: Cannot perform generation: An object name must be provided.")
        return
    }
    else {
        objectName = params[0]
    }

    // Read all other arguments
    if( argsMap.d ) {
        genDomainClass = true
    }
    
    // Plugin home dir
    def pluginHome = "${riptideSalesforcePluginDir}" + File.separator
    
    // Code generation service
    salesforceGenService = appCtx.getBean("salesforceGenService")
    salesforceGenService.generateSingle( objectName, "${pluginHome}", "${basedir}", genDomainClass )
    event('StatusFinal', ["Done generating artefacts for ${objectName}"])
}

