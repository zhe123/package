/**
 * RemovePackageFromDefaultShipmentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class RemovePackageFromDefaultShipmentResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromDefaultShipmentResult;

    public RemovePackageFromDefaultShipmentResponse() {
    }

    public RemovePackageFromDefaultShipmentResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromDefaultShipmentResult) {
           this.removePackageFromDefaultShipmentResult = removePackageFromDefaultShipmentResult;
    }


    /**
     * Gets the removePackageFromDefaultShipmentResult value for this RemovePackageFromDefaultShipmentResponse.
     * 
     * @return removePackageFromDefaultShipmentResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getRemovePackageFromDefaultShipmentResult() {
        return removePackageFromDefaultShipmentResult;
    }


    /**
     * Sets the removePackageFromDefaultShipmentResult value for this RemovePackageFromDefaultShipmentResponse.
     * 
     * @param removePackageFromDefaultShipmentResult
     */
    public void setRemovePackageFromDefaultShipmentResult(com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromDefaultShipmentResult) {
        this.removePackageFromDefaultShipmentResult = removePackageFromDefaultShipmentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemovePackageFromDefaultShipmentResponse)) return false;
        RemovePackageFromDefaultShipmentResponse other = (RemovePackageFromDefaultShipmentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removePackageFromDefaultShipmentResult==null && other.getRemovePackageFromDefaultShipmentResult()==null) || 
             (this.removePackageFromDefaultShipmentResult!=null &&
              this.removePackageFromDefaultShipmentResult.equals(other.getRemovePackageFromDefaultShipmentResult())));
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
        if (getRemovePackageFromDefaultShipmentResult() != null) {
            _hashCode += getRemovePackageFromDefaultShipmentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemovePackageFromDefaultShipmentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">RemovePackageFromDefaultShipmentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removePackageFromDefaultShipmentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RemovePackageFromDefaultShipmentResult"));
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
