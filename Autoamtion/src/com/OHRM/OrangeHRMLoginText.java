package com.OHRM;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMLoginText {

	
		
		WebDriver driver;
		@BeforeTest
		public void setup()
		{
		String ApplicatinUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicatinUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		@AfterTest
		public void teardown()
		{
			driver.close();
		}
		@Test
		public void OrangeHrmFunctionalityText() throws InterruptedException
		{
		
		// Loginpanel validation
		
		String Expected_LoginPanelText="LOGIN Panel";
		WebElement loginPanleElement=driver.findElement(By.id("logInPanelHeading"));
		String Actual_LoginPanelText=loginPanleElement.getText();
		if(Actual_LoginPanelText.equals(Expected_LoginPanelText))
		{
			System.out.println("OHRM LoginPanel Text is Matched-PASS");
		}
		else
		{
			System.out.println("OHRM LoginPanel Text is Not Mathced-FAIL");
		}
		
		// Title Validation
		
		String Expected_Title="OrangeHRM";
		String Actual_Title=driver.getTitle();
		if(Actual_Title.equals(Expected_Title))
		{
			System.out.println("OHRM Title is Matched-PASS");
		}
		else
		{
			System.out.println("OHRM Title is Not Matched-FAIL");
		}
		
		//Url Validation
		
		String Expected_currentUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		String Actual_currentUrl=driver.getCurrentUrl();
		if(Actual_currentUrl.contains(Expected_currentUrl))
		{
			System.out.println("OHRM Url is Matched-PASS");
		}
		else
		{
			System.out.println("OHRM Url is Not Matched-FAIL");
		}
		
		// Login Functionality
		
		
		By userName=By.name("txtUsername");
		WebElement userName1=driver.findElement(userName);
		userName1.sendKeys("muralikrishna");
		By passWord=By.name("txtPassword");
		WebElement passWord1=driver.findElement(passWord);
		passWord1.sendKeys("A@1muralikrishna");
		By loginButton=By.name("Submit");
		WebElement loginButton1=driver.findElement(loginButton);
		loginButton1.click();
		
		// welcomeAdminText
		
		String Expected_welcomeText="Welcome Admin";
		String Actual_welcomeText=driver.getPageSource();
		if(Actual_welcomeText.contains(Expected_welcomeText))
		{
			System.out.println("OHRM welcome Text is Matched-PASS");
		}
		else
		{
			System.out.println("OHRM welcome Text is Not Matched-FAIL");
		}
		
		// pimElement
		
		By pimElmenet=By.id("menu_pim_viewPimModule");
		WebElement pimElement2=driver.findElement(pimElmenet);
		
		Actions action=new Actions(driver);
		action.moveToElement(pimElement2).build().perform();
		
		Thread.sleep(5000);
		action.sendKeys(Keys.TAB).build().perform();
		
		/*// addEmployeelist
		
		WebElement addEmployeelist=driver.findElement(By.id("menu_pim_viewEmployeeList"));
		addEmployeelist.click();
		
		FileInputStream file=new FileInputStream("./src/com/OHRM/OHRM MultipleData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet2");
		
		WebElement addEmployee2list=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div"));
		java.util.List<WebElement>tablerows=addEmployee2list.findElements(By.tagName("tr"));
		int tablerows_length=tablerows.size();
		System.out.println(tablerows_length);
		
		String data=addEmployee2list.getText();
		System.out.println(data);
		
		for(int i=0;i<tablerows_length;i++)
		{
			Row row=sheet.createRow(i);
			
			java.util.List<WebElement>tablecells=tablerows.get(i).findElements(By.tagName("td"));
			int tablecells_length=tablecells.size();
			System.out.println(tablecells_length);

		
         for(int j=0;j<tablecells_length;j++)
         {
        	 Cell cell=row.createCell(j);
        	 
        	 
        	 String data1=tablecells.get(j).getText();
        	 cell.setCellValue(data1);
        	 System.out.println(data1);
        	 
         }
		
         
         FileOutputStream file1=new FileOutputStream("./src/com/OHRM/OHRM MultipleData.xlsx");
         workbook.write(file1);
         
         
         */
		}
		
		
		
		
		
		
		
		/*
		 * WebElement addEmploye1=driver.findElement(By.id("menu_pim_addEmployee"));
		 * addEmploye1.click();
		 * 
		 * 
		 * By firstName=By.name("firstName"); WebElement
		 * firstName1=driver.findElement(firstName); firstName1.sendKeys("murali");
		 * 
		 * By middleName=By.id("middleName"); WebElement
		 * middleName1=driver.findElement(middleName); middleName1.sendKeys("friend");
		 * 
		 * 
		 * By lostName=By.id("lastName"); WebElement
		 * lostName1=driver.findElement(lostName); lostName1.sendKeys("hsr");
		 * 
		 * //save Button
		 * 
		 * By saveButton=By.id("btnSave"); WebElement
		 * saveButton2=driver.findElement(saveButton); saveButton2.click();
		 */		
		
		
	}


