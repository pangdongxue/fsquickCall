/**
 * SSOLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx;

public class SSOLocator extends org.apache.axis.client.Service implements net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSO {

/**
 * 综合应用平台（IAMS）单点登录
 */

    public SSOLocator() {
    }


    public SSOLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SSOLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SSOSoap
    private java.lang.String SSOSoap_address = "http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx";

    public java.lang.String getSSOSoapAddress() {
        return SSOSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SSOSoapWSDDServiceName = "SSOSoap";

    public java.lang.String getSSOSoapWSDDServiceName() {
        return SSOSoapWSDDServiceName;
    }

    public void setSSOSoapWSDDServiceName(java.lang.String name) {
        SSOSoapWSDDServiceName = name;
    }

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOSoap getSSOSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SSOSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSSOSoap(endpoint);
    }

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOSoap getSSOSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOSoapStub _stub = new net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOSoapStub(portAddress, this);
            _stub.setPortName(getSSOSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSSOSoapEndpointAddress(java.lang.String address) {
        SSOSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOSoapStub _stub = new net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOSoapStub(new java.net.URL(SSOSoap_address), this);
                _stub.setPortName(getSSOSoapWSDDServiceName());
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
        if ("SSOSoap".equals(inputPortName)) {
            return getSSOSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "SSO");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "SSOSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SSOSoap".equals(portName)) {
            setSSOSoapEndpointAddress(address);
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
