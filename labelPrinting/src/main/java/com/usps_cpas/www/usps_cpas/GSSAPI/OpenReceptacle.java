/**
 * OpenReceptacle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class OpenReceptacle  implements java.io.Serializable {
    private java.lang.String agentName;

    private java.lang.String receptacleID;

    private java.lang.String rateType;

    private java.lang.String rateGroup;

    private java.lang.String receptacleCategory;

    private boolean inShipmentQueue;

    private java.lang.String shipmentID;

    private java.lang.String originLocationID;

    private int pieceCount;

    private java.math.BigDecimal weightInLbs;

    private java.lang.String destinationCountryCode;

    private java.lang.String destinationCountryName;

    private boolean canMoveToDispatch;

    private java.lang.String rateZone;

    private java.lang.String parentReceptacleGUID;

    private boolean passThrough;

    public OpenReceptacle() {
    }

    public OpenReceptacle(
           java.lang.String agentName,
           java.lang.String receptacleID,
           java.lang.String rateType,
           java.lang.String rateGroup,
           java.lang.String receptacleCategory,
           boolean inShipmentQueue,
           java.lang.String shipmentID,
           java.lang.String originLocationID,
           int pieceCount,
           java.math.BigDecimal weightInLbs,
           java.lang.String destinationCountryCode,
           java.lang.String destinationCountryName,
           boolean canMoveToDispatch,
           java.lang.String rateZone,
           java.lang.String parentReceptacleGUID,
           boolean passThrough) {
           this.agentName = agentName;
           this.receptacleID = receptacleID;
           this.rateType = rateType;
           this.rateGroup = rateGroup;
           this.receptacleCategory = receptacleCategory;
           this.inShipmentQueue = inShipmentQueue;
           this.shipmentID = shipmentID;
           this.originLocationID = originLocationID;
           this.pieceCount = pieceCount;
           this.weightInLbs = weightInLbs;
           this.destinationCountryCode = destinationCountryCode;
           this.destinationCountryName = destinationCountryName;
           this.canMoveToDispatch = canMoveToDispatch;
           this.rateZone = rateZone;
           this.parentReceptacleGUID = parentReceptacleGUID;
           this.passThrough = passThrough;
    }


    /**
     * Gets the agentName value for this OpenReceptacle.
     * 
     * @return agentName
     */
    public java.lang.String getAgentName() {
        return agentName;
    }


    /**
     * Sets the agentName value for this OpenReceptacle.
     * 
     * @param agentName
     */
    public void setAgentName(java.lang.String agentName) {
        this.agentName = agentName;
    }


    /**
     * Gets the receptacleID value for this OpenReceptacle.
     * 
     * @return receptacleID
     */
    public java.lang.String getReceptacleID() {
        return receptacleID;
    }


    /**
     * Sets the receptacleID value for this OpenReceptacle.
     * 
     * @param receptacleID
     */
    public void setReceptacleID(java.lang.String receptacleID) {
        this.receptacleID = receptacleID;
    }


    /**
     * Gets the rateType value for this OpenReceptacle.
     * 
     * @return rateType
     */
    public java.lang.String getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this OpenReceptacle.
     * 
     * @param rateType
     */
    public void setRateType(java.lang.String rateType) {
        this.rateType = rateType;
    }


    /**
     * Gets the rateGroup value for this OpenReceptacle.
     * 
     * @return rateGroup
     */
    public java.lang.String getRateGroup() {
        return rateGroup;
    }


    /**
     * Sets the rateGroup value for this OpenReceptacle.
     * 
     * @param rateGroup
     */
    public void setRateGroup(java.lang.String rateGroup) {
        this.rateGroup = rateGroup;
    }


    /**
     * Gets the receptacleCategory value for this OpenReceptacle.
     * 
     * @return receptacleCategory
     */
    public java.lang.String getReceptacleCategory() {
        return receptacleCategory;
    }


    /**
     * Sets the receptacleCategory value for this OpenReceptacle.
     * 
     * @param receptacleCategory
     */
    public void setReceptacleCategory(java.lang.String receptacleCategory) {
        this.receptacleCategory = receptacleCategory;
    }


    /**
     * Gets the inShipmentQueue value for this OpenReceptacle.
     * 
     * @return inShipmentQueue
     */
    public boolean isInShipmentQueue() {
        return inShipmentQueue;
    }


    /**
     * Sets the inShipmentQueue value for this OpenReceptacle.
     * 
     * @param inShipmentQueue
     */
    public void setInShipmentQueue(boolean inShipmentQueue) {
        this.inShipmentQueue = inShipmentQueue;
    }


    /**
     * Gets the shipmentID value for this OpenReceptacle.
     * 
     * @return shipmentID
     */
    public java.lang.String getShipmentID() {
        return shipmentID;
    }


    /**
     * Sets the shipmentID value for this OpenReceptacle.
     * 
     * @param shipmentID
     */
    public void setShipmentID(java.lang.String shipmentID) {
        this.shipmentID = shipmentID;
    }


    /**
     * Gets the originLocationID value for this OpenReceptacle.
     * 
     * @return originLocationID
     */
    public java.lang.String getOriginLocationID() {
        return originLocationID;
    }


    /**
     * Sets the originLocationID value for this OpenReceptacle.
     * 
     * @param originLocationID
     */
    public void setOriginLocationID(java.lang.String originLocationID) {
        this.originLocationID = originLocationID;
    }


    /**
     * Gets the pieceCount value for this OpenReceptacle.
     * 
     * @return pieceCount
     */
    public int getPieceCount() {
        return pieceCount;
    }


    /**
     * Sets the pieceCount value for this OpenReceptacle.
     * 
     * @param pieceCount
     */
    public void setPieceCount(int pieceCount) {
        this.pieceCount = pieceCount;
    }


    /**
     * Gets the weightInLbs value for this OpenReceptacle.
     * 
     * @return weightInLbs
     */
    public java.math.BigDecimal getWeightInLbs() {
        return weightInLbs;
    }


    /**
     * Sets the weightInLbs value for this OpenReceptacle.
     * 
     * @param weightInLbs
     */
    public void setWeightInLbs(java.math.BigDecimal weightInLbs) {
        this.weightInLbs = weightInLbs;
    }


    /**
     * Gets the destinationCountryCode value for this OpenReceptacle.
     * 
     * @return destinationCountryCode
     */
    public java.lang.String getDestinationCountryCode() {
        return destinationCountryCode;
    }


    /**
     * Sets the destinationCountryCode value for this OpenReceptacle.
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(java.lang.String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }


    /**
     * Gets the destinationCountryName value for this OpenReceptacle.
     * 
     * @return destinationCountryName
     */
    public java.lang.String getDestinationCountryName() {
        return destinationCountryName;
    }


    /**
     * Sets the destinationCountryName value for this OpenReceptacle.
     * 
     * @param destinationCountryName
     */
    public void setDestinationCountryName(java.lang.String destinationCountryName) {
        this.destinationCountryName = destinationCountryName;
    }


    /**
     * Gets the canMoveToDispatch value for this OpenReceptacle.
     * 
     * @return canMoveToDispatch
     */
    public boolean isCanMoveToDispatch() {
        return canMoveToDispatch;
    }


    /**
     * Sets the canMoveToDispatch value for this OpenReceptacle.
     * 
     * @param canMoveToDispatch
     */
    public void setCanMoveToDispatch(boolean canMoveToDispatch) {
        this.canMoveToDispatch = canMoveToDispatch;
    }


    /**
     * Gets the rateZone value for this OpenReceptacle.
     * 
     * @return rateZone
     */
    public java.lang.String getRateZone() {
        return rateZone;
    }


    /**
     * Sets the rateZone value for this OpenReceptacle.
     * 
     * @param rateZone
     */
    public void setRateZone(java.lang.String rateZone) {
        this.rateZone = rateZone;
    }


    /**
     * Gets the parentReceptacleGUID value for this OpenReceptacle.
     * 
     * @return parentReceptacleGUID
     */
    public java.lang.String getParentReceptacleGUID() {
        return parentReceptacleGUID;
    }


    /**
     * Sets the parentReceptacleGUID value for this OpenReceptacle.
     * 
     * @param parentReceptacleGUID
     */
    public void setParentReceptacleGUID(java.lang.String parentReceptacleGUID) {
        this.parentReceptacleGUID = parentReceptacleGUID;
    }


    /**
     * Gets the passThrough value for this OpenReceptacle.
     * 
     * @return passThrough
     */
    public boolean isPassThrough() {
        return passThrough;
    }


    /**
     * Sets the passThrough value for this OpenReceptacle.
     * 
     * @param passThrough
     */
    public void setPassThrough(boolean passThrough) {
        this.passThrough = passThrough;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpenReceptacle)) return false;
        OpenReceptacle other = (OpenReceptacle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentName==null && other.getAgentName()==null) || 
             (this.agentName!=null &&
              this.agentName.equals(other.getAgentName()))) &&
            ((this.receptacleID==null && other.getReceptacleID()==null) || 
             (this.receptacleID!=null &&
              this.receptacleID.equals(other.getReceptacleID()))) &&
            ((this.rateType==null && other.getRateType()==null) || 
             (this.rateType!=null &&
              this.rateType.equals(other.getRateType()))) &&
            ((this.rateGroup==null && other.getRateGroup()==null) || 
             (this.rateGroup!=null &&
              this.rateGroup.equals(other.getRateGroup()))) &&
            ((this.receptacleCategory==null && other.getReceptacleCategory()==null) || 
             (this.receptacleCategory!=null &&
              this.receptacleCategory.equals(other.getReceptacleCategory()))) &&
            this.inShipmentQueue == other.isInShipmentQueue() &&
            ((this.shipmentID==null && other.getShipmentID()==null) || 
             (this.shipmentID!=null &&
              this.shipmentID.equals(other.getShipmentID()))) &&
            ((this.originLocationID==null && other.getOriginLocationID()==null) || 
             (this.originLocationID!=null &&
              this.originLocationID.equals(other.getOriginLocationID()))) &&
            this.pieceCount == other.getPieceCount() &&
            ((this.weightInLbs==null && other.getWeightInLbs()==null) || 
             (this.weightInLbs!=null &&
              this.weightInLbs.equals(other.getWeightInLbs()))) &&
            ((this.destinationCountryCode==null && other.getDestinationCountryCode()==null) || 
             (this.destinationCountryCode!=null &&
              this.destinationCountryCode.equals(other.getDestinationCountryCode()))) &&
            ((this.destinationCountryName==null && other.getDestinationCountryName()==null) || 
             (this.destinationCountryName!=null &&
              this.destinationCountryName.equals(other.getDestinationCountryName()))) &&
            this.canMoveToDispatch == other.isCanMoveToDispatch() &&
            ((this.rateZone==null && other.getRateZone()==null) || 
             (this.rateZone!=null &&
              this.rateZone.equals(other.getRateZone()))) &&
            ((this.parentReceptacleGUID==null && other.getParentReceptacleGUID()==null) || 
             (this.parentReceptacleGUID!=null &&
              this.parentReceptacleGUID.equals(other.getParentReceptacleGUID()))) &&
            this.passThrough == other.isPassThrough();
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
        if (getAgentName() != null) {
            _hashCode += getAgentName().hashCode();
        }
        if (getReceptacleID() != null) {
            _hashCode += getReceptacleID().hashCode();
        }
        if (getRateType() != null) {
            _hashCode += getRateType().hashCode();
        }
        if (getRateGroup() != null) {
            _hashCode += getRateGroup().hashCode();
        }
        if (getReceptacleCategory() != null) {
            _hashCode += getReceptacleCategory().hashCode();
        }
        _hashCode += (isInShipmentQueue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getShipmentID() != null) {
            _hashCode += getShipmentID().hashCode();
        }
        if (getOriginLocationID() != null) {
            _hashCode += getOriginLocationID().hashCode();
        }
        _hashCode += getPieceCount();
        if (getWeightInLbs() != null) {
            _hashCode += getWeightInLbs().hashCode();
        }
        if (getDestinationCountryCode() != null) {
            _hashCode += getDestinationCountryCode().hashCode();
        }
        if (getDestinationCountryName() != null) {
            _hashCode += getDestinationCountryName().hashCode();
        }
        _hashCode += (isCanMoveToDispatch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRateZone() != null) {
            _hashCode += getRateZone().hashCode();
        }
        if (getParentReceptacleGUID() != null) {
            _hashCode += getParentReceptacleGUID().hashCode();
        }
        _hashCode += (isPassThrough() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OpenReceptacle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "OpenReceptacle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "AgentName"));
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
        elemField.setFieldName("receptacleCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ReceptacleCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inShipmentQueue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "InShipmentQueue"));
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
        elemField.setFieldName("originLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "OriginLocationID"));
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
        elemField.setFieldName("destinationCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "DestinationCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationCountryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "DestinationCountryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canMoveToDispatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CanMoveToDispatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RateZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentReceptacleGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ParentReceptacleGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passThrough");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "PassThrough"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
