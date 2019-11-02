package com.qa.cpsat.test;

import static org.testng.Assert.assertTrue;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

import com.qa.web.page.locators.NseIndiaPO;
import com.qa.web.steps.GainersSteps;
import com.qa.web.steps.LosersSteps;
import com.qa.web.steps.NSEIndiaStepsTestNG;
import com.qa.web.util.WebUtil;

public class Program6Test extends NSEIndiaStepsTestNG {

	LosersSteps loserTable = new LosersSteps();
	GainersSteps gainerTable = new GainersSteps();
	String[] valuesStore = new String[10];
	String[] valuesStoreTrim = new String[8];
	float[] valuesStoreFloat = new float[10];

	@Test(priority = 1)
	public void testNSEWebsite() throws Exception {
		getURL();
		overLiveMarket();
		WebUtil.sleep();
		clickOnTab();
		WebUtil.sleep();
		gainerTable.getValuesOfGainer();
		clickOnLosersTab();
		WebUtil.sleep();
		loserTable.getValuesOfLosers();
		WebUtil.sleep();
		clickOnGainerTab();
		WebUtil.sleep();
		int sizeOfDetails = sizeOfTabel();
		for (int i = 0; i < sizeOfDetails; i++) {
			valuesStore[i] = WebUtil.getTheValueByXpath(NseIndiaPO.getTableValue, i);
			valuesStoreFloat[i] = Float.parseFloat(valuesStore[i].toString());
		}

		for (int k = 0; k < 9; k++) {
			assertTrue(valuesStoreFloat[k] >= valuesStoreFloat[k + 1]);
		}
		WebUtil.sleep();
		clickOnLosersTab();
		int sizeOfLoser = sizeOfTabelLosers();
		for (int i = 0; i < sizeOfLoser; i++) {
			valuesStore[i] = WebUtil.getTheValueByXpath(NseIndiaPO.getTableValueL, i);
			valuesStoreFloat[i] = Float.parseFloat(valuesStore[i].toString());
		}

		for (int k = 0; k < 9; k++) {
			assertTrue(valuesStoreFloat[k] <= valuesStoreFloat[k + 1]);
		}

		String dateOfNSE = getDatefromWebsite();
		String newDate = dateOfNSE.substring(6, 27);
		Format formatter = new SimpleDateFormat("MMM dd, yyyy HH:mm:ss");
		String sDate = formatter.format(new Date());
		System.out.println("Comparing " + newDate + " and " + sDate + " : " + newDate.equals(sDate));

	}

}
