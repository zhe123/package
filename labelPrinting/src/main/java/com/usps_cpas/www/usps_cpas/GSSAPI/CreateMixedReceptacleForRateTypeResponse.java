/**
 * CreateMixedReceptacleForRateTypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CreateMixedReceptacleForRateTypeResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createMixedReceptacleForRateTypeResult;

    public CreateMixedReceptacleForRateTypeResponse() {
    }

    public CreateMixedReceptacleForRateTypeResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createMixedReceptacleForRateTypeResult) {
           this.createMixedReceptacleForRateTypeResult = createMixedReceptacleForRateTypeResult;
    }


    /**
     * Gets the createMixedReceptacleForRateTypeResult value for this CreateMixedReceptacleForRateTypeResponse.
     * 
     * @return createMixedReceptacleForRateTypeResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult getCreateMixedReceptacleForRateTypeResult() {
        return createMixedReceptacleForRateTypeResult;
    }


    /**
     * Sets the createMixedReceptacleForRateTypeResult value for this CreateMixedReceptacleForRateTypeResponse.
     * 
     * @param createMixedReceptacleForRateTypeResult
     */
    public void setCreateMixedReceptacleForRateTypeResult(com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createMixedReceptacleForRateTypeResult) {
        this.createMixedReceptacleForRateTypeResult = createMixedReceptacleForRateTypeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateMixedReceptacleForRateTypeResponse)) return false;
        CreateMixedReceptacleForRateTypeResponse other = (CreateMixedReceptacleForRateTypeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createMixedReceptacleForRateTypeResult==null && other.getCreateMixedReceptacleForRateTypeResult()==null) || 
             (this.createMixedReceptacleForRateTypeResult!=null &&
              this.createMixedReceptacleForRateTypeResult.equals(other.getCreateMixedReceptacleForRateTypeResult())));
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
        if (getCreateMixedReceptacleForRateTypeResult() != null) {
            _hashCode += getCreateMixedReceptacleForRateTypeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateMixedReceptacleForRateTypeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">CreateMixedReceptacleForRateTypeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createMixedReceptacleForRateTypeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CreateMixedReceptacleForRateTypeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ReceptacleResult"));
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
