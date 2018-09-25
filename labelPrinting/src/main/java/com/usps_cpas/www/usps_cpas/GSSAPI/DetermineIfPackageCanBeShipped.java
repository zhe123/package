/**
 * DetermineIfPackageCanBeShipped.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class DetermineIfPackageCanBeShipped  implements java.io.Serializable {
    private java.lang.String rateType;

    private java.lang.String serviceType;

    private java.lang.String destinationCountryCode;

    private java.math.BigDecimal weight;

    private java.lang.String weightUnit;

    private int length;

    private int width;

    private int height;

    private java.lang.String unitOfMeasurement;

    private java.math.BigDecimal packageValueInUSD;

    private java.lang.String accessToken;

    public DetermineIfPackageCanBeShipped() {
    }

    public DetermineIfPackageCanBeShipped(
           java.lang.String rateType,
           java.lang.String serviceType,
           java.lang.String destinationCountryCode,
           java.math.BigDecimal weight,
           java.lang.String weightUnit,
           int length,
           int width,
           int height,
           java.lang.String unitOfMeasurement,
           java.math.BigDecimal packageValueInUSD,
           java.lang.String accessToken) {
           this.rateType = rateType;
           this.serviceType = serviceType;
           this.destinationCountryCode = destinationCountryCode;
           this.weight = weight;
           this.weightUnit = weightUnit;
           this.length = length;
           this.width = width;
           this.height = height;
           this.unitOfMeasurement = unitOfMeasurement;
           this.packageValueInUSD = packageValueInUSD;
           this.accessToken = accessToken;
    }


    /**
     * Gets the rateType value for this DetermineIfPackageCanBeShipped.
     * 
     * @return rateType
     */
    public java.lang.String getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this DetermineIfPackageCanBeShipped.
     * 
     * @param rateType
     */
    public void setRateType(java.lang.String rateType) {
        this.rateType = rateType;
    }


    /**
     * Gets the serviceType value for this DetermineIfPackageCanBeShipped.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this DetermineIfPackageCanBeShipped.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the destinationCountryCode value for this DetermineIfPackageCanBeShipped.
     * 
     * @return destinationCountryCode
     */
    public java.lang.String getDestinationCountryCode() {
        return destinationCountryCode;
    }


    /**
     * Sets the destinationCountryCode value for this DetermineIfPackageCanBeShipped.
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(java.lang.String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }


    /**
     * Gets the weight value for this DetermineIfPackageCanBeShipped.
     * 
     * @return weight
     */
    public java.math.BigDecimal getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this DetermineIfPackageCanBeShipped.
     * 
     * @param weight
     */
    public void setWeight(java.math.BigDecimal weight) {
        this.weight = weight;
    }


    /**
     * Gets the weightUnit value for this DetermineIfPackageCanBeShipped.
     * 
     * @return weightUnit
     */
    public java.lang.String getWeightUnit() {
        return weightUnit;
    }


    /**
     * Sets the weightUnit value for this DetermineIfPackageCanBeShipped.
     * 
     * @param weightUnit
     */
    public void setWeightUnit(java.lang.String weightUnit) {
        this.weightUnit = weightUnit;
    }


    /**
     * Gets the length value for this DetermineIfPackageCanBeShipped.
     * 
     * @return length
     */
    public int getLength() {
        return length;
    }


    /**
     * Sets the length value for this DetermineIfPackageCanBeShipped.
     * 
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }


    /**
     * Gets the width value for this DetermineIfPackageCanBeShipped.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this DetermineIfPackageCanBeShipped.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }


    /**
     * Gets the height value for this DetermineIfPackageCanBeShipped.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this DetermineIfPackageCanBeShipped.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Gets the unitOfMeasurement value for this DetermineIfPackageCanBeShipped.
     * 
     * @return unitOfMeasurement
     */
    public java.lang.String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }


    /**
     * Sets the unitOfMeasurement value for this DetermineIfPackageCanBeShipped.
     * 
     * @param unitOfMeasurement
     */
    public void setUnitOfMeasurement(java.lang.String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }


    /**
     * Gets the packageValueInUSD value for this DetermineIfPackageCanBeShipped.
     * 
     * @return packageValueInUSD
     */
    public java.math.BigDecimal getPackageValueInUSD() {
        return packageValueInUSD;
    }


    /**
     * Sets the packageValueInUSD value for this DetermineIfPackageCanBeShipped.
     * 
     * @param packageValueInUSD
     */
    public void setPackageValueInUSD(java.math.BigDecimal packageValueInUSD) {
        this.packageValueInUSD = packageValueInUSD;
    }


    /**
     * Gets the accessToken value for this DetermineIfPackageCanBeShipped.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this DetermineIfPackageCanBeShipped.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetermineIfPackageCanBeShipped)) return false;
        DetermineIfPackageCanBeShipped other = (DetermineIfPackageCanBeShipped) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rateType==null && other.getRateType()==null) || 
             (this.rateType!=null &&
              this.rateType.equals(other.getRateType()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.destinationCountryCode==null && other.getDestinationCountryCode()==null) || 
             (this.destinationCountryCode!=null &&
              this.destinationCountryCode.equals(other.getDestinationCountryCode()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.weightUnit==null && other.getWeightUnit()==null) || 
             (this.weightUnit!=null &&
              this.weightUnit.equals(other.getWeightUnit()))) &&
            this.length == other.getLength() &&
            this.width == other.getWidth() &&
            this.height == other.getHeight() &&
            ((this.unitOfMeasurement==null && other.getUnitOfMeasurement()==null) || 
             (this.unitOfMeasurement!=null &&
              this.unitOfMeasurement.equals(other.getUnitOfMeasurement()))) &&
            ((this.packageValueInUSD==null && other.getPackageValueInUSD()==null) || 
             (this.packageValueInUSD!=null &&
              this.packageValueInUSD.equals(other.getPackageValueInUSD()))) &&
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
        if (getRateType() != null) {
            _hashCode += getRateType().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getDestinationCountryCode() != null) {
            _hashCode += getDestinationCountryCode().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getWeightUnit() != null) {
            _hashCode += getWeightUnit().hashCode();
        }
        _hashCode += getLength();
        _hashCode += getWidth();
        _hashCode += getHeight();
        if (getUnitOfMeasurement() != null) {
            _hashCode += getUnitOfMeasurement().hashCode();
        }
        if (getPackageValueInUSD() != null) {
            _hashCode += getPackageValueInUSD().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetermineIfPackageCanBeShipped.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">DetermineIfPackageCanBeShipped"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "DestinationCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "weight"));
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
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasurement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "UnitOfMeasurement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageValueInUSD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "PackageValueInUSD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
