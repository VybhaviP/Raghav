package com.APIautomation.GETCALL;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NonBDD_InactiveUSERS {

	@Test
	public void allInActiveUsers()
	{
		RestAssured.baseURI="https://gorest.co.in/";
		RequestSpecification request = RestAssured.given().log().all();
		request.params("status","inactive");
		request.param("gender","male");
		Response response = request.get("public/v1/users");
		System.out.println("Returned body is : "+ response.prettyPrint());
		System.out.println("status code: " + response.statusCode()+ "All Headers is :" + response.headers());
	}
}
