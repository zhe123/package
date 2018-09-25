/**
 * GetClosedDispatchesListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class GetClosedDispatchesListResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.GetClosedDispatchesListResponseGetClosedDispatchesListResult getClosedDispatchesListResult;

    public GetClosedDispatchesListResponse() {
    }

    public GetClosedDispatchesListResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.GetClosedDispatchesListResponseGetClosedDispatchesListResult getClosedDispatchesListResult) {
           this.getClosedDispatchesListResult = getClosedDispatchesListResult;
    }


    /**
     * Gets the getClosedDispatchesListResult value for this GetClosedDispatchesListResponse.
     * 
     * @return getClosedDispatchesListResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.GetClosedDispatchesListResponseGetClosedDispatchesListResult getGetClosedDispatchesListResult() {
        return getClosedDispatchesListResult;
    }


    /**
     * Sets the getClosedDispatchesListResult value for this GetClosedDispatchesListResponse.
     * 
     * @param getClosedDispatchesListResult
     */
    public void setGetClosedDispatchesListResult(com.usps_cpas.www.usps_cpas.GSSAPI.GetClosedDispatchesListResponseGetClosedDispatchesListResult getClosedDispatchesListResult) {
        this.getClosedDispatchesListResult = getClosedDispatchesListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetClosedDispatchesListResponse)) return false;
        GetClosedDispatchesListResponse other = (GetClosedDispatchesListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getClosedDispatchesListResult==null && other.getGetClosedDispatchesListResult()==null) || 
             (this.getClosedDispatchesListResult!=null &&
              this.getClosedDispatchesListResult.equals(other.getGetClosedDispatchesListResult())));
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
        if (getGetClosedDispatchesListResult() != null) {
            _hashCode += getGetClosedDispatchesListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetClosedDispatchesListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">GetClosedDispatchesListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getClosedDispatchesListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "GetClosedDispatchesListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">>GetClosedDispatchesListResponse>GetClosedDispatchesListResult"));
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
