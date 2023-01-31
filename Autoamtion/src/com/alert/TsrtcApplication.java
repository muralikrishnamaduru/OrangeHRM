package com.alert;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TsrtcApplication {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		String ApplicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		
	        WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
	        List<WebElement>headerlinks=headerBlock.findElements(By.tagName("a"));
	        int headerlinks_length=headerlinks.size();
		    System.out.println(headerlinks_length);
		    String data=headerBlock.getText();
		    System.out.println(data);
		
		    for(int i=0;i<headerlinks_length;i++)
		    {
		    	String headerLinksName=headerlinks.get(i).getText();	
		    	System.out.println(i+" "+headerLinksName);
		    	
		    	System.out.println();
            		    	
		    	headerlinks.get(i).click();
		    	//System.out.println();
		    	driver.navigate().back();
		    	
		    	File  Tsrtc =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	FileUtils.copyFile(Tsrtc, new File("./screenshort/"+headerLinksName+".png"));
		    	
		    	
		    	
		    	
		    	
		    }
		
		
		
			/*		 * By searchButton=By.name("searchBtn"); WebElement
		 * cheakavialabilityButton=driver.findElement(searchButton);
		 * cheakavialabilityButton.click();
		 * 
		 * Alert a=driver.switchTo().alert();
		 * 
		 * a.accept(); a.dismiss(); a.sendKeys("testing");
		 */
		
		/*
		WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
		List<WebElement>headerLinks=headerBlock.findElements(By.tagName("a"));
		int headerLinks_length=headerLinks.size();
		System.out.println(headerLinks_length);
		String data=headerBlock.getText();
		System.out.println(data);
		
		
		for(int i=0;i<headerLinks_length;i++)
		{
		String headerLinks1=headerLinks.get(i).getText();
		System.out.println(headerLinks1+" "+headerLinks_length);
		
		
			headerLinks.get(i).click();
			System.out.println();
			*/
		}
	}

