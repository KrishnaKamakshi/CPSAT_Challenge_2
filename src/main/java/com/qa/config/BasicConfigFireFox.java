package com.qa.config;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasicConfigFireFox extends DriverConfig {
	
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "src/main/resources/fireFox.txt");	
		
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,60); 

		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}
	
	
}
