import org.springframework.beans.factory.InitializingBean;
import com.sforce.soap.partner.sobject.*; 
import com.sforce.soap.partner.*;
import java.lang.reflect.Array;

class SalesForceCodeGenService extends SalesForceBaseService implements java.io.Serializable {   
     static transactional = false   

     public String[] getObjectNames(){
	     DescribeGlobalResult dgr = port.describeGlobal();
       String[] objectNames = dgr.types;
			 return objectNames;
     }

		public void generateCode(String pluginHome) {
		  try {
			  def int describeSObjectsMax = 100;
			  def DescribeGlobalResult dgr = port.describeGlobal();
		    def String[] objectNames = dgr.types;
				
				def totalObjects = objectNames.length
				
				for (int iterationIndex = 0; iterationIndex < totalObjects; iterationIndex += describeSObjectsMax) {
          def int nObjectsThisIteration = describeSObjectsMax;
          if ((totalObjects - iterationIndex) < describeSObjectsMax)
            nObjectsThisIteration = totalObjects - iterationIndex;

				def objectNamesThisIteration = Array.newInstance( objectNames.class.componentType, nObjectsThisIteration)
				System.arraycopy(objectNames, iterationIndex, objectNamesThisIteration, 0, nObjectsThisIteration);
				
				def String[] processing = new String[objectNamesThisIteration.length]
				int count = 0
				objectNamesThisIteration.each{
					processing[count] = it
					count++
				}
				def DescribeSObjectResult[] describeSObjectResults = port.describeSObjects(processing);

		    for (int x=0;x<describeSObjectResults.length;x++) {
		      DescribeSObjectResult describeSObjectResult = describeSObjectResults[x];
					def file = new File(pluginHome + '/src/groovy/com/riptideforce/sfdc/model',  describeSObjectResult.name + '.groovy')
		      // Retrieve fields from the results
		      Field[] fields = describeSObjectResult.getFields();
		      // Get the name of the object
		      String objectName = describeSObjectResult.getName();
		      // Get relatonships
		      ChildRelationship[] relationships = describeSObjectResult.getChildRelationships();
		      // Get some flags
		      boolean isActivateable = describeSObjectResult.isActivateable();
					generateClassProperties(objectName, pluginHome + '/src/groovy/com/riptideforce/sfdc/model', pluginHome, fields, relationships, describeSObjectResult)
		    }
		   }
		  } catch (Exception ex) {
			  ex.printStackTrace()
		    println "\nFailed to get object descriptions, error message was: \n" + ex.getMessage()
		  }
		}
		
