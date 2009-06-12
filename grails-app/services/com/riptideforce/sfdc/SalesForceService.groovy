/**
 * Salesforce Grails plugin.
 * Riptide Force.
 *
 * Base service that provides runtime access to the Salesforce instance.
 */
package com.riptideforce.sfdc

import com.sforce.soap.partner.*
import com.sforce.soap.partner.sobject.*
import org.apache.axiom.om.*
import com.riptideforce.sfdc.*
import com.riptideforce.sfdc.metadata.*
import com.riptideforce.sfdc.soap.util.SObjectConversionUtil

class SalesForceService extends SalesForceBaseService {


    /**
     * Returns all objects of a given class.
     * The class must be mapped as a Salesforce object.
     */
    public
    List getAllObjects(Class<?> type) {

        SalesforceObject objAnnot = type.getAnnotation( SalesforceObject.class )

        if( objAnnot == null ) {
            throw new RuntimeException("Class provided is not mapped to Salesforce")
        }

        // Get a list of the fields to retreive
        String fieldStr = "";
        type.getDeclaredFields().eachWithIndex { field, idx ->
            if( field.getAnnotation( SalesforceField.class ) != null ) {
                if( fieldStr != "" ) {
                    fieldStr += ", "
                }
                fieldStr += field.getAnnotation( SalesforceField.class ).name()
            }
        }

        def list = fetchAll("Select ${fieldStr} from ${objAnnot.name()}")

        def returnVals = []
        list.each { object->
            returnVals.add(this.buildObject(type, object))
        }
        return returnVals
    }

    /**
     * Returns an object given its type and its Id.
     * The class must be mapped as a Salesforce object.
     */
    public
    Object getObjectById( Class<?> type, String Id ) {

        SalesforceObject objAnnot = type.getAnnotation( SalesforceObject.class )

        if( objAnnot == null ) {
            throw new RuntimeException("Class provided is not mapped to Salesforce")
        }

        // Get a list of the fields to retreive
        String fieldStr = "";
        type.getDeclaredFields().eachWithIndex { field, idx ->
            if( field.getAnnotation( SalesforceField.class ) != null ) {
                if( fieldStr != "" ) {
                    fieldStr += ", "
                }
                fieldStr += field.getAnnotation( SalesforceField.class ).name()
            }
        }

        String id = "'" + id + "'"
        return this.buildObject( type, fetch("Select ${fieldStr} from ${objAnnot.name()} where ID = " + id) )
    }

    /**
     * Returns all objects for a given class that comply with the provided
     * where clause.
     * The class must be mapped as a Salesforce object.
     */
    public
    List getAllObjects( Class<?> type, String whereClause ) {

        SalesforceObject objAnnot = type.getAnnotation( SalesforceObject.class )

        if( objAnnot == null ) {
            throw new RuntimeException("Class provided is not mapped to Salesforce")
        }

        // Get a list of the fields to retreive
        String fieldStr = "";
        type.getDeclaredFields().eachWithIndex { field, idx ->
            if( field.getAnnotation( SalesforceField.class ) != null ) {
                if( fieldStr != "" ) {
                    fieldStr += ", "
                }
                fieldStr += field.getAnnotation( SalesforceField.class ).name()
            }
        }

    	def list = fetchAll("Select ${fieldStr} from ${objAnnot.name()} where " + whereClause)

        def returnVals = []
        list.each { object->
            returnVals.add(this.buildObject(type, object))
        }
        return returnVals
    }

    /**
     * Creates a set of new objects in salesforce.
     * The objects must be mapped as Salesforce objects.
     */
    public SaveResult[] createObjects( Object ... objs ) {

        SObject[] sObjs = new SObject[objs.length]
        int idx = 0;

        objs.each { obj ->

            SalesforceObject objAnnot = obj.getClass().getAnnotation( SalesforceObject.class )

            if( objAnnot == null ) {
                throw new RuntimeException("One of the provided objects is not mapped to Salesforce")
            }
            sObjs[idx++] = this.buildSObjectForCreation(obj)
        }

        return create( sObjs )
    }

    /**
     * Updates a set of objects in salesforce.
     * The objects must be mapped as Salesforce objects.
     */
    public SaveResult[] updateObjects( Object ... objs ) {

        SObject[] sObjs = new SObject[objs.length]
        int idx = 0;

        objs.each { obj ->
            SalesforceObject objAnnot = obj.getClass().getAnnotation( SalesforceObject.class )

            if( objAnnot == null ) {
                throw new RuntimeException("One of the provided objects is not mapped to Salesforce")
            }
            sObjs[idx++] = this.buildSObjectForUpdate(obj)
        }

        return update( sObjs )
    }



