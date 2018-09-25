/**
 * CreateNewReceptacleInCurrentShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CreateNewReceptacleInCurrentShipment  implements java.io.Serializable {
    private java.lang.String productCode;

    private java.lang.String serviceCode;

    private java.lang.String receptacleType;

    private java.lang.String foreignCountryCode;

    private java.lang.String foreignOECode;

    private java.util.Calendar dateOfMailing;

    private java.lang.String accessToken;

    public CreateNewReceptacleInCurrentShipment() {
    }

    public CreateNewReceptacleInCurrentShipment(
           java.lang.String productCode,
           java.lang.String serviceCode,
           java.lang.String receptacleType,
           java.lang.String foreignCountryCode,
           java.lang.String foreignOECode,
           java.util.Calendar dateOfMailing,
           java.lang.String accessToken) {
           this.productCode = productCode;
           this.serviceCode = serviceCode;
           this.receptacleType = receptacleType;
           this.foreignCountryCode = foreignCountryCode;
           this.foreignOECode = foreignOECode;
           this.dateOfMailing = dateOfMailing;
           this.accessToken = accessToken;
    }


    /**
     * Gets the productCode value for this CreateNewReceptacleInCurrentShipment.
     * 
     * @return productCode
     */
    public java.lang.String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this CreateNewReceptacleInCurrentShipment.
     * 
     * @param productCode
     */
    public void setProductCode(java.lang.String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the serviceCode value for this CreateNewReceptacleInCurrentShipment.
     * 
     * @return serviceCode
     */
    public java.lang.String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this CreateNewReceptacleInCurrentShipment.
     * 
     * @param serviceCode
     */
    public void setServiceCode(java.lang.String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the receptacleType value for this CreateNewReceptacleInCurrentShipment.
     * 
     * @return receptacleType
     */
    public java.lang.String getReceptacleType() {
        return receptacleType;
    }


    /**
     * Sets the receptacleType value for this CreateNewReceptacleInCurrentShipment.
     * 
     * @param receptacleType
     */
    public void setReceptacleType(java.lang.String receptacleType) {
        this.receptacleType = receptacleType;
    }


    /**
     * Gets the foreignCountryCode value for this CreateNewReceptacleInCurrentShipment.
     * 
     * @return foreignCountryCode
     */
    public java.lang.String getForeignCountryCode() {
        return foreignCountryCode;
    }


    /**
     * Sets the foreignCountryCode value for this CreateNewReceptacleInCurrentShipment.
     * 
     * @param foreignCountryCode
     */
    public void setForeignCountryCode(java.lang.String foreignCountryCode) {
        this.foreignCountryCode = foreignCountryCode;
    }


    /**
     * Gets the foreignOECode value for this CreateNewReceptacleInCurrentShipment.
     * 
     * @return foreignOECode
     */
    public java.lang.String getForeignOECode() {
        return foreignOECode;
    }


    /**
     * Sets the foreignOECode value for this CreateNewReceptacleInCurrentShipment.
     * 
     * @param foreignOECode
     */
    public void setForeignOECode(java.lang.String foreignOECode) {
        this.foreignOECode = foreignOECode;
    }


    /**
     * Gets the dateOfMailing value for this CreateNewReceptacleInCurrentShipment.
     * 
     * @return dateOfMailing
     */
    public java.util.Calendar getDateOfMailing() {
        return dateOfMailing;
    }


    /**
     * Sets the dateOfMailing value for this CreateNewReceptacleInCurrentShipment.
     * 
     * @param dateOfMailing
     */
    public void setDateOfMailing(java.util.Calendar dateOfMailing) {
        this.dateOfMailing = dateOfMailing;
    }


    /**
     * Gets the accessToken value for this CreateNewReceptacleInCurrentShipment.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this CreateNewReceptacleInCurrentShipment.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateNewReceptacleInCurrentShipment)) return false;
        CreateNewReceptacleInCurrentShipment other = (CreateNewReceptacleInCurrentShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.serviceCode==null && other.getServiceCode()==null) || 
             (this.serviceCode!=null &&
              this.serviceCode.equals(other.getServiceCode()))) &&
            ((this.receptacleType==null && other.getReceptacleType()==null) || 
             (this.receptacleType!=null &&
              this.receptacleType.equals(other.getReceptacleType()))) &&
            ((this.foreignCountryCode==null && other.getForeignCountryCode()==null) || 
             (this.foreignCountryCode!=null &&
              this.foreignCountryCode.equals(other.getForeignCountryCode()))) &&
            ((this.foreignOECode==null && other.getForeignOECode()==null) || 
             (this.foreignOECode!=null &&
              this.foreignOECode.equals(other.getForeignOECode()))) &&
            ((this.dateOfMailing==null && other.getDateOfMailing()==null) || 
             (this.dateOfMailing!=null &&
              this.dateOfMailing.equals(other.getDateOfMailing()))) &&
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
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getServiceCode() != null) {
            _hashCode += getServiceCode().hashCode();
        }
        if (getReceptacleType() != null) {
            _hashCode += getReceptacleType().hashCode();
        }
        if (getForeignCountryCode() != null) {
            _hashCode += getForeignCountryCode().hashCode();
        }
        if (getForeignOECode() != null) {
            _hashCode += getForeignOECode().hashCode();
        }
        if (getDateOfMailing() != null) {
            _hashCode += getDateOfMailing().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateNewReceptacleInCurrentShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">CreateNewReceptacleInCurrentShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ProductCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ServiceCode"));
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
        elemField.setFieldName("foreignCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ForeignCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignOECode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ForeignOECode"));
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
