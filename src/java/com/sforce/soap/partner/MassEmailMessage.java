/**
 * MassEmailMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class MassEmailMessage  extends com.sforce.soap.partner.Email  implements java.io.Serializable {
    private java.lang.String[] targetObjectIds;

    private java.lang.String templateId;

    public MassEmailMessage() {
    }

    public MassEmailMessage(
           java.lang.Boolean bccSender,
           com.sforce.soap.partner.EmailPriority emailPriority,
           java.lang.String replyTo,
           java.lang.Boolean saveAsActivity,
           java.lang.String subject,
           java.lang.Boolean useSignature,
           java.lang.String[] targetObjectIds,
           java.lang.String templateId) {
        super(
            bccSender,
            emailPriority,
            replyTo,
            saveAsActivity,
            subject,
            useSignature);
        this.targetObjectIds = targetObjectIds;
        this.templateId = templateId;
    }


    /**
     * Gets the targetObjectIds value for this MassEmailMessage.
     * 
     * @return targetObjectIds
     */
    public java.lang.String[] getTargetObjectIds() {
        return targetObjectIds;
    }


    /**
     * Sets the targetObjectIds value for this MassEmailMessage.
     * 
     * @param targetObjectIds
     */
    public void setTargetObjectIds(java.lang.String[] targetObjectIds) {
        this.targetObjectIds = targetObjectIds;
    }

    public java.lang.String getTargetObjectIds(int i) {
        return this.targetObjectIds[i];
    }

    public void setTargetObjectIds(int i, java.lang.String _value) {
        this.targetObjectIds[i] = _value;
    }


    /**
     * Gets the templateId value for this MassEmailMessage.
     * 
     * @return templateId
     */
    public java.lang.String getTemplateId() {
        return templateId;
    }


    /**
     * Sets the templateId value for this MassEmailMessage.
     * 
     * @param templateId
     */
    public void setTemplateId(java.lang.String templateId) {
        this.templateId = templateId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MassEmailMessage)) return false;
        MassEmailMessage other = (MassEmailMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targetObjectIds==null && other.getTargetObjectIds()==null) || 
             (this.targetObjectIds!=null &&
              java.util.Arrays.equals(this.targetObjectIds, other.getTargetObjectIds()))) &&
            ((this.templateId==null && other.getTemplateId()==null) || 
             (this.templateId!=null &&
              this.templateId.equals(other.getTemplateId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getTargetObjectIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetObjectIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetObjectIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemplateId() != null) {
            _hashCode += getTemplateId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MassEmailMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "MassEmailMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetObjectIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "targetObjectIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "templateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
