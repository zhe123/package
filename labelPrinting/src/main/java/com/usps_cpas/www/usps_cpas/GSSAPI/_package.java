/**
 * _package.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class _package  implements java.io.Serializable {
    private java.lang.String packageWeightUnit;

    private java.lang.String packageGUID;

    private java.lang.String recipientCountryCode;

    private java.lang.String recipientCountryName;

    private java.lang.String USPSPackageID;

    private java.lang.String mailerPackageID;

    private java.math.BigDecimal packageWeight;

    private java.lang.String recipientName;

    private boolean inshipmentQueue;

    private java.lang.String shipmentID;

    private java.lang.String receptacleID;

    private boolean isPackageBlocked;

    private java.lang.String foreignPortCode;

    public _package() {
    }

    public _package(
           java.lang.String packageWeightUnit,
           java.lang.String packageGUID,
           java.lang.String recipientCountryCode,
           java.lang.String recipientCountryName,
           java.lang.String USPSPackageID,
           java.lang.String mailerPackageID,
           java.math.BigDecimal packageWeight,
           java.lang.String recipientName,
           boolean inshipmentQueue,
           java.lang.String shipmentID,
           java.lang.String receptacleID,
           boolean isPackageBlocked,
           java.lang.String foreignPortCode) {
           this.packageWeightUnit = packageWeightUnit;
           this.packageGUID = packageGUID;
           this.recipientCountryCode = recipientCountryCode;
           this.recipientCountryName = recipientCountryName;
           this.USPSPackageID = USPSPackageID;
           this.mailerPackageID = mailerPackageID;
           this.packageWeight = packageWeight;
           this.recipientName = recipientName;
           this.inshipmentQueue = inshipmentQueue;
           this.shipmentID = shipmentID;
           this.receptacleID = receptacleID;
           this.isPackageBlocked = isPackageBlocked;
           this.foreignPortCode = foreignPortCode;
    }


    /**
     * Gets the packageWeightUnit value for this _package.
     * 
     * @return packageWeightUnit
     */
    public java.lang.String getPackageWeightUnit() {
        return packageWeightUnit;
    }


    /**
     * Sets the packageWeightUnit value for this _package.
     * 
     * @param packageWeightUnit
     */
    public void setPackageWeightUnit(java.lang.String packageWeightUnit) {
        this.packageWeightUnit = packageWeightUnit;
    }


    /**
     * Gets the packageGUID value for this _package.
     * 
     * @return packageGUID
     */
    public java.lang.String getPackageGUID() {
        return packageGUID;
    }


    /**
     * Sets the packageGUID value for this _package.
     * 
     * @param packageGUID
     */
    public void setPackageGUID(java.lang.String packageGUID) {
        this.packageGUID = packageGUID;
    }


    /**
     * Gets the recipientCountryCode value for this _package.
     * 
     * @return recipientCountryCode
     */
    public java.lang.String getRecipientCountryCode() {
        return recipientCountryCode;
    }


    /**
     * Sets the recipientCountryCode value for this _package.
     * 
     * @param recipientCountryCode
     */
    public void setRecipientCountryCode(java.lang.String recipientCountryCode) {
        this.recipientCountryCode = recipientCountryCode;
    }


    /**
     * Gets the recipientCountryName value for this _package.
     * 
     * @return recipientCountryName
     */
    public java.lang.String getRecipientCountryName() {
        return recipientCountryName;
    }


    /**
     * Sets the recipientCountryName value for this _package.
     * 
     * @param recipientCountryName
     */
    public void setRecipientCountryName(java.lang.String recipientCountryName) {
        this.recipientCountryName = recipientCountryName;
    }


    /**
     * Gets the USPSPackageID value for this _package.
     * 
     * @return USPSPackageID
     */
    public java.lang.String getUSPSPackageID() {
        return USPSPackageID;
    }


    /**
     * Sets the USPSPackageID value for this _package.
     * 
     * @param USPSPackageID
     */
    public void setUSPSPackageID(java.lang.String USPSPackageID) {
        this.USPSPackageID = USPSPackageID;
    }


    /**
     * Gets the mailerPackageID value for this _package.
     * 
     * @return mailerPackageID
     */
    public java.lang.String getMailerPackageID() {
        return mailerPackageID;
    }


    /**
     * Sets the mailerPackageID value for this _package.
     * 
     * @param mailerPackageID
     */
    public void setMailerPackageID(java.lang.String mailerPackageID) {
        this.mailerPackageID = mailerPackageID;
    }


    /**
     * Gets the packageWeight value for this _package.
     * 
     * @return packageWeight
     */
    public java.math.BigDecimal getPackageWeight() {
        return packageWeight;
    }


    /**
     * Sets the packageWeight value for this _package.
     * 
     * @param packageWeight
     */
    public void setPackageWeight(java.math.BigDecimal packageWeight) {
        this.packageWeight = packageWeight;
    }


    /**
     * Gets the recipientName value for this _package.
     * 
     * @return recipientName
     */
    public java.lang.String getRecipientName() {
        return recipientName;
    }


    /**
     * Sets the recipientName value for this _package.
     * 
     * @param recipientName
     */
    public void setRecipientName(java.lang.String recipientName) {
        this.recipientName = recipientName;
    }


    /**
     * Gets the inshipmentQueue value for this _package.
     * 
     * @return inshipmentQueue
     */
    public boolean isInshipmentQueue() {
        return inshipmentQueue;
    }


    /**
     * Sets the inshipmentQueue value for this _package.
     * 
     * @param inshipmentQueue
     */
    public void setInshipmentQueue(boolean inshipmentQueue) {
        this.inshipmentQueue = inshipmentQueue;
    }


    /**
     * Gets the shipmentID value for this _package.
     * 
     * @return shipmentID
     */
    public java.lang.String getShipmentID() {
        return shipmentID;
    }


    /**
     * Sets the shipmentID value for this _package.
     * 
     * @param shipmentID
     */
    public void setShipmentID(java.lang.String shipmentID) {
        this.shipmentID = shipmentID;
    }


    /**
     * Gets the receptacleID value for this _package.
     * 
     * @return receptacleID
     */
    public java.lang.String getReceptacleID() {
        return receptacleID;
    }


    /**
     * Sets the receptacleID value for this _package.
     * 
     * @param receptacleID
     */
    public void setReceptacleID(java.lang.String receptacleID) {
        this.receptacleID = receptacleID;
    }


    /**
     * Gets the isPackageBlocked value for this _package.
     * 
     * @return isPackageBlocked
     */
    public boolean isIsPackageBlocked() {
        return isPackageBlocked;
    }


    /**
     * Sets the isPackageBlocked value for this _package.
     * 
     * @param isPackageBlocked
     */
    public void setIsPackageBlocked(boolean isPackageBlocked) {
        this.isPackageBlocked = isPackageBlocked;
    }


    /**
     * Gets the foreignPortCode value for this _package.
     * 
     * @return foreignPortCode
     */
    public java.lang.String getForeignPortCode() {
        return foreignPortCode;
    }


    /**
     * Sets the foreignPortCode value for this _package.
     * 
     * @param foreignPortCode
     */
    public void setForeignPortCode(java.lang.String foreignPortCode) {
        this.foreignPortCode = foreignPortCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _package)) return false;
        _package other = (_package) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageWeightUnit==null && other.getPackageWeightUnit()==null) || 
             (this.packageWeightUnit!=null &&
              this.packageWeightUnit.equals(other.getPackageWeightUnit()))) &&
            ((this.packageGUID==null && other.getPackageGUID()==null) || 
             (this.packageGUID!=null &&
              this.packageGUID.equals(other.getPackageGUID()))) &&
            ((this.recipientCountryCode==null && other.getRecipientCountryCode()==null) || 
             (this.recipientCountryCode!=null &&
              this.recipientCountryCode.equals(other.getRecipientCountryCode()))) &&
            ((this.recipientCountryName==null && other.getRecipientCountryName()==null) || 
             (this.recipientCountryName!=null &&
              this.recipientCountryName.equals(other.getRecipientCountryName()))) &&
            ((this.USPSPackageID==null && other.getUSPSPackageID()==null) || 
             (this.USPSPackageID!=null &&
              this.USPSPackageID.equals(other.getUSPSPackageID()))) &&
            ((this.mailerPackageID==null && other.getMailerPackageID()==null) || 
             (this.mailerPackageID!=null &&
              this.mailerPackageID.equals(other.getMailerPackageID()))) &&
            ((this.packageWeight==null && other.getPackageWeight()==null) || 
             (this.packageWeight!=null &&
              this.packageWeight.equals(other.getPackageWeight()))) &&
            ((this.recipientName==null && other.getRecipientName()==null) || 
             (this.recipientName!=null &&
              this.recipientName.equals(other.getRecipientName()))) &&
            this.inshipmentQueue == other.isInshipmentQueue() &&
            ((this.shipmentID==null && other.getShipmentID()==null) || 
             (this.shipmentID!=null &&
              this.shipmentID.equals(other.getShipmentID()))) &&
            ((this.receptacleID==null && other.getReceptacleID()==null) || 
             (this.receptacleID!=null &&
              this.receptacleID.equals(other.getReceptacleID()))) &&
            this.isPackageBlocked == other.isIsPackageBlocked() &&
            ((this.foreignPortCode==null && other.getForeignPortCode()==null) || 
             (this.foreignPortCode!=null &&
              this.foreignPortCode.equals(other.getForeignPortCode())));
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
        if (getPackageWeightUnit() != null) {
            _hashCode += getPackageWeightUnit().hashCode();
        }
        if (getPackageGUID() != null) {
            _hashCode += getPackageGUID().hashCode();
        }
        if (getRecipientCountryCode() != null) {
            _hashCode += getRecipientCountryCode().hashCode();
        }
        if (getRecipientCountryName() != null) {
            _hashCode += getRecipientCountryName().hashCode();
        }
        if (getUSPSPackageID() != null) {
            _hashCode += getUSPSPackageID().hashCode();
        }
        if (getMailerPackageID() != null) {
            _hashCode += getMailerPackageID().hashCode();
        }
        if (getPackageWeight() != null) {
            _hashCode += getPackageWeight().hashCode();
        }
        if (getRecipientName() != null) {
            _hashCode += getRecipientName().hashCode();
        }
        _hashCode += (isInshipmentQueue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getShipmentID() != null) {
            _hashCode += getShipmentID().hashCode();
        }
        if (getReceptacleID() != null) {
            _hashCode += getReceptacleID().hashCode();
        }
        _hashCode += (isIsPackageBlocked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getForeignPortCode() != null) {
            _hashCode += getForeignPortCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(_package.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Package"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageWeightUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "PackageWeightUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "PackageGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("recipientCountryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RecipientCountryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USPSPackageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "USPSPackageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailerPackageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "MailerPackageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "PackageWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RecipientName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inshipmentQueue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "InshipmentQueue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ShipmentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receptacleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ReceptacleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPackageBlocked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "IsPackageBlocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignPortCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ForeignPortCode"));
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
