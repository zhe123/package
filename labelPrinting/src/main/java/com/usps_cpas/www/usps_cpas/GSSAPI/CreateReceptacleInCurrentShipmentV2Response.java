/**
 * CreateReceptacleInCurrentShipmentV2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CreateReceptacleInCurrentShipmentV2Response  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createReceptacleInCurrentShipmentV2Result;

    public CreateReceptacleInCurrentShipmentV2Response() {
    }

    public CreateReceptacleInCurrentShipmentV2Response(
           com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createReceptacleInCurrentShipmentV2Result) {
           this.createReceptacleInCurrentShipmentV2Result = createReceptacleInCurrentShipmentV2Result;
    }


    /**
     * Gets the createReceptacleInCurrentShipmentV2Result value for this CreateReceptacleInCurrentShipmentV2Response.
     * 
     * @return createReceptacleInCurrentShipmentV2Result
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult getCreateReceptacleInCurrentShipmentV2Result() {
        return createReceptacleInCurrentShipmentV2Result;
    }


    /**
     * Sets the createReceptacleInCurrentShipmentV2Result value for this CreateReceptacleInCurrentShipmentV2Response.
     * 
     * @param createReceptacleInCurrentShipmentV2Result
     */
    public void setCreateReceptacleInCurrentShipmentV2Result(com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createReceptacleInCurrentShipmentV2Result) {
        this.createReceptacleInCurrentShipmentV2Result = createReceptacleInCurrentShipmentV2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateReceptacleInCurrentShipmentV2Response)) return false;
        CreateReceptacleInCurrentShipmentV2Response other = (CreateReceptacleInCurrentShipmentV2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createReceptacleInCurrentShipmentV2Result==null && other.getCreateReceptacleInCurrentShipmentV2Result()==null) || 
             (this.createReceptacleInCurrentShipmentV2Result!=null &&
              this.createReceptacleInCurrentShipmentV2Result.equals(other.getCreateReceptacleInCurrentShipmentV2Result())));
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
        if (getCreateReceptacleInCurrentShipmentV2Result() != null) {
            _hashCode += getCreateReceptacleInCurrentShipmentV2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateReceptacleInCurrentShipmentV2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">CreateReceptacleInCurrentShipmentV2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createReceptacleInCurrentShipmentV2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CreateReceptacleInCurrentShipmentV2Result"));
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
