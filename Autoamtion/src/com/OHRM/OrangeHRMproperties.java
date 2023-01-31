package com.OHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMproperties {
	
	
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
	public void OrangeHRMpropertiesfile() throws IOException
	{
	
		
		FileInputStream file=new FileInputStream("");
		
		Properties pr=new Properties();	
		pr.load(file);

		WebElement userNameElement=driver.findElement(By.id(pr.getProperty("Usernameproperties")));
		userNameElement.sendKeys("muralikrishna");
		
		WebElement passwordElement=driver.findElement(By.id(pr.getProperty("Passwordproperties")));
		passwordElement.sendKeys("A@1muralikrishna");
		
		
		
		
		
		
	}
}
