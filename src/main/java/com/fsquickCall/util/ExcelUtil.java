package com.fsquickCall.util;

import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import com.fsquickCall.model.User;

public class ExcelUtil {	
	
	public static Workbook fillExcelDataWithTemplate(List <User> userlist,String templateFileName)throws Exception{
		InputStream inp=ExcelUtil.class.getResourceAsStream(templateFileName);
		POIFSFileSystem fs=new POIFSFileSystem(inp);
		Workbook wb=new HSSFWorkbook(fs);
		Sheet sheet=wb.getSheetAt(0);
		
		//int cellNums=sheet.getRow(0).getLastCellNum();
		int rowIndex=1;		
		for(int i = 0 ; i < userlist.size() ; i++) {
			Row row=sheet.createRow(rowIndex++);		
			row.createCell(0).setCellValue(userlist.get(i).getName());
			row.createCell(1).setCellValue(userlist.get(i).getPhone());
			row.createCell(2).setCellValue(userlist.get(i).getPlan());
			row.createCell(3).setCellValue(userlist.get(i).getNote());			
		}		
		return wb;
	}
		      	
	
	public static String formatCell(HSSFCell hssfCell){
		if(hssfCell==null){
			return "";
		}else{			  						
			if(hssfCell.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN){
				return String.valueOf(hssfCell.getBooleanCellValue());
			}else if(hssfCell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
				hssfCell.setCellType(hssfCell.CELL_TYPE_STRING);
				return hssfCell.getStringCellValue();
			}else{
				return String.valueOf(hssfCell.getStringCellValue());
			} 
			
	
		}
	}
}
