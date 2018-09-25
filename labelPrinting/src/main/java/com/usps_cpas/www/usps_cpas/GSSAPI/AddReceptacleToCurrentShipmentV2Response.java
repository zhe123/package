/**
 * AddReceptacleToCurrentShipmentV2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class AddReceptacleToCurrentShipmentV2Response  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.AddReceptacleResult addReceptacleToCurrentShipmentV2Result;

    public AddReceptacleToCurrentShipmentV2Response() {
    }

    public AddReceptacleToCurrentShipmentV2Response(
           com.usps_cpas.www.usps_cpas.GSSAPI.AddReceptacleResult addReceptacleToCurrentShipmentV2Result) {
           this.addReceptacleToCurrentShipmentV2Result = addReceptacleToCurrentShipmentV2Result;
    }


    /**
     * Gets the addReceptacleToCurrentShipmentV2Result value for this AddReceptacleToCurrentShipmentV2Response.
     * 
     * @return addReceptacleToCurrentShipmentV2Result
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.AddReceptacleResult getAddReceptacleToCurrentShipmentV2Result() {
        return addReceptacleToCurrentShipmentV2Result;
    }


    /**
     * Sets the addReceptacleToCurrentShipmentV2Result value for this AddReceptacleToCurrentShipmentV2Response.
     * 
     * @param addReceptacleToCurrentShipmentV2Result
     */
    public void setAddReceptacleToCurrentShipmentV2Result(com.usps_cpas.www.usps_cpas.GSSAPI.AddReceptacleResult addReceptacleToCurrentShipmentV2Result) {
        this.addReceptacleToCurrentShipmentV2Result = addReceptacleToCurrentShipmentV2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddReceptacleToCurrentShipmentV2Response)) return false;
        AddReceptacleToCurrentShipmentV2Response other = (AddReceptacleToCurrentShipmentV2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addReceptacleToCurrentShipmentV2Result==null && other.getAddReceptacleToCurrentShipmentV2Result()==null) || 
             (this.addReceptacleToCurrentShipmentV2Result!=null &&
              this.addReceptacleToCurrentShipmentV2Result.equals(other.getAddReceptacleToCurrentShipmentV2Result())));
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
        if (getAddReceptacleToCurrentShipmentV2Result() != null) {
            _hashCode += getAddReceptacleToCurrentShipmentV2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddReceptacleToCurrentShipmentV2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">AddReceptacleToCurrentShipmentV2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addReceptacleToCurrentShipmentV2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "AddReceptacleToCurrentShipmentV2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "AddReceptacleResult"));
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
