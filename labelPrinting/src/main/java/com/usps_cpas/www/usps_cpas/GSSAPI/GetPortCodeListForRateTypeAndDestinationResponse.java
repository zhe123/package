/**
 * GetPortCodeListForRateTypeAndDestinationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class GetPortCodeListForRateTypeAndDestinationResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getPortCodeListForRateTypeAndDestinationResult;

    public GetPortCodeListForRateTypeAndDestinationResponse() {
    }

    public GetPortCodeListForRateTypeAndDestinationResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getPortCodeListForRateTypeAndDestinationResult) {
           this.getPortCodeListForRateTypeAndDestinationResult = getPortCodeListForRateTypeAndDestinationResult;
    }


    /**
     * Gets the getPortCodeListForRateTypeAndDestinationResult value for this GetPortCodeListForRateTypeAndDestinationResponse.
     * 
     * @return getPortCodeListForRateTypeAndDestinationResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getGetPortCodeListForRateTypeAndDestinationResult() {
        return getPortCodeListForRateTypeAndDestinationResult;
    }


    /**
     * Sets the getPortCodeListForRateTypeAndDestinationResult value for this GetPortCodeListForRateTypeAndDestinationResponse.
     * 
     * @param getPortCodeListForRateTypeAndDestinationResult
     */
    public void setGetPortCodeListForRateTypeAndDestinationResult(com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getPortCodeListForRateTypeAndDestinationResult) {
        this.getPortCodeListForRateTypeAndDestinationResult = getPortCodeListForRateTypeAndDestinationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPortCodeListForRateTypeAndDestinationResponse)) return false;
        GetPortCodeListForRateTypeAndDestinationResponse other = (GetPortCodeListForRateTypeAndDestinationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPortCodeListForRateTypeAndDestinationResult==null && other.getGetPortCodeListForRateTypeAndDestinationResult()==null) || 
             (this.getPortCodeListForRateTypeAndDestinationResult!=null &&
              this.getPortCodeListForRateTypeAndDestinationResult.equals(other.getGetPortCodeListForRateTypeAndDestinationResult())));
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
        if (getGetPortCodeListForRateTypeAndDestinationResult() != null) {
            _hashCode += getGetPortCodeListForRateTypeAndDestinationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPortCodeListForRateTypeAndDestinationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">GetPortCodeListForRateTypeAndDestinationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPortCodeListForRateTypeAndDestinationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "GetPortCodeListForRateTypeAndDestinationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CommonResult"));
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
