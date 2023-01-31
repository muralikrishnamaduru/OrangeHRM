package com.screenshort;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OsamaniaUniversity {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		String ApplicationurlAddress="https://www.osmania.ac.in/";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationurlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
				
		
		// Title validation
		
		String Expected_Title="Osmania University";
		String Actaul_Title=driver.getTitle();
		if(Actaul_Title.equals(Expected_Title))
		{
			System.out.println("OHRM Title is Matched-PASS");
		}
		else 
		{
			System.out.println("OHRM Title is Not Matched-FAIL");
		}
				
		// OHRM Url Validation
		
		String ExpectedcurrentUrl="https://www.osmania.ac.in/";
		String ActualcurrentUrl=driver.getCurrentUrl();
		if(ActualcurrentUrl.contains(ExpectedcurrentUrl))
		{
			System.out.println("OHRM Url is Mathced-PASS");
		}
		else
		{
			System.out.println("OHRM Url is Not Matched-FAIL");
		}
		
		
		
		// header block 
		
		    WebElement selectlanguages=driver.findElement(By.id("gtranslate_selector"));
		    List<WebElement>listaName=selectlanguages.findElements(By.tagName("option"));
		    int listName_length=listaName.size();
		    System.out.println(listName_length);
		    String data=selectlanguages.getText();
		    System.out.println(data);
		    for(int i=0;i<listName_length;i++)
		    {
		    	String NoOfLanguages=listaName.get(i).getText();
		    	System.out.println(i+" "+NoOfLanguages);
		    	
		    	
		    	Select selection=new Select(selectlanguages);
		    	selection.selectByIndex(i);
		    	selection.selectByVisibleText(NoOfLanguages);
		 
		    	
		    	File OsmaniaUniversity=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	FileUtils.copyFile(OsmaniaUniversity,new File("./screenshort/"+NoOfLanguages+".png"));
		    	
		    	
		 	
		    	
		    }
		    
		
  
	}

}
