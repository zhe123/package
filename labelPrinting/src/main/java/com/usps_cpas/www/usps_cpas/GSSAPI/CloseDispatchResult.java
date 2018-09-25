/**
 * CloseDispatchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class CloseDispatchResult  implements java.io.Serializable {
    private int responseCode;

    private java.lang.String message;

    private java.lang.String dispatchID;

    private int packageCount;

    public CloseDispatchResult() {
    }

    public CloseDispatchResult(
           int responseCode,
           java.lang.String message,
           java.lang.String dispatchID,
           int packageCount) {
           this.responseCode = responseCode;
           this.message = message;
           this.dispatchID = dispatchID;
           this.packageCount = packageCount;
    }


    /**
     * Gets the responseCode value for this CloseDispatchResult.
     * 
     * @return responseCode
     */
    public int getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this CloseDispatchResult.
     * 
     * @param responseCode
     */
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the message value for this CloseDispatchResult.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this CloseDispatchResult.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the dispatchID value for this CloseDispatchResult.
     * 
     * @return dispatchID
     */
    public java.lang.String getDispatchID() {
        return dispatchID;
    }


    /**
     * Sets the dispatchID value for this CloseDispatchResult.
     * 
     * @param dispatchID
     */
    public void setDispatchID(java.lang.String dispatchID) {
        this.dispatchID = dispatchID;
    }


    /**
     * Gets the packageCount value for this CloseDispatchResult.
     * 
     * @return packageCount
     */
    public int getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this CloseDispatchResult.
     * 
     * @param packageCount
     */
    public void setPackageCount(int packageCount) {
        this.packageCount = packageCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CloseDispatchResult)) return false;
        CloseDispatchResult other = (CloseDispatchResult) obj;
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
            ((this.dispatchID==null && other.getDispatchID()==null) || 
             (this.dispatchID!=null &&
              this.dispatchID.equals(other.getDispatchID()))) &&
            this.packageCount == other.getPackageCount();
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
        if (getDispatchID() != null) {
            _hashCode += getDispatchID().hashCode();
        }
        _hashCode += getPackageCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CloseDispatchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "CloseDispatchResult"));
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
        elemField.setFieldName("dispatchID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "DispatchID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "PackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
