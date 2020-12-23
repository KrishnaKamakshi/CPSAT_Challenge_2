package com.qa.config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import com.qa.listeners.CustomListeners;

@Listeners(CustomListeners.class)
public class BasicConfigChrome extends DriverConfig {

	@Before
	public void setUp() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		wait = new WebDriverWait(driver, 30);

	}

	@After
	public void closingBrowser() {
		driver.close();
	}

}
