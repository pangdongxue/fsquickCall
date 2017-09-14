package com.fsquickCall.controller;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fsquickCall.model.Staff;
import com.fsquickCall.model.User;
import com.fsquickCall.service.Userservice;
import com.fsquickCall.util.ECOPUtils;
import com.fsquickCall.util.ExcelUtil;
import com.fsquickCall.util.ResponseUtil;
import com.fsquickCall.util.StringUtil;

import net.gmcc.fs.nwsc.ECOP.Result;
import net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultOfLoginResult;
import net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOLocator;
import net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.SSOSoapStub;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@Controller
@RequestMapping("/user")
public class StaffController {
		
	@Autowired
	private Userservice userservice;
		
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Staff staff, HttpServletRequest request, HttpServletResponse response) throws RemoteException{
		if(StringUtil.isEmpty(staff.getStaffName())||StringUtil.isEmpty(staff.getPassword())){
			request.setAttribute("errorMsg", "用户名或密码为空！");
			return "index";
		}
		
		SSOLocator Locator = null;  
		SSOSoapStub stub = null;  
		java.net.URL url = null;
		Locator = new SSOLocator();  				   
		try {
			url = new java.net.URL(" http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx?WSDL");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 				   
		
		stub = new SSOSoapStub(url,Locator);
		ResultOfLoginResult ssocheckRes = stub.loginCheck2("__FSMobile-ABOSS__", "ABOSS", "ABOSS123",
		staff.getStaffName(), staff.getPassword());				
		if (ssocheckRes.getDetail().getReturnValue() != 0) {																		
			request.setAttribute("errorMsg", "用户名或密码错误！");					
			return "index";
		}else {
			HttpSession session=request.getSession();
			session.setAttribute("currentStaff", staff);					
			return "userinfo";
		}	
	}

	
	/** 
     * 客户列表,根据当前页和记录数 
     * @param page 当前页 
     * @param rows 页面记录数 
     * @param response  
     * @param model 
	 * @throws Exception 
     */  
    @RequestMapping("/userList")  
    @ResponseBody 
    public  void userList(int page,int rows,HttpServletResponse response,Model model) throws Exception{  
        response.setContentType("application/json; charset=utf-8");  
        //求得开始记录与结束记录  
        int start = (page-1)*rows;  
        int end = page * rows;  
        //把总记录和当前记录写到前台  
        JSONObject result=new JSONObject();
        int total = userservice.usersList().size();            
        List<User> userlist=userservice.usersListByPage(start, end);        
        JSONArray jsonArray=JSONArray.fromObject(userlist);		             
        result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response,result); 
    }  
    
    @RequestMapping("/addUser")  
    public void addUser(HttpServletRequest request,User user){   
        userservice.addUser(user);  
    }
        
    
    @RequestMapping("/exportExcel") 
    public void export2(HttpServletRequest request, HttpServletResponse response,User user) throws Exception{
    	Staff currentStaff = (Staff) request.getSession().getAttribute("currentStaff");
    	System.out.println("员工账号"+currentStaff.getStaffName());
		List<User> userlist=userservice.usersList();		
		Workbook wb=ExcelUtil.fillExcelDataWithTemplate(userlist, currentStaff, "userExporTemplate.xls");		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String filename = "推荐方案_" + sdf.format(new Date()).toString() + ".xls";
		ResponseUtil.export(response, wb, filename);
    }
	
    @RequestMapping("/uploadExcel")
	@SuppressWarnings("resource")
	public String upload(@RequestParam("userUploadFile") MultipartFile userUploadFile ,HttpServletRequest request,HttpServletResponse response)throws Exception{		    	    	    	    	   
    	String filePath=request.getSession().getServletContext().getRealPath("/");
    	int random = (int) (Math.random() * 1000);
    	java.util.Date dt = new java.util.Date(System.currentTimeMillis());  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");  
        String time = sdf.format(dt);
    	String newFileName = time + random + ".xls" ;
    	File userfile = new File(filePath+"uploadfile/"+newFileName);
    	userUploadFile.transferTo(userfile);				
		JSONObject result=new JSONObject();
		result.put("success", "true");
		ResponseUtil.write(response, result);
		
		return null;
	}
}
