package com.qa.web.steps;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import com.qa.config.BasicConfigChromeTestNG;
import com.qa.config.ConfigConstants;
import com.qa.config.ExcelDataConfig;
import com.qa.web.page.locators.NseIndiaPO;
import com.qa.web.util.WebUtil;

import io.qameta.allure.Step;

public class NSEIndiaSteps extends BasicConfigChromeTestNG {
	private static final String EXCEL_DATA = "src/main/resources/CompanyNames.xlsx";


	@Step("Getting the URL")
	public void getURL() {
		WebUtil.getURLWebsite(NseIndiaPO.URL);
	}

	@Step("Getting the value of the Market Text")
	public String getTheTextByIndex(int index) {
		return WebUtil.getByElementsText(NseIndiaPO.marketValueText, index);
	}

	@Step("Getting the value of the Market Value")
	public String getTheTextByValueOfWindows(int index) {
		return WebUtil.getByElementsText(NseIndiaPO.markentValueValues, index);
	}

	@Step("Enter the value for the company name")
	public void sendTheValue() {
		WebUtil.sendTheValueByID(NseIndiaPO.keyWord, ConfigConstants.companyName);
	}

	@Step("Using the word Enter Key")
	public void hitEnterKey() {
		WebUtil.keyToEnter(NseIndiaPO.keyWord);
	}

	@Step("Fetching the Face value of the company")
	public String fetchTheCompanyValue() {
		return WebUtil.getTextFromAttributeValueXpath(NseIndiaPO.faceValue);
	}

	@Step("Taking the Screenshot of the Page")
	public void captureScreenShot() throws Exception {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshots/NSE"+ "_" + timestamp() + ".jpg" ));
	}

	@Step("Fetching the High 52 value of the company")
	public String fetchTheHighValue() {
		return WebUtil.getTextFromAttributeValueXpath(NseIndiaPO.high52);
	}

	@Step("Fetching the Low 53 value of the company")
	public String fetchTheLowValue() {
		return WebUtil.getTextFromAttributeValueXpath(NseIndiaPO.low52);
	}
	
	@Step("Enter the value for the company name from excel")
	public void sendTheValueExcel(String testCases, String dataTest) {
		WebUtil.getElementByID(NseIndiaPO.keyWord).sendKeys(dataTest);
	}
	
	public static String timestamp() {
	    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	  }	
	
	@DataProvider(name = "companyName")
	public Object[][] passData()
	{
		ExcelDataConfig excelDataTest = new ExcelDataConfig(EXCEL_DATA);
		
		int rowNumber = excelDataTest.getRowCount(0);
		
		Object[][] data = new Object[rowNumber][2];
		
		for(int i= 0; i<rowNumber;i++)
		{
			data[i][0] =  ExcelDataConfig.getData(0, i, 0);
			data[i][1] =  ExcelDataConfig.getData(0, i, 1);
		}
		
		return data;
		
	}

}
