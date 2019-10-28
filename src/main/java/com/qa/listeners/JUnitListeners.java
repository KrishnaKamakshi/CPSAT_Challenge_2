package com.qa.listeners;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import com.qa.config.BasicConfigFireFox;

import lombok.extern.slf4j.Slf4j;

import org.junit.runner.Result;

@Slf4j
public class JUnitListeners extends RunListener {
	
	 BasicConfigFireFox basicConfFire = new BasicConfigFireFox();

	 public void testRunStarted(Description description) throws Exception
	    {
	        log.info("Number of tests to execute : " + description.testCount());
	    }
	 
	    public void testRunFinished(Result result) throws Exception
	    {
	        log.info("Number of tests executed : " + result.getRunCount());
	    } 
	  
	    public void testStarted(Description description) throws Exception
	    {
	        log.info("Starting execution of test case : "+ description.getMethodName());
	    }
	 
	   
	    public void testFinished(Description description) throws Exception
	    {
	        log.info("Finished execution of test case : "+ description.getMethodName());
	    }
	 
	   
	    public void testFailure(Failure failure) throws Exception
	    {
	    	
	    	log.info("Execution of test case failed : "+ failure.getDescription().getMethodName());
	        
	        
	    }
	
	    public void testIgnored(Description description) throws Exception
	    {
	        log.info("Execution of test case ignored : "+ description.getMethodName());
	    }


}
