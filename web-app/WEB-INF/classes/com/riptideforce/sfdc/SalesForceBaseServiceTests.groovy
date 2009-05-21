package com.riptideforce.sfdc

import com.riptideforce.sforce.*

class SalesForceBaseServiceTests extends GroovyTestCase {

    static transactional = false;

    def salesForceService


    void testAccounts() {
        def results = salesForceService.getAllMAAX_Asset__cs()
        results.each() { obj ->
            println obj.toString()
        }
    }
}
