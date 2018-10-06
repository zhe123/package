/**
 * ConsolidatorWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public class ConsolidatorWebServiceLocator extends org.apache.axis.client.Service implements com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebService {

    public ConsolidatorWebServiceLocator() {
    }


    public ConsolidatorWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConsolidatorWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConsolidatorWebServiceSoap
    private java.lang.String ConsolidatorWebServiceSoap_address = "http://gss.usps.com/usps-cpas/testgssapi/consolidatorwebservice.asmx";

    public java.lang.String getConsolidatorWebServiceSoapAddress() {
        return ConsolidatorWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConsolidatorWebServiceSoapWSDDServiceName = "ConsolidatorWebServiceSoap";

    public java.lang.String getConsolidatorWebServiceSoapWSDDServiceName() {
        return ConsolidatorWebServiceSoapWSDDServiceName;
    }

    public void setConsolidatorWebServiceSoapWSDDServiceName(java.lang.String name) {
        ConsolidatorWebServiceSoapWSDDServiceName = name;
    }

    public com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceSoap getConsolidatorWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConsolidatorWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConsolidatorWebServiceSoap(endpoint);
    }

    public com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceSoap getConsolidatorWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceSoapStub _stub = new com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getConsolidatorWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConsolidatorWebServiceSoapEndpointAddress(java.lang.String address) {
        ConsolidatorWebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceSoapStub _stub = new com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceSoapStub(new java.net.URL(ConsolidatorWebServiceSoap_address), this);
                _stub.setPortName(getConsolidatorWebServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ConsolidatorWebServiceSoap".equals(inputPortName)) {
            return getConsolidatorWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ConsolidatorWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.usps-cpas.com/usps-cpas/GSSAPI/", "ConsolidatorWebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConsolidatorWebServiceSoap".equals(portName)) {
            setConsolidatorWebServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
