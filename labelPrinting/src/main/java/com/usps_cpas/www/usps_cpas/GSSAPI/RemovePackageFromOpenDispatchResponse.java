/**
 * RemovePackageFromOpenDispatchResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class RemovePackageFromOpenDispatchResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromOpenDispatchResult;

    public RemovePackageFromOpenDispatchResponse() {
    }

    public RemovePackageFromOpenDispatchResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromOpenDispatchResult) {
           this.removePackageFromOpenDispatchResult = removePackageFromOpenDispatchResult;
    }


    /**
     * Gets the removePackageFromOpenDispatchResult value for this RemovePackageFromOpenDispatchResponse.
     * 
     * @return removePackageFromOpenDispatchResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getRemovePackageFromOpenDispatchResult() {
        return removePackageFromOpenDispatchResult;
    }


    /**
     * Sets the removePackageFromOpenDispatchResult value for this RemovePackageFromOpenDispatchResponse.
     * 
     * @param removePackageFromOpenDispatchResult
     */
    public void setRemovePackageFromOpenDispatchResult(com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromOpenDispatchResult) {
        this.removePackageFromOpenDispatchResult = removePackageFromOpenDispatchResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemovePackageFromOpenDispatchResponse)) return false;
        RemovePackageFromOpenDispatchResponse other = (RemovePackageFromOpenDispatchResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removePackageFromOpenDispatchResult==null && other.getRemovePackageFromOpenDispatchResult()==null) || 
             (this.removePackageFromOpenDispatchResult!=null &&
              this.removePackageFromOpenDispatchResult.equals(other.getRemovePackageFromOpenDispatchResult())));
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
        if (getRemovePackageFromOpenDispatchResult() != null) {
            _hashCode += getRemovePackageFromOpenDispatchResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemovePackageFromOpenDispatchResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">RemovePackageFromOpenDispatchResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removePackageFromOpenDispatchResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RemovePackageFromOpenDispatchResult"));
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
