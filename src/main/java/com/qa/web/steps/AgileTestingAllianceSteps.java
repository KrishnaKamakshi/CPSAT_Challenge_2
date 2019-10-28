package com.qa.web.steps;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.config.BasicConfigChrome;
import com.qa.web.page.locators.AgileTestingAlliancePO;
import com.qa.web.util.WebUtil;

import io.qameta.allure.Step;

public class AgileTestingAllianceSteps extends BasicConfigChrome {
	
	@Step("Getting the URL")
	public void getURL()
	{
		WebUtil.getURLWebsite(AgileTestingAlliancePO.URL);
	}
	
	@Step("Click on the Certifications")
	public void clickOnCertificationTab()
	{
		WebUtil.clickOnElementByXpath(AgileTestingAlliancePO.certifications);
	}
	
	@Step("Size of the Certifications")
	public int getTheSizeOfCertifications()
	{
		return WebUtil.gettingTheSize(AgileTestingAlliancePO.mapArea);
	}
	
	@Step("Getting the HREF links")
	public String getHrefLinks(int index, String href)
	{
		return WebUtil.getByElements(AgileTestingAlliancePO.mapArea, index, href);
	}
	@Step("Getting the index of the element")
	public WebElement getTheIndex(int index)
	{
		return WebUtil.getByElementsIndex(AgileTestingAlliancePO.mapArea, index);
	}
	
	@Step("Mouse over on the each elements")
	public Actions mouseOverAction()
	{
		Actions actions = new Actions(driver);
		return actions;
	}
	
	@Step("Context click for each link")
	public void getContextClickOfLinks() throws Exception
	{
		
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
		driver.close();
		driver.switchTo().window(parentId);	
	}
	

}
