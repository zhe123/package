/**
 * Shipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class Shipment  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String shipmentNote;

    private java.lang.String consolidatorLocationName;

    private java.lang.String shipperLocationName;

    private int remainingReceptacleCount;

    private int remainingPackageCount;

    private java.lang.String destinationLocation;

    private int receptacleCount;

    private int packageCount;

    private java.lang.String shipmentGUID;

    private java.lang.String shipmentID;

    private java.lang.String shipper;

    private java.lang.String vehicleType;

    private java.lang.String vehicleNumber;

    private java.lang.String originLocationID;

    private java.util.Calendar closedDateTime;

    private java.util.Calendar arrivalDateTime;

    private java.lang.String shipmentStateCode;

    public Shipment() {
    }

    public Shipment(
           java.lang.String status,
           java.lang.String shipmentNote,
           java.lang.String consolidatorLocationName,
           java.lang.String shipperLocationName,
           int remainingReceptacleCount,
           int remainingPackageCount,
           java.lang.String destinationLocation,
           int receptacleCount,
           int packageCount,
           java.lang.String shipmentGUID,
           java.lang.String shipmentID,
           java.lang.String shipper,
           java.lang.String vehicleType,
           java.lang.String vehicleNumber,
           java.lang.String originLocationID,
           java.util.Calendar closedDateTime,
           java.util.Calendar arrivalDateTime,
           java.lang.String shipmentStateCode) {
           this.status = status;
           this.shipmentNote = shipmentNote;
           this.consolidatorLocationName = consolidatorLocationName;
           this.shipperLocationName = shipperLocationName;
           this.remainingReceptacleCount = remainingReceptacleCount;
           this.remainingPackageCount = remainingPackageCount;
           this.destinationLocation = destinationLocation;
           this.receptacleCount = receptacleCount;
           this.packageCount = packageCount;
           this.shipmentGUID = shipmentGUID;
           this.shipmentID = shipmentID;
           this.shipper = shipper;
           this.vehicleType = vehicleType;
           this.vehicleNumber = vehicleNumber;
           this.originLocationID = originLocationID;
           this.closedDateTime = closedDateTime;
           this.arrivalDateTime = arrivalDateTime;
           this.shipmentStateCode = shipmentStateCode;
    }


    /**
     * Gets the status value for this Shipment.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Shipment.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the shipmentNote value for this Shipment.
     * 
     * @return shipmentNote
     */
    public java.lang.String getShipmentNote() {
        return shipmentNote;
    }


    /**
     * Sets the shipmentNote value for this Shipment.
     * 
     * @param shipmentNote
     */
    public void setShipmentNote(java.lang.String shipmentNote) {
        this.shipmentNote = shipmentNote;
    }


    /**
     * Gets the consolidatorLocationName value for this Shipment.
     * 
     * @return consolidatorLocationName
     */
    public java.lang.String getConsolidatorLocationName() {
        return consolidatorLocationName;
    }


    /**
     * Sets the consolidatorLocationName value for this Shipment.
     * 
     * @param consolidatorLocationName
     */
    public void setConsolidatorLocationName(java.lang.String consolidatorLocationName) {
        this.consolidatorLocationName = consolidatorLocationName;
    }


    /**
     * Gets the shipperLocationName value for this Shipment.
     * 
     * @return shipperLocationName
     */
    public java.lang.String getShipperLocationName() {
        return shipperLocationName;
    }


    /**
     * Sets the shipperLocationName value for this Shipment.
     * 
     * @param shipperLocationName
     */
    public void setShipperLocationName(java.lang.String shipperLocationName) {
        this.shipperLocationName = shipperLocationName;
    }


    /**
     * Gets the remainingReceptacleCount value for this Shipment.
     * 
     * @return remainingReceptacleCount
     */
    public int getRemainingReceptacleCount() {
        return remainingReceptacleCount;
    }


    /**
     * Sets the remainingReceptacleCount value for this Shipment.
     * 
     * @param remainingReceptacleCount
     */
    public void setRemainingReceptacleCount(int remainingReceptacleCount) {
        this.remainingReceptacleCount = remainingReceptacleCount;
    }


    /**
     * Gets the remainingPackageCount value for this Shipment.
     * 
     * @return remainingPackageCount
     */
    public int getRemainingPackageCount() {
        return remainingPackageCount;
    }


    /**
     * Sets the remainingPackageCount value for this Shipment.
     * 
     * @param remainingPackageCount
     */
    public void setRemainingPackageCount(int remainingPackageCount) {
        this.remainingPackageCount = remainingPackageCount;
    }


    /**
     * Gets the destinationLocation value for this Shipment.
     * 
     * @return destinationLocation
     */
    public java.lang.String getDestinationLocation() {
        return destinationLocation;
    }


    /**
     * Sets the destinationLocation value for this Shipment.
     * 
     * @param destinationLocation
     */
    public void setDestinationLocation(java.lang.String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }


    /**
     * Gets the receptacleCount value for this Shipment.
     * 
     * @return receptacleCount
     */
    public int getReceptacleCount() {
        return receptacleCount;
    }


    /**
     * Sets the receptacleCount value for this Shipment.
     * 
     * @param receptacleCount
     */
    public void setReceptacleCount(int receptacleCount) {
        this.receptacleCount = receptacleCount;
    }


    /**
     * Gets the packageCount value for this Shipment.
     * 
     * @return packageCount
     */
    public int getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this Shipment.
     * 
     * @param packageCount
     */
    public void setPackageCount(int packageCount) {
        this.packageCount = packageCount;
    }


    /**
     * Gets the shipmentGUID value for this Shipment.
     * 
     * @return shipmentGUID
     */
    public java.lang.String getShipmentGUID() {
        return shipmentGUID;
    }


    /**
     * Sets the shipmentGUID value for this Shipment.
     * 
     * @param shipmentGUID
     */
    public void setShipmentGUID(java.lang.String shipmentGUID) {
        this.shipmentGUID = shipmentGUID;
    }


    /**
     * Gets the shipmentID value for this Shipment.
     * 
     * @return shipmentID
     */
    public java.lang.String getShipmentID() {
        return shipmentID;
    }


    /**
     * Sets the shipmentID value for this Shipment.
     * 
     * @param shipmentID
     */
    public void setShipmentID(java.lang.String shipmentID) {
        this.shipmentID = shipmentID;
    }


    /**
     * Gets the shipper value for this Shipment.
     * 
     * @return shipper
     */
    public java.lang.String getShipper() {
        return shipper;
    }


    /**
     * Sets the shipper value for this Shipment.
     * 
     * @param shipper
     */
    public void setShipper(java.lang.String shipper) {
        this.shipper = shipper;
    }


    /**
     * Gets the vehicleType value for this Shipment.
     * 
     * @return vehicleType
     */
    public java.lang.String getVehicleType() {
        return vehicleType;
    }


    /**
     * Sets the vehicleType value for this Shipment.
     * 
     * @param vehicleType
     */
    public void setVehicleType(java.lang.String vehicleType) {
        this.vehicleType = vehicleType;
    }


    /**
     * Gets the vehicleNumber value for this Shipment.
     * 
     * @return vehicleNumber
     */
    public java.lang.String getVehicleNumber() {
        return vehicleNumber;
    }


    /**
     * Sets the vehicleNumber value for this Shipment.
     * 
     * @param vehicleNumber
     */
    public void setVehicleNumber(java.lang.String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }


    /**
     * Gets the originLocationID value for this Shipment.
     * 
     * @return originLocationID
     */
    public java.lang.String getOriginLocationID() {
        return originLocationID;
    }


    /**
     * Sets the originLocationID value for this Shipment.
     * 
     * @param originLocationID
     */
    public void setOriginLocationID(java.lang.String originLocationID) {
        this.originLocationID = originLocationID;
    }


    /**
     * Gets the closedDateTime value for this Shipment.
     * 
     * @return closedDateTime
     */
    public java.util.Calendar getClosedDateTime() {
        return closedDateTime;
    }


    /**
     * Sets the closedDateTime value for this Shipment.
     * 
     * @param closedDateTime
     */
    public void setClosedDateTime(java.util.Calendar closedDateTime) {
        this.closedDateTime = closedDateTime;
    }


    /**
     * Gets the arrivalDateTime value for this Shipment.
     * 
     * @return arrivalDateTime
     */
    public java.util.Calendar getArrivalDateTime() {
        return arrivalDateTime;
    }


    /**
     * Sets the arrivalDateTime value for this Shipment.
     * 
     * @param arrivalDateTime
     */
    public void setArrivalDateTime(java.util.Calendar arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }


    /**
     * Gets the shipmentStateCode value for this Shipment.
     * 
     * @return shipmentStateCode
     */
    public java.lang.String getShipmentStateCode() {
        return shipmentStateCode;
    }


    /**
     * Sets the shipmentStateCode value for this Shipment.
     * 
     * @param shipmentStateCode
     */
    public void setShipmentStateCode(java.lang.String shipmentStateCode) {
        this.shipmentStateCode = shipmentStateCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Shipment)) return false;
        Shipment other = (Shipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.shipmentNote==null && other.getShipmentNote()==null) || 
             (this.shipmentNote!=null &&
              this.shipmentNote.equals(other.getShipmentNote()))) &&
            ((this.consolidatorLocationName==null && other.getConsolidatorLocationName()==null) || 
             (this.consolidatorLocationName!=null &&
              this.consolidatorLocationName.equals(other.getConsolidatorLocationName()))) &&
            ((this.shipperLocationName==null && other.getShipperLocationName()==null) || 
             (this.shipperLocationName!=null &&
              this.shipperLocationName.equals(other.getShipperLocationName()))) &&
            this.remainingReceptacleCount == other.getRemainingReceptacleCount() &&
            this.remainingPackageCount == other.getRemainingPackageCount() &&
            ((this.destinationLocation==null && other.getDestinationLocation()==null) || 
             (this.destinationLocation!=null &&
              this.destinationLocation.equals(other.getDestinationLocation()))) &&
            this.receptacleCount == other.getReceptacleCount() &&
            this.packageCount == other.getPackageCount() &&
            ((this.shipmentGUID==null && other.getShipmentGUID()==null) || 
             (this.shipmentGUID!=null &&
              this.shipmentGUID.equals(other.getShipmentGUID()))) &&
            ((this.shipmentID==null && other.getShipmentID()==null) || 
             (this.shipmentID!=null &&
              this.shipmentID.equals(other.getShipmentID()))) &&
            ((this.shipper==null && other.getShipper()==null) || 
             (this.shipper!=null &&
              this.shipper.equals(other.getShipper()))) &&
            ((this.vehicleType==null && other.getVehicleType()==null) || 
             (this.vehicleType!=null &&
              this.vehicleType.equals(other.getVehicleType()))) &&
            ((this.vehicleNumber==null && other.getVehicleNumber()==null) || 
             (this.vehicleNumber!=null &&
              this.vehicleNumber.equals(other.getVehicleNumber()))) &&
            ((this.originLocationID==null && other.getOriginLocationID()==null) || 
             (this.originLocationID!=null &&
              this.originLocationID.equals(other.getOriginLocationID()))) &&
            ((this.closedDateTime==null && other.getClosedDateTime()==null) || 
             (this.closedDateTime!=null &&
              this.closedDateTime.equals(other.getClosedDateTime()))) &&
            ((this.arrivalDateTime==null && other.getArrivalDateTime()==null) || 
             (this.arrivalDateTime!=null &&
              this.arrivalDateTime.equals(other.getArrivalDateTime()))) &&
            ((this.shipmentStateCode==null && other.getShipmentStateCode()==null) || 
             (this.shipmentStateCode!=null &&
              this.shipmentStateCode.equals(other.getShipmentStateCode())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getShipmentNote() != null) {
            _hashCode += getShipmentNote().hashCode();
        }
        if (getConsolidatorLocationName() != null) {
            _hashCode += getConsolidatorLocationName().hashCode();
        }
        if (getShipperLocationName() != null) {
            _hashCode += getShipperLocationName().hashCode();
        }
        _hashCode += getRemainingReceptacleCount();
        _hashCode += getRemainingPackageCount();
        if (getDestinationLocation() != null) {
            _hashCode += getDestinationLocation().hashCode();
        }
        _hashCode += getReceptacleCount();
        _hashCode += getPackageCount();
        if (getShipmentGUID() != null) {
            _hashCode += getShipmentGUID().hashCode();
        }
        if (getShipmentID() != null) {
            _hashCode += getShipmentID().hashCode();
        }
        if (getShipper() != null) {
            _hashCode += getShipper().hashCode();
        }
        if (getVehicleType() != null) {
            _hashCode += getVehicleType().hashCode();
        }
        if (getVehicleNumber() != null) {
            _hashCode += getVehicleNumber().hashCode();
        }
        if (getOriginLocationID() != null) {
            _hashCode += getOriginLocationID().hashCode();
        }
        if (getClosedDateTime() != null) {
            _hashCode += getClosedDateTime().hashCode();
        }
        if (getArrivalDateTime() != null) {
            _hashCode += getArrivalDateTime().hashCode();
        }
        if (getShipmentStateCode() != null) {
            _hashCode += getShipmentStateCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Shipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Shipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ShipmentNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatorLocationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ConsolidatorLocationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipperLocationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ShipperLocationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingReceptacleCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RemainingReceptacleCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingPackageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RemainingPackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "DestinationLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receptacleCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ReceptacleCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "PackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ShipmentGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("shipper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Shipper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "VehicleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "VehicleNumber"));
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
        elemField.setFieldName("closedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ClosedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ArrivalDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentStateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ShipmentStateCode"));
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
