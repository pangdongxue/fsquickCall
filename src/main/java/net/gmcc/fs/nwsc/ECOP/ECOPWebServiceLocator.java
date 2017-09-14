/**
 * ECOPWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.gmcc.fs.nwsc.ECOP;

public class ECOPWebServiceLocator extends org.apache.axis.client.Service implements net.gmcc.fs.nwsc.ECOP.ECOPWebService {

    public ECOPWebServiceLocator() {
    }


    public ECOPWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ECOPWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ECOPWebServiceSoap
    private java.lang.String ECOPWebServiceSoap_address = "http://nwsc.fs.gmcc.net/ECOPService/ECOPWebService.asmx";

    public java.lang.String getECOPWebServiceSoapAddress() {
        return ECOPWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ECOPWebServiceSoapWSDDServiceName = "ECOPWebServiceSoap";

    public java.lang.String getECOPWebServiceSoapWSDDServiceName() {
        return ECOPWebServiceSoapWSDDServiceName;
    }

    public void setECOPWebServiceSoapWSDDServiceName(java.lang.String name) {
        ECOPWebServiceSoapWSDDServiceName = name;
    }

    public net.gmcc.fs.nwsc.ECOP.ECOPWebServiceSoap getECOPWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ECOPWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getECOPWebServiceSoap(endpoint);
    }

    public net.gmcc.fs.nwsc.ECOP.ECOPWebServiceSoap getECOPWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.gmcc.fs.nwsc.ECOP.ECOPWebServiceSoapStub _stub = new net.gmcc.fs.nwsc.ECOP.ECOPWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getECOPWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setECOPWebServiceSoapEndpointAddress(java.lang.String address) {
        ECOPWebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.gmcc.fs.nwsc.ECOP.ECOPWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                net.gmcc.fs.nwsc.ECOP.ECOPWebServiceSoapStub _stub = new net.gmcc.fs.nwsc.ECOP.ECOPWebServiceSoapStub(new java.net.URL(ECOPWebServiceSoap_address), this);
                _stub.setPortName(getECOPWebServiceSoapWSDDServiceName());
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
        if ("ECOPWebServiceSoap".equals(inputPortName)) {
            return getECOPWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/ECOP/", "ECOPWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/ECOP/", "ECOPWebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ECOPWebServiceSoap".equals(portName)) {
            setECOPWebServiceSoapEndpointAddress(address);
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
