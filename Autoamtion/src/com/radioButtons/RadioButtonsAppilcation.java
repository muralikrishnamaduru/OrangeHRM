package com.radioButtons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsAppilcation {

	public static <webElement> void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String ApplicationUrlAddress="https://echoecho.com/htmlforms10.htm";
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td
		//html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td
		
		By radiobutton=By.name("group1");
		List<WebElement>radiobutton1=driver.findElements(radiobutton);
		int radiobuton1_length=radiobutton1.size();
		System.out.println(radiobuton1_length);
		
		
		
		
		
		By radiaobutton=By.name("group2");
		
		List<WebElement>radiobutton2=driver.findElements(radiaobutton);
		int radiobutton2_length=radiobutton2.size();
		System.out.println(radiobutton2_length);
		
		
		for(int i=0;i<radiobuton1_length;i++)
		{
			List<WebElement>radiobuttonx=radiobutton1.get(i).findElements(radiaobutton);
			radiobuttonx.get(i).click();
			
			Thread.sleep(10000);
			
			for(int j=0;j<radiobutton2_length;j++)
			{
				List<WebElement>radiobuttony=radiobutton2.get(j).findElements(radiaobutton);
				radiobuttony.get(j).click();
			}
		    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//By radioButtonBolck=By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td");
		//WebElement radioButtonBlock1=driver.findElement(radioButtonBolck);
		
		/*
		 * List<WebElement>group1radioButton=radioButtonBlock1.findElements(By.name(
		 * "group1")); int group1radioButton_length=group1radioButton.size();
		 * System.out.println(group1radioButton_length); String
		 * data=radioButtonBlock1.getText(); System.out.println(data);
		 * 
		 * By radioButtonBolck2=By.xpath(
		 * "/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"
		 * ); WebElement radioButtonBlock2=driver.findElement(radioButtonBolck);
		 * 
		 * List<WebElement>group2radioButton2=radioButtonBlock2.findElements(By.name(
		 * "group2")); int group1radioButton2_length =group2radioButton2.size();
		 * System.out.println(group1radioButton2_length);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * for(int i=0;i<group1radioButton_length;i++) {
		 * group1radioButton.get(i).click();
		 * 
		 * Thread.sleep(10000);
		 * 
		 * for(int j=0;j<group1radioButton2_length;j++) {
		 * 
		 * group2radioButton2.get(j).click();
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(group2radioButton2.get(j).getAttribute("value")+
		 * " "+group2radioButton2.get(j).getAttribute("checked")); }
		 * System.out.println(); } driver.quit();
		 */

		    
	       }
           }

