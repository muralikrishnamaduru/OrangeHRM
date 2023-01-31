package com.OHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OHRM_AddEmployeeList {

	public static void main(String[] args) throws IOException, InterruptedException {

		
	
		WebDriver driver;
		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
        driver= new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("muralikrishna");
		driver.findElement(By.name("txtPassword")).sendKeys("A@1muralikrishna");
		driver.findElement(By.className("button")).click();
		// driver1.quit();

		By welcomeAdmin=By.id("welcome");
		WebElement welcomeAdmin1=driver.findElement(welcomeAdmin);
		welcomeAdmin1.click();
		
		
		WebElement headerBlock=driver.findElement(By.className("menu"));
		List<WebElement>headerlinks=headerBlock.findElements(By.tagName("b"));
		int headerLinks_length=headerlinks.size();
		System.out.println(headerLinks_length);
		String OHRM=headerBlock.getText();
		System.out.println(OHRM);
		for(int i=0;i<headerLinks_length;i++)
		{
			String headerlinkName=headerlinks.get(i).getText();
		    System.out.println(i+" "+headerlinkName);
		    
			/*
			 * 
			 * Select selection=new Select(headerBlock); selection.selectByIndex(i);
			 * selection.selectByVisibleText(headerlinkName);
			 */
		    
		    
		    
		    headerlinks.get(i).click();
		    
		    System.out.println(driver.getCurrentUrl());
		    System.out.println(driver.getTitle());
		    System.out.println();
		    driver.navigate().back();
		    
			Thread.sleep(10000);
			
			 File OrangeHRMS=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(OrangeHRMS, new File("./screenchort/"+headerlinkName+".png"));
			 
			 
			 
		
		
		
		}
		
		
		
		
		
		
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * By pimElement=By.id("menu_pim_viewPimModule"); WebElement
		 * pimElement1=driver.findElement(pimElement);
		 * 
		 * 
		 * Actions action=new Actions(driver);
		 * action.moveToElement(pimElement1).build().perform();
		 * 
		 * Thread.sleep(5000); action.sendKeys(Keys.TAB).build().perform();
		 * 
		 * 
		 * 
		 * 
		 * By AddEmployeeList=By.id("menu_pim_viewEmployeeList"); WebElement
		 * addEmployee1=driver.findElement(AddEmployeeList); addEmployee1.click();
		 * 
		 * 
		 * 
		 * //Thread.sleep(5000);
		 * 
		 * FileInputStream file=new
		 * FileInputStream("./src/com/OHRM/OHRM MultipleData.xlsx"); XSSFWorkbook
		 * workbook=new XSSFWorkbook(file); XSSFSheet sheet=workbook.getSheet("Sheet3");
		 * 
		 * 
		 * //frmList_ohrmListComponent
		 * 
		 * WebElement
		 * addEmployeelist=driver.findElement(By.id("frmList_ohrmListComponent"));
		 * List<WebElement>tablerows=addEmployeelist.findElements(By.tagName("tr")); int
		 * tablerows_length=tablerows.size(); System.out.println(tablerows_length);
		 * String data=addEmployeelist.getText(); System.out.println(data);
		 * 
		 * for(int i=0;i<tablerows_length;i++) {
		 * 
		 * Row row=sheet.createRow(i);
		 * 
		 * List<WebElement>tablecells=tablerows.get(i).findElements(By.tagName("td"));
		 * 
		 * int tablecells_length=tablecells.size();
		 * System.out.println(tablecells_length);
		 * 
		 * 
		 * for(int j=0;j<tablecells_length;j++) {
		 * 
		 * 
		 * Cell cell=row.createCell(j);
		 * 
		 * String data1=tablecells.get(j).getText(); System.out.println(data1);
		 * cell.setCellValue(data1); } FileOutputStream file1=new
		 * FileOutputStream("./src/com/OHRM/OHRM MultipleData.xlsx");
		 * workbook.write(file1); }
		 */
		///html/body/div[1]/div[3]/div[2]/div/form

		/*WebElement addEmployeelist=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form"));
		List<WebElement>tableRows=addEmployeelist.findElements(By.name("tr"));
		int tableRows_leangth=tableRows.size();
		System.out.println(tableRows_leangth);
		String data=addEmployeelist.getText();
		System.out.println(data);

		for(int i=0;i<tableRows_leangth;i++)
		{
		Row row=sheet.createRow(i);

		// By xpathRowLocator=By.xpath(xpathExpresstionPart1+i+xpathExpresstionPart2);
		//  WebElement xpathRow=driver.findElement(xpathRowLocator);
		List<WebElement>tebleCells=tableRows.get(i).findElements(By.tagName("td"));
		int tableCells_leangth=tebleCells.size();
		System.out.println(tableCells_leangth);
		for(int j=0;j<tableCells_leangth;j++)
		{

		Cell cell=row.createCell(j);
		String data1=tebleCells.get(j).getText();
		System.out.println(data1);
		cell.setCellValue(data1);
		//FileOutputStream file1=new FileOutputStream("data");
		//workbook.write(file1);
		*/
		//FileOutputStream file1=new FileOutputStream("./src/com/OHRM/OHRM MultipleData.xlsx");
		//workbook.write(file1);
		}
}



		

