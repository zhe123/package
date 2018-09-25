/**
 * CreatePMODReceptacleInCurrentShipmentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CreatePMODReceptacleInCurrentShipmentResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createPMODReceptacleInCurrentShipmentResult;

    public CreatePMODReceptacleInCurrentShipmentResponse() {
    }

    public CreatePMODReceptacleInCurrentShipmentResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createPMODReceptacleInCurrentShipmentResult) {
           this.createPMODReceptacleInCurrentShipmentResult = createPMODReceptacleInCurrentShipmentResult;
    }


    /**
     * Gets the createPMODReceptacleInCurrentShipmentResult value for this CreatePMODReceptacleInCurrentShipmentResponse.
     * 
     * @return createPMODReceptacleInCurrentShipmentResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult getCreatePMODReceptacleInCurrentShipmentResult() {
        return createPMODReceptacleInCurrentShipmentResult;
    }


    /**
     * Sets the createPMODReceptacleInCurrentShipmentResult value for this CreatePMODReceptacleInCurrentShipmentResponse.
     * 
     * @param createPMODReceptacleInCurrentShipmentResult
     */
    public void setCreatePMODReceptacleInCurrentShipmentResult(com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createPMODReceptacleInCurrentShipmentResult) {
        this.createPMODReceptacleInCurrentShipmentResult = createPMODReceptacleInCurrentShipmentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatePMODReceptacleInCurrentShipmentResponse)) return false;
        CreatePMODReceptacleInCurrentShipmentResponse other = (CreatePMODReceptacleInCurrentShipmentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createPMODReceptacleInCurrentShipmentResult==null && other.getCreatePMODReceptacleInCurrentShipmentResult()==null) || 
             (this.createPMODReceptacleInCurrentShipmentResult!=null &&
              this.createPMODReceptacleInCurrentShipmentResult.equals(other.getCreatePMODReceptacleInCurrentShipmentResult())));
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
        if (getCreatePMODReceptacleInCurrentShipmentResult() != null) {
            _hashCode += getCreatePMODReceptacleInCurrentShipmentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreatePMODReceptacleInCurrentShipmentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">CreatePMODReceptacleInCurrentShipmentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createPMODReceptacleInCurrentShipmentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CreatePMODReceptacleInCurrentShipmentResult"));
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
