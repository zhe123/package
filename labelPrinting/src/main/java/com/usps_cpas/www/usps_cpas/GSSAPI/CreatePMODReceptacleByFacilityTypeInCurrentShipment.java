/**
 * CreatePMODReceptacleByFacilityTypeInCurrentShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CreatePMODReceptacleByFacilityTypeInCurrentShipment  implements java.io.Serializable {
    private java.lang.String facilityType;

    private java.lang.String facilityZipCode;

    private java.lang.String receptacleType;

    private java.util.Calendar dateOfMailing;

    private java.lang.String facilityName;

    private java.lang.String accessToken;

    public CreatePMODReceptacleByFacilityTypeInCurrentShipment() {
    }

    public CreatePMODReceptacleByFacilityTypeInCurrentShipment(
           java.lang.String facilityType,
           java.lang.String facilityZipCode,
           java.lang.String receptacleType,
           java.util.Calendar dateOfMailing,
           java.lang.String facilityName,
           java.lang.String accessToken) {
           this.facilityType = facilityType;
           this.facilityZipCode = facilityZipCode;
           this.receptacleType = receptacleType;
           this.dateOfMailing = dateOfMailing;
           this.facilityName = facilityName;
           this.accessToken = accessToken;
    }


    /**
     * Gets the facilityType value for this CreatePMODReceptacleByFacilityTypeInCurrentShipment.
     * 
     * @return facilityType
     */
    public java.lang.String getFacilityType() {
        return facilityType;
    }


    /**
     * Sets the facilityType value for this CreatePMODReceptacleByFacilityTypeInCurrentShipment.
     * 
     * @param facilityType
     */
    public void setFacilityType(java.lang.String facilityType) {
        this.facilityType = facilityType;
    }


    /**
     * Gets the facilityZipCode value for this CreatePMODReceptacleByFacilityTypeInCurrentShipment.
     * 
     * @return facilityZipCode
     */
    public java.lang.String getFacilityZipCode() {
        return facilityZipCode;
    }


    /**
     * Sets the facilityZipCode value for this CreatePMODReceptacleByFacilityTypeInCurrentShipment.
     * 
     * @param facilityZipCode
     */
    public void setFacilityZipCode(java.lang.String facilityZipCode) {
        this.facilityZipCode = facilityZipCode;
    }


    /**
     * Gets the receptacleType value for this CreatePMODReceptacleByFacilityTypeInCurrentShipment.
     * 
     * @return receptacleType
     */
    public java.lang.String getReceptacleType() {
        return receptacleType;
    }


    /**
     * Sets the receptacleType value for this CreatePMODReceptacleByFacilityTypeInCurrentShipment.
     * 
     * @param receptacleType
     */
    public void setReceptacleType(java.lang.String receptacleType) {
        this.receptacleType = receptacleType;
    }


    /**
     * Gets the dateOfMailing value for this CreatePMODReceptacleByFacilityTypeInCurrentShipment.
     * 
     * @return dateOfMailing
     */
    public java.util.Calendar getDateOfMailing() {
        return dateOfMailing;
    }


    /**
     * Sets the dateOfMailing value for this CreatePMODReceptacleByFacilityTypeInCurrentShipment.
     * 
     * @param dateOfMailing
     */
    public void setDateOfMailing(java.util.Calendar dateOfMailing) {
        this.dateOfMailing = dateOfMailing;
    }


    /**
     * Gets the facilityName value for this CreatePMODReceptacleByFacilityTypeInCurrentShipment.
     * 
     * @return facilityName
     */
    public java.lang.String getFacilityName() {
        return facilityName;
    }


    /**
     * Sets the facilityName value for this CreatePMODReceptacleByFacilityTypeInCurrentShipment.
     * 
     * @param facilityName
     */
    public void setFacilityName(java.lang.String facilityName) {
        this.facilityName = facilityName;
    }


    /**
     * Gets the accessToken value for this CreatePMODReceptacleByFacilityTypeInCurrentShipment.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this CreatePMODReceptacleByFacilityTypeInCurrentShipment.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatePMODReceptacleByFacilityTypeInCurrentShipment)) return false;
        CreatePMODReceptacleByFacilityTypeInCurrentShipment other = (CreatePMODReceptacleByFacilityTypeInCurrentShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.facilityType==null && other.getFacilityType()==null) || 
             (this.facilityType!=null &&
              this.facilityType.equals(other.getFacilityType()))) &&
            ((this.facilityZipCode==null && other.getFacilityZipCode()==null) || 
             (this.facilityZipCode!=null &&
              this.facilityZipCode.equals(other.getFacilityZipCode()))) &&
            ((this.receptacleType==null && other.getReceptacleType()==null) || 
             (this.receptacleType!=null &&
              this.receptacleType.equals(other.getReceptacleType()))) &&
            ((this.dateOfMailing==null && other.getDateOfMailing()==null) || 
             (this.dateOfMailing!=null &&
              this.dateOfMailing.equals(other.getDateOfMailing()))) &&
            ((this.facilityName==null && other.getFacilityName()==null) || 
             (this.facilityName!=null &&
              this.facilityName.equals(other.getFacilityName()))) &&
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
        if (getFacilityType() != null) {
            _hashCode += getFacilityType().hashCode();
        }
        if (getFacilityZipCode() != null) {
            _hashCode += getFacilityZipCode().hashCode();
        }
        if (getReceptacleType() != null) {
            _hashCode += getReceptacleType().hashCode();
        }
        if (getDateOfMailing() != null) {
            _hashCode += getDateOfMailing().hashCode();
        }
        if (getFacilityName() != null) {
            _hashCode += getFacilityName().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreatePMODReceptacleByFacilityTypeInCurrentShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">CreatePMODReceptacleByFacilityTypeInCurrentShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facilityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "FacilityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facilityZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "FacilityZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receptacleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ReceptacleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfMailing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "DateOfMailing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facilityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "FacilityName"));
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
