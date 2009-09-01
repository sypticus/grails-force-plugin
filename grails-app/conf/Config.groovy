

// Salesforce config
// This is for Tests only (Should be removed for plugin distribution)
salesforce {
    
    // Environment based configuration
    production {
        
    }
    development {
        user = "carlos.munoz@riptidesoftware.com"
        password = "r1pt1d3wwPp0lKQhsIuXlBifd2KLY3EIna"
        loginThreshold = 3600000
        codegen {
            //pkg = "com.riptideforce.sforce"
        }
    }
    test {
        user = "carlos.munoz@riptidesoftware.com"
        password = "r1pt1d3wwPp0lKQhsIuXlBifd2KLY3EIna"
        loginThreshold = 3600000
        codegen {
            //pkg = "com.riptideforce.sforce"
        }
        sandbox = false
    }
}


// The following properties have been added by the Upgrade process...
grails.views.default.codec="none" // none, html, base64
grails.views.gsp.encoding="UTF-8"
