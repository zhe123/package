/**
 * CreateMixedReceptacleInCurrentShipmentV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CreateMixedReceptacleInCurrentShipmentV2  implements java.io.Serializable {
    private java.lang.String productCode;

    private java.lang.String rateGroup;

    private int pieceCount;

    private java.math.BigDecimal weightInLbs;

    private java.lang.String packageShape;

    private java.lang.String accessToken;

    public CreateMixedReceptacleInCurrentShipmentV2() {
    }

    public CreateMixedReceptacleInCurrentShipmentV2(
           java.lang.String productCode,
           java.lang.String rateGroup,
           int pieceCount,
           java.math.BigDecimal weightInLbs,
           java.lang.String packageShape,
           java.lang.String accessToken) {
           this.productCode = productCode;
           this.rateGroup = rateGroup;
           this.pieceCount = pieceCount;
           this.weightInLbs = weightInLbs;
           this.packageShape = packageShape;
           this.accessToken = accessToken;
    }


    /**
     * Gets the productCode value for this CreateMixedReceptacleInCurrentShipmentV2.
     * 
     * @return productCode
     */
    public java.lang.String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this CreateMixedReceptacleInCurrentShipmentV2.
     * 
     * @param productCode
     */
    public void setProductCode(java.lang.String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the rateGroup value for this CreateMixedReceptacleInCurrentShipmentV2.
     * 
     * @return rateGroup
     */
    public java.lang.String getRateGroup() {
        return rateGroup;
    }


    /**
     * Sets the rateGroup value for this CreateMixedReceptacleInCurrentShipmentV2.
     * 
     * @param rateGroup
     */
    public void setRateGroup(java.lang.String rateGroup) {
        this.rateGroup = rateGroup;
    }


    /**
     * Gets the pieceCount value for this CreateMixedReceptacleInCurrentShipmentV2.
     * 
     * @return pieceCount
     */
    public int getPieceCount() {
        return pieceCount;
    }


    /**
     * Sets the pieceCount value for this CreateMixedReceptacleInCurrentShipmentV2.
     * 
     * @param pieceCount
     */
    public void setPieceCount(int pieceCount) {
        this.pieceCount = pieceCount;
    }


    /**
     * Gets the weightInLbs value for this CreateMixedReceptacleInCurrentShipmentV2.
     * 
     * @return weightInLbs
     */
    public java.math.BigDecimal getWeightInLbs() {
        return weightInLbs;
    }


    /**
     * Sets the weightInLbs value for this CreateMixedReceptacleInCurrentShipmentV2.
     * 
     * @param weightInLbs
     */
    public void setWeightInLbs(java.math.BigDecimal weightInLbs) {
        this.weightInLbs = weightInLbs;
    }


    /**
     * Gets the packageShape value for this CreateMixedReceptacleInCurrentShipmentV2.
     * 
     * @return packageShape
     */
    public java.lang.String getPackageShape() {
        return packageShape;
    }


    /**
     * Sets the packageShape value for this CreateMixedReceptacleInCurrentShipmentV2.
     * 
     * @param packageShape
     */
    public void setPackageShape(java.lang.String packageShape) {
        this.packageShape = packageShape;
    }


    /**
     * Gets the accessToken value for this CreateMixedReceptacleInCurrentShipmentV2.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this CreateMixedReceptacleInCurrentShipmentV2.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateMixedReceptacleInCurrentShipmentV2)) return false;
        CreateMixedReceptacleInCurrentShipmentV2 other = (CreateMixedReceptacleInCurrentShipmentV2) obj;
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
            ((this.rateGroup==null && other.getRateGroup()==null) || 
             (this.rateGroup!=null &&
              this.rateGroup.equals(other.getRateGroup()))) &&
            this.pieceCount == other.getPieceCount() &&
            ((this.weightInLbs==null && other.getWeightInLbs()==null) || 
             (this.weightInLbs!=null &&
              this.weightInLbs.equals(other.getWeightInLbs()))) &&
            ((this.packageShape==null && other.getPackageShape()==null) || 
             (this.packageShape!=null &&
              this.packageShape.equals(other.getPackageShape()))) &&
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
        if (getRateGroup() != null) {
            _hashCode += getRateGroup().hashCode();
        }
        _hashCode += getPieceCount();
        if (getWeightInLbs() != null) {
            _hashCode += getWeightInLbs().hashCode();
        }
        if (getPackageShape() != null) {
            _hashCode += getPackageShape().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateMixedReceptacleInCurrentShipmentV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">CreateMixedReceptacleInCurrentShipmentV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ProductCode"));
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
        elemField.setFieldName("packageShape");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "PackageShape"));
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
