grailsHome = ant.project.properties."environment.GRAILS_HOME"
 
includeTargets << grailsScript("Package") 
includeTargets << grailsScript("Bootstrap")

salesForceCodeGenService = null

target(initSalesforceService: 'Grabs salesforceService from the application context'){
	depends( checkVersion, configureProxy, packageApp, classpath)
	classLoader = new URLClassLoader([classesDir.toURI().toURL()] as URL[], rootLoader)
	Thread.currentThread().setContextClassLoader(classLoader)
	loadApp()
	configureApp()
	salesForceCodeGenService = appCtx.getBean("salesForceCodeGenService")
}