    /**
     * Build a groovy object from an SObject definition
     */
    private
    Object buildObject( Class<?> type, SObject so ) {
        OMElement[] elems = so.getExtraElement();
        def object = type.newInstance()
        def typeFields = type.getDeclaredFields()

        // Get the Salesforce class annotation
        SalesforceObject objAnnot = type.getAnnotation( SalesforceObject.class )
        if( objAnnot == null ) {
            throw new RuntimeException("The provided type is not mapped to Salesforce")
        }

        for( OMElement elem : elems ) {

            // Try to find a mapped field to the given sObject local name
            def matchingField =
                typeFields.find {
                    SalesforceField sfFieldAnn = it.getAnnotation(SalesforceField.class)
                    if( sfFieldAnn != null ) {
                        if( sfFieldAnn.name() == elem.getLocalName() ) {
                            return true
                        }
                    }
                    return false
                }

            // invoke the setter if found
            try {
                // find the setter and the argument type
                Class elemType = matchingField.getType()
                String setter = SObjectConversionUtil.getDynamicSetterForField(matchingField.getName());
                object."${setter}"(SObjectConversionUtil.convertToJavaType( elem.getText(), elemType ))
            }
            catch(NoSuchMethodException nsmex) {
                // The plugin classes might be out of date
                // TODO Log a message to warn
            }

        }

        return object
    }

    // Build SObject for creation
    private SObject buildSObjectForCreation( Object obj ) {

        SalesforceObject objAnnot = obj.getClass().getAnnotation( SalesforceObject.class )

        if( objAnnot == null ) {
            throw new RuntimeException("One of the provided objects is not mapped to Salesforce")
        }

        SObject sObj = new SObject();
        sObj.setType(objAnnot.name());

        OMFactory fac = OMAbstractFactory.getOMFactory();

        // For all declared fields
        obj.getClass().getDeclaredFields().each { field ->
            SalesforceField sfAnnotation = field.getAnnotation(SalesforceField.class)

            if( sfAnnotation != null ) {
                if( sfAnnotation.createable() ) {

                    String getter = SObjectConversionUtil.getDynamicGetterForField(field.getName());

                    // get the value
                    Object fieldVal = obj."${getter}"()
                    String fieldName = sfAnnotation.name()

                    // if the field is null
                    if( fieldVal == null ) {
                        sObj.addFieldsToNull( fieldName );
                    }
                    // otherwise
                    else {
                        OMElement newElem =
                            fac.createOMElement(fieldName,
                                fac.createOMNamespace("urn:sobject.partner.soap.sforce.com", "ns2"));
                        newElem.setText( SObjectConversionUtil.convertToString( fieldVal ) );
                        sObj.addExtraElement( newElem );
                    }
                }
            }
        }

        return sObj
    }

    // Build SObject for update
    private SObject buildSObjectForUpdate( Object obj ) {
        SalesforceObject objAnnot = obj.getClass().getAnnotation( SalesforceObject.class )

        if( objAnnot == null ) {
            throw new RuntimeException("One of the provided objects is not mapped to Salesforce")
        }

        SObject sObj = new SObject();
        sObj.setType(objAnnot.name());

        OMFactory fac = OMAbstractFactory.getOMFactory();

        // For all declared fields
        obj.getClass().getDeclaredFields().each { field ->
            SalesforceField sfAnnotation = field.getAnnotation(SalesforceField.class)

            if( sfAnnotation != null ) {
                // Id Field
                if( sfAnnotation.isId() ) {
                    ID objId = new ID();

                    String getter = SObjectConversionUtil.getDynamicGetterForField(field.getName());

                    // get the value
                    Object fieldVal = obj."${getter}"()

                    // set it on the sObject
                    objId.setID( fieldVal );
                    sObj.setId( objId );
                }
                // Updateable field
                else if( sfAnnotation.updateable() ) {

                    String getter = SObjectConversionUtil.getDynamicGetterForField(field.getName());

                    // get the value
                    Object fieldVal = obj."${getter}"()
                    String fieldName = sfAnnotation.name()

                    // if the field is null
                    if( fieldVal == null ) {
                        sObj.addFieldsToNull( fieldName );
                    }
                    // otherwise
                    else {
                        OMElement newElem =
                            fac.createOMElement(fieldName,
                                fac.createOMNamespace("urn:sobject.partner.soap.sforce.com", "ns2"));
                        newElem.setText( SObjectConversionUtil.convertToString( fieldVal ) );
                        sObj.addExtraElement( newElem );
                    }
                }
            }
        }

        return sObj
    }

}

