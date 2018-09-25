/**
 * RemovePackageFromDefaultShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class RemovePackageFromDefaultShipment  implements java.io.Serializable {
    private java.lang.String USPSPackageTrackingID;

    private java.lang.String accessToken;

    public RemovePackageFromDefaultShipment() {
    }

    public RemovePackageFromDefaultShipment(
           java.lang.String USPSPackageTrackingID,
           java.lang.String accessToken) {
           this.USPSPackageTrackingID = USPSPackageTrackingID;
           this.accessToken = accessToken;
    }


    /**
     * Gets the USPSPackageTrackingID value for this RemovePackageFromDefaultShipment.
     * 
     * @return USPSPackageTrackingID
     */
    public java.lang.String getUSPSPackageTrackingID() {
        return USPSPackageTrackingID;
    }


    /**
     * Sets the USPSPackageTrackingID value for this RemovePackageFromDefaultShipment.
     * 
     * @param USPSPackageTrackingID
     */
    public void setUSPSPackageTrackingID(java.lang.String USPSPackageTrackingID) {
        this.USPSPackageTrackingID = USPSPackageTrackingID;
    }


    /**
     * Gets the accessToken value for this RemovePackageFromDefaultShipment.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this RemovePackageFromDefaultShipment.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemovePackageFromDefaultShipment)) return false;
        RemovePackageFromDefaultShipment other = (RemovePackageFromDefaultShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.USPSPackageTrackingID==null && other.getUSPSPackageTrackingID()==null) || 
             (this.USPSPackageTrackingID!=null &&
              this.USPSPackageTrackingID.equals(other.getUSPSPackageTrackingID()))) &&
            ((this.accessToken==null && other.getAccessToken()==null) || 
             (this.accessToken!=null &&
              this.accessToken.equals(other.getAccessToken())));
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
        if (getUSPSPackageTrackingID() != null) {
            _hashCode += getUSPSPackageTrackingID().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemovePackageFromDefaultShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">RemovePackageFromDefaultShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USPSPackageTrackingID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "USPSPackageTrackingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "AccessToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
