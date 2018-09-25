/**
 * GetCurrentShipmentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class GetCurrentShipmentResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getCurrentShipmentResult;

    public GetCurrentShipmentResponse() {
    }

    public GetCurrentShipmentResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getCurrentShipmentResult) {
           this.getCurrentShipmentResult = getCurrentShipmentResult;
    }


    /**
     * Gets the getCurrentShipmentResult value for this GetCurrentShipmentResponse.
     * 
     * @return getCurrentShipmentResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getGetCurrentShipmentResult() {
        return getCurrentShipmentResult;
    }


    /**
     * Sets the getCurrentShipmentResult value for this GetCurrentShipmentResponse.
     * 
     * @param getCurrentShipmentResult
     */
    public void setGetCurrentShipmentResult(com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getCurrentShipmentResult) {
        this.getCurrentShipmentResult = getCurrentShipmentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCurrentShipmentResponse)) return false;
        GetCurrentShipmentResponse other = (GetCurrentShipmentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCurrentShipmentResult==null && other.getGetCurrentShipmentResult()==null) || 
             (this.getCurrentShipmentResult!=null &&
              this.getCurrentShipmentResult.equals(other.getGetCurrentShipmentResult())));
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
        if (getGetCurrentShipmentResult() != null) {
            _hashCode += getGetCurrentShipmentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCurrentShipmentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">GetCurrentShipmentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCurrentShipmentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "GetCurrentShipmentResult"));
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
