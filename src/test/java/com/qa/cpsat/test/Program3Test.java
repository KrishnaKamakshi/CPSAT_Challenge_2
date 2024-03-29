package com.qa.cpsat.test;

import org.testng.annotations.Test;

import com.qa.web.steps.NSEIndiaStepsTestNG;
import com.qa.web.util.WebUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Program3Test extends NSEIndiaStepsTestNG {

	@Test
	public void testNSEScreenshot() throws Exception {
		getURL();
		WebUtil.sleep();
		sendTheValue();
		WebUtil.sleep();
		hitEnterKey();
		WebUtil.sleep();
		log.info("Face value of the company is {}", fetchTheCompanyValue());
		captureScreenShot();
		log.info("High 52 value of the company is {}", fetchTheHighValue());
		log.info("Low 52 value of the company is {}", fetchTheLowValue());

	}

}
