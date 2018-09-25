/**
 * UpdateDomesticPackageWeight.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class UpdateDomesticPackageWeight  implements java.io.Serializable {
    private java.lang.String USPSPackageID;

    private java.math.BigDecimal weight;

    private java.lang.String weightUnit;

    private java.lang.String accessToken;

    public UpdateDomesticPackageWeight() {
    }

    public UpdateDomesticPackageWeight(
           java.lang.String USPSPackageID,
           java.math.BigDecimal weight,
           java.lang.String weightUnit,
           java.lang.String accessToken) {
           this.USPSPackageID = USPSPackageID;
           this.weight = weight;
           this.weightUnit = weightUnit;
           this.accessToken = accessToken;
    }


    /**
     * Gets the USPSPackageID value for this UpdateDomesticPackageWeight.
     * 
     * @return USPSPackageID
     */
    public java.lang.String getUSPSPackageID() {
        return USPSPackageID;
    }


    /**
     * Sets the USPSPackageID value for this UpdateDomesticPackageWeight.
     * 
     * @param USPSPackageID
     */
    public void setUSPSPackageID(java.lang.String USPSPackageID) {
        this.USPSPackageID = USPSPackageID;
    }


    /**
     * Gets the weight value for this UpdateDomesticPackageWeight.
     * 
     * @return weight
     */
    public java.math.BigDecimal getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this UpdateDomesticPackageWeight.
     * 
     * @param weight
     */
    public void setWeight(java.math.BigDecimal weight) {
        this.weight = weight;
    }


    /**
     * Gets the weightUnit value for this UpdateDomesticPackageWeight.
     * 
     * @return weightUnit
     */
    public java.lang.String getWeightUnit() {
        return weightUnit;
    }


    /**
     * Sets the weightUnit value for this UpdateDomesticPackageWeight.
     * 
     * @param weightUnit
     */
    public void setWeightUnit(java.lang.String weightUnit) {
        this.weightUnit = weightUnit;
    }


    /**
     * Gets the accessToken value for this UpdateDomesticPackageWeight.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this UpdateDomesticPackageWeight.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateDomesticPackageWeight)) return false;
        UpdateDomesticPackageWeight other = (UpdateDomesticPackageWeight) obj;
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
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.weightUnit==null && other.getWeightUnit()==null) || 
             (this.weightUnit!=null &&
              this.weightUnit.equals(other.getWeightUnit()))) &&
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
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getWeightUnit() != null) {
            _hashCode += getWeightUnit().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateDomesticPackageWeight.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">UpdateDomesticPackageWeight"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USPSPackageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "USPSPackageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "WeightUnit"));
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
