/**
 * SetExpectedShipDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class SetExpectedShipDate  implements java.io.Serializable {
    private java.lang.String destinationLocationID;

    private java.lang.String expectedShipDate;

    private java.lang.String accessToken;

    public SetExpectedShipDate() {
    }

    public SetExpectedShipDate(
           java.lang.String destinationLocationID,
           java.lang.String expectedShipDate,
           java.lang.String accessToken) {
           this.destinationLocationID = destinationLocationID;
           this.expectedShipDate = expectedShipDate;
           this.accessToken = accessToken;
    }


    /**
     * Gets the destinationLocationID value for this SetExpectedShipDate.
     * 
     * @return destinationLocationID
     */
    public java.lang.String getDestinationLocationID() {
        return destinationLocationID;
    }


    /**
     * Sets the destinationLocationID value for this SetExpectedShipDate.
     * 
     * @param destinationLocationID
     */
    public void setDestinationLocationID(java.lang.String destinationLocationID) {
        this.destinationLocationID = destinationLocationID;
    }


    /**
     * Gets the expectedShipDate value for this SetExpectedShipDate.
     * 
     * @return expectedShipDate
     */
    public java.lang.String getExpectedShipDate() {
        return expectedShipDate;
    }


    /**
     * Sets the expectedShipDate value for this SetExpectedShipDate.
     * 
     * @param expectedShipDate
     */
    public void setExpectedShipDate(java.lang.String expectedShipDate) {
        this.expectedShipDate = expectedShipDate;
    }


    /**
     * Gets the accessToken value for this SetExpectedShipDate.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this SetExpectedShipDate.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetExpectedShipDate)) return false;
        SetExpectedShipDate other = (SetExpectedShipDate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.destinationLocationID==null && other.getDestinationLocationID()==null) || 
             (this.destinationLocationID!=null &&
              this.destinationLocationID.equals(other.getDestinationLocationID()))) &&
            ((this.expectedShipDate==null && other.getExpectedShipDate()==null) || 
             (this.expectedShipDate!=null &&
              this.expectedShipDate.equals(other.getExpectedShipDate()))) &&
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
        if (getDestinationLocationID() != null) {
            _hashCode += getDestinationLocationID().hashCode();
        }
        if (getExpectedShipDate() != null) {
            _hashCode += getExpectedShipDate().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetExpectedShipDate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">SetExpectedShipDate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "DestinationLocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedShipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ExpectedShipDate"));
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
