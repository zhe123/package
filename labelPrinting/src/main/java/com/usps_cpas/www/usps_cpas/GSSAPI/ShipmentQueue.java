/**
 * ShipmentQueue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class ShipmentQueue  implements java.io.Serializable {
    private java.util.Calendar shipmentReceivedByDate;

    private com.usps_cpas.www.usps_cpas.GSSAPI.Shipment[] shipment;

    private com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetail defaultOpenShipment;

    public ShipmentQueue() {
    }

    public ShipmentQueue(
           java.util.Calendar shipmentReceivedByDate,
           com.usps_cpas.www.usps_cpas.GSSAPI.Shipment[] shipment,
           com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetail defaultOpenShipment) {
           this.shipmentReceivedByDate = shipmentReceivedByDate;
           this.shipment = shipment;
           this.defaultOpenShipment = defaultOpenShipment;
    }


    /**
     * Gets the shipmentReceivedByDate value for this ShipmentQueue.
     * 
     * @return shipmentReceivedByDate
     */
    public java.util.Calendar getShipmentReceivedByDate() {
        return shipmentReceivedByDate;
    }


    /**
     * Sets the shipmentReceivedByDate value for this ShipmentQueue.
     * 
     * @param shipmentReceivedByDate
     */
    public void setShipmentReceivedByDate(java.util.Calendar shipmentReceivedByDate) {
        this.shipmentReceivedByDate = shipmentReceivedByDate;
    }


    /**
     * Gets the shipment value for this ShipmentQueue.
     * 
     * @return shipment
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.Shipment[] getShipment() {
        return shipment;
    }


    /**
     * Sets the shipment value for this ShipmentQueue.
     * 
     * @param shipment
     */
    public void setShipment(com.usps_cpas.www.usps_cpas.GSSAPI.Shipment[] shipment) {
        this.shipment = shipment;
    }


    /**
     * Gets the defaultOpenShipment value for this ShipmentQueue.
     * 
     * @return defaultOpenShipment
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetail getDefaultOpenShipment() {
        return defaultOpenShipment;
    }


    /**
     * Sets the defaultOpenShipment value for this ShipmentQueue.
     * 
     * @param defaultOpenShipment
     */
    public void setDefaultOpenShipment(com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetail defaultOpenShipment) {
        this.defaultOpenShipment = defaultOpenShipment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentQueue)) return false;
        ShipmentQueue other = (ShipmentQueue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipmentReceivedByDate==null && other.getShipmentReceivedByDate()==null) || 
             (this.shipmentReceivedByDate!=null &&
              this.shipmentReceivedByDate.equals(other.getShipmentReceivedByDate()))) &&
            ((this.shipment==null && other.getShipment()==null) || 
             (this.shipment!=null &&
              java.util.Arrays.equals(this.shipment, other.getShipment()))) &&
            ((this.defaultOpenShipment==null && other.getDefaultOpenShipment()==null) || 
             (this.defaultOpenShipment!=null &&
              this.defaultOpenShipment.equals(other.getDefaultOpenShipment())));
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
        if (getShipmentReceivedByDate() != null) {
            _hashCode += getShipmentReceivedByDate().hashCode();
        }
        if (getShipment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultOpenShipment() != null) {
            _hashCode += getDefaultOpenShipment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentQueue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ShipmentQueue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentReceivedByDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ShipmentReceivedByDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Shipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Shipment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Shipment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultOpenShipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "DefaultOpenShipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ShipmentDetail"));
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
