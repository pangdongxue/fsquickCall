/**
 * ECOPWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.gmcc.fs.nwsc.ECOP;

public interface ECOPWebServiceSoap extends java.rmi.Remote {

    /**
     * ECOP_SERVICE_30984 电子发票下载接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result einvoiceDownload(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String applyoid, java.lang.String receivenumber) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0009 产品受理(productgroup:产品组(默认为0);producttype:产品类别(默认为0);productname:产品名称(可空);ordertype:(1：办理
     * ;2：取消;3：修改);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result productAcceptance(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String productid, java.lang.String productgroup, java.lang.String producttype, java.lang.String productname, java.lang.String ordertype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0014 余额查询接口(id:业务标识(ACCOUNTS_BALANCE_SEARCH))
     */
    public net.gmcc.fs.nwsc.ECOP.Result balanceQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0015 手机信息查询接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result gotoneGetMobileArea(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0019 积分/M值查询-总积分/总M值查询接口(id:业务标识(INTE_GRAL_CURR_YEAR（M值用MZONE_MVALUE_BALANCE）))
     */
    public net.gmcc.fs.nwsc.ECOP.Result integrationQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0024 欠费查询接口(id:业务标识(ARREARS_INFO_SEARCH))
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryPlan(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0025 PUK码查询接口(id:业务标识(PUK))
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryPUKCardInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0026 实时话费查询接口(id:业务标识(REAL_TIME_FEE_SEARCH))
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryCustRealtimeFees(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0029 我的基本信息查询接口(id:业务标识(MY_BASICINFO))
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryMyBasicInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0031 增值业务查询(id:业务标识(MONTER_UNIFY_QUERY))
     */
    public net.gmcc.fs.nwsc.ECOP.Result valueAddedServiceQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0032 客户信息查询(id:业务标识(MY_PERSONAL_INFO))
     */
    public net.gmcc.fs.nwsc.ECOP.Result customerInfoQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0033 套餐订购状态查询(querytype:查询方式(0只查询有效信息;1查询所有订购信息;2下月生效;3当月生效);type:产品分类(根据分类查询：package：基础套餐类;function：服务功能类;increment：梦网增值类;others：其它功能类))
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryUserSubSelectProds(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String querytype, java.lang.String type) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0037 获取短号群聊网配置的成员数量(id:传短号群聊网业务标识(短号家庭网: FAMILY_TALKING;短号好友网:FRIEND_TALKING;短号老乡网:DHLXW);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result getCornetGroupStaff(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0038 查询短号群聊网订购状态(id:传短号群聊网业务标识(短号家庭网: FAMILY_TALKING;短号好友网:FRIEND_TALKING;短号老乡网:DHLXW);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryCornetGroupOrderingState(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0039 订购短号群聊网(id：要申请的短号群聊网业务标识(短号家庭网: FAMILY_TALKING;短号好友网:FRIEND_TALKING;短号老乡网:DHLXW);effectiveType:生效标识(1、WITHIN_24_HOURS--
     * 24小时内生效;2、NEXT_MONTH--下月1日生效))
     */
    public net.gmcc.fs.nwsc.ECOP.Result openFamilyServ(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id, java.lang.String effectiveType) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0040 退订短号群聊网(id:要取消的短号群聊网业务标识(短号家庭网: FAMILY_TALKING;短号好友网:FRIEND_TALKING;短号老乡网:DHLXW))
     */
    public net.gmcc.fs.nwsc.ECOP.Result cancelFamilyServ(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0041 升级短号群聊网资费类型(id:要取消的短号群聊网业务标识(短号家庭网: FAMILY_TALKING;短号好友网:FRIEND_TALKING;短号老乡网:DHLXW))
     */
    public net.gmcc.fs.nwsc.ECOP.Result upgradeCornetNetworkTariffType(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0042 查询短号群聊网网内现有成员(id:要取消的短号群聊网业务标识(短号家庭网: FAMILY_TALKING;短号好友网:FRIEND_TALKING;短号老乡网:DHLXW);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryCornetGroupMembers(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0043 成员加入短号群聊网(id:传短号群聊网业务标识：短号家庭网: FAMILY_TALKING;短号好友网:FRIEND_TALKING;短号老乡网:DHLXW)
     */
    public net.gmcc.fs.nwsc.ECOP.Result joinCornetGroupChatNetwork(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id, java.lang.String number, java.lang.String shortNumber) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0044 变更短号群聊网成员短号(id:传短号群聊网业务标识：短号家庭网: FAMILY_TALKING;短号好友网:FRIEND_TALKING;短号老乡网:DHLXW)
     */
    public net.gmcc.fs.nwsc.ECOP.Result changeMemberCornet(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id, java.lang.String number, java.lang.String shortNumber) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0045 删除短号群聊网成员(id:传短号群聊网业务标识：短号家庭网: FAMILY_TALKING;短号好友网:FRIEND_TALKING;短号老乡网:DHLXW)
     */
    public net.gmcc.fs.nwsc.ECOP.Result deleteCornetGroupChatMember(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id, java.lang.String number, java.lang.String shortNumber) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0053 余额主动查询接口(id：业务标识(ACCOUNTS_BALANCE_SEARCH_ACT);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result balanceActiveQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0069 积分/M值查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryPoint(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0075 全流量查询接口(querytype:服务标识(值填1，流量查询))
     */
    public net.gmcc.fs.nwsc.ECOP.Result flowqueryall(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String querytype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0076 宽带地址查询(cityname:所在城市(填写地市中文名称);districtname:所在区县/镇(填写区县/镇中文名称);address:详细地址(填写详细地址关键字);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result broadbandAddressQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String cityname, java.lang.String districtname, java.lang.String address) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0077 查询可用流量
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryAvailableTraffic(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0079 WLAN密码重置
     */
    public net.gmcc.fs.nwsc.ECOP.Result WLANPasswordReset(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0080 号码购机资格校验接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result numberQualificationCheck(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0081 IMEI自带机资格校验
     */
    public net.gmcc.fs.nwsc.ECOP.Result checkAgreeIMEI(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String imei) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0082 自带机下的产品类型及产品包查询(machineType:手机类型(3G：VIR_3GAGREEMENT;4G：VIR_AGREEMENT))
     */
    public net.gmcc.fs.nwsc.ECOP.Result productTypeAndProductPackageInquiry(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String machineType) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0083 自带机合约查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result selfMachineContractInquiry(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String proPackageId, java.lang.String heyueCycle) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0084 自带机合约办理(machineType:机型(3G：VIR_3GAGREEMENT;4G：VIR_AGREEMENT);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result bringMachineContractManagement(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String machineType, java.lang.String heyueId, java.lang.String imeiCode, java.lang.String proPackageId, java.lang.String heyueCycle) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0085 预存营销案预受理(ordertype:受理类型(0:办理(需要填入orderseq,fee,paytype);1:取消;10:预办理);orderseq:订单序列号(预办理生产返回的序列号);fee:费用(1、分；2、当付费方式为积分时，表示积分值。);paytype:支付类型(1
     * 现金;2 银行;3 转帐单;4 积分;5 刷卡;6 支票))
     */
    public net.gmcc.fs.nwsc.ECOP.Result preStorageMarketingCasePreAccepted(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String productid, java.lang.String productname, java.lang.String ordertype, java.lang.String orderseq, java.lang.String fee, java.lang.String paytype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0086 商品办理校验(existattr:是否存在附加属性(0:否;1:是);attr:产品属性组(existattr为1时,此项为必填);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result commodityVerification(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servernum, java.lang.String productid, java.lang.String productname, java.lang.String existattr, net.gmcc.fs.nwsc.ECOP.Attrinfo[] attr) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0087 全球通开户（paymode：付款模式（开户时使用，通过地市分册“ECOP_SERVICE_30565
     * B2M付费模式查询接口”获取开户主体产品可使用的付费模式。）;region:地市:填写地市首字母且为大写，如：广州，填写GZ；佛山，填写FS;optype:操作类型：0：订购;efftype:生效方式：2：立即;3：下月;0：默认值，按产品实际定义生效
     * ）
     */
    public net.gmcc.fs.nwsc.ECOP.Result globalOpenAccount(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String spassword, java.lang.String custname, java.lang.String servernum, java.lang.String password, java.lang.String paymode, java.lang.String imsi, java.lang.String iccid, java.lang.String custid, java.lang.String region, java.lang.String optype, java.lang.String prodid, java.lang.String packprodid, java.lang.String efftype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_0088 全球通开户订单提交(paytype:支付方式:1 现金;2 银行;3 转帐单;4
     * 积分;5 刷卡;6 支票)
     */
    public net.gmcc.fs.nwsc.ECOP.Result globalAccountOrderSubmission(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String fee, java.lang.String paytype, java.lang.String orderseq, java.lang.String servernum) throws java.rmi.RemoteException;

    /**
     * CUS_01_ECOP_SERVICE_30007 普通快速业务办理订单效验(custid:客户编码(个人\家庭\集团为客户编码。开户时，只支持老客户开户，不支持创建新客户。);custtype:客户类别(1：个人;2：家庭（暂不支持）;3：集团);servnumber:服务号码(集团产品号码或者个人手机号码，个人和集团改产品时必填.集团开户时为空。);optype:操作类型(0:订购;4:取消;2:修改产品服务附加属性;1:暂停;3:恢复;补充说明：除了修改产品的附加属性时，产品的操作类型=2外，若增加或删除产品包下的子产品，产品包的操作类型=2;当业务类型为：ChangeMain
     * 时，旧主体产品填：D 新主体产品填：N;5 赠送;6.索要;7 服务强制停;);prodid:产品编码/产品包编码(对原子产品进行操作时为产品编码（若原子产品属于产品包，产品包编码放置在packprodid节点）。当对产品包进行操作时为包编码。包下子产品在下面的subprodinfolist节点中;业务类型,当业务类型为：ChangeMain
     * 时，只需要填新旧主体产品编码，不需要填新旧主体产品下的附加产品(该限制只使用珠海过渡方案,到江门试点需要调整为不仅传新旧主体产品还包含新旧主体产品下的附加产品));efftype:生效方式(取值：2:立即;3:下月;0:默认值，按产品实际定义生效;对于订购：是生效方式;对于退订：是失效方式;对于修改：无意义;当业务类型为：ChangeMain
     * 时，默认填3下月))
     */
    public net.gmcc.fs.nwsc.ECOP.Result newCheckOrderInfor(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custtype, java.lang.String servnumber, java.lang.String optype, java.lang.String prodid, java.lang.String efftype) throws java.rmi.RemoteException;

    /**
     * CUS_02_ECOP_SERVICE_30007 自带机业务办理 订单效验(custtype:客户类别(1：个人;2：家庭（暂不支持）;3：集团)，optype：0:订购;4:取消;2:修改产品服务附加属性;1:暂停;3:恢复,efftype:生效方式(2:立即;3:下月;0:默认值)
     */
    public net.gmcc.fs.nwsc.ECOP.Result byodCheckOrderInfor(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custtype, java.lang.String servnumber, java.lang.String optype, java.lang.String prodid, java.lang.String efftype, java.lang.String subprodid, java.lang.String IMEI) throws java.rmi.RemoteException;

    /**
     * CUS_03_ECOP_SERVICE_30007 WALN密码重置业务
     */
    public net.gmcc.fs.nwsc.ECOP.Result resetWLANPwd(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber) throws java.rmi.RemoteException;

    /**
     * CUS_04_ECOP_SERVICE_30007 开户业务订单效验 订单效验(custtype:客户类别(1：个人;2：家庭（暂不支持）;3：集团)，optype：0:订购;4:取消;2:修改产品服务附加属性;1:暂停;3:恢复,efftype:生效方式(2:立即;3:下月;0:默认值)
     */
    public net.gmcc.fs.nwsc.ECOP.Result KHCheckOrderInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custype, java.lang.String servnumber, java.lang.String subName, java.lang.String uPassword, java.lang.String rectype, java.lang.String iscreateacct, java.lang.String paymode, java.lang.String authtype, java.lang.String prodchinfoJsonObject) throws java.rmi.RemoteException;

    /**
     * CUS_05_ECOP_SERVICE_30007 开户业务订单效验 订单效验(custtype:客户类别(1：个人;2：家庭（暂不支持）;3：集团)，optype：0:订购;4:取消;2:修改产品服务附加属性;1:暂停;3:恢复,efftype:生效方式(2:立即;3:下月;0:默认值)
     */
    public net.gmcc.fs.nwsc.ECOP.Result DKCheckOrderInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custype, java.lang.String servnumber, java.lang.String subName, java.lang.String uPassword, java.lang.String rectype, java.lang.String iscreateacct, java.lang.String paymode, java.lang.String authtype, java.lang.String prodchinfoJsonObject) throws java.rmi.RemoteException;

    /**
     * CUS_06_ECOP_SERVICE_30007 普通退订产品业务
     */
    public net.gmcc.fs.nwsc.ECOP.Result unsubscribeProduct(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custtype, java.lang.String servnumber, java.lang.String optype, java.lang.String subsprodid, java.lang.String prodid, java.lang.String efftype) throws java.rmi.RemoteException;

    /**
     * CUS_01_ECOP_SERVICE_30008 订购提交(custtype:客户类别(1：个人;2：家庭（暂不支持）;3：集团);paytype:付费方式(1
     * 现金;2 银行;3 转帐单;4 积分;5 刷卡;6 支票);fee:金额(1、分；2、当付费方式为积分时，表示积分值),attr:订单扩展信息系列;)
     */
    public net.gmcc.fs.nwsc.ECOP.Result newOrderSubmission(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custtype, java.lang.String paytype, java.lang.String fee, java.lang.String orderseq, net.gmcc.fs.nwsc.ECOP.Attrinfo[] attr) throws java.rmi.RemoteException;

    /**
     * CUS_01_ECOP_SERVICE_30005_30109 获取用户余额与品牌
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryMobileBrandABlance(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber) throws java.rmi.RemoteException;

    /**
     * Test
     */
    public java.lang.String a_HelloWorld() throws java.rmi.RemoteException;

    /**
     * 接入系统获取有效会话Token
     */
    public net.gmcc.fs.nwsc.ECOP.Result getToken(java.lang.String systemID, java.lang.String securityValue) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30002 客户鉴权
     */
    public net.gmcc.fs.nwsc.ECOP.Result checkPersonalFamilyAuth(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custtype, java.lang.String vertype, java.lang.String vertacct, java.lang.String key, java.lang.String value) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30004 客户信息查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result gotoneUserInfoGrading(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String custid) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30005 用户信息查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryCusterInfor(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String subsid, java.lang.String servnumber) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30006 订购关系查询(querytype:查询方式(0只查询有效信息;1查询所有订购信息;2下月生效;3当月生效;5基础语音套餐))
     */
    public net.gmcc.fs.nwsc.ECOP.Result saleRelationQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String querytype, java.lang.String servnumber, java.lang.String prodcode) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30007 订单校验(custtype:客户类别(1：个人;2：家庭（暂不支持）;3：集团);substype用户类型(只集团客户（custtype=3）使用1:组合产品用户;2:组合产品下子产品用户;3:非组合产品用户;组合产品:打包销售的主体产品包，组合产品会产生组合产品用户。);rectype:业务类型(用户级别上的业务受理类型。个人：开户：Install;产品变更：ChangeProduct;主体产品转换：ChangeMain;品牌转换：ChangeBrand;个人主体产品预开户：PreInstall（目前只有宽带388使用）;集团：开户:
     * GroupInstall;销户: GroupDropSubs;预约销户:PreDropGroupSubs;取消预约销户:PreDropGroupSubsCancel;产品变更:
     * GroupChangeProduct;产品暂停:StopUseGroupSubs;产品恢复:StopUseGroupSubsCancel);iscreateacct:是否创建用户帐号(1:是
     * 0:否 开户时使用);acctid：用户帐号(开户时使用，Iscreateacct=0时，表示使用老帐户。通过“CRM_IM_004客户信息查询”接口获取客户的老帐户列表。);authtype:服务方式(AuthCheckF
     * 密码+证件认证;AuthCheckB 服务密码认证;AuthCheckE 本人身份证件认证;AuthCheckA 随机短信密码认证;AuthCheckD
     * 凭有效证件;AuthCheckC 随机短信密码+服务密码;AuthCheckL 客户凭证件;AuthCheckM 客户凭密码;);ismpackage：产品列表是否多层包形式(0：非多层包，字段不传时默认为非多层包;1：多层包);ismpackage:产品列表是否多层包形式(0：非多层包，字段不传时默认为非多层包;1：多层包);optype:操作类型(0:订购;4:取消;2:修改产品服务附加属性;1:暂停;3:恢复;补充说明：除了修改产品的附加属性时，产品的操作类型=2外，若增加或删除产品包下的子产品，产品包的操作类型=2;当业务类型为：ChangeMain
     * 时，旧主体产品填：D 新主体产品填：N;5 赠送;6.索要;7 服务强制停;);subsprodid:用户产品实例编号(用户产品实例编号;订购(0)：请求报文为空;变更附加属性(2)或取消(4)：请求报文不为空);prodid:产品编码/产品包编码(对原子产品进行操作时为产品编码（若原子产品属于产品包，产品包编码放置在packprodid节点）。当对产品包进行操作时为包编码。包下子产品在下面的subprodinfolist节点中;业务类型;当业务类型为：ChangeMain
     * 时，只需要填新旧主体产品编码，不需要填新旧主体产品下的附加产品(该限制只使用珠海过渡方案,到江门试点需要调整为不仅传新旧主体产品还包含新旧主体产品下的附加产品));packageprodoid:用户产品包实例编号(ismpackage为0时非必传，为1时必传);efftype:生效方式(取值：2:立即;3:下月;0:默认值，按产品实际定义生效;对于订购：是生效方式;对于退订：是失效方式;对于修改：无意义;当业务类型为：ChangeMain
     * 时，默认填3下月);bookingfalg:是否预约订购(0：否;1：是);bookingtime:预约订购开始时间(格式：YYYYMMDDHH24MISS;当bookingfalg为1时必传。);poptype:操作类型(0:订购(0),服务附加属性值由空值变更为非空值;4:删除,服务附加属性值由非空修改为空;2:修改,附加属性值非空值变更非空值);paraused:资源预占标识(0:预占资源;1:不预占资源);platform:支付平台(weixin:微信;alipay:支付宝;);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result checkOrderInfor(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String spassword, java.lang.String custid, java.lang.String custtype, java.lang.String servnumber, java.lang.String subname, java.lang.String password, java.lang.String substype, java.lang.String rectype, java.lang.String iscreateacct, java.lang.String acctid, java.lang.String paymode, java.lang.String authtype, java.lang.String itemid, java.lang.String itemvalue, java.lang.String ismpackage, java.lang.String optype, java.lang.String subsprodid, java.lang.String prodid, java.lang.String packprodid, java.lang.String packageprodoid, java.lang.String efftype, java.lang.String usecycle, java.lang.String quantity, java.lang.String bookingfalg, java.lang.String bookingtime, java.lang.String serviceid, java.lang.String paraid, java.lang.String paravalue, java.lang.String optype1, java.lang.String paratype, java.lang.String paratypevalue, java.lang.String paraused, java.lang.String paravalue1, java.lang.String optype2, java.lang.String subsprodid1, java.lang.String prodid1, java.lang.String packprodid1, java.lang.String efftype1, java.lang.String usecycle1, java.lang.String quantity1, java.lang.String serviceid1, java.lang.String paraid1, java.lang.String paravalue2, java.lang.String optype3, java.lang.String paratype1, java.lang.String paratypevalue1, java.lang.String paraused1, java.lang.String paravalue3, java.lang.String payfornum, java.lang.String platform) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30008 订购提交(custtype:客户类别(1：个人;2：家庭（暂不支持）;3：集团);paytype:付费方式(1
     * 现金;2 银行;3 转帐单;4 积分;5 刷卡;6 支票);fee:金额(1、分；2、当付费方式为积分时，表示积分值))
     */
    public net.gmcc.fs.nwsc.ECOP.Result commitOrder(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custtype, java.lang.String paytype, java.lang.String fee, java.lang.String orderseq) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30009 订单信息查询(busitype:业务类型(Install：开户changeproduct：改产品;GroupMemberMgr集团成员管理))
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryOrderBaseInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String orderid, java.lang.String servnumber, java.lang.String custid, java.lang.String begintime, java.lang.String endtime, java.lang.String busitype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30010 订单详细信息查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryOrderDetailInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String orderid) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30026 费用计算
     */
    public net.gmcc.fs.nwsc.ECOP.Result checkOrderFee(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custtype, java.lang.String orderseq, java.lang.String feetype, java.lang.String fee) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30033 成员订单校验(custtype:客户类别(2：家庭;3：集团);opttype:操作类型(0-
     * 	开通 ;1-	暂停 ;2-	注销 ;3-	恢复 ;4-	修改（成员业务开通属性、产品属性）);smsconfirm:短信二次确认标识(0
     * 不需要二次确认;1 需要二次确认;可选参数，如果不传则按0 处理不需要二次确认);optype:操作类型(0-	开通 ;1-	暂停
     * ;2-	注销 ;3-	恢复 ;4-	修改（成员业务开通属性、产品属性）);payflag:计费标志(0：集团统付;1: 个人支付;成员属性的产品时可不填);efftype:生效方式(取值：立即(2),下月(3),默认(0)
     * ;对于订购：是生效方式;对于退订：是失效方式;对于修改：无意义;成员业务开通属性对应的产品生效方式填写默认 （0）);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result checkOrderMemberInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custid, java.lang.String custtype, java.lang.String productcode, java.lang.String opttype, java.lang.String membermobile, java.lang.String membernum, java.lang.String membername, java.lang.String memtype, java.lang.String smsconfirm, java.lang.String optype, java.lang.String subsprodid, java.lang.String prodid, java.lang.String packprodid, java.lang.String payflag, java.lang.String efftype, java.lang.String usecycle, java.lang.String serviceid, java.lang.String paraid, java.lang.String paravalue, java.lang.String optype1, java.lang.String paratype, java.lang.String paravalue1, java.lang.String optype2, java.lang.String subsprodid1, java.lang.String prodid1, java.lang.String packprodid1, java.lang.String payflag1, java.lang.String efftype1, java.lang.String usecycle1, java.lang.String serviceid1, java.lang.String paraid1, java.lang.String paravalue2, java.lang.String optype3, java.lang.String paratype1, java.lang.String paravalue3) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30037 包月量查询(type:类型(0全部类型;1表示剩余分钟数;2 表示 短信剩余条数;3
     * 表示 GPRS剩余资源;4 表示 彩信剩余条数;6 普通WLAN剩余分钟数;7 短号套餐剩余分钟数;8 区域WLAN剩余分钟数))
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryPackageUsed(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String type) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30039 预存返还查询(begintime:查询开始月份(格式：YYYYMM);endtime:查询结束月份(格式：YYYYMM;备注：预存返还时间，只能查
     * 包括当前月最近三个月的记录);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryUserDepositePayBack(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String begintime, java.lang.String endtime, java.lang.String prodid) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30044 SP定购关系查询(needquerysms:是否下发查询结果短信 1:是;0:否;)
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryUserSPRelation(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String needquerysms) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30047 查询成员所属集团产品信息
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryMemberGroupProdInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30049 订单撤销(paytype:退费方式(1 现金;2 积分))
     */
    public net.gmcc.fs.nwsc.ECOP.Result cancelOrder(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String orderseq, java.lang.String reason, java.lang.String paytype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30050 查询用户指定产品范围订购关系(querytype:查询方式(0只查询有效信息;1查询所有订购信息;2下月生效;3当月生效;4
     * 根据产品组查询有效订购;);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryUserProductOrderingRelations(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String prodcode, java.lang.String querytype, java.lang.String prodid, java.lang.String solutionid) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30054 产品展示详细信息查询(rectype:业务类型(个人：开户：Install;产品变更：ChangeProduct;集团：开户:
     * GroupInstall;销户: GroupDropSubs;预约销户:PreDropGroupSubs;取消预约销户:PreDropGroupSubsCancel;产品变更:
     * GroupChangeProduct;产品暂停:StopUseGroupSubs;产品恢复:StopUseGroupSubsCancel))
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryProdDetail(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String prodid, java.lang.String region, java.lang.String orgaid, java.lang.String servnumber, java.lang.String rectype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30055 随机密码生成(reqtype:请求类型(1、wlan随机密码;2、鉴权随机密码))
     */
    public net.gmcc.fs.nwsc.ECOP.Result getWLANRandomPwd(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String reqtype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30069 宽带密码验证(pwdtype:密码类型(当为1时“密码”是经过des加密的密文；当为0时“工号密码”是明文))
     */
    public net.gmcc.fs.nwsc.ECOP.Result checkKdPwd(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String aPassword, java.lang.String servnumber, java.lang.String password, java.lang.String pwdtype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30070 宽带端口重新绑定(stype:绑定类型(0解除绑定;1建立绑定;2端口重新绑定))
     */
    public net.gmcc.fs.nwsc.ECOP.Result kdPortreBind(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String stype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30071 宽带密码重置
     */
    public net.gmcc.fs.nwsc.ECOP.Result resetKDPassword(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30072 宽带与手机捆绑关系查询(accttype:帐号类型(0：KDAcctID为宽带帐号;1：KDAcctID为捆绑手机号))
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryKDBindMobile(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String kdacctid, java.lang.String begintime, java.lang.String endtime, java.lang.String accttype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30106 号码简要信息(projectcode:查询项目代码(固定为1))
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryUserBaseInfor(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String userno, java.lang.String projectcode) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30107 手机归属地查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryMobileLocal(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30109 查询客户帐户余额
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryCustomBalance(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String userno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30112 查询客户实时话费(projectcode:查询项目代码(0  查询 ‘用户实时话费’;1
     * 查询 ‘用户扣费流水’（默认返回最近3个月）);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryCustRealtimeFees2(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String projectcode) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30114 查询客户帐单(日期格式：YYYYMMDD)
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryCustomBill(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String userno, java.lang.String startdate, java.lang.String enddate) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30124 客户产品信息(projectcode:查询项目代码(8，产品信息))
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryCustomProductInfor(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String groupid, java.lang.String projectcode) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30126 总积分查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryTotalIntegral(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30127 积分交易平台积分扣减(type:扣减积分类型(0:基本积分,1:优惠积分;-1:不区别基本积分和优惠积分);sequence:外围系统交易序列号(当reason为105、106、123时此项必填);buscode:商户代码(当reason为105、106时此项必填))
     */
    public net.gmcc.fs.nwsc.ECOP.Result pointsIntegral(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String custid, java.lang.String deducepoint, java.lang.String type, java.lang.String reason, java.lang.String sequence, java.lang.String buscode) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30128 当前积分查询(qrydate:查询时间(YYYY  表示查询年度);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result gotoneGetCurrentIntegral(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String qrydate) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30140 号码-SIM卡数据对应关系查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result querySIMRelationInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String iccid) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30146 用户信息综合查询接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result querySubSintegratedInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30154 智能网用户查询余额及月结日期
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryBalanceAndBillDate(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30196 宽带客户信息查询(servnumber:宽带帐号(宽带帐号或身份证号至少1个必传);idno:身份证号(宽带帐号或身份证号至少1个必传);startdate和enddate:开始时间(YYYYMMDDhh24miss，QueryType为2、3时有效);querytype:查询类型(1客户基本信息;2客户优惠信息;3客户业务受理明细))
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryKDCustInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String servnumber, java.lang.String idno, java.lang.String address, java.lang.String startdate, java.lang.String enddate, java.lang.String querytype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30209 缴费记录查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryCustomChargeRecord(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String startdate, java.lang.String enddate) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30210 SIM卡信息(projectno:查询项目代码(17，卡信息);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result querySIMCardInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String projectno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30211 修改号码基本信息
     */
    public net.gmcc.fs.nwsc.ECOP.Result changeNumberBasicInfor(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30218 客户号码信息(projectcode:查询项目代码(7，号码信息);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryMobileBaseInformation(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String projectcode) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30226 密码验证(ncode:(1 验证服务密码))
     */
    public net.gmcc.fs.nwsc.ECOP.Result servicePasswordAuth(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String ncode, java.lang.String spassword, java.lang.String remark) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30230 一证多机查询接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryOneCertmulmachine(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String certtype, java.lang.String certid) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30266 帐单、清单定制查询接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result querySubAccountListInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30269 智能网用户月结话费查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryCustMonthCharge(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String date) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30270 智能网用户月结话费查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryUserMonthCharge(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String date) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30293 优惠资格查询客服接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryUserDiscountQualify(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30324 查询客户欠费
     */
    public net.gmcc.fs.nwsc.ECOP.Result gotoneNonPayQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30326 查询用户档案
     */
    public net.gmcc.fs.nwsc.ECOP.Result gotoneGetUserInfo(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30336 按月查清单
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryMonthInventoryList(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String month, java.lang.String type) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30338 新增清单效验码生成命令字
     */
    public net.gmcc.fs.nwsc.ECOP.Result intelligenceNetGetMusterEfficacyCode(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30339 随机效验码验证命令字
     */
    public net.gmcc.fs.nwsc.ECOP.Result intelligenceNetMusterEfficacyCodeEfficacy(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String authcode) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30383 激活(permitunactive:是否允许生成状态制作备卡(1 允许;0 不允许))
     */
    public net.gmcc.fs.nwsc.ECOP.Result commitCardActivation(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String cardtype, java.lang.String permitunactive) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30387 修改清单、账单、发票邮寄定制/取消(ncode:(1--申请;0-取消;2-查询);ope_type:(1-账单;2-清单;3-发票))
     */
    public net.gmcc.fs.nwsc.ECOP.Result gotonePostalServiceApply(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String ncode, java.lang.String ope_type) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30388 身份证验证
     */
    public net.gmcc.fs.nwsc.ECOP.Result gotoneIDCardCheck(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String personid) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30403 修改HLR 数据(ncode:(1 ：比较修改;2 ：强制修改))
     */
    public net.gmcc.fs.nwsc.ECOP.Result alterHLRdata(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String ncode, java.lang.String remarks) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30404 营业工单记录查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryWorkList(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String startdate, java.lang.String enddate) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30405 营业记录对比信息
     */
    public net.gmcc.fs.nwsc.ECOP.Result compareBussRecord(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String orderid) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30406 查询客户帐单明细
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryCustomBillDetail(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String startdate, java.lang.String enddate) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30423 大客户资料接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result gotoneBigCustInfoQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30450 根据成员手机号码查询集团客户基本信息
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryGroupInfoMemberNum(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30452 用户是否预出及已产生话费余额查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryGsmMess(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30518 积分交易平台退积分(type:退积分类型(0:基本积分,1:优惠积分;-1:不区别基本积分和优惠积分))
     */
    public net.gmcc.fs.nwsc.ECOP.Result backIntegral(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String bossseqno, java.lang.String type, java.lang.String reason) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30519 积分交易平台积分查询(integralcircle:积分周期(格式YYYY ，或者为'-1'代表查询该客户所有积分周期的积分信息);integraltype:积分类型(0:基本积分,1:优惠积分，2:不区别基本积分和优惠积分);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result currentIntegralQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String custid, java.lang.String integralcircle, java.lang.String integraltype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30520 积分兑奖记录查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryUserIntegralPrizeRecord(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30536 停开机接口(ncode:操作类型(11：停机;12：开机);stype:服务类型(1：申请停机;2：强制停机
     * ;3：报失停机 ;5: 欠费停机;6：申请开机;7：强制开机;8：报失开机;9: 单边开机;10: 缴费开机;13: 紧急开机))
     */
    public net.gmcc.fs.nwsc.ECOP.Result applyServiceModify(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String ncode, java.lang.String stype, java.lang.String remark) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30564 B2M获取IMSI接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryIMSIData(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String cardid, java.lang.String number, java.lang.String puk) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30565 B2M付费模式查询接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryPayTypeInfoForMobile(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String productid) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30574 号码暂选接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result telnumTmpPick(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String orgid, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30575 释放暂选号码
     */
    public net.gmcc.fs.nwsc.ECOP.Result unTelnumTmpPick(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String orgid, java.lang.String mobileno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30585 用户与用户关系查询(relatetype:关系类型(sbrtyjt	一键通关系;sbrtyksh
     * 	一卡双号关系;sbrtip;	ip直通车关系;sbrtsex	随e卡捆绑关系;sbrtqqk	超级亲情卡捆绑;sbrtd100	动力100捆绑全球通;sbrtmid
     * 	mid主副号关系;sbrtykdh	一卡多号关系;sbrtfriend	汕头亲情卡关系;sbrtspgift	sp赠送;sbrthx
     * 号携主副号关系;all 全部))
     */
    public net.gmcc.fs.nwsc.ECOP.Result querySubSrelation(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String region, java.lang.String relatetype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30588 个人客户开户接口(gender:客户性别(0	女;1 男);country:国家/地区(China
     * 	中国;Hongkong	中国香港;Macao	中国澳门;Taiwan	中国台湾;America	美国;Japan	日本;ElseCountry
     * 	其他))
     */
    public net.gmcc.fs.nwsc.ECOP.Result personcustInstall(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String useraccount, java.lang.String custname, java.lang.String certtype, java.lang.String certid, java.lang.String certaddress, java.lang.String llinkman, java.lang.String linkphone, java.lang.String address, java.lang.String paraid, java.lang.String paravalue, java.lang.String shortname, java.lang.String gender, java.lang.String linkaddress, java.lang.String postcode, java.lang.String country, java.lang.String nation, java.lang.String delegatename, java.lang.String delegateidtype, java.lang.String delegateid, java.lang.String delegateaddr, java.lang.String delegatephone) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30589 宽带账号查询接口(queryway:查询方式(0 随机选号 1 条件选号);condition:查询条件(如果查询方式为1
     * 条件选号，则需要输入该条件，否则为空)：0匹配号码头3位  1匹配号码尾4位;)
     */
    public net.gmcc.fs.nwsc.ECOP.Result broadbandAccountQuery(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String queryway, java.lang.String condition, java.lang.String value, java.lang.String num) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30598 白卡IMSI解捆绑接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result releaseBasiSimForCardID(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String cardid) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30600 智能网用户话费返还记录查询
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryPreDepositrec(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String begdate, java.lang.String enddate) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30606 黑名单用户查询(手机号码或者证件号码;最少有一个不为空;当证件号码不为空时证件类型必须填写;证件类型参阅字典组中字典标识)
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryBlackList(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String certid, java.lang.String idno) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30619 按日期查清单(startdate:查询开始日期(YYYYMMDD);enddate:查询结束日期(YYYYMMDD);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryUserBillByDate(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String startdate, java.lang.String enddate) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30675 电子渠道号码预约接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result orderEChannelNumber(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String telnum, java.lang.String bookchannel, java.lang.String booknum, java.lang.String certtype, java.lang.String certnum, java.lang.String custname, java.lang.String certaddr, java.lang.String linkphone, java.lang.String postcode, java.lang.String precontracttimes, java.lang.String ishallps, java.lang.String dutyusername, java.lang.String gender, java.lang.String certid, java.lang.String certtype1, java.lang.String certaddr1, java.lang.String linkphone1) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30676 BOSS接口取消号码预订接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result orderEChannelCancelNumber(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String telnum, java.lang.String bookchannel, java.lang.String booknum, java.lang.String certtype, java.lang.String certnum) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30750 客户真实身份登记接口(source:登记来源(1:社会渠道短信登记;11:跨市社会渠道短信登记;2:社会渠道代办系统登记;12:跨市社会渠道代办系统登记;3:网站售卡登记;4:其他);region:发起方地区(source为11、12时必填，格式发起方地区号，如200
     * 广州;755深圳);wayid:发起方社会渠道编码(source为11、12时必填可通过【CRM_IM_148社会渠道信息查询】获取))
     */
    public net.gmcc.fs.nwsc.ECOP.Result customerRegister(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String source, java.lang.String region, java.lang.String wayid, java.lang.String officetel, java.lang.String mobileno, java.lang.String name, java.lang.String certtype, java.lang.String certid, java.lang.String certaddress, java.lang.String delegatename, java.lang.String delegateidtype, java.lang.String delegateid, java.lang.String delegateaddr, java.lang.String delegatephone, java.lang.String gender, java.lang.String nation, java.lang.String birthday, java.lang.String issuingauthority, java.lang.String certvaliddate, java.lang.String certexpdate, java.lang.String dutyusername, java.lang.String dgender, java.lang.String dcertid, java.lang.String dcerttype, java.lang.String certaddr) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30751 客户真实身份退登记接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result customerRegisterRollback(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String certtype, java.lang.String certid) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30752 统一流量查询接口（电子渠道）(querytype:查询类型(0：查询用户所有免费资源;1：查询用户语音类免费资源;2：查询用户信息类免费资源;3：查询用户上网类免费资源;4：查询用户套餐免费金额资源;5：查询用户WLAN类资源（包括普通WLAN、区域WLAN剩余时长）;6：查询流量充值卡;7：灵活账期流量;8：查询4G数据卡;9：查询流量转移可用余额;10：专网专号查询
     * 新增);)
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryAll(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String querytype) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30772 备卡申请接口(permitunactive:是否允许生成状态制作备卡（1 允许;0
     * 不允许）)
     */
    public net.gmcc.fs.nwsc.ECOP.Result standbyGet(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String mobileno, java.lang.String simid, java.lang.String stationid, java.lang.String permitunactive) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30953 电渠获取身份证相片接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result getIDCardImg(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String custname, java.lang.String certid) throws java.rmi.RemoteException;

    /**
     * ECOP_SERVICE_30983 历史电子发票查询接口
     */
    public net.gmcc.fs.nwsc.ECOP.Result queryHistorIcaleInvoice(java.lang.String operatorID, java.lang.String systemID, java.lang.String accountID, java.lang.String password, java.lang.String applyoid, java.lang.String servnumber, java.lang.String startdate, java.lang.String enddate) throws java.rmi.RemoteException;
}
