package com.APIautomation.GETCALL;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllPostAPI {

	@Test
	public void getAllUserPost()
	{
	
		RestAssured.baseURI="https://gorest.co.in/";
		given()
		.contentType("application/jason")
		.when().get("public/v1/posts")
		.then()
		.statusCode(200)
		.and();
		//.header("Server","nginx");
	}
	
	
	
}
