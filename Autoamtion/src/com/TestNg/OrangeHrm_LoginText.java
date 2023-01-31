package com.TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHrm_LoginText {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		
		String ApplicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	@Test(priority=0)
	public void OHRMLoginTextFunctionality()
	{
	// OHRMLoginText
		By userName=By.name("txtUsername");
		WebElement userName1=driver.findElement(userName);
		userName1.sendKeys("muralikrishna");
	    By passWord=By.name("txtPassword");
	    WebElement password1=driver.findElement(passWord);
	    password1.sendKeys("A@1muralikrishna");
	    By LoginButton=By.name("Submit");
	    WebElement LoginButton1=driver.findElement(LoginButton);
	    LoginButton1.click();
     }
	@Test(priority=1)
	public void LOGINPanelText()
	{
		String ExpectedLoginPanelText="LOGINPanel";
		WebElement loginPanelElement=driver.findElement(By.id("logInPanelHeading"));
		String ActualLoginpanelText=loginPanelElement.getText();
		if(ActualLoginpanelText.equals(ExpectedLoginPanelText))
		{
			System.out.println("OHRM Login Panel  Text is Matched-PASS");
		}
		else
		{
			System.out.println("OHRM Login Panel  Text is Not  Matched-FAIL");
		}}
	  	@Test(priority=2)
	  	public void TitleValidation()
	  	{
	  	
	  		String ExpectedTitle="OrangeHRM";
	  		String ActualTitle=driver.getTitle();
	  		if(ActualTitle.equals(ExpectedTitle))
	  		{
	  			System.out.println("OHRM Title is Matched-PASS");
	  		}
	  		else
	  		{
	  			System.out.println("OHRM Title is Not MAtched-FAIL");
	  		}
	  	    }
	  		@Test(priority=3)
	  		public void Urlvaliadtion()
	  		{
	  			
	  			String ExpectedUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	  			String ActualUrlAddress=driver.getCurrentUrl();
	  			if(ActualUrlAddress.contains(ExpectedUrlAddress))
	  			{
	  				System.out.println("OHRM Url is Matched-PASS");
	  			}
	  			else
	  			{
	  				System.out.println("OHRM Url is Not Matched-FAIL");
	  			}}
	  			@Test(priority=4)
	  			public void welcomeAdmin()
	  			{
	  			
	  				String Expected_WelcomeAdminText="Welcome Admin";
	  				String Actual_WelcomeAdminText=driver.getPageSource();
	  				if(Actual_WelcomeAdminText.contains(Expected_WelcomeAdminText))
	  				{
                    System.out.println("OHRM welcome admin Text is Matched-PASS");	  				
	  				}
	  				else
	  				{
	  					System.out.println("OHRM welcome admin Text is Not Matched-FAIL");
	  	      }
	  	      }
	  	   @Test(priority=5)
	  	   public void pimelement() throws InterruptedException
	  	   {
	  		   
	  		   By PimElemenet=By.id("menu_pim_viewPimModule");
	  		   WebElement pimElement1=driver.findElement(PimElemenet);
	  		   
	  		   Actions action=new Actions(driver);
	  		   action.moveToElement(pimElement1).build().perform();
	  		   action.sendKeys(Keys.TAB).build().perform();
	  		   
	  		   Thread.sleep(3000);
	  		   
	  		 action.sendKeys(Keys.ENTER).build().perform();
	  	   }
	  	   @Test(priority=6)
	  	   public void addEmployee()
	  	   {
	  		   By addEmployee=By.id("menu_pim_addEmployee");
	  		   WebElement addEmployee1=driver.findElement(addEmployee);
	  		 addEmployee1.click();
	  	   }
           @Test
           public void addEmployeeName()
           {
        	   
	  		  By firstName=By.name("firstName");
	  		  WebElement firstName1=driver.findElement(firstName);
	  		  firstName1.sendKeys("murali");
	  		   
	  	    	By middleName=By.id("middleName");
	  		    WebElement middleName1=driver.findElement(middleName);
	  		    middleName1.sendKeys("friend");
	  		  

	  	    	By lostName=By.id("lastName");
	  		    WebElement lostName1=driver.findElement(lostName);
	  		    lostName1.sendKeys("hsr");
	  	      }
             @Test
             public void saveButton()
             {
            	 
            	 By saveButton=By.id("btnSave");
            	 WebElement saveButton1=driver.findElement(saveButton);
            	 saveButton1.click();
             }}
         