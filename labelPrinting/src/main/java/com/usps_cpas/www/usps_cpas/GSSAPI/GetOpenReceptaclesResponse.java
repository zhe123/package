/**
 * GetOpenReceptaclesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class GetOpenReceptaclesResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.OpenReceptaclesResult getOpenReceptaclesResult;

    public GetOpenReceptaclesResponse() {
    }

    public GetOpenReceptaclesResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.OpenReceptaclesResult getOpenReceptaclesResult) {
           this.getOpenReceptaclesResult = getOpenReceptaclesResult;
    }


    /**
     * Gets the getOpenReceptaclesResult value for this GetOpenReceptaclesResponse.
     * 
     * @return getOpenReceptaclesResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.OpenReceptaclesResult getGetOpenReceptaclesResult() {
        return getOpenReceptaclesResult;
    }


    /**
     * Sets the getOpenReceptaclesResult value for this GetOpenReceptaclesResponse.
     * 
     * @param getOpenReceptaclesResult
     */
    public void setGetOpenReceptaclesResult(com.usps_cpas.www.usps_cpas.GSSAPI.OpenReceptaclesResult getOpenReceptaclesResult) {
        this.getOpenReceptaclesResult = getOpenReceptaclesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOpenReceptaclesResponse)) return false;
        GetOpenReceptaclesResponse other = (GetOpenReceptaclesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getOpenReceptaclesResult==null && other.getGetOpenReceptaclesResult()==null) || 
             (this.getOpenReceptaclesResult!=null &&
              this.getOpenReceptaclesResult.equals(other.getGetOpenReceptaclesResult())));
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
        if (getGetOpenReceptaclesResult() != null) {
            _hashCode += getGetOpenReceptaclesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOpenReceptaclesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">GetOpenReceptaclesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getOpenReceptaclesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "GetOpenReceptaclesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "OpenReceptaclesResult"));
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
