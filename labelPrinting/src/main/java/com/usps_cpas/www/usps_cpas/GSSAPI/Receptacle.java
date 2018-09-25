/**
 * Receptacle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class Receptacle  implements java.io.Serializable {
    private java.lang.String receptacleID;

    private boolean inshipmentQueue;

    private java.lang.String shipmentID;

    public Receptacle() {
    }

    public Receptacle(
           java.lang.String receptacleID,
           boolean inshipmentQueue,
           java.lang.String shipmentID) {
           this.receptacleID = receptacleID;
           this.inshipmentQueue = inshipmentQueue;
           this.shipmentID = shipmentID;
    }


    /**
     * Gets the receptacleID value for this Receptacle.
     * 
     * @return receptacleID
     */
    public java.lang.String getReceptacleID() {
        return receptacleID;
    }


    /**
     * Sets the receptacleID value for this Receptacle.
     * 
     * @param receptacleID
     */
    public void setReceptacleID(java.lang.String receptacleID) {
        this.receptacleID = receptacleID;
    }


    /**
     * Gets the inshipmentQueue value for this Receptacle.
     * 
     * @return inshipmentQueue
     */
    public boolean isInshipmentQueue() {
        return inshipmentQueue;
    }


    /**
     * Sets the inshipmentQueue value for this Receptacle.
     * 
     * @param inshipmentQueue
     */
    public void setInshipmentQueue(boolean inshipmentQueue) {
        this.inshipmentQueue = inshipmentQueue;
    }


    /**
     * Gets the shipmentID value for this Receptacle.
     * 
     * @return shipmentID
     */
    public java.lang.String getShipmentID() {
        return shipmentID;
    }


    /**
     * Sets the shipmentID value for this Receptacle.
     * 
     * @param shipmentID
     */
    public void setShipmentID(java.lang.String shipmentID) {
        this.shipmentID = shipmentID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Receptacle)) return false;
        Receptacle other = (Receptacle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receptacleID==null && other.getReceptacleID()==null) || 
             (this.receptacleID!=null &&
              this.receptacleID.equals(other.getReceptacleID()))) &&
            this.inshipmentQueue == other.isInshipmentQueue() &&
            ((this.shipmentID==null && other.getShipmentID()==null) || 
             (this.shipmentID!=null &&
              this.shipmentID.equals(other.getShipmentID())));
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
        if (getReceptacleID() != null) {
            _hashCode += getReceptacleID().hashCode();
        }
        _hashCode += (isInshipmentQueue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getShipmentID() != null) {
            _hashCode += getShipmentID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Receptacle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Receptacle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receptacleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ReceptacleID"));
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
