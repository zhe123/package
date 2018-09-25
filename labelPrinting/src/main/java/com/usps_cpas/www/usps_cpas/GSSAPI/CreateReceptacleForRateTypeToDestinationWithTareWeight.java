/**
 * CreateReceptacleForRateTypeToDestinationWithTareWeight.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CreateReceptacleForRateTypeToDestinationWithTareWeight  implements java.io.Serializable {
    private java.lang.String rateType;

    private boolean dutiable;

    private java.lang.String receptacleType;

    private java.lang.String foreignOECode;

    private java.lang.String countryCode;

    private java.util.Calendar dateOfMailing;

    private int pieceCount;

    private java.math.BigDecimal weightInLbs;

    private java.math.BigDecimal tareWeight;

    private java.lang.String accessToken;

    public CreateReceptacleForRateTypeToDestinationWithTareWeight() {
    }

    public CreateReceptacleForRateTypeToDestinationWithTareWeight(
           java.lang.String rateType,
           boolean dutiable,
           java.lang.String receptacleType,
           java.lang.String foreignOECode,
           java.lang.String countryCode,
           java.util.Calendar dateOfMailing,
           int pieceCount,
           java.math.BigDecimal weightInLbs,
           java.math.BigDecimal tareWeight,
           java.lang.String accessToken) {
           this.rateType = rateType;
           this.dutiable = dutiable;
           this.receptacleType = receptacleType;
           this.foreignOECode = foreignOECode;
           this.countryCode = countryCode;
           this.dateOfMailing = dateOfMailing;
           this.pieceCount = pieceCount;
           this.weightInLbs = weightInLbs;
           this.tareWeight = tareWeight;
           this.accessToken = accessToken;
    }


    /**
     * Gets the rateType value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @return rateType
     */
    public java.lang.String getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @param rateType
     */
    public void setRateType(java.lang.String rateType) {
        this.rateType = rateType;
    }


    /**
     * Gets the dutiable value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @return dutiable
     */
    public boolean isDutiable() {
        return dutiable;
    }


    /**
     * Sets the dutiable value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @param dutiable
     */
    public void setDutiable(boolean dutiable) {
        this.dutiable = dutiable;
    }


    /**
     * Gets the receptacleType value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @return receptacleType
     */
    public java.lang.String getReceptacleType() {
        return receptacleType;
    }


    /**
     * Sets the receptacleType value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @param receptacleType
     */
    public void setReceptacleType(java.lang.String receptacleType) {
        this.receptacleType = receptacleType;
    }


    /**
     * Gets the foreignOECode value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @return foreignOECode
     */
    public java.lang.String getForeignOECode() {
        return foreignOECode;
    }


    /**
     * Sets the foreignOECode value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @param foreignOECode
     */
    public void setForeignOECode(java.lang.String foreignOECode) {
        this.foreignOECode = foreignOECode;
    }


    /**
     * Gets the countryCode value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the dateOfMailing value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @return dateOfMailing
     */
    public java.util.Calendar getDateOfMailing() {
        return dateOfMailing;
    }


    /**
     * Sets the dateOfMailing value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @param dateOfMailing
     */
    public void setDateOfMailing(java.util.Calendar dateOfMailing) {
        this.dateOfMailing = dateOfMailing;
    }


    /**
     * Gets the pieceCount value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @return pieceCount
     */
    public int getPieceCount() {
        return pieceCount;
    }


    /**
     * Sets the pieceCount value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @param pieceCount
     */
    public void setPieceCount(int pieceCount) {
        this.pieceCount = pieceCount;
    }


    /**
     * Gets the weightInLbs value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @return weightInLbs
     */
    public java.math.BigDecimal getWeightInLbs() {
        return weightInLbs;
    }


    /**
     * Sets the weightInLbs value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @param weightInLbs
     */
    public void setWeightInLbs(java.math.BigDecimal weightInLbs) {
        this.weightInLbs = weightInLbs;
    }


    /**
     * Gets the tareWeight value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @return tareWeight
     */
    public java.math.BigDecimal getTareWeight() {
        return tareWeight;
    }


    /**
     * Sets the tareWeight value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @param tareWeight
     */
    public void setTareWeight(java.math.BigDecimal tareWeight) {
        this.tareWeight = tareWeight;
    }


    /**
     * Gets the accessToken value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this CreateReceptacleForRateTypeToDestinationWithTareWeight.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateReceptacleForRateTypeToDestinationWithTareWeight)) return false;
        CreateReceptacleForRateTypeToDestinationWithTareWeight other = (CreateReceptacleForRateTypeToDestinationWithTareWeight) obj;
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
            this.dutiable == other.isDutiable() &&
            ((this.receptacleType==null && other.getReceptacleType()==null) || 
             (this.receptacleType!=null &&
              this.receptacleType.equals(other.getReceptacleType()))) &&
            ((this.foreignOECode==null && other.getForeignOECode()==null) || 
             (this.foreignOECode!=null &&
              this.foreignOECode.equals(other.getForeignOECode()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.dateOfMailing==null && other.getDateOfMailing()==null) || 
             (this.dateOfMailing!=null &&
              this.dateOfMailing.equals(other.getDateOfMailing()))) &&
            this.pieceCount == other.getPieceCount() &&
            ((this.weightInLbs==null && other.getWeightInLbs()==null) || 
             (this.weightInLbs!=null &&
              this.weightInLbs.equals(other.getWeightInLbs()))) &&
            ((this.tareWeight==null && other.getTareWeight()==null) || 
             (this.tareWeight!=null &&
              this.tareWeight.equals(other.getTareWeight()))) &&
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
        _hashCode += (isDutiable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReceptacleType() != null) {
            _hashCode += getReceptacleType().hashCode();
        }
        if (getForeignOECode() != null) {
            _hashCode += getForeignOECode().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getDateOfMailing() != null) {
            _hashCode += getDateOfMailing().hashCode();
        }
        _hashCode += getPieceCount();
        if (getWeightInLbs() != null) {
            _hashCode += getWeightInLbs().hashCode();
        }
        if (getTareWeight() != null) {
            _hashCode += getTareWeight().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateReceptacleForRateTypeToDestinationWithTareWeight.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">CreateReceptacleForRateTypeToDestinationWithTareWeight"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dutiable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Dutiable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("foreignOECode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ForeignOECode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CountryCode"));
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
        elemField.setFieldName("pieceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "PieceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightInLbs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "WeightInLbs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tareWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "TareWeight"));
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
