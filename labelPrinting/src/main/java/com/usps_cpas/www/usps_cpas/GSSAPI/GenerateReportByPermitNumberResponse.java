/**
 * GenerateReportByPermitNumberResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class GenerateReportByPermitNumberResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.GenerateReportResult generateReportByPermitNumberResult;

    public GenerateReportByPermitNumberResponse() {
    }

    public GenerateReportByPermitNumberResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.GenerateReportResult generateReportByPermitNumberResult) {
           this.generateReportByPermitNumberResult = generateReportByPermitNumberResult;
    }


    /**
     * Gets the generateReportByPermitNumberResult value for this GenerateReportByPermitNumberResponse.
     * 
     * @return generateReportByPermitNumberResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.GenerateReportResult getGenerateReportByPermitNumberResult() {
        return generateReportByPermitNumberResult;
    }


    /**
     * Sets the generateReportByPermitNumberResult value for this GenerateReportByPermitNumberResponse.
     * 
     * @param generateReportByPermitNumberResult
     */
    public void setGenerateReportByPermitNumberResult(com.usps_cpas.www.usps_cpas.GSSAPI.GenerateReportResult generateReportByPermitNumberResult) {
        this.generateReportByPermitNumberResult = generateReportByPermitNumberResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateReportByPermitNumberResponse)) return false;
        GenerateReportByPermitNumberResponse other = (GenerateReportByPermitNumberResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.generateReportByPermitNumberResult==null && other.getGenerateReportByPermitNumberResult()==null) || 
             (this.generateReportByPermitNumberResult!=null &&
              this.generateReportByPermitNumberResult.equals(other.getGenerateReportByPermitNumberResult())));
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
        if (getGenerateReportByPermitNumberResult() != null) {
            _hashCode += getGenerateReportByPermitNumberResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenerateReportByPermitNumberResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">GenerateReportByPermitNumberResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generateReportByPermitNumberResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "GenerateReportByPermitNumberResult"));
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
