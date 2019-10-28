package com.qa.cpsat.test;

import static org.testng.Assert.assertTrue;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.web.steps.GainersSteps;
import com.qa.web.steps.LosersSteps;
import com.qa.web.steps.NSEIndiaStepsTestNG;

public class Program6Test extends NSEIndiaStepsTestNG {

	LosersSteps loserTable = new LosersSteps();
	GainersSteps gainerTable = new GainersSteps();
	String[] valuesStore = new String[10];
	String[] valuesStoreTrim = new String[8];
	float[] valuesStoreInt = new float[10];

	@Test(priority = 1)
	public void tesWebTable() throws Exception {
		getURL();
		Thread.sleep(3000);
		overLiveMarket();
		Thread.sleep(3000);
		clickOnTab();
		Thread.sleep(3000);
		gainerTable.getValuesOfGainer();
		clickOnLosersTab();
		loserTable.getValuesOfLosers();
		Thread.sleep(4000);
		clickOnGainerTab();
		Thread.sleep(4000);
		for (int i = 0; i < driver.findElements(By.xpath("//table[@id='topGainers']/tbody/tr/td[3]")).size(); i++) {
			valuesStore[i] = driver.findElements(By.xpath("//table[@id='topGainers']/tbody/tr/td[3]")).get(i).getText();
			valuesStoreInt[i] = Float.parseFloat(valuesStore[i].toString());
		}

		for (int k = 0; k < 9; k++) {
			assertTrue(valuesStoreInt[k] >= valuesStoreInt[k + 1]);
		}

		Thread.sleep(4000);

		clickOnLosersTab();

		for (int i = 0; i < driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[3]")).size(); i++) {
			valuesStore[i] = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[3]")).get(i).getText();
			valuesStoreInt[i] = Float.parseFloat(valuesStore[i].toString());
		}

		for (int k = 0; k < 9; k++) {
			assertTrue(valuesStoreInt[k] <= valuesStoreInt[k + 1]);
		}

		String dateOfNSE = getDatefromWebsite();
		String newDate = dateOfNSE.substring(6, 27);
		Format formatter = new SimpleDateFormat("MMM dd, yyyy HH:mm:ss");
		String sDate = formatter.format(new Date());
		System.out.println("Comparing " + newDate + " and " + sDate + " : " + newDate.equals(sDate));

	}

}
