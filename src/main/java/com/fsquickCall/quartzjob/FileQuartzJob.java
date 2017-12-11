package com.fsquickCall.quartzjob;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fsquickCall.model.User;
import com.fsquickCall.service.Userservice;
import com.fsquickCall.util.ECOPUtils;
import com.fsquickCall.util.ExcelUtil;

import net.gmcc.fs.nwsc.ECOP.Result;

public class FileQuartzJob {
	
	public final static String systemId = "__FSMobile-ABOSS__" ;
	public final static String userName="ABOSS" ;
	public final static String password="ABOSS123" ;
	
	@Autowired
	private Userservice userservice;
	
    public void doFileJob() throws Exception{  
    	
    	Logger log = LoggerFactory.getLogger(this.getClass());        
    	log.info("【开始】定时任务开始"); 
    	  	
    	User user = new User();   	
    	//File file = new File ("D:\\java-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\fsquickCall\\uploadfile\\匹配后的推荐方案.xls");
    	
    	String path="D:/java-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/fsquickCall/uploadfile";
    	File file=new File(path);
    	File[] fileList = file.listFiles();
    	  //System.out.println("该目录下对象个数："+tempList.length);
    	for (int i = 0; i < fileList.length; i++) {
    	   if (fileList[i].isFile()) {  		   
    		    POIFSFileSystem fs=new POIFSFileSystem(new FileInputStream(fileList[i]));	
    	    	//System.out.println("wodepipeifangan");  
    			HSSFWorkbook wb=new HSSFWorkbook(fs);
    			HSSFSheet hssfSheet=wb.getSheetAt(0);  // 获取第一个Sheet页
    			if(hssfSheet!=null){
    				for(int rowNum=1;rowNum<=hssfSheet.getLastRowNum();rowNum++){
    					HSSFRow hssfRow=hssfSheet.getRow(rowNum);
    					if(hssfRow==null){
    						continue;
    					}
    					user.setLoginid(ExcelUtil.formatCell(hssfRow.getCell(0)));	
    					user.setName(ExcelUtil.formatCell(hssfRow.getCell(1)));				
    					user.setPhone(ExcelUtil.formatCell(hssfRow.getCell(2)));
    					user.setPlanid(ExcelUtil.formatCell(hssfRow.getCell(3)));
    					user.setPlan(ExcelUtil.formatCell(hssfRow.getCell(4)));
    					user.setNote(ExcelUtil.formatCell(hssfRow.getCell(5)));
    		
    					PlanValidate.validate(user);
    					userservice.addUser(user);			
    				}
    			}   		   
    	   	}   	  
    	}
   
        System.out.println("---------定时任务结束-------------");  
       
    }  
  

}
