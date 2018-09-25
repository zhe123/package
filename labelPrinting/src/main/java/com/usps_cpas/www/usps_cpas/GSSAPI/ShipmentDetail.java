/**
 * ShipmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class ShipmentDetail  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI._package[] _package;

    private com.usps_cpas.www.usps_cpas.GSSAPI.Receptacle[] receptacle;

    private com.usps_cpas.www.usps_cpas.GSSAPI.Shipment shipment;

    public ShipmentDetail() {
    }

    public ShipmentDetail(
           com.usps_cpas.www.usps_cpas.GSSAPI._package[] _package,
           com.usps_cpas.www.usps_cpas.GSSAPI.Receptacle[] receptacle,
           com.usps_cpas.www.usps_cpas.GSSAPI.Shipment shipment) {
           this._package = _package;
           this.receptacle = receptacle;
           this.shipment = shipment;
    }


    /**
     * Gets the _package value for this ShipmentDetail.
     * 
     * @return _package
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI._package[] get_package() {
        return _package;
    }


    /**
     * Sets the _package value for this ShipmentDetail.
     * 
     * @param _package
     */
    public void set_package(com.usps_cpas.www.usps_cpas.GSSAPI._package[] _package) {
        this._package = _package;
    }


    /**
     * Gets the receptacle value for this ShipmentDetail.
     * 
     * @return receptacle
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.Receptacle[] getReceptacle() {
        return receptacle;
    }


    /**
     * Sets the receptacle value for this ShipmentDetail.
     * 
     * @param receptacle
     */
    public void setReceptacle(com.usps_cpas.www.usps_cpas.GSSAPI.Receptacle[] receptacle) {
        this.receptacle = receptacle;
    }


    /**
     * Gets the shipment value for this ShipmentDetail.
     * 
     * @return shipment
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.Shipment getShipment() {
        return shipment;
    }


    /**
     * Sets the shipment value for this ShipmentDetail.
     * 
     * @param shipment
     */
    public void setShipment(com.usps_cpas.www.usps_cpas.GSSAPI.Shipment shipment) {
        this.shipment = shipment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentDetail)) return false;
        ShipmentDetail other = (ShipmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._package==null && other.get_package()==null) || 
             (this._package!=null &&
              java.util.Arrays.equals(this._package, other.get_package()))) &&
            ((this.receptacle==null && other.getReceptacle()==null) || 
             (this.receptacle!=null &&
              java.util.Arrays.equals(this.receptacle, other.getReceptacle()))) &&
            ((this.shipment==null && other.getShipment()==null) || 
             (this.shipment!=null &&
              this.shipment.equals(other.getShipment())));
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
        if (get_package() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_package());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_package(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceptacle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceptacle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceptacle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipment() != null) {
            _hashCode += getShipment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ShipmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_package");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Package"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Package"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Package"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receptacle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Receptacle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Receptacle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Receptacle"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Shipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Shipment"));
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
