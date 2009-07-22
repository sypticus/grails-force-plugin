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

    /*void testDelete() {
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
    }*/


    /*void testBatchCreate() {

        def objs = []

        for(i in 1..300) {
            TestObject tst1 = new TestObject()

            tst1.setName('Object ' + i)
            tst1.setDescription('Descr for object ' + i)
            tst1.setCustomDate( Calendar.getInstance() )
            tst1.setOwnerId( salesForceService.getUserId() )
            tst1.setColor("Red")
            tst1.setUses(["Home", "Office"])

            objs << tst1

        }

        // Create
        SaveResult[] res = salesForceService.createObjects( objs as Object[] )
        for( SaveResult r : res ) {
            println r.getSuccess()
            for( Error err : r.getErrors() ) {
                println err.getMessage()
            }
        }
    }*/


    /*void testBatchUpdate() {

        def objs = salesForceService.getAllObjects(TestObject.class)

        objs.each {
            it.setName( it.getName() + " Modified" )
        }

        SaveResult[] res = salesForceService.updateObjects( objs as Object[] )
        for( SaveResult r : res ) {
            println r.getSuccess()
            for( Error err : r.getErrors() ) {
                println err.getMessage()
            }
        }

    }*/


    /*void testBatchDelete() {

        def objs = salesForceService.getAllObjects(TestObject.class)

        def ids = []

        objs.each {
            ids << it.getId()
        }


        // Delete
        DeleteResult[] res = salesForceService.delete( ids as String[] )
        for( DeleteResult r : res ) {
            println r.getSuccess()
            for( Error err : r.getErrors() ) {
                println err.getMessage()
            }
        }
    }*/


    /*void testDomainObjects() {
        TestObject tst1 = new TestObject()
        TestObject tst2 = new TestObject()

        tst1.setName('Object 1')
        tst1.setDescription('Descr for object 1')
        tst1.setCustomDate( Calendar.getInstance() )
        tst1.setOwnerId( salesForceService.getUserId() )
        tst1.setColor("Red")
        tst1.setUses(["Home", "Office"])


        SFTestObject sfTst = new SFTestObject()
        sfTst.copyFrom(tst1)
        sfTst.toSalesforceObject()
        sfTst.save(flush:true)
    }*/

    void testProperties() {

        def objs = salesForceService.getAllObjects(com.riptideforce.sfdc.Property.class)

        salesForceService.updateObjects( objs[1] )
    }
}
