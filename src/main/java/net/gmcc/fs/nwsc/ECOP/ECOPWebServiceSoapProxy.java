package net.gmcc.fs.nwsc.ECOP;

public class ECOPWebServiceSoapProxy implements net.gmcc.fs.nwsc.ECOP.ECOPWebServiceSoap {
  private String _endpoint = null;
  private net.gmcc.fs.nwsc.ECOP.ECOPWebServiceSoap eCOPWebServiceSoap = null;
  
  public ECOPWebServiceSoapProxy() {
    _initECOPWebServiceSoapProxy();
  }
  
  public ECOPWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initECOPWebServiceSoapProxy();
  }
  
  private void _initECOPWebServiceSoapProxy() {
    try {
      eCOPWebServiceSoap = (new net.gmcc.fs.nwsc.ECOP.ECOPWebServiceLocator()).getECOPWebServiceSoap();
      if (eCOPWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)eCOPWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)eCOPWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (eCOPWebServiceSoap != null)
      ((javax.xml.rpc.Stub)eCOPWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.gmcc.fs.nwsc.ECOP.ECOPWebServiceSoap getECOPWebServiceSoap() {
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap;
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result einvoiceDownload(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String applyoid, java.lang.String receivenumber) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.einvoiceDownload(operatorID, systemID, accountID, password, applyoid, receivenumber);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result productAcceptance(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String productid, java.lang.String productgroup, java.lang.String producttype, java.lang.String productname, java.lang.String ordertype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.productAcceptance(operatorID, systemID, accountID, password, servernum, productid, productgroup, producttype, productname, ordertype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result balanceQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.balanceQuery(operatorID, systemID, accountID, password, servernum, id);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result gotoneGetMobileArea(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.gotoneGetMobileArea(operatorID, systemID, accountID, password, servnumber);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result integrationQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.integrationQuery(operatorID, systemID, accountID, password, servernum, id);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryPlan(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryPlan(operatorID, systemID, accountID, password, servernum, id);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryPUKCardInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryPUKCardInfo(operatorID, systemID, accountID, password, servernum, id);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryCustRealtimeFees(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryCustRealtimeFees(operatorID, systemID, accountID, password, servernum, id);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryMyBasicInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryMyBasicInfo(operatorID, systemID, accountID, password, servernum, id);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result valueAddedServiceQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.valueAddedServiceQuery(operatorID, systemID, accountID, password, servernum, id);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result customerInfoQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.customerInfoQuery(operatorID, systemID, accountID, password, servernum, id);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryUserSubSelectProds(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String querytype, java.lang.String type) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryUserSubSelectProds(operatorID, systemID, accountID, password, servnumber, querytype, type);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result getCornetGroupStaff(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String id) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.getCornetGroupStaff(operatorID, systemID, accountID, password, id);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryCornetGroupOrderingState(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryCornetGroupOrderingState(operatorID, systemID, accountID, password, servernum, id);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result openFamilyServ(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id, java.lang.String effectiveType) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.openFamilyServ(operatorID, systemID, accountID, password, servernum, id, effectiveType);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result cancelFamilyServ(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.cancelFamilyServ(operatorID, systemID, accountID, password, servernum, id);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result upgradeCornetNetworkTariffType(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.upgradeCornetNetworkTariffType(operatorID, systemID, accountID, password, servernum, id);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryCornetGroupMembers(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryCornetGroupMembers(operatorID, systemID, accountID, password, servernum, id);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result joinCornetGroupChatNetwork(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id, java.lang.String number, java.lang.String shortNumber) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.joinCornetGroupChatNetwork(operatorID, systemID, accountID, password, servernum, id, number, shortNumber);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result changeMemberCornet(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id, java.lang.String number, java.lang.String shortNumber) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.changeMemberCornet(operatorID, systemID, accountID, password, servernum, id, number, shortNumber);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result deleteCornetGroupChatMember(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id, java.lang.String number, java.lang.String shortNumber) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.deleteCornetGroupChatMember(operatorID, systemID, accountID, password, servernum, id, number, shortNumber);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result balanceActiveQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.balanceActiveQuery(operatorID, systemID, accountID, password, servernum, id);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryPoint(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryPoint(operatorID, systemID, accountID, password, servernum);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result flowqueryall(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String querytype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.flowqueryall(operatorID, systemID, accountID, password, servernum, querytype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result broadbandAddressQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String cityname, java.lang.String districtname, java.lang.String address) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.broadbandAddressQuery(operatorID, systemID, accountID, password, cityname, districtname, address);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryAvailableTraffic(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryAvailableTraffic(operatorID, systemID, accountID, password, servernum);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result WLANPasswordReset(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.WLANPasswordReset(operatorID, systemID, accountID, password, servernum);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result numberQualificationCheck(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.numberQualificationCheck(operatorID, systemID, accountID, password, servernum);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result checkAgreeIMEI(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String imei) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.checkAgreeIMEI(operatorID, systemID, accountID, password, servernum, imei);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result productTypeAndProductPackageInquiry(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String machineType) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.productTypeAndProductPackageInquiry(operatorID, systemID, accountID, password, servernum, machineType);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result selfMachineContractInquiry(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String proPackageId, java.lang.String heyueCycle) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.selfMachineContractInquiry(operatorID, systemID, accountID, password, servernum, proPackageId, heyueCycle);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result bringMachineContractManagement(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String machineType, java.lang.String heyueId, java.lang.String imeiCode, java.lang.String proPackageId, java.lang.String heyueCycle) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.bringMachineContractManagement(operatorID, systemID, accountID, password, servernum, machineType, heyueId, imeiCode, proPackageId, heyueCycle);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result preStorageMarketingCasePreAccepted(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String productid, java.lang.String productname, java.lang.String ordertype, java.lang.String orderseq, java.lang.String fee, java.lang.String paytype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.preStorageMarketingCasePreAccepted(operatorID, systemID, accountID, password, servernum, productid, productname, ordertype, orderseq, fee, paytype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result commodityVerification(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String productid, java.lang.String productname, java.lang.String existattr, net.gmcc.fs.nwsc.ECOP.Attrinfo[] attr) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.commodityVerification(operatorID, systemID, accountID, password, servernum, productid, productname, existattr, attr);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result globalOpenAccount(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String spassword, java.lang.String custname, java.lang.String servernum, java.lang.String password, java.lang.String paymode, java.lang.String imsi, java.lang.String iccid, java.lang.String custid, java.lang.String region, java.lang.String optype, java.lang.String prodid, java.lang.String packprodid, java.lang.String efftype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.globalOpenAccount(operatorID, systemID, accountID, spassword, custname, servernum, password, paymode, imsi, iccid, custid, region, optype, prodid, packprodid, efftype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result globalAccountOrderSubmission(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String fee, java.lang.String paytype, java.lang.String orderseq, java.lang.String servernum) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.globalAccountOrderSubmission(operatorID, systemID, accountID, password, fee, paytype, orderseq, servernum);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result newCheckOrderInfor(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custtype, java.lang.String servnumber, java.lang.String optype, java.lang.String prodid, java.lang.String efftype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.newCheckOrderInfor(operatorID, systemID, accountID, password, custid, custtype, servnumber, optype, prodid, efftype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result byodCheckOrderInfor(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custtype, java.lang.String servnumber, java.lang.String optype, java.lang.String prodid, java.lang.String efftype, java.lang.String subprodid, java.lang.String IMEI) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.byodCheckOrderInfor(operatorID, systemID, accountID, password, custid, custtype, servnumber, optype, prodid, efftype, subprodid, IMEI);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result resetWLANPwd(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.resetWLANPwd(operatorID, systemID, accountID, password, servnumber);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result KHCheckOrderInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custype, java.lang.String servnumber, java.lang.String subName, java.lang.String uPassword, java.lang.String rectype, java.lang.String iscreateacct, java.lang.String paymode, java.lang.String authtype, java.lang.String prodchinfoJsonObject) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.KHCheckOrderInfo(operatorID, systemID, accountID, password, custid, custype, servnumber, subName, uPassword, rectype, iscreateacct, paymode, authtype, prodchinfoJsonObject);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result DKCheckOrderInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custype, java.lang.String servnumber, java.lang.String subName, java.lang.String uPassword, java.lang.String rectype, java.lang.String iscreateacct, java.lang.String paymode, java.lang.String authtype, java.lang.String prodchinfoJsonObject) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.DKCheckOrderInfo(operatorID, systemID, accountID, password, custid, custype, servnumber, subName, uPassword, rectype, iscreateacct, paymode, authtype, prodchinfoJsonObject);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result unsubscribeProduct(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custtype, java.lang.String servnumber, java.lang.String optype, java.lang.String subsprodid, java.lang.String prodid, java.lang.String efftype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.unsubscribeProduct(operatorID, systemID, accountID, password, custid, custtype, servnumber, optype, subsprodid, prodid, efftype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result newOrderSubmission(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custtype, java.lang.String paytype, java.lang.String fee, java.lang.String orderseq, net.gmcc.fs.nwsc.ECOP.Attrinfo[] attr) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.newOrderSubmission(operatorID, systemID, accountID, password, custid, custtype, paytype, fee, orderseq, attr);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryMobileBrandABlance(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryMobileBrandABlance(operatorID, systemID, accountID, password, servnumber);
  }
  
  public java.lang.String a_HelloWorld() throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.a_HelloWorld();
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result getToken(java.lang.String systemID, java.lang.String securityValue) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.getToken(systemID, securityValue);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result checkPersonalFamilyAuth(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custtype, java.lang.String vertype, java.lang.String vertacct, java.lang.String key, java.lang.String value) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.checkPersonalFamilyAuth(operatorID, systemID, accountID, password, custtype, vertype, vertacct, key, value);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result gotoneUserInfoGrading(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String custid) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.gotoneUserInfoGrading(operatorID, systemID, accountID, password, mobileno, custid);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryCusterInfor(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String subsid, java.lang.String servnumber) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryCusterInfor(operatorID, systemID, accountID, password, subsid, servnumber);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result saleRelationQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String querytype, java.lang.String servnumber, java.lang.String prodcode) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.saleRelationQuery(operatorID, systemID, accountID, password, querytype, servnumber, prodcode);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result checkOrderInfor(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String spassword, java.lang.String custid, java.lang.String custtype, java.lang.String servnumber, java.lang.String subname, java.lang.String password, java.lang.String substype, java.lang.String rectype, java.lang.String iscreateacct, java.lang.String acctid, java.lang.String paymode, java.lang.String authtype, java.lang.String itemid, java.lang.String itemvalue, java.lang.String ismpackage, java.lang.String optype, java.lang.String subsprodid, java.lang.String prodid, java.lang.String packprodid, java.lang.String packageprodoid, java.lang.String efftype, java.lang.String usecycle, java.lang.String quantity, java.lang.String bookingfalg, java.lang.String bookingtime, java.lang.String serviceid, java.lang.String paraid, java.lang.String paravalue, java.lang.String optype1, java.lang.String paratype, java.lang.String paratypevalue, java.lang.String paraused, java.lang.String paravalue1, java.lang.String optype2, java.lang.String subsprodid1, java.lang.String prodid1, java.lang.String packprodid1, java.lang.String efftype1, java.lang.String usecycle1, java.lang.String quantity1, java.lang.String serviceid1, java.lang.String paraid1, java.lang.String paravalue2, java.lang.String optype3, java.lang.String paratype1, java.lang.String paratypevalue1, java.lang.String paraused1, java.lang.String paravalue3, java.lang.String payfornum, java.lang.String platform) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.checkOrderInfor(operatorID, systemID, accountID, spassword, custid, custtype, servnumber, subname, password, substype, rectype, iscreateacct, acctid, paymode, authtype, itemid, itemvalue, ismpackage, optype, subsprodid, prodid, packprodid, packageprodoid, efftype, usecycle, quantity, bookingfalg, bookingtime, serviceid, paraid, paravalue, optype1, paratype, paratypevalue, paraused, paravalue1, optype2, subsprodid1, prodid1, packprodid1, efftype1, usecycle1, quantity1, serviceid1, paraid1, paravalue2, optype3, paratype1, paratypevalue1, paraused1, paravalue3, payfornum, platform);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result commitOrder(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custtype, java.lang.String paytype, java.lang.String fee, java.lang.String orderseq) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.commitOrder(operatorID, systemID, accountID, password, custid, custtype, paytype, fee, orderseq);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryOrderBaseInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String orderid, java.lang.String servnumber, java.lang.String custid, java.lang.String begintime, java.lang.String endtime, java.lang.String busitype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryOrderBaseInfo(operatorID, systemID, accountID, password, orderid, servnumber, custid, begintime, endtime, busitype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryOrderDetailInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String orderid) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryOrderDetailInfo(operatorID, systemID, accountID, password, orderid);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result checkOrderFee(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custtype, java.lang.String orderseq, java.lang.String feetype, java.lang.String fee) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.checkOrderFee(operatorID, systemID, accountID, password, custid, custtype, orderseq, feetype, fee);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result checkOrderMemberInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custtype, java.lang.String productcode, java.lang.String opttype, java.lang.String membermobile, java.lang.String membernum, java.lang.String membername, java.lang.String memtype, java.lang.String smsconfirm, java.lang.String optype, java.lang.String subsprodid, java.lang.String prodid, java.lang.String packprodid, java.lang.String payflag, java.lang.String efftype, java.lang.String usecycle, java.lang.String serviceid, java.lang.String paraid, java.lang.String paravalue, java.lang.String optype1, java.lang.String paratype, java.lang.String paravalue1, java.lang.String optype2, java.lang.String subsprodid1, java.lang.String prodid1, java.lang.String packprodid1, java.lang.String payflag1, java.lang.String efftype1, java.lang.String usecycle1, java.lang.String serviceid1, java.lang.String paraid1, java.lang.String paravalue2, java.lang.String optype3, java.lang.String paratype1, java.lang.String paravalue3) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.checkOrderMemberInfo(operatorID, systemID, accountID, password, custid, custtype, productcode, opttype, membermobile, membernum, membername, memtype, smsconfirm, optype, subsprodid, prodid, packprodid, payflag, efftype, usecycle, serviceid, paraid, paravalue, optype1, paratype, paravalue1, optype2, subsprodid1, prodid1, packprodid1, payflag1, efftype1, usecycle1, serviceid1, paraid1, paravalue2, optype3, paratype1, paravalue3);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryPackageUsed(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String type) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryPackageUsed(operatorID, systemID, accountID, password, servnumber, type);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryUserDepositePayBack(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String begintime, java.lang.String endtime, java.lang.String prodid) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryUserDepositePayBack(operatorID, systemID, accountID, password, servnumber, begintime, endtime, prodid);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryUserSPRelation(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String needquerysms) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryUserSPRelation(operatorID, systemID, accountID, password, servnumber, needquerysms);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryMemberGroupProdInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryMemberGroupProdInfo(operatorID, systemID, accountID, password, servnumber);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result cancelOrder(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String orderseq, java.lang.String reason, java.lang.String paytype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.cancelOrder(operatorID, systemID, accountID, password, orderseq, reason, paytype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryUserProductOrderingRelations(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String prodcode, java.lang.String querytype, java.lang.String prodid, java.lang.String solutionid) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryUserProductOrderingRelations(operatorID, systemID, accountID, password, servnumber, prodcode, querytype, prodid, solutionid);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryProdDetail(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String prodid, java.lang.String region, java.lang.String orgaid, java.lang.String servnumber, java.lang.String rectype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryProdDetail(operatorID, systemID, accountID, password, prodid, region, orgaid, servnumber, rectype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result getWLANRandomPwd(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String reqtype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.getWLANRandomPwd(operatorID, systemID, accountID, password, servnumber, reqtype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result checkKdPwd(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String aPassword, java.lang.String servnumber, java.lang.String password, java.lang.String pwdtype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.checkKdPwd(operatorID, systemID, accountID, aPassword, servnumber, password, pwdtype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result kdPortreBind(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String stype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.kdPortreBind(operatorID, systemID, accountID, password, servnumber, stype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result resetKDPassword(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.resetKDPassword(operatorID, systemID, accountID, password, servnumber);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryKDBindMobile(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String kdacctid, java.lang.String begintime, java.lang.String endtime, java.lang.String accttype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryKDBindMobile(operatorID, systemID, accountID, password, kdacctid, begintime, endtime, accttype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryUserBaseInfor(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String userno, java.lang.String projectcode) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryUserBaseInfor(operatorID, systemID, accountID, password, userno, projectcode);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryMobileLocal(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryMobileLocal(operatorID, systemID, accountID, password, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryCustomBalance(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String userno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryCustomBalance(operatorID, systemID, accountID, password, userno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryCustRealtimeFees2(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String projectcode) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryCustRealtimeFees2(operatorID, systemID, accountID, password, mobileno, projectcode);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryCustomBill(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String userno, java.lang.String startdate, java.lang.String enddate) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryCustomBill(operatorID, systemID, accountID, password, userno, startdate, enddate);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryCustomProductInfor(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String groupid, java.lang.String projectcode) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryCustomProductInfor(operatorID, systemID, accountID, password, groupid, projectcode);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryTotalIntegral(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryTotalIntegral(operatorID, systemID, accountID, password, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result pointsIntegral(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String custid, java.lang.String deducepoint, java.lang.String type, java.lang.String reason, java.lang.String sequence, java.lang.String buscode) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.pointsIntegral(operatorID, systemID, accountID, password, mobileno, custid, deducepoint, type, reason, sequence, buscode);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result gotoneGetCurrentIntegral(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String qrydate) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.gotoneGetCurrentIntegral(operatorID, systemID, accountID, password, mobileno, qrydate);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result querySIMRelationInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String iccid) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.querySIMRelationInfo(operatorID, systemID, accountID, password, mobileno, iccid);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result querySubSintegratedInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.querySubSintegratedInfo(operatorID, systemID, accountID, password, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryBalanceAndBillDate(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryBalanceAndBillDate(operatorID, systemID, accountID, password, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryKDCustInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String idno, java.lang.String address, java.lang.String startdate, java.lang.String enddate, java.lang.String querytype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryKDCustInfo(operatorID, systemID, accountID, password, servnumber, idno, address, startdate, enddate, querytype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryCustomChargeRecord(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String startdate, java.lang.String enddate) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryCustomChargeRecord(operatorID, systemID, accountID, password, mobileno, startdate, enddate);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result querySIMCardInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String projectno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.querySIMCardInfo(operatorID, systemID, accountID, password, mobileno, projectno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result changeNumberBasicInfor(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.changeNumberBasicInfor(operatorID, systemID, accountID, password, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryMobileBaseInformation(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String projectcode) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryMobileBaseInformation(operatorID, systemID, accountID, password, mobileno, projectcode);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result servicePasswordAuth(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String ncode, java.lang.String spassword, java.lang.String remark) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.servicePasswordAuth(operatorID, systemID, accountID, password, mobileno, ncode, spassword, remark);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryOneCertmulmachine(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String certtype, java.lang.String certid) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryOneCertmulmachine(operatorID, systemID, accountID, password, certtype, certid);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result querySubAccountListInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.querySubAccountListInfo(operatorID, systemID, accountID, password, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryCustMonthCharge(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String date) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryCustMonthCharge(operatorID, systemID, accountID, password, mobileno, date);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryUserMonthCharge(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String date) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryUserMonthCharge(operatorID, systemID, accountID, password, mobileno, date);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryUserDiscountQualify(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryUserDiscountQualify(operatorID, systemID, accountID, password, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result gotoneNonPayQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.gotoneNonPayQuery(operatorID, systemID, accountID, password, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result gotoneGetUserInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.gotoneGetUserInfo(operatorID, systemID, accountID, password, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryMonthInventoryList(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String month, java.lang.String type) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryMonthInventoryList(operatorID, systemID, accountID, password, mobileno, month, type);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result intelligenceNetGetMusterEfficacyCode(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.intelligenceNetGetMusterEfficacyCode(operatorID, systemID, accountID, password, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result intelligenceNetMusterEfficacyCodeEfficacy(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String authcode) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.intelligenceNetMusterEfficacyCodeEfficacy(operatorID, systemID, accountID, password, mobileno, authcode);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result commitCardActivation(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String cardtype, java.lang.String permitunactive) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.commitCardActivation(operatorID, systemID, accountID, password, mobileno, cardtype, permitunactive);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result gotonePostalServiceApply(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String ncode, java.lang.String ope_type) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.gotonePostalServiceApply(operatorID, systemID, accountID, password, mobileno, ncode, ope_type);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result gotoneIDCardCheck(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String personid) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.gotoneIDCardCheck(operatorID, systemID, accountID, password, mobileno, personid);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result alterHLRdata(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String ncode, java.lang.String remarks) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.alterHLRdata(operatorID, systemID, accountID, password, mobileno, ncode, remarks);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryWorkList(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String startdate, java.lang.String enddate) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryWorkList(operatorID, systemID, accountID, password, mobileno, startdate, enddate);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result compareBussRecord(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String orderid) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.compareBussRecord(operatorID, systemID, accountID, password, mobileno, orderid);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryCustomBillDetail(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String startdate, java.lang.String enddate) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryCustomBillDetail(operatorID, systemID, accountID, password, mobileno, startdate, enddate);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result gotoneBigCustInfoQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.gotoneBigCustInfoQuery(operatorID, systemID, accountID, password, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryGroupInfoMemberNum(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryGroupInfoMemberNum(operatorID, systemID, accountID, password, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryGsmMess(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryGsmMess(operatorID, systemID, accountID, password, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result backIntegral(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String bossseqno, java.lang.String type, java.lang.String reason) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.backIntegral(operatorID, systemID, accountID, password, mobileno, bossseqno, type, reason);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result currentIntegralQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String custid, java.lang.String integralcircle, java.lang.String integraltype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.currentIntegralQuery(operatorID, systemID, accountID, password, mobileno, custid, integralcircle, integraltype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryUserIntegralPrizeRecord(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryUserIntegralPrizeRecord(operatorID, systemID, accountID, password, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result applyServiceModify(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String ncode, java.lang.String stype, java.lang.String remark) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.applyServiceModify(operatorID, systemID, accountID, password, mobileno, ncode, stype, remark);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryIMSIData(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String cardid, java.lang.String number, java.lang.String puk) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryIMSIData(operatorID, systemID, accountID, password, cardid, number, puk);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryPayTypeInfoForMobile(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String productid) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryPayTypeInfoForMobile(operatorID, systemID, accountID, password, productid);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result telnumTmpPick(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String orgid, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.telnumTmpPick(operatorID, systemID, accountID, password, orgid, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result unTelnumTmpPick(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String orgid, java.lang.String mobileno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.unTelnumTmpPick(operatorID, systemID, accountID, password, orgid, mobileno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result querySubSrelation(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String region, java.lang.String relatetype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.querySubSrelation(operatorID, systemID, accountID, password, region, relatetype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result personcustInstall(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String useraccount, java.lang.String custname, java.lang.String certtype, java.lang.String certid, java.lang.String certaddress, java.lang.String llinkman, java.lang.String linkphone, java.lang.String address, java.lang.String paraid, java.lang.String paravalue, java.lang.String shortname, java.lang.String gender, java.lang.String linkaddress, java.lang.String postcode, java.lang.String country, java.lang.String nation, java.lang.String delegatename, java.lang.String delegateidtype, java.lang.String delegateid, java.lang.String delegateaddr, java.lang.String delegatephone) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.personcustInstall(operatorID, systemID, accountID, password, useraccount, custname, certtype, certid, certaddress, llinkman, linkphone, address, paraid, paravalue, shortname, gender, linkaddress, postcode, country, nation, delegatename, delegateidtype, delegateid, delegateaddr, delegatephone);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result broadbandAccountQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String queryway, java.lang.String condition, java.lang.String value, java.lang.String num) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.broadbandAccountQuery(operatorID, systemID, accountID, password, queryway, condition, value, num);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result releaseBasiSimForCardID(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String cardid) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.releaseBasiSimForCardID(operatorID, systemID, accountID, password, cardid);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryPreDepositrec(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String begdate, java.lang.String enddate) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryPreDepositrec(operatorID, systemID, accountID, password, mobileno, begdate, enddate);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryBlackList(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String certid, java.lang.String idno) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryBlackList(operatorID, systemID, accountID, password, mobileno, certid, idno);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryUserBillByDate(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String startdate, java.lang.String enddate) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryUserBillByDate(operatorID, systemID, accountID, password, mobileno, startdate, enddate);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result orderEChannelNumber(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String telnum, java.lang.String bookchannel, java.lang.String booknum, java.lang.String certtype, java.lang.String certnum, java.lang.String custname, java.lang.String certaddr, java.lang.String linkphone, java.lang.String postcode, java.lang.String precontracttimes, java.lang.String ishallps, java.lang.String dutyusername, java.lang.String gender, java.lang.String certid, java.lang.String certtype1, java.lang.String certaddr1, java.lang.String linkphone1) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.orderEChannelNumber(operatorID, systemID, accountID, password, telnum, bookchannel, booknum, certtype, certnum, custname, certaddr, linkphone, postcode, precontracttimes, ishallps, dutyusername, gender, certid, certtype1, certaddr1, linkphone1);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result orderEChannelCancelNumber(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String telnum, java.lang.String bookchannel, java.lang.String booknum, java.lang.String certtype, java.lang.String certnum) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.orderEChannelCancelNumber(operatorID, systemID, accountID, password, telnum, bookchannel, booknum, certtype, certnum);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result customerRegister(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String source, java.lang.String region, java.lang.String wayid, java.lang.String officetel, java.lang.String mobileno, java.lang.String name, java.lang.String certtype, java.lang.String certid, java.lang.String certaddress, java.lang.String delegatename, java.lang.String delegateidtype, java.lang.String delegateid, java.lang.String delegateaddr, java.lang.String delegatephone, java.lang.String gender, java.lang.String nation, java.lang.String birthday, java.lang.String issuingauthority, java.lang.String certvaliddate, java.lang.String certexpdate, java.lang.String dutyusername, java.lang.String dgender, java.lang.String dcertid, java.lang.String dcerttype, java.lang.String certaddr) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.customerRegister(operatorID, systemID, accountID, password, source, region, wayid, officetel, mobileno, name, certtype, certid, certaddress, delegatename, delegateidtype, delegateid, delegateaddr, delegatephone, gender, nation, birthday, issuingauthority, certvaliddate, certexpdate, dutyusername, dgender, dcertid, dcerttype, certaddr);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result customerRegisterRollback(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String certtype, java.lang.String certid) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.customerRegisterRollback(operatorID, systemID, accountID, password, mobileno, certtype, certid);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryAll(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String querytype) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryAll(operatorID, systemID, accountID, password, mobileno, querytype);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result standbyGet(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String simid, java.lang.String stationid, java.lang.String permitunactive) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.standbyGet(operatorID, systemID, accountID, password, mobileno, simid, stationid, permitunactive);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result getIDCardImg(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custname, java.lang.String certid) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.getIDCardImg(operatorID, systemID, accountID, password, custname, certid);
  }
  
  public net.gmcc.fs.nwsc.ECOP.Result queryHistorIcaleInvoice(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String applyoid, java.lang.String servnumber, java.lang.String startdate, java.lang.String enddate) throws java.rmi.RemoteException{
    if (eCOPWebServiceSoap == null)
      _initECOPWebServiceSoapProxy();
    return eCOPWebServiceSoap.queryHistorIcaleInvoice(operatorID, systemID, accountID, password, applyoid, servnumber, startdate, enddate);
  }
  
  
}