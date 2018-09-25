/**
 * SearchForProcessedPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class SearchForProcessedPackage  implements java.io.Serializable {
    private java.lang.String accessToken;

    private java.lang.String packageID;

    private java.lang.String orderID;

    private java.lang.String recipientLastName;

    private java.lang.String recipientFirstName;

    private java.lang.String recipientBusinessName;

    private java.lang.String recipientCountryCode;

    public SearchForProcessedPackage() {
    }

    public SearchForProcessedPackage(
           java.lang.String accessToken,
           java.lang.String packageID,
           java.lang.String orderID,
           java.lang.String recipientLastName,
           java.lang.String recipientFirstName,
           java.lang.String recipientBusinessName,
           java.lang.String recipientCountryCode) {
           this.accessToken = accessToken;
           this.packageID = packageID;
           this.orderID = orderID;
           this.recipientLastName = recipientLastName;
           this.recipientFirstName = recipientFirstName;
           this.recipientBusinessName = recipientBusinessName;
           this.recipientCountryCode = recipientCountryCode;
    }


    /**
     * Gets the accessToken value for this SearchForProcessedPackage.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this SearchForProcessedPackage.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }


    /**
     * Gets the packageID value for this SearchForProcessedPackage.
     * 
     * @return packageID
     */
    public java.lang.String getPackageID() {
        return packageID;
    }


    /**
     * Sets the packageID value for this SearchForProcessedPackage.
     * 
     * @param packageID
     */
    public void setPackageID(java.lang.String packageID) {
        this.packageID = packageID;
    }


    /**
     * Gets the orderID value for this SearchForProcessedPackage.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this SearchForProcessedPackage.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the recipientLastName value for this SearchForProcessedPackage.
     * 
     * @return recipientLastName
     */
    public java.lang.String getRecipientLastName() {
        return recipientLastName;
    }


    /**
     * Sets the recipientLastName value for this SearchForProcessedPackage.
     * 
     * @param recipientLastName
     */
    public void setRecipientLastName(java.lang.String recipientLastName) {
        this.recipientLastName = recipientLastName;
    }


    /**
     * Gets the recipientFirstName value for this SearchForProcessedPackage.
     * 
     * @return recipientFirstName
     */
    public java.lang.String getRecipientFirstName() {
        return recipientFirstName;
    }


    /**
     * Sets the recipientFirstName value for this SearchForProcessedPackage.
     * 
     * @param recipientFirstName
     */
    public void setRecipientFirstName(java.lang.String recipientFirstName) {
        this.recipientFirstName = recipientFirstName;
    }


    /**
     * Gets the recipientBusinessName value for this SearchForProcessedPackage.
     * 
     * @return recipientBusinessName
     */
    public java.lang.String getRecipientBusinessName() {
        return recipientBusinessName;
    }


    /**
     * Sets the recipientBusinessName value for this SearchForProcessedPackage.
     * 
     * @param recipientBusinessName
     */
    public void setRecipientBusinessName(java.lang.String recipientBusinessName) {
        this.recipientBusinessName = recipientBusinessName;
    }


    /**
     * Gets the recipientCountryCode value for this SearchForProcessedPackage.
     * 
     * @return recipientCountryCode
     */
    public java.lang.String getRecipientCountryCode() {
        return recipientCountryCode;
    }


    /**
     * Sets the recipientCountryCode value for this SearchForProcessedPackage.
     * 
     * @param recipientCountryCode
     */
    public void setRecipientCountryCode(java.lang.String recipientCountryCode) {
        this.recipientCountryCode = recipientCountryCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchForProcessedPackage)) return false;
        SearchForProcessedPackage other = (SearchForProcessedPackage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessToken==null && other.getAccessToken()==null) || 
             (this.accessToken!=null &&
              this.accessToken.equals(other.getAccessToken()))) &&
            ((this.packageID==null && other.getPackageID()==null) || 
             (this.packageID!=null &&
              this.packageID.equals(other.getPackageID()))) &&
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.recipientLastName==null && other.getRecipientLastName()==null) || 
             (this.recipientLastName!=null &&
              this.recipientLastName.equals(other.getRecipientLastName()))) &&
            ((this.recipientFirstName==null && other.getRecipientFirstName()==null) || 
             (this.recipientFirstName!=null &&
              this.recipientFirstName.equals(other.getRecipientFirstName()))) &&
            ((this.recipientBusinessName==null && other.getRecipientBusinessName()==null) || 
             (this.recipientBusinessName!=null &&
              this.recipientBusinessName.equals(other.getRecipientBusinessName()))) &&
            ((this.recipientCountryCode==null && other.getRecipientCountryCode()==null) || 
             (this.recipientCountryCode!=null &&
              this.recipientCountryCode.equals(other.getRecipientCountryCode())));
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
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        if (getPackageID() != null) {
            _hashCode += getPackageID().hashCode();
        }
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getRecipientLastName() != null) {
            _hashCode += getRecipientLastName().hashCode();
        }
        if (getRecipientFirstName() != null) {
            _hashCode += getRecipientFirstName().hashCode();
        }
        if (getRecipientBusinessName() != null) {
            _hashCode += getRecipientBusinessName().hashCode();
        }
        if (getRecipientCountryCode() != null) {
            _hashCode += getRecipientCountryCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchForProcessedPackage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">SearchForProcessedPackage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "AccessToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "PackageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "OrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RecipientLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RecipientFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientBusinessName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RecipientBusinessName"));
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
