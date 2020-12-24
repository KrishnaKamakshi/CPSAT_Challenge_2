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
		
	}

}
