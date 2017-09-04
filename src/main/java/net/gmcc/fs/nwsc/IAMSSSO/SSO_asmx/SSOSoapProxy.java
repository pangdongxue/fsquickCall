package net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx;

public class SSOSoapProxy implements net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOSoap {
  private String _endpoint = null;
  private net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOSoap sSOSoap = null;
  
  public SSOSoapProxy() {
    _initSSOSoapProxy();
  }
  
  public SSOSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initSSOSoapProxy();
  }
  
  private void _initSSOSoapProxy() {
    try {
      sSOSoap = (new net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOLocator()).getSSOSoap();
      if (sSOSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sSOSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sSOSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sSOSoap != null)
      ((javax.xml.rpc.Stub)sSOSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOSoap getSSOSoap() {
    if (sSOSoap == null)
      _initSSOSoapProxy();
    return sSOSoap;
  }
  
  public java.lang.String a_HelloWorld() throws java.rmi.RemoteException{
    if (sSOSoap == null)
      _initSSOSoapProxy();
    return sSOSoap.a_HelloWorld();
  }
  
  public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult setAppAccessLog(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String loginID) throws java.rmi.RemoteException{
    if (sSOSoap == null)
      _initSSOSoapProxy();
    return sSOSoap.setAppAccessLog(systemID, sysAccountID, sysPassword, loginID);
  }
  
  public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getUserAccount(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, boolean isgmccCookie, java.lang.String loginID) throws java.rmi.RemoteException{
    if (sSOSoap == null)
      _initSSOSoapProxy();
    return sSOSoap.getUserAccount(systemID, sysAccountID, sysPassword, isgmccCookie, loginID);
  }
  
  public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.Result isLogin(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String loginID, java.lang.String sessionId) throws java.rmi.RemoteException{
    if (sSOSoap == null)
      _initSSOSoapProxy();
    return sSOSoap.isLogin(systemID, sysAccountID, sysPassword, loginID, sessionId);
  }
  
  public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getEncryptString(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String strEncryptString, java.lang.String strEncryptKey, java.lang.String strEncryptType) throws java.rmi.RemoteException{
    if (sSOSoap == null)
      _initSSOSoapProxy();
    return sSOSoap.getEncryptString(systemID, sysAccountID, sysPassword, strEncryptString, strEncryptKey, strEncryptType);
  }
  
  public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getDecryptString(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String strDecryptString, java.lang.String strDecryptKey, java.lang.String strDecryptType) throws java.rmi.RemoteException{
    if (sSOSoap == null)
      _initSSOSoapProxy();
    return sSOSoap.getDecryptString(systemID, sysAccountID, sysPassword, strDecryptString, strDecryptKey, strDecryptType);
  }
  
  public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getPassWordValidateTime(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String processName, java.lang.String xmlData, java.lang.String adminName, java.lang.String adminPassword) throws java.rmi.RemoteException{
    if (sSOSoap == null)
      _initSSOSoapProxy();
    return sSOSoap.getPassWordValidateTime(systemID, sysAccountID, sysPassword, processName, xmlData, adminName, adminPassword);
  }
  
  public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult loginCheck2(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String loginId, java.lang.String password) throws java.rmi.RemoteException{
    if (sSOSoap == null)
      _initSSOSoapProxy();
    return sSOSoap.loginCheck2(systemID, sysAccountID, sysPassword, loginId, password);
  }
  
  public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult loginCheckGZ(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String loginId, java.lang.String password) throws java.rmi.RemoteException{
    if (sSOSoap == null)
      _initSSOSoapProxy();
    return sSOSoap.loginCheckGZ(systemID, sysAccountID, sysPassword, loginId, password);
  }
  
  public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfValidateLoginResult validateSSO(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String takenValue) throws java.rmi.RemoteException{
    if (sSOSoap == null)
      _initSSOSoapProxy();
    return sSOSoap.validateSSO(systemID, sysAccountID, sysPassword, takenValue);
  }
  
  public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult encryptStringForCookie(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String originalString) throws java.rmi.RemoteException{
    if (sSOSoap == null)
      _initSSOSoapProxy();
    return sSOSoap.encryptStringForCookie(systemID, sysAccountID, sysPassword, originalString);
  }
  
  public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult loginCheck(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, java.lang.String gmccSystemid, java.lang.String loginId, java.lang.String password) throws java.rmi.RemoteException{
    if (sSOSoap == null)
      _initSSOSoapProxy();
    return sSOSoap.loginCheck(systemID, sysAccountID, sysPassword, gmccSystemid, loginId, password);
  }
  
  public net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfActionResult getUserID(java.lang.String systemID, java.lang.String sysAccountID, java.lang.String sysPassword, boolean isgmccCookie, java.lang.String cookieValue) throws java.rmi.RemoteException{
    if (sSOSoap == null)
      _initSSOSoapProxy();
    return sSOSoap.getUserID(systemID, sysAccountID, sysPassword, isgmccCookie, cookieValue);
  }
  
  
}