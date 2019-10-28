package com.qa.cpsat.test;

import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.qa.config.ConfigConstants;
import com.qa.web.steps.AgileTestingAllianceSteps;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Program1Test extends AgileTestingAllianceSteps {

	@Test
	public void test1() throws Exception 
	{
		getURL();
		clickOnCertificationTab();
		int numberOfCertifications = getTheSizeOfCertifications();
		assertEquals(numberOfCertifications, ConfigConstants.counCertification);
		for (int i = 0; i < numberOfCertifications; i++) {
			log.info(getHrefLinks(i, "href"));
		}
		for(int j=0; j < numberOfCertifications; j++ )
		{
			WebElement elementLocator = getTheIndex(j);
			mouseOverAction().contextClick(elementLocator).perform();
			getContextClickOfLinks();
		}
	}

}
