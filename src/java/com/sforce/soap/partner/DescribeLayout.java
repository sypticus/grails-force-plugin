
/**
 * DescribeLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5  Built on : Apr 30, 2009 (06:07:47 EDT)
 */
            
                package com.sforce.soap.partner;
            

            /**
            *  DescribeLayout bean class
            */
        
        public  class DescribeLayout
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = DescribeLayout
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
                        * field for ButtonLayoutSection
                        */

                        
                                    protected com.sforce.soap.partner.DescribeLayoutButtonSection localButtonLayoutSection ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localButtonLayoutSectionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap.partner.DescribeLayoutButtonSection
                           */
                           public  com.sforce.soap.partner.DescribeLayoutButtonSection getButtonLayoutSection(){
                               return localButtonLayoutSection;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ButtonLayoutSection
                               */
                               public void setButtonLayoutSection(com.sforce.soap.partner.DescribeLayoutButtonSection param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localButtonLayoutSectionTracker = true;
                                       } else {
                                          localButtonLayoutSectionTracker = false;
                                              
                                       }
                                   
                                            this.localButtonLayoutSection=param;
                                    

                               }
                            

                        /**
                        * field for DetailLayoutSections
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap.partner.DescribeLayoutSection[] localDetailLayoutSections ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDetailLayoutSectionsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap.partner.DescribeLayoutSection[]
                           */
                           public  com.sforce.soap.partner.DescribeLayoutSection[] getDetailLayoutSections(){
                               return localDetailLayoutSections;
                           }

                           
                        


                               
                              /**
                               * validate the array for DetailLayoutSections
                               */
                              protected void validateDetailLayoutSections(com.sforce.soap.partner.DescribeLayoutSection[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DetailLayoutSections
                              */
                              public void setDetailLayoutSections(com.sforce.soap.partner.DescribeLayoutSection[] param){
                              
                                   validateDetailLayoutSections(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localDetailLayoutSectionsTracker = true;
                                          } else {
                                             localDetailLayoutSectionsTracker = false;
                                                 
                                          }
                                      
                                      this.localDetailLayoutSections=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap.partner.DescribeLayoutSection
                             */
                             public void addDetailLayoutSections(com.sforce.soap.partner.DescribeLayoutSection param){
                                   if (localDetailLayoutSections == null){
                                   localDetailLayoutSections = new com.sforce.soap.partner.DescribeLayoutSection[]{};
                                   }

                            
                                 //update the setting tracker
                                localDetailLayoutSectionsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDetailLayoutSections);
                               list.add(param);
                               this.localDetailLayoutSections =
                             (com.sforce.soap.partner.DescribeLayoutSection[])list.toArray(
                            new com.sforce.soap.partner.DescribeLayoutSection[list.size()]);

                             }
                             

                        /**
                        * field for EditLayoutSections
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap.partner.DescribeLayoutSection[] localEditLayoutSections ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEditLayoutSectionsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap.partner.DescribeLayoutSection[]
                           */
                           public  com.sforce.soap.partner.DescribeLayoutSection[] getEditLayoutSections(){
                               return localEditLayoutSections;
                           }

                           
                        


                               
                              /**
                               * validate the array for EditLayoutSections
                               */
                              protected void validateEditLayoutSections(com.sforce.soap.partner.DescribeLayoutSection[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param EditLayoutSections
                              */
                              public void setEditLayoutSections(com.sforce.soap.partner.DescribeLayoutSection[] param){
                              
                                   validateEditLayoutSections(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localEditLayoutSectionsTracker = true;
                                          } else {
                                             localEditLayoutSectionsTracker = false;
                                                 
                                          }
                                      
                                      this.localEditLayoutSections=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap.partner.DescribeLayoutSection
                             */
                             public void addEditLayoutSections(com.sforce.soap.partner.DescribeLayoutSection param){
                                   if (localEditLayoutSections == null){
                                   localEditLayoutSections = new com.sforce.soap.partner.DescribeLayoutSection[]{};
                                   }

                            
                                 //update the setting tracker
                                localEditLayoutSectionsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localEditLayoutSections);
                               list.add(param);
                               this.localEditLayoutSections =
                             (com.sforce.soap.partner.DescribeLayoutSection[])list.toArray(
                            new com.sforce.soap.partner.DescribeLayoutSection[list.size()]);

                             }
                             

                        /**
                        * field for Id
                        */

                        
                                    protected com.sforce.soap.partner.ID localId ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap.partner.ID
                           */
                           public  com.sforce.soap.partner.ID getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(com.sforce.soap.partner.ID param){
                            
                                            this.localId=param;
                                    

                               }
                            

                        /**
                        * field for RelatedLists
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap.partner.RelatedList[] localRelatedLists ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRelatedListsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap.partner.RelatedList[]
                           */
                           public  com.sforce.soap.partner.RelatedList[] getRelatedLists(){
                               return localRelatedLists;
                           }

                           
                        


                               
                              /**
                               * validate the array for RelatedLists
                               */
                              protected void validateRelatedLists(com.sforce.soap.partner.RelatedList[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RelatedLists
                              */
                              public void setRelatedLists(com.sforce.soap.partner.RelatedList[] param){
                              
                                   validateRelatedLists(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localRelatedListsTracker = true;
                                          } else {
                                             localRelatedListsTracker = false;
                                                 
                                          }
                                      
                                      this.localRelatedLists=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap.partner.RelatedList
                             */
                             public void addRelatedLists(com.sforce.soap.partner.RelatedList param){
                                   if (localRelatedLists == null){
                                   localRelatedLists = new com.sforce.soap.partner.RelatedList[]{};
                                   }

                            
                                 //update the setting tracker
                                localRelatedListsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRelatedLists);
                               list.add(param);
                               this.localRelatedLists =
                             (com.sforce.soap.partner.RelatedList[])list.toArray(
                            new com.sforce.soap.partner.RelatedList[list.size()]);

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
                       DescribeLayout.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":DescribeLayout",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "DescribeLayout",
                           xmlWriter);
                   }

               
                   }
                if (localButtonLayoutSectionTracker){
                                            if (localButtonLayoutSection==null){
                                                 throw new org.apache.axis2.databinding.ADBException("buttonLayoutSection cannot be null!!");
                                            }
                                           localButtonLayoutSection.serialize(new javax.xml.namespace.QName("urn:partner.soap.sforce.com","buttonLayoutSection"),
                                               factory,xmlWriter);
                                        } if (localDetailLayoutSectionsTracker){
                                       if (localDetailLayoutSections!=null){
                                            for (int i = 0;i < localDetailLayoutSections.length;i++){
                                                if (localDetailLayoutSections[i] != null){
                                                 localDetailLayoutSections[i].serialize(new javax.xml.namespace.QName("urn:partner.soap.sforce.com","detailLayoutSections"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("detailLayoutSections cannot be null!!");
                                        
                                    }
                                 } if (localEditLayoutSectionsTracker){
                                       if (localEditLayoutSections!=null){
                                            for (int i = 0;i < localEditLayoutSections.length;i++){
                                                if (localEditLayoutSections[i] != null){
                                                 localEditLayoutSections[i].serialize(new javax.xml.namespace.QName("urn:partner.soap.sforce.com","editLayoutSections"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("editLayoutSections cannot be null!!");
                                        
                                    }
                                 }
                                            if (localId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");
                                            }
                                           localId.serialize(new javax.xml.namespace.QName("urn:partner.soap.sforce.com","id"),
                                               factory,xmlWriter);
                                         if (localRelatedListsTracker){
                                       if (localRelatedLists!=null){
                                            for (int i = 0;i < localRelatedLists.length;i++){
                                                if (localRelatedLists[i] != null){
                                                 localRelatedLists[i].serialize(new javax.xml.namespace.QName("urn:partner.soap.sforce.com","relatedLists"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("relatedLists cannot be null!!");
                                        
                                    }
                                 }
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

                 if (localButtonLayoutSectionTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "buttonLayoutSection"));
                            
                            
                                    if (localButtonLayoutSection==null){
                                         throw new org.apache.axis2.databinding.ADBException("buttonLayoutSection cannot be null!!");
                                    }
                                    elementList.add(localButtonLayoutSection);
                                } if (localDetailLayoutSectionsTracker){
                             if (localDetailLayoutSections!=null) {
                                 for (int i = 0;i < localDetailLayoutSections.length;i++){

                                    if (localDetailLayoutSections[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                          "detailLayoutSections"));
                                         elementList.add(localDetailLayoutSections[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("detailLayoutSections cannot be null!!");
                                    
                             }

                        } if (localEditLayoutSectionsTracker){
                             if (localEditLayoutSections!=null) {
                                 for (int i = 0;i < localEditLayoutSections.length;i++){

                                    if (localEditLayoutSections[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                          "editLayoutSections"));
                                         elementList.add(localEditLayoutSections[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("editLayoutSections cannot be null!!");
                                    
                             }

                        }
                            elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                      "id"));
                            
                            
                                    if (localId==null){
                                         throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");
                                    }
                                    elementList.add(localId);
                                 if (localRelatedListsTracker){
                             if (localRelatedLists!=null) {
                                 for (int i = 0;i < localRelatedLists.length;i++){

                                    if (localRelatedLists[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
                                                                          "relatedLists"));
                                         elementList.add(localRelatedLists[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("relatedLists cannot be null!!");
                                    
                             }

                        }

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
        public static DescribeLayout parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            DescribeLayout object =
                new DescribeLayout();

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
                    
                            if (!"DescribeLayout".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (DescribeLayout)com.sforce.soap.partner.sobject.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","buttonLayoutSection").equals(reader.getName())){
                                
                                                object.setButtonLayoutSection(com.sforce.soap.partner.DescribeLayoutButtonSection.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","detailLayoutSections").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.sforce.soap.partner.DescribeLayoutSection.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("urn:partner.soap.sforce.com","detailLayoutSections").equals(reader.getName())){
                                                                    list2.add(com.sforce.soap.partner.DescribeLayoutSection.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDetailLayoutSections((com.sforce.soap.partner.DescribeLayoutSection[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap.partner.DescribeLayoutSection.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","editLayoutSections").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(com.sforce.soap.partner.DescribeLayoutSection.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
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
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:partner.soap.sforce.com","editLayoutSections").equals(reader.getName())){
                                                                    list3.add(com.sforce.soap.partner.DescribeLayoutSection.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setEditLayoutSections((com.sforce.soap.partner.DescribeLayoutSection[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap.partner.DescribeLayoutSection.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","id").equals(reader.getName())){
                                
                                                object.setId(com.sforce.soap.partner.ID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:partner.soap.sforce.com","relatedLists").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list5.add(com.sforce.soap.partner.RelatedList.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone5 = false;
                                                        while(!loopDone5){
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
                                                                loopDone5 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:partner.soap.sforce.com","relatedLists").equals(reader.getName())){
                                                                    list5.add(com.sforce.soap.partner.RelatedList.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone5 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRelatedLists((com.sforce.soap.partner.RelatedList[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap.partner.RelatedList.class,
                                                                list5));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
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
           
          