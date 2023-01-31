package com.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid_Hub {

	@Parameters("browser")
	@Test
	public void login(String browserName) throws MalformedURLException
	{
		
		System.out.println("browser name :"+browserName);
		
		DesiredCapabilities cap=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);	
		}
		else 
			if(browserName.equalsIgnoreCase("firefox"));
			{
				cap=DesiredCapabilities.firefox();
				cap.setBrowserName("firefox");
				cap.setPlatform(Platform.WINDOWS);
			}
			
			
			RemoteWebDriver driver=new RemoteWebDriver( new URL("http://192.168.217.197:7777/wd/hub"),cap);
					
					String AppUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
			driver.get(AppUrl);
			driver.manage().window().maximize();
			

	
	}
}
