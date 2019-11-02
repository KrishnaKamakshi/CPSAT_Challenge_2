package com.qa.web.steps;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import com.qa.config.BasicConfigChrome;
import com.qa.web.page.locators.AgileTestingAlliancePO;
import com.qa.web.util.WebUtil;

import io.qameta.allure.Step;

public class AgileTestingAllianceSteps extends BasicConfigChrome {

	@Step("Getting the URL")
	public void getURL() {
		WebUtil.getURLWebsite(AgileTestingAlliancePO.URL);
	}

	@Step("Click on the Certifications")
	public void clickOnCertificationTab() {
		WebUtil.clickOnElementByXpath(AgileTestingAlliancePO.certifications);
	}

	@Step("Size of the Certifications")
	public int getTheSizeOfCertifications() {
		return WebUtil.gettingTheSize(AgileTestingAlliancePO.mapArea);
	}

	@Step("Getting the HREF links")
	public String getHrefLinks(int index, String href) {
		return WebUtil.getByElements(AgileTestingAlliancePO.mapArea, index, href);
	}

	@Step("Getting the index of the element")
	public WebElement getTheIndex(int index) {
		return WebUtil.getByElementsIndex(AgileTestingAlliancePO.mapArea, index);
	}

	@Step("Mouse over on the each elements")
	public Actions mouseOverAction() {
		Actions actions = new Actions(driver);
		return actions;
	}
	
	@Step("Taking the Screenshot of the Page")
	public void captureScreenShot() throws Exception {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshots/AgileTesting"+ "_" + timestamp() + ".jpg" ));
	}
	
	public static String timestamp() {
	    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	  }	
	

	@Step("Context click for each link")
	public void getContextClickOfLinks() throws Exception {

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		/* Switching to Child Window */
		driver.switchTo().window(childId);
		Thread.sleep(4000);
		String currentURL = driver.getCurrentUrl();
		URL link = new URL(currentURL);
		HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
		httpConn.setConnectTimeout(4000);
		httpConn.connect();
		if (httpConn.getResponseCode() == 200) {
			System.out.println(link + " - " + httpConn.getResponseMessage());
		}
		if (httpConn.getResponseCode() == 404) {
			System.out.println(link + " - " + httpConn.getResponseMessage());
			captureScreenShot();
			SoftAssert assertValue = new SoftAssert();
			assertValue.assertFalse(false);
			
		}
		driver.close();
		driver.switchTo().window(parentId);
	}

}
