grailsHome = ant.project.properties."environment.GRAILS_HOME"
 
includeTargets << new File("${grailsHome}/scripts/Package.groovy") 
includeTargets << new File("${grailsHome}/scripts/Bootstrap.groovy")

salesForceCodeGenService = null

target(initSalesforceService: 'grabs salesforceService from the application context'){
	depends( checkVersion, configureProxy, packageApp, classpath)
	classLoader = new URLClassLoader([classesDir.toURI().toURL()] as URL[], rootLoader)
	Thread.currentThread().setContextClassLoader(classLoader)
	loadApp()
	configureApp()
	salesForceCodeGenService = appCtx.getBean("salesForceCodeGenService")
}
