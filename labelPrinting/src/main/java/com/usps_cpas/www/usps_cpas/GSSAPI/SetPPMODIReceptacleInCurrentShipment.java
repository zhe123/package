/**
 * SetPPMODIReceptacleInCurrentShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class SetPPMODIReceptacleInCurrentShipment  implements java.io.Serializable {
    private java.lang.String receptacleID;

    private java.lang.String PPMODIReceptacleID;

    private java.lang.String accessToken;

    public SetPPMODIReceptacleInCurrentShipment() {
    }

    public SetPPMODIReceptacleInCurrentShipment(
           java.lang.String receptacleID,
           java.lang.String PPMODIReceptacleID,
           java.lang.String accessToken) {
           this.receptacleID = receptacleID;
           this.PPMODIReceptacleID = PPMODIReceptacleID;
           this.accessToken = accessToken;
    }


    /**
     * Gets the receptacleID value for this SetPPMODIReceptacleInCurrentShipment.
     * 
     * @return receptacleID
     */
    public java.lang.String getReceptacleID() {
        return receptacleID;
    }


    /**
     * Sets the receptacleID value for this SetPPMODIReceptacleInCurrentShipment.
     * 
     * @param receptacleID
     */
    public void setReceptacleID(java.lang.String receptacleID) {
        this.receptacleID = receptacleID;
    }


    /**
     * Gets the PPMODIReceptacleID value for this SetPPMODIReceptacleInCurrentShipment.
     * 
     * @return PPMODIReceptacleID
     */
    public java.lang.String getPPMODIReceptacleID() {
        return PPMODIReceptacleID;
    }


    /**
     * Sets the PPMODIReceptacleID value for this SetPPMODIReceptacleInCurrentShipment.
     * 
     * @param PPMODIReceptacleID
     */
    public void setPPMODIReceptacleID(java.lang.String PPMODIReceptacleID) {
        this.PPMODIReceptacleID = PPMODIReceptacleID;
    }


    /**
     * Gets the accessToken value for this SetPPMODIReceptacleInCurrentShipment.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this SetPPMODIReceptacleInCurrentShipment.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetPPMODIReceptacleInCurrentShipment)) return false;
        SetPPMODIReceptacleInCurrentShipment other = (SetPPMODIReceptacleInCurrentShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receptacleID==null && other.getReceptacleID()==null) || 
             (this.receptacleID!=null &&
              this.receptacleID.equals(other.getReceptacleID()))) &&
            ((this.PPMODIReceptacleID==null && other.getPPMODIReceptacleID()==null) || 
             (this.PPMODIReceptacleID!=null &&
              this.PPMODIReceptacleID.equals(other.getPPMODIReceptacleID()))) &&
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
        if (getReceptacleID() != null) {
            _hashCode += getReceptacleID().hashCode();
        }
        if (getPPMODIReceptacleID() != null) {
            _hashCode += getPPMODIReceptacleID().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetPPMODIReceptacleInCurrentShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">SetPPMODIReceptacleInCurrentShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receptacleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ReceptacleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPMODIReceptacleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "PPMODIReceptacleID"));
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
