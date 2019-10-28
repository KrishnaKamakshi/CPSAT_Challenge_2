package com.qa.cpsat.test;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.config.ConfigConstants;
import com.qa.web.steps.ShopstopperSteps;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Program5Test extends ShopstopperSteps {
	@Test
	public void testTheShopperStop() throws InterruptedException {
		getURL();
		Thread.sleep(4000);
		clickOnCloseIcon();
		for (int i = 0; i <= 5; i++) {
			clickOnBannerIcon();
			Thread.sleep(3000);
		}
		overMouseOnMenTab();
		Thread.sleep(3000);
		clickOnMenFragrance();
		Thread.sleep(3000);
		int sizeOfDetails = gettingTheDetails();
		for (int i = 0; i < sizeOfDetails; i++) {
			log.info("Values of the Accessories are {} ", gettingValuesOfAccessories(i));
		}
		clickOnStoreLink();
		Thread.sleep(3000);
		List<WebElement> options = getTheCityNames();
		List<String> text = new ArrayList<String>();
		for (int i = 0; i < options.size(); i++) {
			text.add(options.get(i).getText());
		}
		log.info("Values of the City Names are {} ", text);
		assertEquals(text.contains(ConfigConstants.CityName), true);
		assertEquals(text.contains(ConfigConstants.CityNameB), true);
		assertEquals(text.contains(ConfigConstants.CityNameM), true);
		log.info("Page title is {}", getTitleOfPage());

	}

}
