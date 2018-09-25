/**
 * CreateMixedReceptacleInCurrentShipmentV2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CreateMixedReceptacleInCurrentShipmentV2Response  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createMixedReceptacleInCurrentShipmentV2Result;

    public CreateMixedReceptacleInCurrentShipmentV2Response() {
    }

    public CreateMixedReceptacleInCurrentShipmentV2Response(
           com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createMixedReceptacleInCurrentShipmentV2Result) {
           this.createMixedReceptacleInCurrentShipmentV2Result = createMixedReceptacleInCurrentShipmentV2Result;
    }


    /**
     * Gets the createMixedReceptacleInCurrentShipmentV2Result value for this CreateMixedReceptacleInCurrentShipmentV2Response.
     * 
     * @return createMixedReceptacleInCurrentShipmentV2Result
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult getCreateMixedReceptacleInCurrentShipmentV2Result() {
        return createMixedReceptacleInCurrentShipmentV2Result;
    }


    /**
     * Sets the createMixedReceptacleInCurrentShipmentV2Result value for this CreateMixedReceptacleInCurrentShipmentV2Response.
     * 
     * @param createMixedReceptacleInCurrentShipmentV2Result
     */
    public void setCreateMixedReceptacleInCurrentShipmentV2Result(com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createMixedReceptacleInCurrentShipmentV2Result) {
        this.createMixedReceptacleInCurrentShipmentV2Result = createMixedReceptacleInCurrentShipmentV2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateMixedReceptacleInCurrentShipmentV2Response)) return false;
        CreateMixedReceptacleInCurrentShipmentV2Response other = (CreateMixedReceptacleInCurrentShipmentV2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createMixedReceptacleInCurrentShipmentV2Result==null && other.getCreateMixedReceptacleInCurrentShipmentV2Result()==null) || 
             (this.createMixedReceptacleInCurrentShipmentV2Result!=null &&
              this.createMixedReceptacleInCurrentShipmentV2Result.equals(other.getCreateMixedReceptacleInCurrentShipmentV2Result())));
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
        if (getCreateMixedReceptacleInCurrentShipmentV2Result() != null) {
            _hashCode += getCreateMixedReceptacleInCurrentShipmentV2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateMixedReceptacleInCurrentShipmentV2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">CreateMixedReceptacleInCurrentShipmentV2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createMixedReceptacleInCurrentShipmentV2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CreateMixedReceptacleInCurrentShipmentV2Result"));
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
