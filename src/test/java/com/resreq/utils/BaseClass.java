package com.resreq.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
private static final Logger logger = LogManager.getLogger(BaseClass.class);
	
	@BeforeMethod
	public void beforeMethod() {
		//RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	}
	
	//If the test fails, result.getThrowable() gets the exception that caused the test to fail. and print on logger
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			Throwable t = result.getThrowable();
			StringWriter error = new StringWriter();
			t.printStackTrace(new PrintWriter(error));
			logger.info(error.toString());
		}
		
	}
}
