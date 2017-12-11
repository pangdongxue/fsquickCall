package com.fsquickCall.controller;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fsquickCall.model.Staff;
import com.fsquickCall.model.User;
import com.fsquickCall.quartzjob.PlanValidate;
import com.fsquickCall.service.Userservice;
import com.fsquickCall.util.ExcelUtil;
import com.fsquickCall.util.ResponseUtil;
import com.fsquickCall.util.StringUtil;

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
    public  void userList(HttpServletRequest request,HttpServletResponse response,Model model) throws Exception{  
        response.setContentType("application/json; charset=utf-8");  
        //求得开始记录与结束记录  
        
        int page = request.getParameter("page") == null ?
                1 : Integer.parseInt(request.getParameter("page"));
        int rows = request.getParameter("rows") == null ? 
                10 : Integer.parseInt(request.getParameter("rows"));
        int start = (page-1)*rows;  
        int end = page * rows; 
        //筛选条件
        String name = request.getParameter("name") == null ? 
                "" : request.getParameter("name");
        String phone = request.getParameter("phone") == null ? 
                "" : request.getParameter("phone");
        //调用服务
        List<User> users = userservice.getAllUsers(start, end, name, phone); 
        
        //把总记录和当前记录写到前台  
        JSONObject result=new JSONObject();
        int total = userservice.getCount(name, phone);            
        List<User> userlist=userservice.getAllUsers(start, end, name, phone);        
        JSONArray jsonArray=JSONArray.fromObject(userlist);		             
        result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response,result); 
    }  
    
    @RequestMapping("/addUser")  
    public void addUser(HttpServletRequest request,User user){   
        userservice.addUser(user);  
    }
    
    @RequestMapping("/userSave")
    public void userSave( User user, HttpServletRequest request, HttpServletResponse response) throws RemoteException, Exception{
    	int id =user.getId();
    	if(id!=0){
			user.setId(id);
		}
    	PlanValidate.validate(user);
		try{
			int saveNums=0;
			JSONObject result=new JSONObject();
			if(id!=0){
				saveNums=userservice.updateUser(user);
			}else{
				saveNums=userservice.addUser(user);
			}
			if(saveNums>0){
				result.put("success", "true");
			}else{
				result.put("success", "true");//业务逻辑,需要返回success，但返回的是错误message
				result.put("errorMsg", "保存失败");
			}
			ResponseUtil.write(response, result);
		}catch(Exception e){
			e.printStackTrace();
		}
    }
    
    
    @RequestMapping(value = "/userDelete", method = RequestMethod.POST)
    @ResponseBody
    public void delete(@RequestParam(value="delIds") String delIds,HttpServletRequest request, HttpServletResponse response)throws Exception{
    	response.setContentType("application/json; charset=utf-8"); 
    	try{
			JSONObject result=new JSONObject();
			String[] idStr = delIds.split(",");
			for (String id : idStr) {
				userservice.deleteUserById(Integer.parseInt(id));
	        }
			
				result.put("success", "true");
				result.put("delNums", idStr.length);
			
			ResponseUtil.write(response, result);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
        
    /**
     * 导出Excel文件
     * @param request
     * @param response
     * @param user
     * @throws Exception
     */
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
