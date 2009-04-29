pluginHome = new File("./plugins").listFiles().find { it.name.startsWith('salesforce-')}
if(pluginHome == null) pluginHome = "."

includeTargets << new File( "${pluginHome}/scripts/SalesforceInit.groovy" )

target('default': "Describes the salesforce instance") {
	describe()
}

target(describe: "The implementation task") {
	depends(initSalesforceService)
	salesForceCodeGenService.dumpObjectNames()
  event('StatusFinal', ['Done'])
}
