/**
 * ValidateAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class ValidateAddress  implements java.io.Serializable {
    private java.lang.String recipientAddressLine1;

    private java.lang.String recipientAddressLine2;

    private java.lang.String recipientCity;

    private java.lang.String recipientState;

    private java.lang.String recipientPostalCode;

    private java.lang.String recipientCountryCode;

    private java.lang.String accessToken;

    public ValidateAddress() {
    }

    public ValidateAddress(
           java.lang.String recipientAddressLine1,
           java.lang.String recipientAddressLine2,
           java.lang.String recipientCity,
           java.lang.String recipientState,
           java.lang.String recipientPostalCode,
           java.lang.String recipientCountryCode,
           java.lang.String accessToken) {
           this.recipientAddressLine1 = recipientAddressLine1;
           this.recipientAddressLine2 = recipientAddressLine2;
           this.recipientCity = recipientCity;
           this.recipientState = recipientState;
           this.recipientPostalCode = recipientPostalCode;
           this.recipientCountryCode = recipientCountryCode;
           this.accessToken = accessToken;
    }


    /**
     * Gets the recipientAddressLine1 value for this ValidateAddress.
     * 
     * @return recipientAddressLine1
     */
    public java.lang.String getRecipientAddressLine1() {
        return recipientAddressLine1;
    }


    /**
     * Sets the recipientAddressLine1 value for this ValidateAddress.
     * 
     * @param recipientAddressLine1
     */
    public void setRecipientAddressLine1(java.lang.String recipientAddressLine1) {
        this.recipientAddressLine1 = recipientAddressLine1;
    }


    /**
     * Gets the recipientAddressLine2 value for this ValidateAddress.
     * 
     * @return recipientAddressLine2
     */
    public java.lang.String getRecipientAddressLine2() {
        return recipientAddressLine2;
    }


    /**
     * Sets the recipientAddressLine2 value for this ValidateAddress.
     * 
     * @param recipientAddressLine2
     */
    public void setRecipientAddressLine2(java.lang.String recipientAddressLine2) {
        this.recipientAddressLine2 = recipientAddressLine2;
    }


    /**
     * Gets the recipientCity value for this ValidateAddress.
     * 
     * @return recipientCity
     */
    public java.lang.String getRecipientCity() {
        return recipientCity;
    }


    /**
     * Sets the recipientCity value for this ValidateAddress.
     * 
     * @param recipientCity
     */
    public void setRecipientCity(java.lang.String recipientCity) {
        this.recipientCity = recipientCity;
    }


    /**
     * Gets the recipientState value for this ValidateAddress.
     * 
     * @return recipientState
     */
    public java.lang.String getRecipientState() {
        return recipientState;
    }


    /**
     * Sets the recipientState value for this ValidateAddress.
     * 
     * @param recipientState
     */
    public void setRecipientState(java.lang.String recipientState) {
        this.recipientState = recipientState;
    }


    /**
     * Gets the recipientPostalCode value for this ValidateAddress.
     * 
     * @return recipientPostalCode
     */
    public java.lang.String getRecipientPostalCode() {
        return recipientPostalCode;
    }


    /**
     * Sets the recipientPostalCode value for this ValidateAddress.
     * 
     * @param recipientPostalCode
     */
    public void setRecipientPostalCode(java.lang.String recipientPostalCode) {
        this.recipientPostalCode = recipientPostalCode;
    }


    /**
     * Gets the recipientCountryCode value for this ValidateAddress.
     * 
     * @return recipientCountryCode
     */
    public java.lang.String getRecipientCountryCode() {
        return recipientCountryCode;
    }


    /**
     * Sets the recipientCountryCode value for this ValidateAddress.
     * 
     * @param recipientCountryCode
     */
    public void setRecipientCountryCode(java.lang.String recipientCountryCode) {
        this.recipientCountryCode = recipientCountryCode;
    }


    /**
     * Gets the accessToken value for this ValidateAddress.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this ValidateAddress.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateAddress)) return false;
        ValidateAddress other = (ValidateAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recipientAddressLine1==null && other.getRecipientAddressLine1()==null) || 
             (this.recipientAddressLine1!=null &&
              this.recipientAddressLine1.equals(other.getRecipientAddressLine1()))) &&
            ((this.recipientAddressLine2==null && other.getRecipientAddressLine2()==null) || 
             (this.recipientAddressLine2!=null &&
              this.recipientAddressLine2.equals(other.getRecipientAddressLine2()))) &&
            ((this.recipientCity==null && other.getRecipientCity()==null) || 
             (this.recipientCity!=null &&
              this.recipientCity.equals(other.getRecipientCity()))) &&
            ((this.recipientState==null && other.getRecipientState()==null) || 
             (this.recipientState!=null &&
              this.recipientState.equals(other.getRecipientState()))) &&
            ((this.recipientPostalCode==null && other.getRecipientPostalCode()==null) || 
             (this.recipientPostalCode!=null &&
              this.recipientPostalCode.equals(other.getRecipientPostalCode()))) &&
            ((this.recipientCountryCode==null && other.getRecipientCountryCode()==null) || 
             (this.recipientCountryCode!=null &&
              this.recipientCountryCode.equals(other.getRecipientCountryCode()))) &&
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
        if (getRecipientAddressLine1() != null) {
            _hashCode += getRecipientAddressLine1().hashCode();
        }
        if (getRecipientAddressLine2() != null) {
            _hashCode += getRecipientAddressLine2().hashCode();
        }
        if (getRecipientCity() != null) {
            _hashCode += getRecipientCity().hashCode();
        }
        if (getRecipientState() != null) {
            _hashCode += getRecipientState().hashCode();
        }
        if (getRecipientPostalCode() != null) {
            _hashCode += getRecipientPostalCode().hashCode();
        }
        if (getRecipientCountryCode() != null) {
            _hashCode += getRecipientCountryCode().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">ValidateAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientAddressLine1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RecipientAddressLine1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientAddressLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RecipientAddressLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RecipientCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RecipientState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RecipientPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RecipientCountryCode"));
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
