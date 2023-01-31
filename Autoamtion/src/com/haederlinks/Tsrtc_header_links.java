package com.haederlinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_header_links {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		String ApplicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
	    List<WebElement>headerLinks=headerBlock.findElements(By.tagName("a"));
	   int headerLinks_length=headerLinks.size();
	   System.out.println(headerLinks_length);
	   String data=headerBlock.getText();
       System.out.println(data);
       
       for(int i=0;i<headerLinks_length;i++)
       {
    	   String headerlinksName=headerLinks.get(i).getText();
    	   System.out.println(headerlinksName);
    	   System.out.println(i+" "+headerlinksName);
    	 
		
			  headerLinks.get(i).click();
			  System.out.println(driver.getCurrentUrl());
			  System.out.println(driver.getTitle()); 
			  System.out.println();
			  driver.navigate();
			 
    	   
    	   
       }
       
       
       
       
       
       
       
       
	}

}
