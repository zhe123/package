/**
 * GetShipmentDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class GetShipmentDetailsResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getShipmentDetailsResult;

    public GetShipmentDetailsResponse() {
    }

    public GetShipmentDetailsResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getShipmentDetailsResult) {
           this.getShipmentDetailsResult = getShipmentDetailsResult;
    }


    /**
     * Gets the getShipmentDetailsResult value for this GetShipmentDetailsResponse.
     * 
     * @return getShipmentDetailsResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getGetShipmentDetailsResult() {
        return getShipmentDetailsResult;
    }


    /**
     * Sets the getShipmentDetailsResult value for this GetShipmentDetailsResponse.
     * 
     * @param getShipmentDetailsResult
     */
    public void setGetShipmentDetailsResult(com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getShipmentDetailsResult) {
        this.getShipmentDetailsResult = getShipmentDetailsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetShipmentDetailsResponse)) return false;
        GetShipmentDetailsResponse other = (GetShipmentDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getShipmentDetailsResult==null && other.getGetShipmentDetailsResult()==null) || 
             (this.getShipmentDetailsResult!=null &&
              this.getShipmentDetailsResult.equals(other.getGetShipmentDetailsResult())));
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
        if (getGetShipmentDetailsResult() != null) {
            _hashCode += getGetShipmentDetailsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetShipmentDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">GetShipmentDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getShipmentDetailsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "GetShipmentDetailsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ShipmentDetailResult"));
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
