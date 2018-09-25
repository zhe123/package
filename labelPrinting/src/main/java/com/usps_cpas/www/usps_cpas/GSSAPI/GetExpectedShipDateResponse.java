/**
 * GetExpectedShipDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class GetExpectedShipDateResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.ExpectedShipResult getExpectedShipDateResult;

    public GetExpectedShipDateResponse() {
    }

    public GetExpectedShipDateResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.ExpectedShipResult getExpectedShipDateResult) {
           this.getExpectedShipDateResult = getExpectedShipDateResult;
    }


    /**
     * Gets the getExpectedShipDateResult value for this GetExpectedShipDateResponse.
     * 
     * @return getExpectedShipDateResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ExpectedShipResult getGetExpectedShipDateResult() {
        return getExpectedShipDateResult;
    }


    /**
     * Sets the getExpectedShipDateResult value for this GetExpectedShipDateResponse.
     * 
     * @param getExpectedShipDateResult
     */
    public void setGetExpectedShipDateResult(com.usps_cpas.www.usps_cpas.GSSAPI.ExpectedShipResult getExpectedShipDateResult) {
        this.getExpectedShipDateResult = getExpectedShipDateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetExpectedShipDateResponse)) return false;
        GetExpectedShipDateResponse other = (GetExpectedShipDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getExpectedShipDateResult==null && other.getGetExpectedShipDateResult()==null) || 
             (this.getExpectedShipDateResult!=null &&
              this.getExpectedShipDateResult.equals(other.getGetExpectedShipDateResult())));
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
        if (getGetExpectedShipDateResult() != null) {
            _hashCode += getGetExpectedShipDateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExpectedShipDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">GetExpectedShipDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getExpectedShipDateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "GetExpectedShipDateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ExpectedShipResult"));
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