		private void generateClassProperties(String name, String path, String pluginHome, com.sforce.soap.partner.Field[] fields, ChildRelationship[] rel, DescribeSObjectResult dsr){
			def f = new File(path + "/" + name + ".groovy")
			def fieldNames = []
			println "Processing file: " + f.name
			def text ="package com.riptideforce.sfdc.model \n"
			text = text + "import java.util.* \n"
			text = text + "import org.joda.time.* \n"
			text = text + "import javax.xml.datatype.XMLGregorianCalendar \n"
			text = text + "import javax.xml.namespace.QName \n"
			text = text + "import org.apache.axis.message.MessageElement \n"
			text = text + "import com.sforce.soap.partner.sobject.SObject \n\n"
		  text = text + "class " + name + " implements java.io.Serializable { \n"
					 fields.each { Field field ->
						   // Handle Properties
							   def type = field.getType().toString()
							   println "Adding Property: " + type + " " + field.getName()
								 fieldNames.add(field.getName())
								 def mappedType = getObjectTypeForField(type)
								 println "Mapped Property " + type + " to " + mappedType
							   text = text + mappedType + " " + field.getName() + "\n"
					 }
					
					 text = text + "\n\n"
					
					// Handle Relationships
					rel.each {
						 def file = new File(path + '/',  it.getChildSObject() + '.groovy')
						if (file.exists()){
						   if (it.getRelationshipName() == null){
					        text = text + it.getChildSObject() + " " + it.getChildSObject() + it.getField() + " \n"
					     } else {
						      text = text + "List<" + it.getChildSObject() + "> " + it.getRelationshipName() + " \n"
					     }
					   }
					}
			
				 text = text + "\n\n"
			 
			   text = text + "public static " + name + " build" + name + "(com.sforce.soap.partner.sobject.SObject so) {\n"
			   text = text + "  def object = new " + name + "() \n"
			   text = text + "  object.Id = so.getId() \n" 
		     text = text + "  MessageElement[] elements = so.get_any() \n"
			   text = text + "  for (int i=0; i < elements.length; i++) { \n"
				         for (int i=0; i < fields.length; i++) {
													if ('Id' != fields[i].getName()){
				                   text = text + "   if ('" + fields[i].getName() + "' == elements[i].getName()){ \n"
			                     text = text + "       object." + fields[i].getName() + " = elements[i].getObjectValue(" + getObjectTypeForField(fields[i].getType().toString()) +".class) \n"
			   		               text = text + "   }\n"
												  }
			            }
			   text = text + "\n  }\n"
									text = text + "return object \n"
		     text = text + "\n\n}\n"
		
			   text = text + "\n\n"
			
				 text = text + "public com.sforce.soap.partner.sobject.SObject buildSObject() {\n"
			   text = text + "  List<MessageElement> elements = []; \n"
			   for (int i=0; i < fields.length; i++) {
				    text = text + "if (this." + fields[i].getName() + "){ \n"
			      text = text + "  elements.add(new MessageElement(new QName('" + fields[i].getName() + "'), this." + fields[i].getName() + ")); \n"
			   		text = text + "}\n"
			    }
			   text = text + "  def sobject = new com.sforce.soap.partner.sobject.SObject(); \n"
			   text = text + "  sobject.setType('" + name + "'); \n"
			   text = text + "  sobject.set_any(elements.toArray(new MessageElement[elements.size()])); \n"
			   text = text + "  return sobject; \n"
				 text = text + " }\n"
				
				 text = text + "\n\n"
			   text = text + "public String toString() {\n"
			   text = text + "return "
			    def val = 0
			   	fieldNames.each { field ->
					    if (val == (fieldNames.size()-1)){
							   text = text + "'" + field + ":' + this." + field + "\n"
							 } else {
								 text = text + "'" + field + ":' + this." + field + " + '\\n' + \n"
							 }
							val++
						}
				text = text + "}\n"
				
		   text = text + "\n\n}\n"
			
			 f.write(text)
			
			 // generate the SalesForceService methods
		   def serviceFile = new File(pluginHome + "/grails-app/services/SalesForceService.groovy")
			
			 if (dsr.queryable){
			 if (fieldNames.size() > 0){
				  def service = "public List<" + name + "> getAll" + name + "s() { \n"
				  
				  // build object query
				  def query = "Select " 
				  def count = 0
					fieldNames.each { field ->
						if (count == (fieldNames.size()-1)){
						  query = query + field + " "
						} else {
							query = query + field + ", "
						}
						count++
					}
				  query = query + "From " + name
				  service = service + "   def list = fetchAll('" + query + "') \n"
			   	service = service + "   def returnvals = [] \n"
			    service = service + "   list.each { object-> \n"
					service = service +"       returnvals.add(" + name + ".build" + name + "(object)) \n"
					service = service +	"   } \n"
				  service = service + "   return returnvals \n"
				  service = service + "}\n\n"
				
				  service = service + "public " + name + " get" + name + "ById(String id) { \n"
				  service = service + " id = \"'\" + id + \"'\" \n"
				  service = service + " return " + name + ".build" + name + "(fetch('" + query + " where ID = ' + id )) \n"
				  service = service + "}\n\n"
				
				  serviceFile.append(service)
			 }
			}
		}
		
     public void dumpObjectNames(){
	     DescribeGlobalResult dgr = port.describeGlobal();
       String[] objectNames = dgr.types;
			 def totalcount = 0
			 def totalqueryable = 0
			 objectNames.each {
			   println it	
			   totalcount++
			 }
			 println "Total Object Count: " + totalcount
     }

		public String getObjectTypeForField(String type){
			String returnVal = null
			switch (type){
					case "string":
				   returnVal = "String"
					break
					case "int":
						returnVal = "Integer"
					break
					case "boolean":
					 returnVal = "Boolean"
					break
					case "date":
						returnVal = "Date"
					break
					case "datetime":
						returnVal = "XMLGregorianCalendar"
					break
					case "base64":
					 	returnVal = "byte[]"
				  default:
			     returnVal = "String"
				  break
		   }
			return returnVal
		}

}