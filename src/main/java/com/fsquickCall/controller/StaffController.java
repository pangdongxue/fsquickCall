package com.fsquickCall.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.fsquickCall.model.Staff;
import com.fsquickCall.model.User;
import com.fsquickCall.service.Staffservice;
import com.fsquickCall.service.Userservice;
import com.fsquickCall.util.ExcelUtil;
import com.fsquickCall.util.ResponseUtil;
import com.fsquickCall.util.StringUtil;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@Controller
@RequestMapping("/user")
public class StaffController {

	@Autowired
	private Staffservice staffservice;
	
	@Autowired
	private Userservice userservice;
		
	@RequestMapping("/login")
	public String login(Staff staff,HttpServletRequest request){
		if(StringUtil.isEmpty(staff.getStaffName())||StringUtil.isEmpty(staff.getPassword())){
			
			request.setAttribute("errorMsg", "用户名或密码为空！");
			return "index";
		}
		
		Staff resultStaff=staffservice.login(staff);
		if(resultStaff==null){
			request.setAttribute("staff", staff);
			request.setAttribute("errorMsg", "用户名或密码错误！");
			return "index";
		}else{
			HttpSession session=request.getSession();
			session.setAttribute("currentStaff", resultStaff);
			return "redirect:/userinfo.jsp";
		}
	}
	
	/** 
     * 用户列表,根据当前页和记录数 
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
        System.out.print(total);
        
        List<User> userlist=userservice.usersListByPage(start, end);
        
        JSONArray jsonArray=JSONArray.fromObject(userlist);		
         
        System.out.print(total);
        result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response,result); 
    }  
    
    
    @RequestMapping("/addUser")  
    public void addUser(HttpServletRequest request,User user){   
        userservice.addUser(user);  
    }
    
    @RequestMapping("/exportExcel") 
    public void export2(HttpServletResponse response,User user) throws Exception{
		List<User> userlist=userservice.usersList();
		System.out.println(userlist.get(0).getPlan());
		Workbook wb=ExcelUtil.fillExcelDataWithTemplate(userlist, "userExporTemplate.xls");
		ResponseUtil.export(response, wb, "匹配后的推荐方案.xls");
    }
	
    @RequestMapping("/uploadExcel")
	@SuppressWarnings("resource")
	public String upload(@RequestParam("userUploadFile") MultipartFile userUploadFile ,HttpServletRequest request,HttpServletResponse response)throws Exception{		
    	
    	
    	User user = new User();
    	String filePath=request.getSession().getServletContext().getRealPath("/");
    	File userfile = new File(filePath+"uploadfile/"+userUploadFile.getOriginalFilename());
    	userUploadFile.transferTo(userfile);		
		POIFSFileSystem fs=new POIFSFileSystem(new FileInputStream(filePath+"uploadfile/"+userUploadFile.getOriginalFilename()));		
		HSSFWorkbook wb=new HSSFWorkbook(fs);
		HSSFSheet hssfSheet=wb.getSheetAt(0);  // 获取第一个Sheet页
		if(hssfSheet!=null){
			for(int rowNum=1;rowNum<=hssfSheet.getLastRowNum();rowNum++){
				HSSFRow hssfRow=hssfSheet.getRow(rowNum);
				if(hssfRow==null){
					continue;
				}
				user.setName(ExcelUtil.formatCell(hssfRow.getCell(0)));				
				user.setPhone(ExcelUtil.formatCell(hssfRow.getCell(1)));						
				user.setPlan(ExcelUtil.formatCell(hssfRow.getCell(2)));
				user.setNote(ExcelUtil.formatCell(hssfRow.getCell(3)));
				userservice.addUser(user);			
			}
		}
		JSONObject result=new JSONObject();
		result.put("success", "true");
		ResponseUtil.write(response, result);
		if(userfile.exists()){
			userfile.delete();
		}
		return null;
	}
}
