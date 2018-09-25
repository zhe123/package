/**
 * GetAvailableCustomInsuredAmountListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class GetAvailableCustomInsuredAmountListResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getAvailableCustomInsuredAmountListResult;

    public GetAvailableCustomInsuredAmountListResponse() {
    }

    public GetAvailableCustomInsuredAmountListResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getAvailableCustomInsuredAmountListResult) {
           this.getAvailableCustomInsuredAmountListResult = getAvailableCustomInsuredAmountListResult;
    }


    /**
     * Gets the getAvailableCustomInsuredAmountListResult value for this GetAvailableCustomInsuredAmountListResponse.
     * 
     * @return getAvailableCustomInsuredAmountListResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getGetAvailableCustomInsuredAmountListResult() {
        return getAvailableCustomInsuredAmountListResult;
    }


    /**
     * Sets the getAvailableCustomInsuredAmountListResult value for this GetAvailableCustomInsuredAmountListResponse.
     * 
     * @param getAvailableCustomInsuredAmountListResult
     */
    public void setGetAvailableCustomInsuredAmountListResult(com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getAvailableCustomInsuredAmountListResult) {
        this.getAvailableCustomInsuredAmountListResult = getAvailableCustomInsuredAmountListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAvailableCustomInsuredAmountListResponse)) return false;
        GetAvailableCustomInsuredAmountListResponse other = (GetAvailableCustomInsuredAmountListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAvailableCustomInsuredAmountListResult==null && other.getGetAvailableCustomInsuredAmountListResult()==null) || 
             (this.getAvailableCustomInsuredAmountListResult!=null &&
              this.getAvailableCustomInsuredAmountListResult.equals(other.getGetAvailableCustomInsuredAmountListResult())));
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
        if (getGetAvailableCustomInsuredAmountListResult() != null) {
            _hashCode += getGetAvailableCustomInsuredAmountListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAvailableCustomInsuredAmountListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">GetAvailableCustomInsuredAmountListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAvailableCustomInsuredAmountListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "GetAvailableCustomInsuredAmountListResult"));
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
