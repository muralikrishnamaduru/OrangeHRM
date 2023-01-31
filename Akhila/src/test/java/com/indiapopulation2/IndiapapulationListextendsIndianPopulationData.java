package com.indiapopulation2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IndiapapulationListextendsIndianPopulationData {
	
	WebDriver driver;
	@Test
	public void indiapopulationdata() throws IOException
	{

		FileInputStream file=new FileInputStream("./src/test/java/comtsrctApplication23/Excel_WriteOperation.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		
	
	// Population of India (2020 and historical)
		///html/body/div[3]/div[3]/div/div/div[5]
		///html/body/div[3]/div[3]/div/div/div[5]
		
		
		
		WebElement indiapopulation=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[5]"));
		List<WebElement>tablerows=indiapopulation.findElements(By.tagName("tr"));
		int tablerows_length=tablerows.size();
		System.out.println(tablerows_length);
		String data=indiapopulation.getText();
		System.out.println(data);
	
		for(int i=0;i<tablerows_length;i++)
		{
			
			Row row=sheet.createRow(i);
			
			List<WebElement>tablecells=tablerows.get(i).findElements(By.tagName("td"));
			int tablecells_length=tablecells.size();
			System.out.println(tablecells_length);
			for(int j=0;j<tablecells_length;j++)
			{
				
				Cell cell=row.createCell(j);
				
				String data1=tablecells.get(j).getText();
				System.out.println(data1);
				cell.setCellValue(data1);	
				
    		
			
			FileOutputStream file1=new FileOutputStream("./src/test/java/comtsrctApplication23/Excel_WriteOperation.xlsx");
			workbook.write(file1);
			
	}
    }
	}
	}


