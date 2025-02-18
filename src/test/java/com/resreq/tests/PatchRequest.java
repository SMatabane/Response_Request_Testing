package com.resreq.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.resreq.listeners.ListenerClass;
import com.resreq.utils.BaseClass;
import com.resreq.utils.FilesConstants;
import com.resreq.utils.Logs;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PatchRequest extends BaseClass{
	

	//@Story("Story 1")
	@Test(description = "Patch request test")
	@Description("Patch request test")
	@Severity(SeverityLevel.CRITICAL)
	public void postRequest() {
		Logs.info("PatchAPIRequest test execution started...");
		
		try {
			String postAPIRequestBody = FileUtils.readFileToString(new File(FilesConstants.JSON_Patch_DATA),
					"UTF-8");
			
		Response res=	RestAssured
						.given()
							.filter(new AllureRestAssured())
							.filter(new ListenerClass())
							.baseUri("https://reqres.in/api")
							.contentType(ContentType.JSON).body(postAPIRequestBody)
						.when()
							.patch("/users/637")
						.then()
						 .assertThat().statusCode(200)
						 .extract()
						 	.response();
						
						
			
			String name = res.jsonPath().getString("name");

			Assert.assertEquals(name, "morpheus");
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Logs.info("PatchAPIRequest test execution ended...");
		
	}
	
	

}
