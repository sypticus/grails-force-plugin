package com.riptideforce.sfdc

import com.riptideforce.sfdc.*
import com.sforce.soap.partner.*

class SalesForceBaseServiceTests extends GroovyTestCase {

    static transactional = false;

    def salesForceService


    /*void testCreate() {
        TestObject__c tst1 = new TestObject__c()
        TestObject__c tst2 = new TestObject__c()

        tst1.setName('Object 1')
        tst1.setDescription__c('Descr for object 1')
        tst1.setCustomDate__c( Calendar.getInstance() )
        tst1.setOwnerId( salesForceService.getUserId() )
        tst1.setColor__c("Red")
        tst1.setUses__c(["Home", "Office"])


        // Create
        SaveResult[] res = salesForceService.createObjects( tst1 )
        for( SaveResult r : res ) {
            println r.getSuccess()
            for( Error err : r.getErrors() ) {
                println err.getMessage()
            }
        }
    }*/

    /*void testUpdate() {
        def objs = salesForceService.getAllObjects(TestObject__c.class, "Name = 'Object 1' OR Name = 'Object 2'")
        TestObject__c[] updatedObjs = new TestObject__c[objs.size()]

        objs.eachWithIndex { obj, idx ->
            obj.setDescription__c( obj.getDescription__c() + ' Modified' )
            obj.setColor__c("Yellow")
            obj.setUses__c(null)

            updatedObjs[idx] = obj

        }

        SaveResult[] res = salesForceService.updateObjects( updatedObjs )
        for( SaveResult r : res ) {
            println r.getSuccess()
            for( Error err : r.getErrors() ) {
                println err.getMessage()
            }
        }
    }*/

    void testDelete() {
        def objs = salesForceService. getAllObjects(TestObject__c.class, "Name = 'Object 1' OR Name = 'Object 2'")
        String[] idsToRemove = new String[ objs.size() ]

        objs.eachWithIndex { obj, idx ->
            idsToRemove[idx] = obj.getId()
        }

        // Delete
        DeleteResult[] res = salesForceService.delete( idsToRemove )
        for( DeleteResult r : res ) {
            println r.getSuccess()
            for( Error err : r.getErrors() ) {
                println err.getMessage()
            }
        }
    }
}
