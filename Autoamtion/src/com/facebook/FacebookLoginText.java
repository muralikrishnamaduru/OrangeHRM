package com.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLoginText {
	
		
		WebDriver driver;
		@BeforeTest
		public void setup()
		{
		String ApplicationUrlAddress="https://www.facebook.com/login/";
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	   }
		@AfterTest
		public void teardown()
		{
			driver.close();
		}
		@Test
		public void facebookLoginFunctionalitytext()
		{
		driver.findElement(By.name("email")).sendKeys("krishnamurali840@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("A@1murali");
		WebElement loginButton=driver.findElement(By.id("loginbutton"));
		loginButton.click();
	}

}
