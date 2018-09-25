/**
 * SearchForProcessedPackageResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class SearchForProcessedPackageResponse  implements java.io.Serializable {
    private com.usps_cpas.www.usps_cpas.GSSAPI.SearchForProcessedPackageResponseSearchForProcessedPackageResult searchForProcessedPackageResult;

    public SearchForProcessedPackageResponse() {
    }

    public SearchForProcessedPackageResponse(
           com.usps_cpas.www.usps_cpas.GSSAPI.SearchForProcessedPackageResponseSearchForProcessedPackageResult searchForProcessedPackageResult) {
           this.searchForProcessedPackageResult = searchForProcessedPackageResult;
    }


    /**
     * Gets the searchForProcessedPackageResult value for this SearchForProcessedPackageResponse.
     * 
     * @return searchForProcessedPackageResult
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.SearchForProcessedPackageResponseSearchForProcessedPackageResult getSearchForProcessedPackageResult() {
        return searchForProcessedPackageResult;
    }


    /**
     * Sets the searchForProcessedPackageResult value for this SearchForProcessedPackageResponse.
     * 
     * @param searchForProcessedPackageResult
     */
    public void setSearchForProcessedPackageResult(com.usps_cpas.www.usps_cpas.GSSAPI.SearchForProcessedPackageResponseSearchForProcessedPackageResult searchForProcessedPackageResult) {
        this.searchForProcessedPackageResult = searchForProcessedPackageResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchForProcessedPackageResponse)) return false;
        SearchForProcessedPackageResponse other = (SearchForProcessedPackageResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchForProcessedPackageResult==null && other.getSearchForProcessedPackageResult()==null) || 
             (this.searchForProcessedPackageResult!=null &&
              this.searchForProcessedPackageResult.equals(other.getSearchForProcessedPackageResult())));
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
        if (getSearchForProcessedPackageResult() != null) {
            _hashCode += getSearchForProcessedPackageResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchForProcessedPackageResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">SearchForProcessedPackageResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchForProcessedPackageResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "SearchForProcessedPackageResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", ">>SearchForProcessedPackageResponse>SearchForProcessedPackageResult"));
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
