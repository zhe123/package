/**
 * GetCurrentShipmentByRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class GetCurrentShipmentByRange  implements java.io.Serializable {
    private java.lang.String accessToken;

    private int startRowNumber;

    private int endRowNumber;

    public GetCurrentShipmentByRange() {
    }

    public GetCurrentShipmentByRange(
           java.lang.String accessToken,
           int startRowNumber,
           int endRowNumber) {
           this.accessToken = accessToken;
           this.startRowNumber = startRowNumber;
           this.endRowNumber = endRowNumber;
    }


    /**
     * Gets the accessToken value for this GetCurrentShipmentByRange.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this GetCurrentShipmentByRange.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }


    /**
     * Gets the startRowNumber value for this GetCurrentShipmentByRange.
     * 
     * @return startRowNumber
     */
    public int getStartRowNumber() {
        return startRowNumber;
    }


    /**
     * Sets the startRowNumber value for this GetCurrentShipmentByRange.
     * 
     * @param startRowNumber
     */
    public void setStartRowNumber(int startRowNumber) {
        this.startRowNumber = startRowNumber;
    }


    /**
     * Gets the endRowNumber value for this GetCurrentShipmentByRange.
     * 
     * @return endRowNumber
     */
    public int getEndRowNumber() {
        return endRowNumber;
    }


    /**
     * Sets the endRowNumber value for this GetCurrentShipmentByRange.
     * 
     * @param endRowNumber
     */
    public void setEndRowNumber(int endRowNumber) {
        this.endRowNumber = endRowNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCurrentShipmentByRange)) return false;
        GetCurrentShipmentByRange other = (GetCurrentShipmentByRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessToken==null && other.getAccessToken()==null) || 
             (this.accessToken!=null &&
              this.accessToken.equals(other.getAccessToken()))) &&
            this.startRowNumber == other.getStartRowNumber() &&
            this.endRowNumber == other.getEndRowNumber();
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
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        _hashCode += getStartRowNumber();
        _hashCode += getEndRowNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCurrentShipmentByRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">GetCurrentShipmentByRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "AccessToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startRowNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "StartRowNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endRowNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "EndRowNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
