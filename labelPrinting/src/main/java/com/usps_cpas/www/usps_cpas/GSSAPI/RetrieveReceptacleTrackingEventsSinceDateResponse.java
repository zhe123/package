/**
 * RetrieveReceptacleTrackingEventsSinceDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class RetrieveReceptacleTrackingEventsSinceDateResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.RetrieveReceptacleTrackingEventsSinceDateResponseRetrieveReceptacleTrackingEventsSinceDateResult retrieveReceptacleTrackingEventsSinceDateResult;

    public RetrieveReceptacleTrackingEventsSinceDateResponse() {
    }

    public RetrieveReceptacleTrackingEventsSinceDateResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.RetrieveReceptacleTrackingEventsSinceDateResponseRetrieveReceptacleTrackingEventsSinceDateResult retrieveReceptacleTrackingEventsSinceDateResult) {
           this.retrieveReceptacleTrackingEventsSinceDateResult = retrieveReceptacleTrackingEventsSinceDateResult;
    }


    /**
     * Gets the retrieveReceptacleTrackingEventsSinceDateResult value for this RetrieveReceptacleTrackingEventsSinceDateResponse.
     * 
     * @return retrieveReceptacleTrackingEventsSinceDateResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.RetrieveReceptacleTrackingEventsSinceDateResponseRetrieveReceptacleTrackingEventsSinceDateResult getRetrieveReceptacleTrackingEventsSinceDateResult() {
        return retrieveReceptacleTrackingEventsSinceDateResult;
    }


    /**
     * Sets the retrieveReceptacleTrackingEventsSinceDateResult value for this RetrieveReceptacleTrackingEventsSinceDateResponse.
     * 
     * @param retrieveReceptacleTrackingEventsSinceDateResult
     */
    public void setRetrieveReceptacleTrackingEventsSinceDateResult(com.usps_cpas.www.usps_cpas.GSSAPI.RetrieveReceptacleTrackingEventsSinceDateResponseRetrieveReceptacleTrackingEventsSinceDateResult retrieveReceptacleTrackingEventsSinceDateResult) {
        this.retrieveReceptacleTrackingEventsSinceDateResult = retrieveReceptacleTrackingEventsSinceDateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveReceptacleTrackingEventsSinceDateResponse)) return false;
        RetrieveReceptacleTrackingEventsSinceDateResponse other = (RetrieveReceptacleTrackingEventsSinceDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.retrieveReceptacleTrackingEventsSinceDateResult==null && other.getRetrieveReceptacleTrackingEventsSinceDateResult()==null) || 
             (this.retrieveReceptacleTrackingEventsSinceDateResult!=null &&
              this.retrieveReceptacleTrackingEventsSinceDateResult.equals(other.getRetrieveReceptacleTrackingEventsSinceDateResult())));
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
        if (getRetrieveReceptacleTrackingEventsSinceDateResult() != null) {
            _hashCode += getRetrieveReceptacleTrackingEventsSinceDateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveReceptacleTrackingEventsSinceDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">RetrieveReceptacleTrackingEventsSinceDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveReceptacleTrackingEventsSinceDateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RetrieveReceptacleTrackingEventsSinceDateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">>RetrieveReceptacleTrackingEventsSinceDateResponse>RetrieveReceptacleTrackingEventsSinceDateResult"));
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
