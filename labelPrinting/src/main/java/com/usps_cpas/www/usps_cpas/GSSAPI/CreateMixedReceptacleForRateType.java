/**
 * CreateMixedReceptacleForRateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CreateMixedReceptacleForRateType  implements java.io.Serializable {
    private java.lang.String rateType;

    private java.lang.String rateGroup;

    private boolean dutiable;

    private java.lang.String receptacleType;

    private java.util.Calendar dateOfMailing;

    private int pieceCount;

    private java.math.BigDecimal weightInLbs;

    private java.lang.String accessToken;

    public CreateMixedReceptacleForRateType() {
    }

    public CreateMixedReceptacleForRateType(
           java.lang.String rateType,
           java.lang.String rateGroup,
           boolean dutiable,
           java.lang.String receptacleType,
           java.util.Calendar dateOfMailing,
           int pieceCount,
           java.math.BigDecimal weightInLbs,
           java.lang.String accessToken) {
           this.rateType = rateType;
           this.rateGroup = rateGroup;
           this.dutiable = dutiable;
           this.receptacleType = receptacleType;
           this.dateOfMailing = dateOfMailing;
           this.pieceCount = pieceCount;
           this.weightInLbs = weightInLbs;
           this.accessToken = accessToken;
    }


    /**
     * Gets the rateType value for this CreateMixedReceptacleForRateType.
     * 
     * @return rateType
     */
    public java.lang.String getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this CreateMixedReceptacleForRateType.
     * 
     * @param rateType
     */
    public void setRateType(java.lang.String rateType) {
        this.rateType = rateType;
    }


    /**
     * Gets the rateGroup value for this CreateMixedReceptacleForRateType.
     * 
     * @return rateGroup
     */
    public java.lang.String getRateGroup() {
        return rateGroup;
    }


    /**
     * Sets the rateGroup value for this CreateMixedReceptacleForRateType.
     * 
     * @param rateGroup
     */
    public void setRateGroup(java.lang.String rateGroup) {
        this.rateGroup = rateGroup;
    }


    /**
     * Gets the dutiable value for this CreateMixedReceptacleForRateType.
     * 
     * @return dutiable
     */
    public boolean isDutiable() {
        return dutiable;
    }


    /**
     * Sets the dutiable value for this CreateMixedReceptacleForRateType.
     * 
     * @param dutiable
     */
    public void setDutiable(boolean dutiable) {
        this.dutiable = dutiable;
    }


    /**
     * Gets the receptacleType value for this CreateMixedReceptacleForRateType.
     * 
     * @return receptacleType
     */
    public java.lang.String getReceptacleType() {
        return receptacleType;
    }


    /**
     * Sets the receptacleType value for this CreateMixedReceptacleForRateType.
     * 
     * @param receptacleType
     */
    public void setReceptacleType(java.lang.String receptacleType) {
        this.receptacleType = receptacleType;
    }


    /**
     * Gets the dateOfMailing value for this CreateMixedReceptacleForRateType.
     * 
     * @return dateOfMailing
     */
    public java.util.Calendar getDateOfMailing() {
        return dateOfMailing;
    }


    /**
     * Sets the dateOfMailing value for this CreateMixedReceptacleForRateType.
     * 
     * @param dateOfMailing
     */
    public void setDateOfMailing(java.util.Calendar dateOfMailing) {
        this.dateOfMailing = dateOfMailing;
    }


    /**
     * Gets the pieceCount value for this CreateMixedReceptacleForRateType.
     * 
     * @return pieceCount
     */
    public int getPieceCount() {
        return pieceCount;
    }


    /**
     * Sets the pieceCount value for this CreateMixedReceptacleForRateType.
     * 
     * @param pieceCount
     */
    public void setPieceCount(int pieceCount) {
        this.pieceCount = pieceCount;
    }


    /**
     * Gets the weightInLbs value for this CreateMixedReceptacleForRateType.
     * 
     * @return weightInLbs
     */
    public java.math.BigDecimal getWeightInLbs() {
        return weightInLbs;
    }


    /**
     * Sets the weightInLbs value for this CreateMixedReceptacleForRateType.
     * 
     * @param weightInLbs
     */
    public void setWeightInLbs(java.math.BigDecimal weightInLbs) {
        this.weightInLbs = weightInLbs;
    }


    /**
     * Gets the accessToken value for this CreateMixedReceptacleForRateType.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this CreateMixedReceptacleForRateType.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateMixedReceptacleForRateType)) return false;
        CreateMixedReceptacleForRateType other = (CreateMixedReceptacleForRateType) obj;
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
            ((this.rateGroup==null && other.getRateGroup()==null) || 
             (this.rateGroup!=null &&
              this.rateGroup.equals(other.getRateGroup()))) &&
            this.dutiable == other.isDutiable() &&
            ((this.receptacleType==null && other.getReceptacleType()==null) || 
             (this.receptacleType!=null &&
              this.receptacleType.equals(other.getReceptacleType()))) &&
            ((this.dateOfMailing==null && other.getDateOfMailing()==null) || 
             (this.dateOfMailing!=null &&
              this.dateOfMailing.equals(other.getDateOfMailing()))) &&
            this.pieceCount == other.getPieceCount() &&
            ((this.weightInLbs==null && other.getWeightInLbs()==null) || 
             (this.weightInLbs!=null &&
              this.weightInLbs.equals(other.getWeightInLbs()))) &&
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
        if (getRateGroup() != null) {
            _hashCode += getRateGroup().hashCode();
        }
        _hashCode += (isDutiable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReceptacleType() != null) {
            _hashCode += getReceptacleType().hashCode();
        }
        if (getDateOfMailing() != null) {
            _hashCode += getDateOfMailing().hashCode();
        }
        _hashCode += getPieceCount();
        if (getWeightInLbs() != null) {
            _hashCode += getWeightInLbs().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateMixedReceptacleForRateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">CreateMixedReceptacleForRateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RateGroup"));
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
