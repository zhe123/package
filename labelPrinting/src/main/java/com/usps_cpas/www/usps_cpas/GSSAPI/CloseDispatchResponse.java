/**
 * CloseDispatchResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CloseDispatchResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.CloseDispatchResult closeDispatchResult;

    public CloseDispatchResponse() {
    }

    public CloseDispatchResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.CloseDispatchResult closeDispatchResult) {
           this.closeDispatchResult = closeDispatchResult;
    }


    /**
     * Gets the closeDispatchResult value for this CloseDispatchResponse.
     * 
     * @return closeDispatchResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CloseDispatchResult getCloseDispatchResult() {
        return closeDispatchResult;
    }


    /**
     * Sets the closeDispatchResult value for this CloseDispatchResponse.
     * 
     * @param closeDispatchResult
     */
    public void setCloseDispatchResult(com.usps_cpas.www.usps_cpas.GSSAPI.CloseDispatchResult closeDispatchResult) {
        this.closeDispatchResult = closeDispatchResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CloseDispatchResponse)) return false;
        CloseDispatchResponse other = (CloseDispatchResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.closeDispatchResult==null && other.getCloseDispatchResult()==null) || 
             (this.closeDispatchResult!=null &&
              this.closeDispatchResult.equals(other.getCloseDispatchResult())));
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
        if (getCloseDispatchResult() != null) {
            _hashCode += getCloseDispatchResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CloseDispatchResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">CloseDispatchResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeDispatchResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CloseDispatchResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CloseDispatchResult"));
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
