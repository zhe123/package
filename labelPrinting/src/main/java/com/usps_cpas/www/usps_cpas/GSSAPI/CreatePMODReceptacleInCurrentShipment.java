/**
 * CreatePMODReceptacleInCurrentShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CreatePMODReceptacleInCurrentShipment  implements java.io.Serializable {
    private java.lang.String productCode;

    private java.lang.String pmodDDU;

    private java.lang.String dduCity;

    private java.lang.String dduState;

    private java.lang.String receptacleType;

    private java.util.Calendar dateOfMailing;

    private java.lang.String locationID;

    private java.lang.String userID;

    private java.lang.String workstationID;

    private java.math.BigDecimal weightInLbs;

    private java.lang.String accessToken;

    public CreatePMODReceptacleInCurrentShipment() {
    }

    public CreatePMODReceptacleInCurrentShipment(
           java.lang.String productCode,
           java.lang.String pmodDDU,
           java.lang.String dduCity,
           java.lang.String dduState,
           java.lang.String receptacleType,
           java.util.Calendar dateOfMailing,
           java.lang.String locationID,
           java.lang.String userID,
           java.lang.String workstationID,
           java.math.BigDecimal weightInLbs,
           java.lang.String accessToken) {
           this.productCode = productCode;
           this.pmodDDU = pmodDDU;
           this.dduCity = dduCity;
           this.dduState = dduState;
           this.receptacleType = receptacleType;
           this.dateOfMailing = dateOfMailing;
           this.locationID = locationID;
           this.userID = userID;
           this.workstationID = workstationID;
           this.weightInLbs = weightInLbs;
           this.accessToken = accessToken;
    }


    /**
     * Gets the productCode value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @return productCode
     */
    public java.lang.String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @param productCode
     */
    public void setProductCode(java.lang.String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the pmodDDU value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @return pmodDDU
     */
    public java.lang.String getPmodDDU() {
        return pmodDDU;
    }


    /**
     * Sets the pmodDDU value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @param pmodDDU
     */
    public void setPmodDDU(java.lang.String pmodDDU) {
        this.pmodDDU = pmodDDU;
    }


    /**
     * Gets the dduCity value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @return dduCity
     */
    public java.lang.String getDduCity() {
        return dduCity;
    }


    /**
     * Sets the dduCity value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @param dduCity
     */
    public void setDduCity(java.lang.String dduCity) {
        this.dduCity = dduCity;
    }


    /**
     * Gets the dduState value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @return dduState
     */
    public java.lang.String getDduState() {
        return dduState;
    }


    /**
     * Sets the dduState value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @param dduState
     */
    public void setDduState(java.lang.String dduState) {
        this.dduState = dduState;
    }


    /**
     * Gets the receptacleType value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @return receptacleType
     */
    public java.lang.String getReceptacleType() {
        return receptacleType;
    }


    /**
     * Sets the receptacleType value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @param receptacleType
     */
    public void setReceptacleType(java.lang.String receptacleType) {
        this.receptacleType = receptacleType;
    }


    /**
     * Gets the dateOfMailing value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @return dateOfMailing
     */
    public java.util.Calendar getDateOfMailing() {
        return dateOfMailing;
    }


    /**
     * Sets the dateOfMailing value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @param dateOfMailing
     */
    public void setDateOfMailing(java.util.Calendar dateOfMailing) {
        this.dateOfMailing = dateOfMailing;
    }


    /**
     * Gets the locationID value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @return locationID
     */
    public java.lang.String getLocationID() {
        return locationID;
    }


    /**
     * Sets the locationID value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @param locationID
     */
    public void setLocationID(java.lang.String locationID) {
        this.locationID = locationID;
    }


    /**
     * Gets the userID value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }


    /**
     * Gets the workstationID value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @return workstationID
     */
    public java.lang.String getWorkstationID() {
        return workstationID;
    }


    /**
     * Sets the workstationID value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @param workstationID
     */
    public void setWorkstationID(java.lang.String workstationID) {
        this.workstationID = workstationID;
    }


    /**
     * Gets the weightInLbs value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @return weightInLbs
     */
    public java.math.BigDecimal getWeightInLbs() {
        return weightInLbs;
    }


    /**
     * Sets the weightInLbs value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @param weightInLbs
     */
    public void setWeightInLbs(java.math.BigDecimal weightInLbs) {
        this.weightInLbs = weightInLbs;
    }


    /**
     * Gets the accessToken value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this CreatePMODReceptacleInCurrentShipment.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatePMODReceptacleInCurrentShipment)) return false;
        CreatePMODReceptacleInCurrentShipment other = (CreatePMODReceptacleInCurrentShipment) obj;
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
            ((this.pmodDDU==null && other.getPmodDDU()==null) || 
             (this.pmodDDU!=null &&
              this.pmodDDU.equals(other.getPmodDDU()))) &&
            ((this.dduCity==null && other.getDduCity()==null) || 
             (this.dduCity!=null &&
              this.dduCity.equals(other.getDduCity()))) &&
            ((this.dduState==null && other.getDduState()==null) || 
             (this.dduState!=null &&
              this.dduState.equals(other.getDduState()))) &&
            ((this.receptacleType==null && other.getReceptacleType()==null) || 
             (this.receptacleType!=null &&
              this.receptacleType.equals(other.getReceptacleType()))) &&
            ((this.dateOfMailing==null && other.getDateOfMailing()==null) || 
             (this.dateOfMailing!=null &&
              this.dateOfMailing.equals(other.getDateOfMailing()))) &&
            ((this.locationID==null && other.getLocationID()==null) || 
             (this.locationID!=null &&
              this.locationID.equals(other.getLocationID()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.workstationID==null && other.getWorkstationID()==null) || 
             (this.workstationID!=null &&
              this.workstationID.equals(other.getWorkstationID()))) &&
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
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getPmodDDU() != null) {
            _hashCode += getPmodDDU().hashCode();
        }
        if (getDduCity() != null) {
            _hashCode += getDduCity().hashCode();
        }
        if (getDduState() != null) {
            _hashCode += getDduState().hashCode();
        }
        if (getReceptacleType() != null) {
            _hashCode += getReceptacleType().hashCode();
        }
        if (getDateOfMailing() != null) {
            _hashCode += getDateOfMailing().hashCode();
        }
        if (getLocationID() != null) {
            _hashCode += getLocationID().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getWorkstationID() != null) {
            _hashCode += getWorkstationID().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(CreatePMODReceptacleInCurrentShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">CreatePMODReceptacleInCurrentShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ProductCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmodDDU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "pmodDDU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dduCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "dduCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dduState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "dduState"));
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
        elemField.setFieldName("dateOfMailing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "DateOfMailing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "LocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "UserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workstationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "WorkstationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
