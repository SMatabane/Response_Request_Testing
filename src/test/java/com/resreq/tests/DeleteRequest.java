package com.resreq.tests;


import org.testng.annotations.Test;

import com.resreq.listeners.ListenerClass;
import com.resreq.utils.BaseClass;
import com.resreq.utils.Logs;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;


public class DeleteRequest extends BaseClass{
	

	
	//@Story("Story 1")
	@Test(description = "Delete request test")
	@Description("Delete request test")
	@Severity(SeverityLevel.CRITICAL)
	public void postRequest() {
		Logs.info("DeleteAPIRequest test execution started...");
		
		RestAssured
					.given()
						.filter(new AllureRestAssured())
						.filter(new ListenerClass())
						.baseUri("https://reqres.in/api")
					.when()
						.delete("/users/637")
					.then()
					 .assertThat().statusCode(204);
		Logs.info("PostAPIRequest test execution ended...");
		
	}
	

}
