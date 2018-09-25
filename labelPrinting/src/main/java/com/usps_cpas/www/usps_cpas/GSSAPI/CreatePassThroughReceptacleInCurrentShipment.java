/**
 * CreatePassThroughReceptacleInCurrentShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CreatePassThroughReceptacleInCurrentShipment  implements java.io.Serializable {
    private java.lang.String productCode;

    private java.lang.String serviceCode;

    private java.lang.String receptacleType;

    private java.lang.String foreignCountryCode;

    private java.lang.String foreignOECode;

    private java.util.Calendar dateOfMailing;

    private int pieceCount;

    private java.math.BigDecimal weightInLbs;

    private java.lang.String ppmodISC;

    private java.lang.String receptacleTypeName;

    private java.lang.String accessToken;

    public CreatePassThroughReceptacleInCurrentShipment() {
    }

    public CreatePassThroughReceptacleInCurrentShipment(
           java.lang.String productCode,
           java.lang.String serviceCode,
           java.lang.String receptacleType,
           java.lang.String foreignCountryCode,
           java.lang.String foreignOECode,
           java.util.Calendar dateOfMailing,
           int pieceCount,
           java.math.BigDecimal weightInLbs,
           java.lang.String ppmodISC,
           java.lang.String receptacleTypeName,
           java.lang.String accessToken) {
           this.productCode = productCode;
           this.serviceCode = serviceCode;
           this.receptacleType = receptacleType;
           this.foreignCountryCode = foreignCountryCode;
           this.foreignOECode = foreignOECode;
           this.dateOfMailing = dateOfMailing;
           this.pieceCount = pieceCount;
           this.weightInLbs = weightInLbs;
           this.ppmodISC = ppmodISC;
           this.receptacleTypeName = receptacleTypeName;
           this.accessToken = accessToken;
    }


    /**
     * Gets the productCode value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @return productCode
     */
    public java.lang.String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @param productCode
     */
    public void setProductCode(java.lang.String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the serviceCode value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @return serviceCode
     */
    public java.lang.String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @param serviceCode
     */
    public void setServiceCode(java.lang.String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the receptacleType value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @return receptacleType
     */
    public java.lang.String getReceptacleType() {
        return receptacleType;
    }


    /**
     * Sets the receptacleType value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @param receptacleType
     */
    public void setReceptacleType(java.lang.String receptacleType) {
        this.receptacleType = receptacleType;
    }


    /**
     * Gets the foreignCountryCode value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @return foreignCountryCode
     */
    public java.lang.String getForeignCountryCode() {
        return foreignCountryCode;
    }


    /**
     * Sets the foreignCountryCode value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @param foreignCountryCode
     */
    public void setForeignCountryCode(java.lang.String foreignCountryCode) {
        this.foreignCountryCode = foreignCountryCode;
    }


    /**
     * Gets the foreignOECode value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @return foreignOECode
     */
    public java.lang.String getForeignOECode() {
        return foreignOECode;
    }


    /**
     * Sets the foreignOECode value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @param foreignOECode
     */
    public void setForeignOECode(java.lang.String foreignOECode) {
        this.foreignOECode = foreignOECode;
    }


    /**
     * Gets the dateOfMailing value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @return dateOfMailing
     */
    public java.util.Calendar getDateOfMailing() {
        return dateOfMailing;
    }


    /**
     * Sets the dateOfMailing value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @param dateOfMailing
     */
    public void setDateOfMailing(java.util.Calendar dateOfMailing) {
        this.dateOfMailing = dateOfMailing;
    }


    /**
     * Gets the pieceCount value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @return pieceCount
     */
    public int getPieceCount() {
        return pieceCount;
    }


    /**
     * Sets the pieceCount value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @param pieceCount
     */
    public void setPieceCount(int pieceCount) {
        this.pieceCount = pieceCount;
    }


    /**
     * Gets the weightInLbs value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @return weightInLbs
     */
    public java.math.BigDecimal getWeightInLbs() {
        return weightInLbs;
    }


    /**
     * Sets the weightInLbs value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @param weightInLbs
     */
    public void setWeightInLbs(java.math.BigDecimal weightInLbs) {
        this.weightInLbs = weightInLbs;
    }


    /**
     * Gets the ppmodISC value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @return ppmodISC
     */
    public java.lang.String getPpmodISC() {
        return ppmodISC;
    }


    /**
     * Sets the ppmodISC value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @param ppmodISC
     */
    public void setPpmodISC(java.lang.String ppmodISC) {
        this.ppmodISC = ppmodISC;
    }


    /**
     * Gets the receptacleTypeName value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @return receptacleTypeName
     */
    public java.lang.String getReceptacleTypeName() {
        return receptacleTypeName;
    }


    /**
     * Sets the receptacleTypeName value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @param receptacleTypeName
     */
    public void setReceptacleTypeName(java.lang.String receptacleTypeName) {
        this.receptacleTypeName = receptacleTypeName;
    }


    /**
     * Gets the accessToken value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this CreatePassThroughReceptacleInCurrentShipment.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatePassThroughReceptacleInCurrentShipment)) return false;
        CreatePassThroughReceptacleInCurrentShipment other = (CreatePassThroughReceptacleInCurrentShipment) obj;
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
            this.pieceCount == other.getPieceCount() &&
            ((this.weightInLbs==null && other.getWeightInLbs()==null) || 
             (this.weightInLbs!=null &&
              this.weightInLbs.equals(other.getWeightInLbs()))) &&
            ((this.ppmodISC==null && other.getPpmodISC()==null) || 
             (this.ppmodISC!=null &&
              this.ppmodISC.equals(other.getPpmodISC()))) &&
            ((this.receptacleTypeName==null && other.getReceptacleTypeName()==null) || 
             (this.receptacleTypeName!=null &&
              this.receptacleTypeName.equals(other.getReceptacleTypeName()))) &&
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
        _hashCode += getPieceCount();
        if (getWeightInLbs() != null) {
            _hashCode += getWeightInLbs().hashCode();
        }
        if (getPpmodISC() != null) {
            _hashCode += getPpmodISC().hashCode();
        }
        if (getReceptacleTypeName() != null) {
            _hashCode += getReceptacleTypeName().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreatePassThroughReceptacleInCurrentShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">CreatePassThroughReceptacleInCurrentShipment"));
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
        elemField.setFieldName("ppmodISC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ppmodISC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receptacleTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ReceptacleTypeName"));
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
