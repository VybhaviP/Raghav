package com.APIautomation.GETCALL;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetCallsWithParameters {

	@Test
	public void withParameters()
	{
		RestAssured.baseURI="https://gorest.co.in/";
		given().contentType("application/json")
		.queryParam("gender","female")
		.queryParam("status","active")
		.when().log().all()
		.get("public/v1/users")
		.then().log().all()
		.statusCode(200);
	}
	
	
	
	
	
	
	
	
}
