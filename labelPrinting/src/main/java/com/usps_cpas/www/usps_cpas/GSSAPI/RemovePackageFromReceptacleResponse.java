/**
 * RemovePackageFromReceptacleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class RemovePackageFromReceptacleResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromReceptacleResult;

    public RemovePackageFromReceptacleResponse() {
    }

    public RemovePackageFromReceptacleResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromReceptacleResult) {
           this.removePackageFromReceptacleResult = removePackageFromReceptacleResult;
    }


    /**
     * Gets the removePackageFromReceptacleResult value for this RemovePackageFromReceptacleResponse.
     * 
     * @return removePackageFromReceptacleResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getRemovePackageFromReceptacleResult() {
        return removePackageFromReceptacleResult;
    }


    /**
     * Sets the removePackageFromReceptacleResult value for this RemovePackageFromReceptacleResponse.
     * 
     * @param removePackageFromReceptacleResult
     */
    public void setRemovePackageFromReceptacleResult(com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromReceptacleResult) {
        this.removePackageFromReceptacleResult = removePackageFromReceptacleResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemovePackageFromReceptacleResponse)) return false;
        RemovePackageFromReceptacleResponse other = (RemovePackageFromReceptacleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removePackageFromReceptacleResult==null && other.getRemovePackageFromReceptacleResult()==null) || 
             (this.removePackageFromReceptacleResult!=null &&
              this.removePackageFromReceptacleResult.equals(other.getRemovePackageFromReceptacleResult())));
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
        if (getRemovePackageFromReceptacleResult() != null) {
            _hashCode += getRemovePackageFromReceptacleResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemovePackageFromReceptacleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">RemovePackageFromReceptacleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removePackageFromReceptacleResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RemovePackageFromReceptacleResult"));
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
