package com.qa.cpsat.test;

import java.util.Collections;

import org.testng.annotations.Test;
import com.qa.config.ConfigConstants;
import com.qa.web.steps.NSEIndiaSteps;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Program2Test extends NSEIndiaSteps{
	
	@Test
	public void testNSEIndia() {
		getURL();
		for (int i = 0; i < 3; i++) {
			ConfigConstants.valuOFMarketWindow = getTheTextByIndex(i);
			ConfigConstants.listString.add(ConfigConstants.valuOFMarketWindow);
		}
		log.info("Values of the maximum window is {}" , ConfigConstants.listString);
		for (int j = 0; j < 3; j++) {
			ConfigConstants.valuesStore[j] = getTheTextByValueOfWindows(j);
			ConfigConstants.valuesStoreInt[j] = Integer.parseInt(ConfigConstants.valuesStore[j]);
			ConfigConstants.list.add(ConfigConstants.valuesStoreInt[j]);

		}
		log.info("List is {}" , ConfigConstants.list);
		int minList = Collections.min(ConfigConstants.list);
		log.info("Values of the minimum is {}" , minList);

	}

}
