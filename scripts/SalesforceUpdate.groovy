pluginHome = new File("./plugins").listFiles().find { it.name.startsWith('salesforce-')}
if(pluginHome == null) pluginHome = "."


includeTargets << new File( "${pluginHome}/scripts/SalesforceInit.groovy" )
includeTargets << new File("${pluginHome}/scripts/_CreateSFArtifact.groovy")

target('default': "Updates all SFDC objects") {
	update()
}

target(update: "Update all SFDC objects task") {
	depends(initSalesforceService)
	def names = salesForceCodeGenService.getObjectNames()
	names.each {
		def file = new File("${pluginHome}/src/groovy/com/riptideforce/sfdc/model", it + ".groovy")
		 if (file.exists()){
			file.delete()
		 }
			typeName = ""
			name = it
			artifactName = "DomainClass"
			artifactPath = "${pluginHome}/src/groovy/com/riptideforce/sfdc/model"
			createSFArtifact()
	}
	
	// create the SalesForceService object
	def serviceFile = new File("${pluginHome}/grails-app/services/SalesForceService.groovy")
	if (serviceFile.exists()){
		serviceFile.delete()
	}
	 serviceFile.append("import com.riptideforce.sfdc.model.*\n\n")
	 serviceFile.append("class SalesForceService extends SalesForceBaseService implements java.io.Serializable { \n")
	 serviceFile.append("static transactional = false \n\n")

	def String pluginloc = "${pluginHome}"
	salesForceCodeGenService.generateCode(pluginloc)
	
	serviceFile.append("}")
	
  event('StatusFinal', ['Done'])
}
