package com.riptideforce.sfdc

import com.riptideforce.sfdc.*
import com.sforce.soap.partner.*

class SalesForceBaseServiceTests extends GroovyTestCase {

    static transactional = false;

    def salesForceService


    /*void testCreate() {
        TestObject tst1 = new TestObject()
        TestObject tst2 = new TestObject()

        tst1.setName('Object 1')
        tst1.setDescription('Descr for object 1')
        tst1.setCustomDate( Calendar.getInstance() )
        tst1.setOwnerId( salesForceService.getUserId() )
        tst1.setColor("Red")
        tst1.setUses(["Home", "Office"])


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
        def objs = salesForceService.getAllObjects(TestObject.class, "Name = 'Object 1' OR Name = 'Object 2'")
        TestObject[] updatedObjs = new TestObject[objs.size()]

        objs.eachWithIndex { obj, idx ->
            obj.setDescription( obj.getDescription() + ' Modified' )
            obj.setColor("Yellow")
            obj.setUses(null)

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
        def objs = salesForceService. getAllObjects(TestObject.class, "Name = 'Object 1' OR Name = 'Object 2'")
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
