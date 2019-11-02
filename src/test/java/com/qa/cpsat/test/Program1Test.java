package com.qa.cpsat.test;

import static org.testng.Assert.assertEquals;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.config.ConfigConstants;
import com.qa.web.page.locators.AgileTestingAlliancePO;
import com.qa.web.steps.AgileTestingAllianceSteps;
import com.qa.web.util.WebUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Program1Test extends AgileTestingAllianceSteps  {

	@Test
	public void testCertifications() throws Exception {
		getURL();
		clickOnCertificationTab();
		int numberOfCertifications = getTheSizeOfCertifications();
		assertEquals(numberOfCertifications, ConfigConstants.counCertification);
		for (int i = 0; i < numberOfCertifications; i++) {
			log.info(getHrefLinks(i, "href"));
		}
		for (int j = 0; j < numberOfCertifications; j++) {
			WebElement elementLocator = getTheIndex(j);
			mouseOverAction().contextClick(elementLocator).perform();
			getContextClickOfLinks();
		}
		WebUtil.sleep();
		Actions actions = new Actions(driver);
		WebElement ele = WebUtil.getElementByXpath(AgileTestingAlliancePO.mouseOverOnCP);
		actions.moveToElement(ele).perform();
		WebUtil.sleep();
		BufferedImage image = new Robot()
				.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "png",
				new File("./Screenshots/AgileTesting_1" + "_" + System.currentTimeMillis() + ".jpg"));

	}

}
