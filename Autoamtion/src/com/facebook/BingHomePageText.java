package com.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BingHomePageText {

	
		WebDriver driver;
		@BeforeTest
		public void setup()
		{
			
		String ApplicationUrlAddress="https://www.bing.com/";
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
		@AfterTest
		public void teardown()
		{
			driver.close();
		}
		@Test
		public  void BingHoempageFunctionalityText()
		{
	
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		

	}
}
