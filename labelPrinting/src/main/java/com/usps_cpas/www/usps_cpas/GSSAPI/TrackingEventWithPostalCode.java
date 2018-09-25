/**
 * TrackingEventWithPostalCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class TrackingEventWithPostalCode  implements java.io.Serializable {
    private java.lang.String trackingCode;

    private java.lang.String description;

    private java.lang.String detailInfo;

    private java.lang.String eventDate;

    private java.lang.String timeZone;

    private java.lang.String eventPostalCode;

    private java.lang.String eventLocationName;

    public TrackingEventWithPostalCode() {
    }

    public TrackingEventWithPostalCode(
           java.lang.String trackingCode,
           java.lang.String description,
           java.lang.String detailInfo,
           java.lang.String eventDate,
           java.lang.String timeZone,
           java.lang.String eventPostalCode,
           java.lang.String eventLocationName) {
           this.trackingCode = trackingCode;
           this.description = description;
           this.detailInfo = detailInfo;
           this.eventDate = eventDate;
           this.timeZone = timeZone;
           this.eventPostalCode = eventPostalCode;
           this.eventLocationName = eventLocationName;
    }


    /**
     * Gets the trackingCode value for this TrackingEventWithPostalCode.
     * 
     * @return trackingCode
     */
    public java.lang.String getTrackingCode() {
        return trackingCode;
    }


    /**
     * Sets the trackingCode value for this TrackingEventWithPostalCode.
     * 
     * @param trackingCode
     */
    public void setTrackingCode(java.lang.String trackingCode) {
        this.trackingCode = trackingCode;
    }


    /**
     * Gets the description value for this TrackingEventWithPostalCode.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TrackingEventWithPostalCode.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the detailInfo value for this TrackingEventWithPostalCode.
     * 
     * @return detailInfo
     */
    public java.lang.String getDetailInfo() {
        return detailInfo;
    }


    /**
     * Sets the detailInfo value for this TrackingEventWithPostalCode.
     * 
     * @param detailInfo
     */
    public void setDetailInfo(java.lang.String detailInfo) {
        this.detailInfo = detailInfo;
    }


    /**
     * Gets the eventDate value for this TrackingEventWithPostalCode.
     * 
     * @return eventDate
     */
    public java.lang.String getEventDate() {
        return eventDate;
    }


    /**
     * Sets the eventDate value for this TrackingEventWithPostalCode.
     * 
     * @param eventDate
     */
    public void setEventDate(java.lang.String eventDate) {
        this.eventDate = eventDate;
    }


    /**
     * Gets the timeZone value for this TrackingEventWithPostalCode.
     * 
     * @return timeZone
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this TrackingEventWithPostalCode.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the eventPostalCode value for this TrackingEventWithPostalCode.
     * 
     * @return eventPostalCode
     */
    public java.lang.String getEventPostalCode() {
        return eventPostalCode;
    }


    /**
     * Sets the eventPostalCode value for this TrackingEventWithPostalCode.
     * 
     * @param eventPostalCode
     */
    public void setEventPostalCode(java.lang.String eventPostalCode) {
        this.eventPostalCode = eventPostalCode;
    }


    /**
     * Gets the eventLocationName value for this TrackingEventWithPostalCode.
     * 
     * @return eventLocationName
     */
    public java.lang.String getEventLocationName() {
        return eventLocationName;
    }


    /**
     * Sets the eventLocationName value for this TrackingEventWithPostalCode.
     * 
     * @param eventLocationName
     */
    public void setEventLocationName(java.lang.String eventLocationName) {
        this.eventLocationName = eventLocationName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrackingEventWithPostalCode)) return false;
        TrackingEventWithPostalCode other = (TrackingEventWithPostalCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trackingCode==null && other.getTrackingCode()==null) || 
             (this.trackingCode!=null &&
              this.trackingCode.equals(other.getTrackingCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.detailInfo==null && other.getDetailInfo()==null) || 
             (this.detailInfo!=null &&
              this.detailInfo.equals(other.getDetailInfo()))) &&
            ((this.eventDate==null && other.getEventDate()==null) || 
             (this.eventDate!=null &&
              this.eventDate.equals(other.getEventDate()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.eventPostalCode==null && other.getEventPostalCode()==null) || 
             (this.eventPostalCode!=null &&
              this.eventPostalCode.equals(other.getEventPostalCode()))) &&
            ((this.eventLocationName==null && other.getEventLocationName()==null) || 
             (this.eventLocationName!=null &&
              this.eventLocationName.equals(other.getEventLocationName())));
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
        if (getTrackingCode() != null) {
            _hashCode += getTrackingCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDetailInfo() != null) {
            _hashCode += getDetailInfo().hashCode();
        }
        if (getEventDate() != null) {
            _hashCode += getEventDate().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getEventPostalCode() != null) {
            _hashCode += getEventPostalCode().hashCode();
        }
        if (getEventLocationName() != null) {
            _hashCode += getEventLocationName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackingEventWithPostalCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "TrackingEventWithPostalCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "TrackingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "DetailInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "EventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "TimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "EventPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventLocationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "EventLocationName"));
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
