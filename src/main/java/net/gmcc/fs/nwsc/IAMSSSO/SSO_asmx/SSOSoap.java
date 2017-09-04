/**
 * SSOSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx;

public interface SSOSoap extends java.rmi.Remote {

    /**
     * Test
     */
    public java.lang.String a_HelloWorld() throws java.rmi.RemoteException;

    /**
     * 当用户每次访问进入一个应用系统时，向IAP填写一条用户访问记录
     */
    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult setAppAccessLog(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String loginID) throws java.rmi.RemoteException;

    /**
     * 让不能调用FSLLIAMS.SSO.DLL的第三方应用根据Cookie获取Account
     */
    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getUserAccount(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, boolean isgmccCookie, java.lang.String loginID) throws java.rmi.RemoteException;

    /**
     * 登陆单例查询
     */
    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.Result isLogin(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String loginID, java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * 返回加密后字段
     */
    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getEncryptString(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String strEncryptString, java.lang.String strEncryptKey, java.lang.String strEncryptType) throws java.rmi.RemoteException;

    /**
     * 返回解密后字段
     */
    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getDecryptString(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String strDecryptString, java.lang.String strDecryptKey, java.lang.String strDecryptType) throws java.rmi.RemoteException;

    /**
     * 获取用户密码过期时间
     */
    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getPassWordValidateTime(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String processName, java.lang.String xmlData, java.lang.String adminName, java.lang.String adminPassword) throws java.rmi.RemoteException;

    /**
     * 采用通用的GMCC存取角色号进行登录检验
     */
    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult loginCheck2(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String loginId, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * 验证登陆并返回token,广州专用
     */
    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult loginCheckGZ(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String loginId, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * 让不能调用FSLLIAMS.SSO.DLL的第三方应用根据统一的令牌来进行验证，其令牌的名称一样。均为省公司的令牌名称
     */
    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfValidateLoginResult validateSSO(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String takenValue) throws java.rmi.RemoteException;

    /**
     * 加密将要写入cookie的字符串，返回密文。原文格式必须是 userid|loginid
     */
    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult encryptStringForCookie(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String originalString) throws java.rmi.RemoteException;

    /**
     * 进行登录检验
     */
    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult loginCheck(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String gmccSystemid, java.lang.String loginId, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * 让不能调用FSLLIAMS.SSO.DLL的第三方应用根据Cookie获取UserID
     */
    public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getUserID(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, boolean isgmccCookie, java.lang.String cookieValue) throws java.rmi.RemoteException;
}
