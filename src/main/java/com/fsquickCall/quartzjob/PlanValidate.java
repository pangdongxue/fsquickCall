package com.fsquickCall.quartzjob;

import java.rmi.RemoteException;
import java.util.Map;

import com.fsquickCall.model.User;
import com.fsquickCall.util.ECOPUtils;

import net.gmcc.fs.nwsc.ECOP.Result;

public class PlanValidate {
	
	public final static String systemId = "__FSMobile-ABOSS__" ;
	public final static String userName="ABOSS" ;
	public final static String password="ABOSS123" ;
	public final static String secretKey="Yy#77x#9";

	public static void validate(User user) throws RemoteException, Exception{
		//ECOP30007
		Result orderCheckResult = ECOPUtils.getEcopService().newCheckOrderInfor("", systemId, userName, password, "", "1", user.getPhone(), "0", user.getPlanid(), "0");
		Map<String, Object> map2 = ECOPUtils.UnPackageXml(orderCheckResult.getMessage());
		if (map2.get("msgheader.retinfo.retcode") != "0") {
			user.setNote(map2.get("msgheader.retinfo.retmsg").toString());						
		}    			
	}
}
