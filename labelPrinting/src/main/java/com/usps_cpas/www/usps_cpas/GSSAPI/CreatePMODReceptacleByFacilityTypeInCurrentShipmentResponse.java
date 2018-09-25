/**
 * CreatePMODReceptacleByFacilityTypeInCurrentShipmentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CreatePMODReceptacleByFacilityTypeInCurrentShipmentResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createPMODReceptacleByFacilityTypeInCurrentShipmentResult;

    public CreatePMODReceptacleByFacilityTypeInCurrentShipmentResponse() {
    }

    public CreatePMODReceptacleByFacilityTypeInCurrentShipmentResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createPMODReceptacleByFacilityTypeInCurrentShipmentResult) {
           this.createPMODReceptacleByFacilityTypeInCurrentShipmentResult = createPMODReceptacleByFacilityTypeInCurrentShipmentResult;
    }


    /**
     * Gets the createPMODReceptacleByFacilityTypeInCurrentShipmentResult value for this CreatePMODReceptacleByFacilityTypeInCurrentShipmentResponse.
     * 
     * @return createPMODReceptacleByFacilityTypeInCurrentShipmentResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult getCreatePMODReceptacleByFacilityTypeInCurrentShipmentResult() {
        return createPMODReceptacleByFacilityTypeInCurrentShipmentResult;
    }


    /**
     * Sets the createPMODReceptacleByFacilityTypeInCurrentShipmentResult value for this CreatePMODReceptacleByFacilityTypeInCurrentShipmentResponse.
     * 
     * @param createPMODReceptacleByFacilityTypeInCurrentShipmentResult
     */
    public void setCreatePMODReceptacleByFacilityTypeInCurrentShipmentResult(com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createPMODReceptacleByFacilityTypeInCurrentShipmentResult) {
        this.createPMODReceptacleByFacilityTypeInCurrentShipmentResult = createPMODReceptacleByFacilityTypeInCurrentShipmentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatePMODReceptacleByFacilityTypeInCurrentShipmentResponse)) return false;
        CreatePMODReceptacleByFacilityTypeInCurrentShipmentResponse other = (CreatePMODReceptacleByFacilityTypeInCurrentShipmentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createPMODReceptacleByFacilityTypeInCurrentShipmentResult==null && other.getCreatePMODReceptacleByFacilityTypeInCurrentShipmentResult()==null) || 
             (this.createPMODReceptacleByFacilityTypeInCurrentShipmentResult!=null &&
              this.createPMODReceptacleByFacilityTypeInCurrentShipmentResult.equals(other.getCreatePMODReceptacleByFacilityTypeInCurrentShipmentResult())));
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
        if (getCreatePMODReceptacleByFacilityTypeInCurrentShipmentResult() != null) {
            _hashCode += getCreatePMODReceptacleByFacilityTypeInCurrentShipmentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreatePMODReceptacleByFacilityTypeInCurrentShipmentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">CreatePMODReceptacleByFacilityTypeInCurrentShipmentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createPMODReceptacleByFacilityTypeInCurrentShipmentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CreatePMODReceptacleByFacilityTypeInCurrentShipmentResult"));
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
