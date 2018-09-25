/**
 * GXGCommodityInfoResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class GXGCommodityInfoResult  implements java.io.Serializable {
    private int responseCode;

    private java.lang.String message;

    private java.lang.String[] commodityNames;

    private java.lang.String commodityEffectiveDate;

    public GXGCommodityInfoResult() {
    }

    public GXGCommodityInfoResult(
           int responseCode,
           java.lang.String message,
           java.lang.String[] commodityNames,
           java.lang.String commodityEffectiveDate) {
           this.responseCode = responseCode;
           this.message = message;
           this.commodityNames = commodityNames;
           this.commodityEffectiveDate = commodityEffectiveDate;
    }


    /**
     * Gets the responseCode value for this GXGCommodityInfoResult.
     * 
     * @return responseCode
     */
    public int getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this GXGCommodityInfoResult.
     * 
     * @param responseCode
     */
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the message value for this GXGCommodityInfoResult.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GXGCommodityInfoResult.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the commodityNames value for this GXGCommodityInfoResult.
     * 
     * @return commodityNames
     */
    public java.lang.String[] getCommodityNames() {
        return commodityNames;
    }


    /**
     * Sets the commodityNames value for this GXGCommodityInfoResult.
     * 
     * @param commodityNames
     */
    public void setCommodityNames(java.lang.String[] commodityNames) {
        this.commodityNames = commodityNames;
    }


    /**
     * Gets the commodityEffectiveDate value for this GXGCommodityInfoResult.
     * 
     * @return commodityEffectiveDate
     */
    public java.lang.String getCommodityEffectiveDate() {
        return commodityEffectiveDate;
    }


    /**
     * Sets the commodityEffectiveDate value for this GXGCommodityInfoResult.
     * 
     * @param commodityEffectiveDate
     */
    public void setCommodityEffectiveDate(java.lang.String commodityEffectiveDate) {
        this.commodityEffectiveDate = commodityEffectiveDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GXGCommodityInfoResult)) return false;
        GXGCommodityInfoResult other = (GXGCommodityInfoResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.responseCode == other.getResponseCode() &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.commodityNames==null && other.getCommodityNames()==null) || 
             (this.commodityNames!=null &&
              java.util.Arrays.equals(this.commodityNames, other.getCommodityNames()))) &&
            ((this.commodityEffectiveDate==null && other.getCommodityEffectiveDate()==null) || 
             (this.commodityEffectiveDate!=null &&
              this.commodityEffectiveDate.equals(other.getCommodityEffectiveDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getResponseCode();
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getCommodityNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommodityNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommodityNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommodityEffectiveDate() != null) {
            _hashCode += getCommodityEffectiveDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GXGCommodityInfoResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "GXGCommodityInfoResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CommodityNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CommodityEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
