
/**
 * DescribeSObjectResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5  Built on : Apr 30, 2009 (06:07:47 EDT)
 */
            
                package com.sforce.soap.partner;
            

            /**
            *  DescribeSObjectResult bean class
            */
        
        public  class DescribeSObjectResult
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = DescribeSObjectResult
                Namespace URI = urn:partner.soap.sforce.com
                Namespace Prefix = ns1
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:partner.soap.sforce.com")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for Activateable
                        */

                        
                                    protected boolean localActivateable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getActivateable(){
                               return localActivateable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Activateable
                               */
                               public void setActivateable(boolean param){
                            
                                            this.localActivateable=param;
                                    

                               }
                            

                        /**
                        * field for ChildRelationships
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap.partner.ChildRelationship[] localChildRelationships ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChildRelationshipsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap.partner.ChildRelationship[]
                           */
                           public  com.sforce.soap.partner.ChildRelationship[] getChildRelationships(){
                               return localChildRelationships;
                           }

                           
                        


                               
                              /**
                               * validate the array for ChildRelationships
                               */
                              protected void validateChildRelationships(com.sforce.soap.partner.ChildRelationship[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ChildRelationships
                              */
                              public void setChildRelationships(com.sforce.soap.partner.ChildRelationship[] param){
                              
                                   validateChildRelationships(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localChildRelationshipsTracker = true;
                                          } else {
                                             localChildRelationshipsTracker = false;
                                                 
                                          }
                                      
                                      this.localChildRelationships=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap.partner.ChildRelationship
                             */
                             public void addChildRelationships(com.sforce.soap.partner.ChildRelationship param){
                                   if (localChildRelationships == null){
                                   localChildRelationships = new com.sforce.soap.partner.ChildRelationship[]{};
                                   }

                            
                                 //update the setting tracker
                                localChildRelationshipsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localChildRelationships);
                               list.add(param);
                               this.localChildRelationships =
                             (com.sforce.soap.partner.ChildRelationship[])list.toArray(
                            new com.sforce.soap.partner.ChildRelationship[list.size()]);

                             }
                             

                        /**
                        * field for Createable
                        */

                        
                                    protected boolean localCreateable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCreateable(){
                               return localCreateable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Createable
                               */
                               public void setCreateable(boolean param){
                            
                                            this.localCreateable=param;
                                    

                               }
                            

                        /**
                        * field for Custom
                        */

                        
                                    protected boolean localCustom ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCustom(){
                               return localCustom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Custom
                               */
                               public void setCustom(boolean param){
                            
                                            this.localCustom=param;
                                    

                               }
                            

                        /**
                        * field for Deletable
                        */

                        
                                    protected boolean localDeletable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDeletable(){
                               return localDeletable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Deletable
                               */
                               public void setDeletable(boolean param){
                            
                                            this.localDeletable=param;
                                    

                               }
                            

                        /**
                        * field for Deprecated
                        */

                        
                                    protected boolean localDeprecated ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeprecatedTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDeprecated(){
                               return localDeprecated;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Deprecated
                               */
                               public void setDeprecated(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localDeprecatedTracker = false;
                                              
                                       } else {
                                          localDeprecatedTracker = true;
                                       }
                                   
                                            this.localDeprecated=param;
                                    

                               }
                            

                        /**
                        * field for DeprecatedAndHidden
                        */

                        
                                    protected boolean localDeprecatedAndHidden ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeprecatedAndHiddenTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDeprecatedAndHidden(){
                               return localDeprecatedAndHidden;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DeprecatedAndHidden
                               */
                               public void setDeprecatedAndHidden(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localDeprecatedAndHiddenTracker = false;
                                              
                                       } else {
                                          localDeprecatedAndHiddenTracker = true;
                                       }
                                   
                                            this.localDeprecatedAndHidden=param;
                                    

                               }
                            

                        /**
                        * field for Fields
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap.partner.Field[] localFields ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFieldsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap.partner.Field[]
                           */
                           public  com.sforce.soap.partner.Field[] getFields(){
                               return localFields;
                           }

                           
                        


                               
                              /**
                               * validate the array for Fields
                               */
                              protected void validateFields(com.sforce.soap.partner.Field[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Fields
                              */
                              public void setFields(com.sforce.soap.partner.Field[] param){
                              
                                   validateFields(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localFieldsTracker = true;
                                          } else {
                                             localFieldsTracker = true;
                                                 
                                          }
                                      
                                      this.localFields=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap.partner.Field
                             */
                             public void addFields(com.sforce.soap.partner.Field param){
                                   if (localFields == null){
                                   localFields = new com.sforce.soap.partner.Field[]{};
                                   }

                            
                                 //update the setting tracker
                                localFieldsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localFields);
                               list.add(param);
                               this.localFields =
                             (com.sforce.soap.partner.Field[])list.toArray(
                            new com.sforce.soap.partner.Field[list.size()]);

                             }
                             

                        /**
                        * field for KeyPrefix
                        */

                        
                                    protected java.lang.String localKeyPrefix ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getKeyPrefix(){
                               return localKeyPrefix;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyPrefix
                               */
                               public void setKeyPrefix(java.lang.String param){
                            
                                            this.localKeyPrefix=param;
                                    

                               }
                            

                        /**
                        * field for Label
                        */

                        
                                    protected java.lang.String localLabel ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLabel(){
                               return localLabel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Label
                               */
                               public void setLabel(java.lang.String param){
                            
                                            this.localLabel=param;
                                    

                               }
                            

                        /**
                        * field for LabelPlural
                        */

                        
                                    protected java.lang.String localLabelPlural ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLabelPlural(){
                               return localLabelPlural;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LabelPlural
                               */
                               public void setLabelPlural(java.lang.String param){
                            
                                            this.localLabelPlural=param;
                                    

                               }
                            

                        /**
                        * field for Layoutable
                        */

                        
                                    protected boolean localLayoutable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getLayoutable(){
                               return localLayoutable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Layoutable
                               */
                               public void setLayoutable(boolean param){
                            
                                            this.localLayoutable=param;
                                    

                               }
                            

                        /**
                        * field for Mergeable
                        */

                        
                                    protected boolean localMergeable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getMergeable(){
                               return localMergeable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Mergeable
                               */
                               public void setMergeable(boolean param){
                            
                                            this.localMergeable=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        */

                        
                                    protected java.lang.String localName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for Queryable
                        */

                        
                                    protected boolean localQueryable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getQueryable(){
                               return localQueryable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Queryable
                               */
                               public void setQueryable(boolean param){
                            
                                            this.localQueryable=param;
                                    

                               }
                            

                        /**
                        * field for RecordTypeInfos
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap.partner.RecordTypeInfo[] localRecordTypeInfos ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRecordTypeInfosTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap.partner.RecordTypeInfo[]
                           */
                           public  com.sforce.soap.partner.RecordTypeInfo[] getRecordTypeInfos(){
                               return localRecordTypeInfos;
                           }

                           
                        


                               
                              /**
                               * validate the array for RecordTypeInfos
                               */
                              protected void validateRecordTypeInfos(com.sforce.soap.partner.RecordTypeInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RecordTypeInfos
                              */
                              public void setRecordTypeInfos(com.sforce.soap.partner.RecordTypeInfo[] param){
                              
                                   validateRecordTypeInfos(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localRecordTypeInfosTracker = true;
                                          } else {
                                             localRecordTypeInfosTracker = false;
                                                 
                                          }
                                      
                                      this.localRecordTypeInfos=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap.partner.RecordTypeInfo
                             */
                             public void addRecordTypeInfos(com.sforce.soap.partner.RecordTypeInfo param){
                                   if (localRecordTypeInfos == null){
                                   localRecordTypeInfos = new com.sforce.soap.partner.RecordTypeInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localRecordTypeInfosTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRecordTypeInfos);
                               list.add(param);
                               this.localRecordTypeInfos =
                             (com.sforce.soap.partner.RecordTypeInfo[])list.toArray(
                            new com.sforce.soap.partner.RecordTypeInfo[list.size()]);

                             }
                             

                        /**
                        * field for Replicateable
                        */

                        
                                    protected boolean localReplicateable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReplicateable(){
                               return localReplicateable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Replicateable
                               */
                               public void setReplicateable(boolean param){
                            
                                            this.localReplicateable=param;
                                    

                               }
                            

                        /**
                        * field for Retrieveable
                        */

                        
                                    protected boolean localRetrieveable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getRetrieveable(){
                               return localRetrieveable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Retrieveable
                               */
                               public void setRetrieveable(boolean param){
                            
                                            this.localRetrieveable=param;
                                    

                               }
                            

                        /**
                        * field for Searchable
                        */

                        
                                    protected boolean localSearchable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSearchable(){
                               return localSearchable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Searchable
                               */
                               public void setSearchable(boolean param){
                            
                                            this.localSearchable=param;
                                    

                               }
                            

                        /**
                        * field for Triggerable
                        */

                        
                                    protected boolean localTriggerable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTriggerableTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getTriggerable(){
                               return localTriggerable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Triggerable
                               */
                               public void setTriggerable(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localTriggerableTracker = false;
                                              
                                       } else {
                                          localTriggerableTracker = true;
                                       }
                                   
                                            this.localTriggerable=param;
                                    

                               }
                            

                        /**
                        * field for Undeletable
                        */

                        
                                    protected boolean localUndeletable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUndeletable(){
                               return localUndeletable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Undeletable
                               */
                               public void setUndeletable(boolean param){
                            
                                            this.localUndeletable=param;
                                    

                               }
                            

                        /**
                        * field for Updateable
                        */

                        
                                    protected boolean localUpdateable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUpdateable(){
                               return localUpdateable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Updateable
                               */
                               public void setUpdateable(boolean param){
                            
                                            this.localUpdateable=param;
                                    

                               }
                            

                        /**
                        * field for UrlDetail
                        */

                        
                                    protected java.lang.String localUrlDetail ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUrlDetail(){
                               return localUrlDetail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UrlDetail
                               */
                               public void setUrlDetail(java.lang.String param){
                            
                                            this.localUrlDetail=param;
                                    

                               }
                            

                        /**
                        * field for UrlEdit
                        */

                        
                                    protected java.lang.String localUrlEdit ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUrlEdit(){
                               return localUrlEdit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UrlEdit
                               */
                               public void setUrlEdit(java.lang.String param){
                            
                                            this.localUrlEdit=param;
                                    

                               }
                            

                        /**
                        * field for UrlNew
                        */

                        
                                    protected java.lang.String localUrlNew ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUrlNew(){
                               return localUrlNew;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UrlNew
                               */
                               public void setUrlNew(java.lang.String param){
                            
                                            this.localUrlNew=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       DescribeSObjectResult.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:partner.soap.sforce.com");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":DescribeSObjectResult",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "DescribeSObjectResult",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"activateable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"activateable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("activateable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("activateable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActivateable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localChildRelationshipsTracker){
                                       if (localChildRelationships!=null){
                                            for (int i = 0;i < localChildRelationships.length;i++){
                                                if (localChildRelationships[i] != null){
                                                 localChildRelationships[i].serialize(new javax.xml.namespace.QName("urn:partner.soap.sforce.com","childRelationships"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("childRelationships cannot be null!!");
                                        
                                    }
                                 }
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"createable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"createable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("createable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("createable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreateable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"custom", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"custom");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("custom");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("custom cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustom));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"deletable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"deletable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("deletable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("deletable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeletable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localDeprecatedTracker){
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"deprecated", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"deprecated");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("deprecated");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("deprecated cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeprecated));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDeprecatedAndHiddenTracker){
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"deprecatedAndHidden", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"deprecatedAndHidden");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("deprecatedAndHidden");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("deprecatedAndHidden cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeprecatedAndHidden));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFieldsTracker){
                                       if (localFields!=null){
                                            for (int i = 0;i < localFields.length;i++){
                                                if (localFields[i] != null){
                                                 localFields[i].serialize(new javax.xml.namespace.QName("urn:partner.soap.sforce.com","fields"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                            // write null attribute
                                                            java.lang.String namespace2 = "urn:partner.soap.sforce.com";
                                                            if (! namespace2.equals("")) {
                                                                java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                                                if (prefix2 == null) {
                                                                    prefix2 = generatePrefix(namespace2);

                                                                    xmlWriter.writeStartElement(prefix2,"fields", namespace2);
                                                                    xmlWriter.writeNamespace(prefix2, namespace2);
                                                                    xmlWriter.setPrefix(prefix2, namespace2);

                                                                } else {
                                                                    xmlWriter.writeStartElement(namespace2,"fields");
                                                                }

                                                            } else {
                                                                xmlWriter.writeStartElement("fields");
                                                            }

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                // write null attribute
                                                java.lang.String namespace2 = "urn:partner.soap.sforce.com";
                                                if (! namespace2.equals("")) {
                                                    java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                                    if (prefix2 == null) {
                                                        prefix2 = generatePrefix(namespace2);

                                                        xmlWriter.writeStartElement(prefix2,"fields", namespace2);
                                                        xmlWriter.writeNamespace(prefix2, namespace2);
                                                        xmlWriter.setPrefix(prefix2, namespace2);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace2,"fields");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("fields");
                                                }

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 }
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"keyPrefix", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"keyPrefix");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("keyPrefix");
                                    }
                                

                                          if (localKeyPrefix==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localKeyPrefix);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"label", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"label");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("label");
                                    }
                                

                                          if (localLabel==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("label cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLabel);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"labelPlural", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"labelPlural");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("labelPlural");
                                    }
                                

                                          if (localLabelPlural==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("labelPlural cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLabelPlural);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"layoutable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"layoutable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("layoutable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("layoutable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLayoutable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"mergeable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"mergeable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("mergeable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("mergeable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMergeable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"name", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"name");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("name");
                                    }
                                

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"queryable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"queryable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("queryable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("queryable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueryable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localRecordTypeInfosTracker){
                                       if (localRecordTypeInfos!=null){
                                            for (int i = 0;i < localRecordTypeInfos.length;i++){
                                                if (localRecordTypeInfos[i] != null){
                                                 localRecordTypeInfos[i].serialize(new javax.xml.namespace.QName("urn:partner.soap.sforce.com","recordTypeInfos"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("recordTypeInfos cannot be null!!");
                                        
                                    }
                                 }
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"replicateable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"replicateable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("replicateable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("replicateable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReplicateable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"retrieveable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"retrieveable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("retrieveable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("retrieveable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRetrieveable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"searchable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"searchable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("searchable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("searchable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSearchable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localTriggerableTracker){
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"triggerable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"triggerable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("triggerable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("triggerable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTriggerable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"undeletable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"undeletable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("undeletable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("undeletable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUndeletable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"updateable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"updateable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("updateable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("updateable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"urlDetail", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"urlDetail");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("urlDetail");
                                    }
                                

                                          if (localUrlDetail==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUrlDetail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"urlEdit", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"urlEdit");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("urlEdit");
                                    }
                                

                                          if (localUrlEdit==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUrlEdit);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:partner.soap.sforce.com";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"urlNew", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"urlNew");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("urlNew");
                                    }
                                

                                          if (localUrlNew==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUrlNew);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "activateable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActivateable));
                             if (localChildRelationshipsTracker){
                             if (localChildRelationships!=null) {
                                 for (int i = 0;i < localChildRelationships.length;i++){

                                    if (localChildRelationships[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                          "childRelationships"));
                                         elementList.add(localChildRelationships[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("childRelationships cannot be null!!");
                                    
                             }

                        }
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "createable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreateable));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "custom"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustom));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "deletable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeletable));
                             if (localDeprecatedTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "deprecated"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeprecated));
                            } if (localDeprecatedAndHiddenTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "deprecatedAndHidden"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeprecatedAndHidden));
                            } if (localFieldsTracker){
                             if (localFields!=null) {
                                 for (int i = 0;i < localFields.length;i++){

                                    if (localFields[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                          "fields"));
                                         elementList.add(localFields[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                          "fields"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                          "fields"));
                                        elementList.add(localFields);
                                    
                             }

                        }
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "keyPrefix"));
                                 
                                         elementList.add(localKeyPrefix==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyPrefix));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "label"));
                                 
                                        if (localLabel != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLabel));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("label cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "labelPlural"));
                                 
                                        if (localLabelPlural != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLabelPlural));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("labelPlural cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "layoutable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLayoutable));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "mergeable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMergeable));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "name"));
                                 
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "queryable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueryable));
                             if (localRecordTypeInfosTracker){
                             if (localRecordTypeInfos!=null) {
                                 for (int i = 0;i < localRecordTypeInfos.length;i++){

                                    if (localRecordTypeInfos[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                          "recordTypeInfos"));
                                         elementList.add(localRecordTypeInfos[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("recordTypeInfos cannot be null!!");
                                    
                             }

                        }
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "replicateable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReplicateable));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "retrieveable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRetrieveable));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "searchable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSearchable));
                             if (localTriggerableTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "triggerable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTriggerable));
                            }
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "undeletable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUndeletable));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "updateable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateable));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "urlDetail"));
                                 
                                         elementList.add(localUrlDetail==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUrlDetail));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "urlEdit"));
                                 
                                         elementList.add(localUrlEdit==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUrlEdit));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "urlNew"));
                                 
                                         elementList.add(localUrlNew==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUrlNew));
                                    

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static DescribeSObjectResult parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            DescribeSObjectResult object =
                new DescribeSObjectResult();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"DescribeSObjectResult".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (DescribeSObjectResult)com.sforce.soap.partner.sobject.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                        java.util.ArrayList list16 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","activateable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setActivateable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","childRelationships").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.sforce.soap.partner.ChildRelationship.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:partner.soap.sforce.com","childRelationships").equals(reader.getName())){
                                                                    list2.add(com.sforce.soap.partner.ChildRelationship.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setChildRelationships((com.sforce.soap.partner.ChildRelationship[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap.partner.ChildRelationship.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","createable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreateable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","custom").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCustom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","deletable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDeletable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","deprecated").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDeprecated(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","deprecatedAndHidden").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDeprecatedAndHidden(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","fields").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list8.add(null);
                                                              reader.next();
                                                          } else {
                                                        list8.add(com.sforce.soap.partner.Field.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone8 = false;
                                                        while(!loopDone8){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone8 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:partner.soap.sforce.com","fields").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list8.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list8.add(com.sforce.soap.partner.Field.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone8 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setFields((com.sforce.soap.partner.Field[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap.partner.Field.class,
                                                                list8));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","keyPrefix").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setKeyPrefix(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","label").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLabel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","labelPlural").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLabelPlural(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","layoutable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLayoutable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","mergeable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMergeable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","name").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","queryable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQueryable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","recordTypeInfos").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list16.add(com.sforce.soap.partner.RecordTypeInfo.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone16 = false;
                                                        while(!loopDone16){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone16 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:partner.soap.sforce.com","recordTypeInfos").equals(reader.getName())){
                                                                    list16.add(com.sforce.soap.partner.RecordTypeInfo.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone16 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRecordTypeInfos((com.sforce.soap.partner.RecordTypeInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap.partner.RecordTypeInfo.class,
                                                                list16));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","replicateable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReplicateable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","retrieveable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRetrieveable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","searchable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSearchable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","triggerable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTriggerable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","undeletable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUndeletable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","updateable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdateable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","urlDetail").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUrlDetail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","urlEdit").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUrlEdit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","urlNew").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUrlNew(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          