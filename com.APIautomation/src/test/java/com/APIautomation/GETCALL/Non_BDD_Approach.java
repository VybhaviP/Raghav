package com.APIautomation.GETCALL;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Non_BDD_Approach {

	@Test
	public void getAllUsers()
	{
		RestAssured.baseURI="https://gorest.co.in/";
		RequestSpecification request = RestAssured.given().log().all();
		Response response = request.get("public/v1/users");
		System.out.println("Response body is : " + response.prettyPrint());
		System.out.println("____________________________________________________");
		System.out.println("Status code is : " + response.statusCode());
		System.out.println("___________________________________________");
		System.out.println("Status line is : " + response.statusLine());
		System.out.println("________________________________________________");
		System.out.println("Content Type : " + response.getHeader("contentType"));
		System.out.println("____________________________________________________");
		System.out.println("All headers : " + response.getHeaders());

		
	}
	
	
	
	
}
