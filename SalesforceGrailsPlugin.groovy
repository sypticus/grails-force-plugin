class SalesforceGrailsPlugin {
    def version = 0.1
    def dependsOn = [:]

    // TODO Fill in these fields
    def author = "Zenon Rawley"
    def authorEmail = "zenon.rawley@riptidesoftware.com"
    def title = "Salesforce.com Plugin"
    def description = '''\
This plugin can be used for clean integration into Salesfore.com and Force.com platform from within Grails 1.0.4.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/Salesforce+Plugin"

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }
   
    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)		
    }

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional)
    }
	                                      
    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }
	
    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
