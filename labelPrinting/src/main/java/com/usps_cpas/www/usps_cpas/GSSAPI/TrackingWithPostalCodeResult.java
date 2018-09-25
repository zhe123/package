/**
 * TrackingWithPostalCodeResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class TrackingWithPostalCodeResult  implements java.io.Serializable {
    private int responseCode;

    private java.lang.String message;

    private java.lang.String[] trackingId;

    private com.usps_cpas.www.usps_cpas.GSSAPI.TrackingEventWithPostalCode[] trackingEventWithPostalCode;

    public TrackingWithPostalCodeResult() {
    }

    public TrackingWithPostalCodeResult(
           int responseCode,
           java.lang.String message,
           java.lang.String[] trackingId,
           com.usps_cpas.www.usps_cpas.GSSAPI.TrackingEventWithPostalCode[] trackingEventWithPostalCode) {
           this.responseCode = responseCode;
           this.message = message;
           this.trackingId = trackingId;
           this.trackingEventWithPostalCode = trackingEventWithPostalCode;
    }


    /**
     * Gets the responseCode value for this TrackingWithPostalCodeResult.
     * 
     * @return responseCode
     */
    public int getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this TrackingWithPostalCodeResult.
     * 
     * @param responseCode
     */
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the message value for this TrackingWithPostalCodeResult.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this TrackingWithPostalCodeResult.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the trackingId value for this TrackingWithPostalCodeResult.
     * 
     * @return trackingId
     */
    public java.lang.String[] getTrackingId() {
        return trackingId;
    }


    /**
     * Sets the trackingId value for this TrackingWithPostalCodeResult.
     * 
     * @param trackingId
     */
    public void setTrackingId(java.lang.String[] trackingId) {
        this.trackingId = trackingId;
    }


    /**
     * Gets the trackingEventWithPostalCode value for this TrackingWithPostalCodeResult.
     * 
     * @return trackingEventWithPostalCode
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.TrackingEventWithPostalCode[] getTrackingEventWithPostalCode() {
        return trackingEventWithPostalCode;
    }


    /**
     * Sets the trackingEventWithPostalCode value for this TrackingWithPostalCodeResult.
     * 
     * @param trackingEventWithPostalCode
     */
    public void setTrackingEventWithPostalCode(com.usps_cpas.www.usps_cpas.GSSAPI.TrackingEventWithPostalCode[] trackingEventWithPostalCode) {
        this.trackingEventWithPostalCode = trackingEventWithPostalCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrackingWithPostalCodeResult)) return false;
        TrackingWithPostalCodeResult other = (TrackingWithPostalCodeResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.responseCode == other.getResponseCode() &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.trackingId==null && other.getTrackingId()==null) || 
             (this.trackingId!=null &&
              java.util.Arrays.equals(this.trackingId, other.getTrackingId()))) &&
            ((this.trackingEventWithPostalCode==null && other.getTrackingEventWithPostalCode()==null) || 
             (this.trackingEventWithPostalCode!=null &&
              java.util.Arrays.equals(this.trackingEventWithPostalCode, other.getTrackingEventWithPostalCode())));
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
        _hashCode += getResponseCode();
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getTrackingId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrackingId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrackingId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrackingEventWithPostalCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrackingEventWithPostalCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrackingEventWithPostalCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackingWithPostalCodeResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "TrackingWithPostalCodeResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "TrackingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingEventWithPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "TrackingEventWithPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "TrackingEventWithPostalCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "TrackingEventWithPostalCode"));
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
