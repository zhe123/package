/**
 * GetShipmentReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class GetShipmentReportResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.GenerateReportResult getShipmentReportResult;

    public GetShipmentReportResponse() {
    }

    public GetShipmentReportResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.GenerateReportResult getShipmentReportResult) {
           this.getShipmentReportResult = getShipmentReportResult;
    }


    /**
     * Gets the getShipmentReportResult value for this GetShipmentReportResponse.
     * 
     * @return getShipmentReportResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.GenerateReportResult getGetShipmentReportResult() {
        return getShipmentReportResult;
    }


    /**
     * Sets the getShipmentReportResult value for this GetShipmentReportResponse.
     * 
     * @param getShipmentReportResult
     */
    public void setGetShipmentReportResult(com.usps_cpas.www.usps_cpas.GSSAPI.GenerateReportResult getShipmentReportResult) {
        this.getShipmentReportResult = getShipmentReportResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetShipmentReportResponse)) return false;
        GetShipmentReportResponse other = (GetShipmentReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getShipmentReportResult==null && other.getGetShipmentReportResult()==null) || 
             (this.getShipmentReportResult!=null &&
              this.getShipmentReportResult.equals(other.getGetShipmentReportResult())));
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
        if (getGetShipmentReportResult() != null) {
            _hashCode += getGetShipmentReportResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetShipmentReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">GetShipmentReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getShipmentReportResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "GetShipmentReportResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "GenerateReportResult"));
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
