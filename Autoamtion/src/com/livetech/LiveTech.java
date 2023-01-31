package com.livetech;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LiveTech {

	
		
		WebDriver driver;
		@BeforeTest
		public void setup()
		{
	     String ApplicationUrlAddress="https://www.livetech.in/";
	     System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(ApplicationUrlAddress);
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		@AfterTest
		public void teardown()
		{
			driver.close();
		}
		@Test
	    public void LiveTechInstituteFunctionality() throws IOException
	    {
			
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,900)");
		
	    File BingHomePageScreenshort=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(BingHomePageScreenshort, new File("./screenshort/bingHomepage.png"));
	}

}
