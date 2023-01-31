package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelcommmonMethods {
	
	String ExcelFileinputpath;
	String ExcelFileoutputpath;
	String SheetName;
	XSSFWorkbook workbook;
	public void getcellvalue(String ExcelFileinputpath,String ExcelFileoutputpath) throws IOException {
	
		
		
		this.ExcelFileinputpath=ExcelFileinputpath;
		this.ExcelFileoutputpath=ExcelFileoutputpath;
		this.SheetName=SheetName;
		FileInputStream file=new FileInputStream(ExcelFileinputpath);
		workbook=new workbook(file);

	
	public String getcellvalue(int rowindex,int cellindex) {	
	
	
	
	
	
	}	
}
