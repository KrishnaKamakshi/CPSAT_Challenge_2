package com.qa.web.steps;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.config.BasicConfigChromeTestNG;
import com.qa.web.page.locators.ShopstopperPO;
import com.qa.web.util.WebUtil;

import io.qameta.allure.Step;

public class ShopstopperSteps extends BasicConfigChromeTestNG {

	@Step("Getting the URL")
	public void getURL() {
		WebUtil.getURLWebsite(ShopstopperPO.URL);
	}

	@Step("Click on the cookies & policy")
	public void clickOnCloseIcon() {
		WebUtil.clickOnElementByXpath(ShopstopperPO.cookiesPolicy);
	}

	@Step("Click on the Banner")
	public void clickOnBannerIcon() {
		WebUtil.clickOnElementByXpath(ShopstopperPO.nextButton);

	}

	@Step("Click on the Men by overing the Mouse")
	public void overMouseOnMenTab() {
		Actions actions = new Actions(driver);
		WebElement ele = WebUtil.getElementByXpath(ShopstopperPO.menTab);
		actions.moveToElement(ele).perform();
	}

	@Step("Click on the Banner")
	public void clickOnMenFragrance() {
		WebUtil.clickOnElementByXpath(ShopstopperPO.menFragrance);

	}

	@Step("Fetching the details of the accessories")
	public int gettingTheDetails() {
		return WebUtil.gettingTheSize(ShopstopperPO.accesoriesDetails);
	}

	@Step("Getting the values from the accessories")
	public String gettingValuesOfAccessories(int index) {
		return WebUtil.getTheValueByXpath(ShopstopperPO.accesoriesDetails, index);
	}

	@Step("Click on the Store link")
	public void clickOnStoreLink() {
		WebUtil.clickOnElementByXpath(ShopstopperPO.linkOfStore);
	}

	@Step("Getting the values of city")
	public List<WebElement> getTheCityNames() {
		return WebUtil.getElementsByXpathElements(ShopstopperPO.cityDetails);
	}
	@Step("Get Page title")
	public String getTitleOfPage()
	{
		return WebUtil.getTheTitle();
	}

}
