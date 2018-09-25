/**
 * GetRequiredReportsForDispatchResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class GetRequiredReportsForDispatchResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.GetAvailableReportResult getRequiredReportsForDispatchResult;

    public GetRequiredReportsForDispatchResponse() {
    }

    public GetRequiredReportsForDispatchResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.GetAvailableReportResult getRequiredReportsForDispatchResult) {
           this.getRequiredReportsForDispatchResult = getRequiredReportsForDispatchResult;
    }


    /**
     * Gets the getRequiredReportsForDispatchResult value for this GetRequiredReportsForDispatchResponse.
     * 
     * @return getRequiredReportsForDispatchResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.GetAvailableReportResult getGetRequiredReportsForDispatchResult() {
        return getRequiredReportsForDispatchResult;
    }


    /**
     * Sets the getRequiredReportsForDispatchResult value for this GetRequiredReportsForDispatchResponse.
     * 
     * @param getRequiredReportsForDispatchResult
     */
    public void setGetRequiredReportsForDispatchResult(com.usps_cpas.www.usps_cpas.GSSAPI.GetAvailableReportResult getRequiredReportsForDispatchResult) {
        this.getRequiredReportsForDispatchResult = getRequiredReportsForDispatchResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRequiredReportsForDispatchResponse)) return false;
        GetRequiredReportsForDispatchResponse other = (GetRequiredReportsForDispatchResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getRequiredReportsForDispatchResult==null && other.getGetRequiredReportsForDispatchResult()==null) || 
             (this.getRequiredReportsForDispatchResult!=null &&
              this.getRequiredReportsForDispatchResult.equals(other.getGetRequiredReportsForDispatchResult())));
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
        if (getGetRequiredReportsForDispatchResult() != null) {
            _hashCode += getGetRequiredReportsForDispatchResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRequiredReportsForDispatchResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">GetRequiredReportsForDispatchResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRequiredReportsForDispatchResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "GetRequiredReportsForDispatchResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "GetAvailableReportResult"));
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
