/**
 * GenerateReportByPermitNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class GenerateReportByPermitNumber  implements java.io.Serializable {
    private java.lang.String dispatchID;

    private java.lang.String reportName;

    private java.lang.String requestFormat;

    private java.lang.String permitNumber;

    private java.lang.String accessToken;

    public GenerateReportByPermitNumber() {
    }

    public GenerateReportByPermitNumber(
           java.lang.String dispatchID,
           java.lang.String reportName,
           java.lang.String requestFormat,
           java.lang.String permitNumber,
           java.lang.String accessToken) {
           this.dispatchID = dispatchID;
           this.reportName = reportName;
           this.requestFormat = requestFormat;
           this.permitNumber = permitNumber;
           this.accessToken = accessToken;
    }


    /**
     * Gets the dispatchID value for this GenerateReportByPermitNumber.
     * 
     * @return dispatchID
     */
    public java.lang.String getDispatchID() {
        return dispatchID;
    }


    /**
     * Sets the dispatchID value for this GenerateReportByPermitNumber.
     * 
     * @param dispatchID
     */
    public void setDispatchID(java.lang.String dispatchID) {
        this.dispatchID = dispatchID;
    }


    /**
     * Gets the reportName value for this GenerateReportByPermitNumber.
     * 
     * @return reportName
     */
    public java.lang.String getReportName() {
        return reportName;
    }


    /**
     * Sets the reportName value for this GenerateReportByPermitNumber.
     * 
     * @param reportName
     */
    public void setReportName(java.lang.String reportName) {
        this.reportName = reportName;
    }


    /**
     * Gets the requestFormat value for this GenerateReportByPermitNumber.
     * 
     * @return requestFormat
     */
    public java.lang.String getRequestFormat() {
        return requestFormat;
    }


    /**
     * Sets the requestFormat value for this GenerateReportByPermitNumber.
     * 
     * @param requestFormat
     */
    public void setRequestFormat(java.lang.String requestFormat) {
        this.requestFormat = requestFormat;
    }


    /**
     * Gets the permitNumber value for this GenerateReportByPermitNumber.
     * 
     * @return permitNumber
     */
    public java.lang.String getPermitNumber() {
        return permitNumber;
    }


    /**
     * Sets the permitNumber value for this GenerateReportByPermitNumber.
     * 
     * @param permitNumber
     */
    public void setPermitNumber(java.lang.String permitNumber) {
        this.permitNumber = permitNumber;
    }


    /**
     * Gets the accessToken value for this GenerateReportByPermitNumber.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this GenerateReportByPermitNumber.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateReportByPermitNumber)) return false;
        GenerateReportByPermitNumber other = (GenerateReportByPermitNumber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dispatchID==null && other.getDispatchID()==null) || 
             (this.dispatchID!=null &&
              this.dispatchID.equals(other.getDispatchID()))) &&
            ((this.reportName==null && other.getReportName()==null) || 
             (this.reportName!=null &&
              this.reportName.equals(other.getReportName()))) &&
            ((this.requestFormat==null && other.getRequestFormat()==null) || 
             (this.requestFormat!=null &&
              this.requestFormat.equals(other.getRequestFormat()))) &&
            ((this.permitNumber==null && other.getPermitNumber()==null) || 
             (this.permitNumber!=null &&
              this.permitNumber.equals(other.getPermitNumber()))) &&
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
        if (getDispatchID() != null) {
            _hashCode += getDispatchID().hashCode();
        }
        if (getReportName() != null) {
            _hashCode += getReportName().hashCode();
        }
        if (getRequestFormat() != null) {
            _hashCode += getRequestFormat().hashCode();
        }
        if (getPermitNumber() != null) {
            _hashCode += getPermitNumber().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenerateReportByPermitNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">GenerateReportByPermitNumber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispatchID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "DispatchID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ReportName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "RequestFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permitNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "PermitNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
