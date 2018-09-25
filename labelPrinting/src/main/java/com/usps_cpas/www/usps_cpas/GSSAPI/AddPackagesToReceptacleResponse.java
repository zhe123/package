/**
 * AddPackagesToReceptacleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class AddPackagesToReceptacleResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult addPackagesToReceptacleResult;

    public AddPackagesToReceptacleResponse() {
    }

    public AddPackagesToReceptacleResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult addPackagesToReceptacleResult) {
           this.addPackagesToReceptacleResult = addPackagesToReceptacleResult;
    }


    /**
     * Gets the addPackagesToReceptacleResult value for this AddPackagesToReceptacleResponse.
     * 
     * @return addPackagesToReceptacleResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getAddPackagesToReceptacleResult() {
        return addPackagesToReceptacleResult;
    }


    /**
     * Sets the addPackagesToReceptacleResult value for this AddPackagesToReceptacleResponse.
     * 
     * @param addPackagesToReceptacleResult
     */
    public void setAddPackagesToReceptacleResult(com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult addPackagesToReceptacleResult) {
        this.addPackagesToReceptacleResult = addPackagesToReceptacleResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddPackagesToReceptacleResponse)) return false;
        AddPackagesToReceptacleResponse other = (AddPackagesToReceptacleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addPackagesToReceptacleResult==null && other.getAddPackagesToReceptacleResult()==null) || 
             (this.addPackagesToReceptacleResult!=null &&
              this.addPackagesToReceptacleResult.equals(other.getAddPackagesToReceptacleResult())));
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
        if (getAddPackagesToReceptacleResult() != null) {
            _hashCode += getAddPackagesToReceptacleResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddPackagesToReceptacleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">AddPackagesToReceptacleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addPackagesToReceptacleResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "AddPackagesToReceptacleResult"));
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
