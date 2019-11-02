package com.qa.cpsat.test;

import org.testng.annotations.Test;

import com.qa.web.steps.NSEIndiaSteps;
import com.qa.web.util.WebUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Program4Test extends NSEIndiaSteps {

	@Test(dataProvider = "companyName")	
	public void testCompany(String testCases, String dataTest) throws Exception {
		getURL();
		WebUtil.sleep();
		sendTheValueExcel(testCases, dataTest);
		WebUtil.sleep();
		hitEnterKey();
		WebUtil.sleep();
		log.info("Face value of the company of {} is {} ", dataTest, fetchTheCompanyValue());
		log.info("High 52 value of the company of {} is {} ", dataTest, fetchTheHighValue());
		log.info("Low 52 value of the company of {} is {} ", dataTest, fetchTheLowValue());
		captureScreenShot();

	}
}
