package com.qa.config;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import com.qa.listeners.CustomListeners;
from selenium import webdriver;


@Listeners(CustomListeners.class)
public class BasicConfigChromeTestNG extends DriverConfig{
	
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		
		
		driver = webdriver.Chrome()
		driver.manage().window().maximize();	


		wait = new WebDriverWait(driver,30); 

	}
	
	@AfterClass
	public void closingBrowser()
	{
		driver.close();
	}

}
