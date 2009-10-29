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

        def query = this.createBatchedQuery(sfdcClass:type)

        def returnVals = []
        while( !query.isDone() ) {
            def batch = this.nextBatch( query )
            returnVals += batch
        }
        return returnVals
    }
    

    /**
     * Returns an object given its type and its Id.
     * The class must be mapped as a Salesforce object.
     */
    public
    Object getObjectById( Class<?> type, String id ) {

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

        String idStr = "'${id}'"
        return this.buildObject( type, fetch("Select ${fieldStr} from ${objAnnot.name()} where ID = ${idStr}") )
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

        def query = this.createBatchedQuery(sfdcClass:type)

        def returnVals = []
        while( !query.isDone() ) {
            def batch = this.nextBatch( query )
            returnVals += batch
        }
        return returnVals
    }

    /**
     * Creates a set of new objects in salesforce.
     * The objects must be mapped as Salesforce objects.
     */
    public SalesforceResponse createObjects( Object ... objs ) {

        SObject[] sObjs = new SObject[objs.length]

        objs.eachWithIndex { obj, idx ->

            SalesforceObject objAnnot = obj.getClass().getAnnotation( SalesforceObject.class )

            if( objAnnot == null ) {
                throw new RuntimeException("One of the provided objects is not mapped to Salesforce")
            }
            sObjs[idx] = this.buildSObjectForCreation(obj)
        }

        SaveResult[] res = create( sObjs )
        
        // Convert to an OperationResult object
        def results = []
        res.eachWithIndex { it, idx ->
            
            OperationResult objResult = new OperationResult();
            
            objResult.setSuccess(it.success)
            objResult.setTargetSalesforceId(it.getId()?.getID())
            objResult.setSalesforceObject(objs[idx])
            
            if(!it.success) {
                for( Error err : it.getErrors() ) {
                    objResult.getErrors().add(err.getMessage())
                } 
            }
            
            results << objResult
        }
        
        // Return a global response
        return new SalesforceResponse(results)
    }
    
    
    /**
     * Overloading method that takes a list of objects
     */
    public SalesforceResponse createObjects( List objs ) {
        return this.createObjects( objs as Object[] )
    }
    

    /**
     * Updates a set of objects in salesforce.
     * The objects must be mapped as Salesforce objects.
     */
    public SalesforceResponse updateObjects( Object ... objs ) {

        SObject[] sObjs = new SObject[objs.length]

        objs.eachWithIndex { obj, idx ->
            SalesforceObject objAnnot = obj.getClass().getAnnotation( SalesforceObject.class )

            if( objAnnot == null ) {
                throw new RuntimeException("One of the provided objects is not mapped to Salesforce")
            }
            sObjs[idx] = this.buildSObjectForUpdate(obj)
        }

        SaveResult[] res = update( sObjs )
        
        // Convert to an OperationResult object
        def results = []
        res.eachWithIndex { it, idx ->
            
            OperationResult objResult = new OperationResult();
            
            objResult.setSuccess(it.success)
            objResult.setTargetSalesforceId(it.getId()?.getID())
            objResult.setSalesforceObject(objs[idx])
            
            if(!it.success) {
                for( Error err : it.getErrors() ) {
                    objResult.getErrors().add(err.getMessage())
                } 
            }
            
            results << objResult
        }
        
        // Return a global response
        return new SalesforceResponse(results)
    }
    
    
    /**
     * Overloading method that takes a list of objects
     */
    public SalesforceResponse updateObjects( List objs ) {
        return this.updateObjects( objs as Object[] )
    }
    
    
    
    /**
     * Validates that the object is ready to be sent to salesforce
     */
    public ValidationResult validate( Object obj ) {
        
        SalesforceObject objAnnot = obj.getClass().getAnnotation( SalesforceObject.class )
        ValidationResult valRes = new ValidationResult();

        if( objAnnot == null ) {
            throw new RuntimeException("The provided object for validation is not mapped to Salesforce")
        }
        else {
            // For all declared fields
            obj.getClass().getDeclaredFields().each { field ->
                SalesforceField sfAnnotation = field.getAnnotation(SalesforceField.class)

                if( sfAnnotation != null ) {
                    // if the field is required yet not provided
                    if( sfAnnotation.required() && obj."${field.name}" == null ) {
                        valRes.addMessage( field.name, "${field.name} is required by the Salesforce org." )
                    }
                }
            }
        }
    }
    
    
    /**
     * Creates a batched query that will get the objects in batches
     * Params:
     * whereClause - The SOQL valid where clause (without 'where') to use. This
     *               parameter is optional. If not given, it will fetch all objects.
     * sfdcClass - The actual Salesforce mapped class
     */
    public
    BatchedQuery createBatchedQuery( Map params ) {
        // Parse the parameters
        def whereClause = params.whereClause
        def sfdcClass = params.sfdcClass
        
        // Remap the query to the full query
        SalesforceObject objAnnot = sfdcClass.getAnnotation( SalesforceObject.class )

        if( objAnnot == null ) {
            throw new RuntimeException("Class provided is not mapped to Salesforce")
        }

        // Get a list of the fields to retrieve
        String fieldStr = "";
        sfdcClass.getDeclaredFields().eachWithIndex { field, idx ->
            if( field.getAnnotation( SalesforceField.class ) != null ) {
                if( fieldStr != "" ) {
                    fieldStr += ", "
                }
                fieldStr += field.getAnnotation( SalesforceField.class ).name()
            }
        }
        
        // BatchedQuery to return
        BatchedQuery retVal = new BatchedQuery()
        
        retVal.sfdcClass = sfdcClass
        retVal.query = "Select ${fieldStr} from ${objAnnot.name()}"
        if( whereClause ) {
            retVal.query += " where ${whereClause}"
        }
        
        return retVal
    }

    
    /**
     * Gets the next batch from the batched query
     */
    public List nextBatch(BatchedQuery bQuery) {
        def list = this.fetchNextBatch(bQuery)
        
        def returnVals = []
        list.each { object->
            returnVals.add(this.buildObject(bQuery.sfdcClass, object))
        }
        return returnVals
    }

    /**
     * Build a groovy object from an SObject definition
     */
    private
    Object buildObject( Class<?> type, SObject so ) {

        // Return null if there is no object given
        if( !so ) {
            return null;
        }

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
                object."${matchingField.getName()}" = SObjectConversionUtil.convertToJavaType( elem.getText(), elemType )
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

                    // get the value
                    Object fieldVal = obj."${field.getName()}"
                    String fieldName = sfAnnotation.name()

                    // if the field is not null, set it on the SObject
                    if( fieldVal != null ) {
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

                    // get the value
                    Object fieldVal = obj."${field.getName()}"

                    // set it on the sObject
                    objId.setID( fieldVal );
                    sObj.setId( objId );
                }
                // Updateable field
                else if( sfAnnotation.updateable() ) {

                    // get the value
                    Object fieldVal = obj."${field.getName()}"
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

