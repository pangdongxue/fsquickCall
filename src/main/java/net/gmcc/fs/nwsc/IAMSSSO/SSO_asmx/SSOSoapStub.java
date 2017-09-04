/**
 * SSOSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx;

public class SSOSoapStub extends org.apache.axis.client.Stub implements net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[13];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("A_HelloWorld");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "A_HelloWorldResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetAppAccessLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "systemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysAccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "LoginID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfActionResult"));
        oper.setReturnClass(net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "SetAppAccessLogResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "systemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysAccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "isgmccCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "LoginID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfActionResult"));
        oper.setReturnClass(net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "GetUserAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IsLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "systemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysAccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "loginID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "Result"));
        oper.setReturnClass(net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "IsLoginResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEncryptString");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "systemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysAccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "strEncryptString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "strEncryptKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "strEncryptType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfActionResult"));
        oper.setReturnClass(net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "GetEncryptStringResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDecryptString");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "systemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysAccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "strDecryptString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "strDecryptKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "strDecryptType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfActionResult"));
        oper.setReturnClass(net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "GetDecryptStringResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPassWordValidateTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "systemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysAccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "processName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "xmlData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "adminName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "adminPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfActionResult"));
        oper.setReturnClass(net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "GetPassWordValidateTimeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoginCheck2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "systemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysAccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "loginId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfLoginResult"));
        oper.setReturnClass(net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "LoginCheck2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoginCheckGZ");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "systemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysAccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "loginId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfActionResult"));
        oper.setReturnClass(net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "LoginCheckGZResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ValidateSSO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "systemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysAccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "takenValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfValidateLoginResult"));
        oper.setReturnClass(net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfValidateLoginResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ValidateSSOResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EncryptStringForCookie");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "systemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysAccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "originalString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfActionResult"));
        oper.setReturnClass(net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "EncryptStringForCookieResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoginCheck");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "systemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysAccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "gmccSystemid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "loginId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfLoginResult"));
        oper.setReturnClass(net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "LoginCheckResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "systemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysAccountID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "sysPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "isgmccCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "cookieValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfActionResult"));
        oper.setReturnClass(net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "GetUserIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

    }

    public SSOSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SSOSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SSOSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://iamsweb.gmcc.net/WS/", "ActionResult");
            cachedSerQNames.add(qName);
            cls = net.gmcc.iamsweb.WS.ActionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://iamsweb.gmcc.net/WS/", "LoginResult");
            cachedSerQNames.add(qName);
            cls = net.gmcc.iamsweb.WS.LoginResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://iamsweb.gmcc.net/WS/", "ValidateLoginResult");
            cachedSerQNames.add(qName);
            cls = net.gmcc.iamsweb.WS.ValidateLoginResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "Result");
            cachedSerQNames.add(qName);
            cls = net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultBase");
            cachedSerQNames.add(qName);
            cls = net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfActionResult");
            cachedSerQNames.add(qName);
            cls = net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfLoginResult");
            cachedSerQNames.add(qName);
            cls = net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfValidateLoginResult");
            cachedSerQNames.add(qName);
            cls = net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfValidateLoginResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String a_HelloWorld() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx/A_HelloWorld");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "A_HelloWorld"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult setAppAccessLog(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String loginID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx/SetAppAccessLog");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "SetAppAccessLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {systemID, sysAccountID, sysPassword, loginID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getUserAccount(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, boolean isgmccCookie, java.lang.String loginID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx/GetUserAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "GetUserAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {systemID, sysAccountID, sysPassword, new java.lang.Boolean(isgmccCookie), loginID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.Result isLogin(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String loginID, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx/IsLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "IsLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {systemID, sysAccountID, sysPassword, loginID, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.Result) org.apache.axis.utils.JavaUtils.convert(_resp, net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getEncryptString(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String strEncryptString, java.lang.String strEncryptKey, java.lang.String strEncryptType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx/GetEncryptString");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "GetEncryptString"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {systemID, sysAccountID, sysPassword, strEncryptString, strEncryptKey, strEncryptType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getDecryptString(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String strDecryptString, java.lang.String strDecryptKey, java.lang.String strDecryptType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx/GetDecryptString");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "GetDecryptString"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {systemID, sysAccountID, sysPassword, strDecryptString, strDecryptKey, strDecryptType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getPassWordValidateTime(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String processName, java.lang.String xmlData, java.lang.String adminName, java.lang.String adminPassword) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx/GetPassWordValidateTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "GetPassWordValidateTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {systemID, sysAccountID, sysPassword, processName, xmlData, adminName, adminPassword});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult loginCheck2(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String loginId, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx/LoginCheck2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "LoginCheck2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {systemID, sysAccountID, sysPassword, loginId, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult loginCheckGZ(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String loginId, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx/LoginCheckGZ");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "LoginCheckGZ"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {systemID, sysAccountID, sysPassword, loginId, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfValidateLoginResult validateSSO(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String takenValue) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx/ValidateSSO");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ValidateSSO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {systemID, sysAccountID, sysPassword, takenValue});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfValidateLoginResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfValidateLoginResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfValidateLoginResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult encryptStringForCookie(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String originalString) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx/EncryptStringForCookie");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "EncryptStringForCookie"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {systemID, sysAccountID, sysPassword, originalString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult loginCheck(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String gmccSystemid, java.lang.String loginId, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx/LoginCheck");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "LoginCheck"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {systemID, sysAccountID, sysPassword, gmccSystemid, loginId, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getUserID(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, boolean isgmccCookie, java.lang.String cookieValue) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx/GetUserID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "GetUserID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {systemID, sysAccountID, sysPassword, new java.lang.Boolean(isgmccCookie), cookieValue});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult) org.apache.axis.utils.JavaUtils.convert(_resp, net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
