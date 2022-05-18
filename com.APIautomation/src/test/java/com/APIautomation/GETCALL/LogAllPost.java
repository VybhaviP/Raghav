package com.APIautomation.GETCALL;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class LogAllPost {

	@Test
	public void logAllPostApis()
	{
		RestAssured.baseURI="https://gorest.co.in/";
		given().contentType("application/jason")
		.when().log().all()
		.get("public/v1/posts")
		.then().log().all()
		.statusCode(200)
		.header("content-Encoding","gzip");
		System.out.println("Get all the post API'S are working");
		
	
	
	
	}
}
