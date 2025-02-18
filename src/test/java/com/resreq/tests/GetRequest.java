package com.resreq.tests;



import org.testng.annotations.Test;

import com.resreq.listeners.ListenerClass;
import com.resreq.utils.BaseClass;
import com.resreq.utils.Logs;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;

@Epic("Epic-01")
@Feature("Get Users")
public class GetRequest extends BaseClass{
	
	
	//@Story("Story 1")
	@Test(description = "Get request test")
	@Description("Get request test")
	@Severity(SeverityLevel.BLOCKER)
	public void getRequest() {
		Logs.info("GetAPIRequest test execution started...");
		try {
			RestAssured.
			given().filter(new AllureRestAssured())
				.filter(new ListenerClass())
				.baseUri("https://reqres.in/api")
			.when()
				.get("/users?page=2")
			.then()
				.assertThat()
				.statusCode(200);
				
			
		
		
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Logs.info("GetRequest test execution ended...");
	}

}
