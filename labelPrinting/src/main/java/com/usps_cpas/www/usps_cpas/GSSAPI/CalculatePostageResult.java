/**
 * CalculatePostageResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CalculatePostageResult  implements java.io.Serializable {
    private int responseCode;

    private java.lang.String message;

    private java.lang.String currencyCode;

    private java.math.BigDecimal extraServiceCodeFee;

    private java.math.BigDecimal calculatedPostage;

    private java.lang.String destinationLocationName;

    private java.lang.String destinationLocationID;

    public CalculatePostageResult() {
    }

    public CalculatePostageResult(
           int responseCode,
           java.lang.String message,
           java.lang.String currencyCode,
           java.math.BigDecimal extraServiceCodeFee,
           java.math.BigDecimal calculatedPostage,
           java.lang.String destinationLocationName,
           java.lang.String destinationLocationID) {
           this.responseCode = responseCode;
           this.message = message;
           this.currencyCode = currencyCode;
           this.extraServiceCodeFee = extraServiceCodeFee;
           this.calculatedPostage = calculatedPostage;
           this.destinationLocationName = destinationLocationName;
           this.destinationLocationID = destinationLocationID;
    }


    /**
     * Gets the responseCode value for this CalculatePostageResult.
     * 
     * @return responseCode
     */
    public int getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this CalculatePostageResult.
     * 
     * @param responseCode
     */
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the message value for this CalculatePostageResult.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this CalculatePostageResult.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the currencyCode value for this CalculatePostageResult.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this CalculatePostageResult.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the extraServiceCodeFee value for this CalculatePostageResult.
     * 
     * @return extraServiceCodeFee
     */
    public java.math.BigDecimal getExtraServiceCodeFee() {
        return extraServiceCodeFee;
    }


    /**
     * Sets the extraServiceCodeFee value for this CalculatePostageResult.
     * 
     * @param extraServiceCodeFee
     */
    public void setExtraServiceCodeFee(java.math.BigDecimal extraServiceCodeFee) {
        this.extraServiceCodeFee = extraServiceCodeFee;
    }


    /**
     * Gets the calculatedPostage value for this CalculatePostageResult.
     * 
     * @return calculatedPostage
     */
    public java.math.BigDecimal getCalculatedPostage() {
        return calculatedPostage;
    }


    /**
     * Sets the calculatedPostage value for this CalculatePostageResult.
     * 
     * @param calculatedPostage
     */
    public void setCalculatedPostage(java.math.BigDecimal calculatedPostage) {
        this.calculatedPostage = calculatedPostage;
    }


    /**
     * Gets the destinationLocationName value for this CalculatePostageResult.
     * 
     * @return destinationLocationName
     */
    public java.lang.String getDestinationLocationName() {
        return destinationLocationName;
    }


    /**
     * Sets the destinationLocationName value for this CalculatePostageResult.
     * 
     * @param destinationLocationName
     */
    public void setDestinationLocationName(java.lang.String destinationLocationName) {
        this.destinationLocationName = destinationLocationName;
    }


    /**
     * Gets the destinationLocationID value for this CalculatePostageResult.
     * 
     * @return destinationLocationID
     */
    public java.lang.String getDestinationLocationID() {
        return destinationLocationID;
    }


    /**
     * Sets the destinationLocationID value for this CalculatePostageResult.
     * 
     * @param destinationLocationID
     */
    public void setDestinationLocationID(java.lang.String destinationLocationID) {
        this.destinationLocationID = destinationLocationID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalculatePostageResult)) return false;
        CalculatePostageResult other = (CalculatePostageResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.responseCode == other.getResponseCode() &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.extraServiceCodeFee==null && other.getExtraServiceCodeFee()==null) || 
             (this.extraServiceCodeFee!=null &&
              this.extraServiceCodeFee.equals(other.getExtraServiceCodeFee()))) &&
            ((this.calculatedPostage==null && other.getCalculatedPostage()==null) || 
             (this.calculatedPostage!=null &&
              this.calculatedPostage.equals(other.getCalculatedPostage()))) &&
            ((this.destinationLocationName==null && other.getDestinationLocationName()==null) || 
             (this.destinationLocationName!=null &&
              this.destinationLocationName.equals(other.getDestinationLocationName()))) &&
            ((this.destinationLocationID==null && other.getDestinationLocationID()==null) || 
             (this.destinationLocationID!=null &&
              this.destinationLocationID.equals(other.getDestinationLocationID())));
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
        _hashCode += getResponseCode();
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getExtraServiceCodeFee() != null) {
            _hashCode += getExtraServiceCodeFee().hashCode();
        }
        if (getCalculatedPostage() != null) {
            _hashCode += getCalculatedPostage().hashCode();
        }
        if (getDestinationLocationName() != null) {
            _hashCode += getDestinationLocationName().hashCode();
        }
        if (getDestinationLocationID() != null) {
            _hashCode += getDestinationLocationID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalculatePostageResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CalculatePostageResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraServiceCodeFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ExtraServiceCodeFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculatedPostage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CalculatedPostage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "DestinationLocationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "DestinationLocationID"));
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
