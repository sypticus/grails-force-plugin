package com.riptideforce.sfdc

import com.riptideforce.sfdc.*
import com.sforce.soap.partner.*
import org.codehaus.groovy.grails.commons.ConfigurationHolderimport grails.util.GrailsUtil
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
        tst1.number = new Double(23);


        // Create
        SalesforceResponse response = salesForceService.createObjects( [tst1] )
        for( r in response.getAllResults() ) {
            println r.getSuccess()
            for( String err : r.getErrors() ) {
                println err
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

        SalesforceResponse response = salesForceService.updateObjects( updatedObjs )
        for( r in response.getAllResults() ) {
            println r.getSuccess()
            for( String err : r.getErrors() ) {
                println err
            }
        }
    }*/

    void testDelete() {
        def objs = salesForceService. getAllObjects(TestObject.class, "Name = 'Object 1' OR Name = 'Object 2'")
        String[] idsToRemove = new String[ objs.size() ]
        def idsList = []

        objs.eachWithIndex { obj, idx ->
            idsToRemove[idx] = obj.getId()
            idsList << obj.getId()
        }

        // Delete
        SalesforceResponse response = salesForceService.delete( idsList )
        for( r in response.getAllResults() ) {
            println r.getSuccess()
            for( String err : r.getErrors() ) {
                println err
            }
        }
    }


    /*void testBatchCreate() {

        def objs = []

        def env = GrailsUtil.getEnvironment()
        
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
        SalesforceResponse response = salesForceService.createObjects( objs as Object[] )
        for( r in response.getAllResults() ) {
            println r.getSuccess()
            for( String err : r.getErrors() ) {
                println err
            }
        }
    }*/


    /*void testBatchUpdate() {

        def objs = salesForceService.getAllObjects(TestObject.class)

        objs.each {
            it.setName( it.getName() + " Modified" )
        }

        SalesforceResponse response = salesForceService.updateObjects( objs as Object[] )
        for( r in response.getAllResults() ) {
            println r.getSuccess()
            for( String err : r.getErrors() ) {
                println err
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
        SalesforceResponse response = salesForceService.delete( ids as String[] )
        for( r in response.getAllResults() ) {
            println r.getSuccess()
            for( String err : r.getErrors() ) {
                println err
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

    /*void testProperties() {

        def objs = salesForceService.getAllObjects(com.riptideforce.sfdc.Property.class)

        salesForceService.updateObjects( objs[1] )
    }*/
}
