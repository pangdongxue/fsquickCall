/**
 * SSO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx;

public interface SSO extends javax.xml.rpc.Service {

/**
 * 综合应用平台（IAMS）单点登录
 */
    public java.lang.String getSSOSoapAddress();

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOSoap getSSOSoap() throws javax.xml.rpc.ServiceException;

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOSoap getSSOSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
