/**
 * VerifyGXGPackageToDestinationLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class VerifyGXGPackageToDestinationLocation  implements java.io.Serializable {
    private java.lang.String packageID;

    private java.lang.String mailingAgentID;

    private int boxNumber;

    private java.lang.String destinationLocationID;

    private com.usps_cpas.www.usps_cpas.GSSAPI.VerifyGXGPackageToDestinationLocationGXGRequest GXGRequest;

    private java.lang.String accessToken;

    public VerifyGXGPackageToDestinationLocation() {
    }

    public VerifyGXGPackageToDestinationLocation(
           java.lang.String packageID,
           java.lang.String mailingAgentID,
           int boxNumber,
           java.lang.String destinationLocationID,
           com.usps_cpas.www.usps_cpas.GSSAPI.VerifyGXGPackageToDestinationLocationGXGRequest GXGRequest,
           java.lang.String accessToken) {
           this.packageID = packageID;
           this.mailingAgentID = mailingAgentID;
           this.boxNumber = boxNumber;
           this.destinationLocationID = destinationLocationID;
           this.GXGRequest = GXGRequest;
           this.accessToken = accessToken;
    }


    /**
     * Gets the packageID value for this VerifyGXGPackageToDestinationLocation.
     * 
     * @return packageID
     */
    public java.lang.String getPackageID() {
        return packageID;
    }


    /**
     * Sets the packageID value for this VerifyGXGPackageToDestinationLocation.
     * 
     * @param packageID
     */
    public void setPackageID(java.lang.String packageID) {
        this.packageID = packageID;
    }


    /**
     * Gets the mailingAgentID value for this VerifyGXGPackageToDestinationLocation.
     * 
     * @return mailingAgentID
     */
    public java.lang.String getMailingAgentID() {
        return mailingAgentID;
    }


    /**
     * Sets the mailingAgentID value for this VerifyGXGPackageToDestinationLocation.
     * 
     * @param mailingAgentID
     */
    public void setMailingAgentID(java.lang.String mailingAgentID) {
        this.mailingAgentID = mailingAgentID;
    }


    /**
     * Gets the boxNumber value for this VerifyGXGPackageToDestinationLocation.
     * 
     * @return boxNumber
     */
    public int getBoxNumber() {
        return boxNumber;
    }


    /**
     * Sets the boxNumber value for this VerifyGXGPackageToDestinationLocation.
     * 
     * @param boxNumber
     */
    public void setBoxNumber(int boxNumber) {
        this.boxNumber = boxNumber;
    }


    /**
     * Gets the destinationLocationID value for this VerifyGXGPackageToDestinationLocation.
     * 
     * @return destinationLocationID
     */
    public java.lang.String getDestinationLocationID() {
        return destinationLocationID;
    }


    /**
     * Sets the destinationLocationID value for this VerifyGXGPackageToDestinationLocation.
     * 
     * @param destinationLocationID
     */
    public void setDestinationLocationID(java.lang.String destinationLocationID) {
        this.destinationLocationID = destinationLocationID;
    }


    /**
     * Gets the GXGRequest value for this VerifyGXGPackageToDestinationLocation.
     * 
     * @return GXGRequest
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.VerifyGXGPackageToDestinationLocationGXGRequest getGXGRequest() {
        return GXGRequest;
    }


    /**
     * Sets the GXGRequest value for this VerifyGXGPackageToDestinationLocation.
     * 
     * @param GXGRequest
     */
    public void setGXGRequest(com.usps_cpas.www.usps_cpas.GSSAPI.VerifyGXGPackageToDestinationLocationGXGRequest GXGRequest) {
        this.GXGRequest = GXGRequest;
    }


    /**
     * Gets the accessToken value for this VerifyGXGPackageToDestinationLocation.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this VerifyGXGPackageToDestinationLocation.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerifyGXGPackageToDestinationLocation)) return false;
        VerifyGXGPackageToDestinationLocation other = (VerifyGXGPackageToDestinationLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageID==null && other.getPackageID()==null) || 
             (this.packageID!=null &&
              this.packageID.equals(other.getPackageID()))) &&
            ((this.mailingAgentID==null && other.getMailingAgentID()==null) || 
             (this.mailingAgentID!=null &&
              this.mailingAgentID.equals(other.getMailingAgentID()))) &&
            this.boxNumber == other.getBoxNumber() &&
            ((this.destinationLocationID==null && other.getDestinationLocationID()==null) || 
             (this.destinationLocationID!=null &&
              this.destinationLocationID.equals(other.getDestinationLocationID()))) &&
            ((this.GXGRequest==null && other.getGXGRequest()==null) || 
             (this.GXGRequest!=null &&
              this.GXGRequest.equals(other.getGXGRequest()))) &&
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
        if (getPackageID() != null) {
            _hashCode += getPackageID().hashCode();
        }
        if (getMailingAgentID() != null) {
            _hashCode += getMailingAgentID().hashCode();
        }
        _hashCode += getBoxNumber();
        if (getDestinationLocationID() != null) {
            _hashCode += getDestinationLocationID().hashCode();
        }
        if (getGXGRequest() != null) {
            _hashCode += getGXGRequest().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerifyGXGPackageToDestinationLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">VerifyGXGPackageToDestinationLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "PackageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingAgentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "MailingAgentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "BoxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "DestinationLocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GXGRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "GXGRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">>VerifyGXGPackageToDestinationLocation>GXGRequest"));
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
