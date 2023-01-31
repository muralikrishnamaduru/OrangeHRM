package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class OHRMscreeenshort {
	
	
	public void takescreenshort(WebDriver driver,String imageName) throws IOException {
		
		File OrangeHRMApplicationErrorScreenshort=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(OrangeHRMApplicationErrorScreenshort, new File("./driverfiles/OrangeHRMApplicationErrorScreenshort.png"));
		
		
		
	}

}
