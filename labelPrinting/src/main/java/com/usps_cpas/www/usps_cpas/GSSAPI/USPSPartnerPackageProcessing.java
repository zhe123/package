/**
 * USPSPartnerPackageProcessing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class USPSPartnerPackageProcessing  implements java.io.Serializable {
    private java.lang.String USPSPackageID;

    private java.lang.String destinationLocationID;

    private com.usps_cpas.www.usps_cpas.GSSAPI.USPSPartnerPackageProcessingXmlDoc xmlDoc;

    private java.lang.String accessToken;

    public USPSPartnerPackageProcessing() {
    }

    public USPSPartnerPackageProcessing(
           java.lang.String USPSPackageID,
           java.lang.String destinationLocationID,
           com.usps_cpas.www.usps_cpas.GSSAPI.USPSPartnerPackageProcessingXmlDoc xmlDoc,
           java.lang.String accessToken) {
           this.USPSPackageID = USPSPackageID;
           this.destinationLocationID = destinationLocationID;
           this.xmlDoc = xmlDoc;
           this.accessToken = accessToken;
    }


    /**
     * Gets the USPSPackageID value for this USPSPartnerPackageProcessing.
     * 
     * @return USPSPackageID
     */
    public java.lang.String getUSPSPackageID() {
        return USPSPackageID;
    }


    /**
     * Sets the USPSPackageID value for this USPSPartnerPackageProcessing.
     * 
     * @param USPSPackageID
     */
    public void setUSPSPackageID(java.lang.String USPSPackageID) {
        this.USPSPackageID = USPSPackageID;
    }


    /**
     * Gets the destinationLocationID value for this USPSPartnerPackageProcessing.
     * 
     * @return destinationLocationID
     */
    public java.lang.String getDestinationLocationID() {
        return destinationLocationID;
    }


    /**
     * Sets the destinationLocationID value for this USPSPartnerPackageProcessing.
     * 
     * @param destinationLocationID
     */
    public void setDestinationLocationID(java.lang.String destinationLocationID) {
        this.destinationLocationID = destinationLocationID;
    }


    /**
     * Gets the xmlDoc value for this USPSPartnerPackageProcessing.
     * 
     * @return xmlDoc
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.USPSPartnerPackageProcessingXmlDoc getXmlDoc() {
        return xmlDoc;
    }


    /**
     * Sets the xmlDoc value for this USPSPartnerPackageProcessing.
     * 
     * @param xmlDoc
     */
    public void setXmlDoc(com.usps_cpas.www.usps_cpas.GSSAPI.USPSPartnerPackageProcessingXmlDoc xmlDoc) {
        this.xmlDoc = xmlDoc;
    }


    /**
     * Gets the accessToken value for this USPSPartnerPackageProcessing.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this USPSPartnerPackageProcessing.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof USPSPartnerPackageProcessing)) return false;
        USPSPartnerPackageProcessing other = (USPSPartnerPackageProcessing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.USPSPackageID==null && other.getUSPSPackageID()==null) || 
             (this.USPSPackageID!=null &&
              this.USPSPackageID.equals(other.getUSPSPackageID()))) &&
            ((this.destinationLocationID==null && other.getDestinationLocationID()==null) || 
             (this.destinationLocationID!=null &&
              this.destinationLocationID.equals(other.getDestinationLocationID()))) &&
            ((this.xmlDoc==null && other.getXmlDoc()==null) || 
             (this.xmlDoc!=null &&
              this.xmlDoc.equals(other.getXmlDoc()))) &&
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
        if (getUSPSPackageID() != null) {
            _hashCode += getUSPSPackageID().hashCode();
        }
        if (getDestinationLocationID() != null) {
            _hashCode += getDestinationLocationID().hashCode();
        }
        if (getXmlDoc() != null) {
            _hashCode += getXmlDoc().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(USPSPartnerPackageProcessing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">USPSPartnerPackageProcessing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USPSPackageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "USPSPackageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("xmlDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "xmlDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">>USPSPartnerPackageProcessing>xmlDoc"));
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
