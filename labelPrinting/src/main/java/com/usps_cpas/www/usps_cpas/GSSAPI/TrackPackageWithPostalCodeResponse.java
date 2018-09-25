/**
 * TrackPackageWithPostalCodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class TrackPackageWithPostalCodeResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.TrackingWithPostalCodeResult trackPackageWithPostalCodeResult;

    public TrackPackageWithPostalCodeResponse() {
    }

    public TrackPackageWithPostalCodeResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.TrackingWithPostalCodeResult trackPackageWithPostalCodeResult) {
           this.trackPackageWithPostalCodeResult = trackPackageWithPostalCodeResult;
    }


    /**
     * Gets the trackPackageWithPostalCodeResult value for this TrackPackageWithPostalCodeResponse.
     * 
     * @return trackPackageWithPostalCodeResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.TrackingWithPostalCodeResult getTrackPackageWithPostalCodeResult() {
        return trackPackageWithPostalCodeResult;
    }


    /**
     * Sets the trackPackageWithPostalCodeResult value for this TrackPackageWithPostalCodeResponse.
     * 
     * @param trackPackageWithPostalCodeResult
     */
    public void setTrackPackageWithPostalCodeResult(com.usps_cpas.www.usps_cpas.GSSAPI.TrackingWithPostalCodeResult trackPackageWithPostalCodeResult) {
        this.trackPackageWithPostalCodeResult = trackPackageWithPostalCodeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrackPackageWithPostalCodeResponse)) return false;
        TrackPackageWithPostalCodeResponse other = (TrackPackageWithPostalCodeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trackPackageWithPostalCodeResult==null && other.getTrackPackageWithPostalCodeResult()==null) || 
             (this.trackPackageWithPostalCodeResult!=null &&
              this.trackPackageWithPostalCodeResult.equals(other.getTrackPackageWithPostalCodeResult())));
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
        if (getTrackPackageWithPostalCodeResult() != null) {
            _hashCode += getTrackPackageWithPostalCodeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackPackageWithPostalCodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">TrackPackageWithPostalCodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackPackageWithPostalCodeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "TrackPackageWithPostalCodeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "TrackingWithPostalCodeResult"));
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
