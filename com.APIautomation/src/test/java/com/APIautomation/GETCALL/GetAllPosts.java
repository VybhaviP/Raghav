package com.APIautomation.GETCALL;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class GetAllPosts {

	@Test
	public void getallposts()
	{
		RestAssured.baseURI="https://gorest.co.in/";
		given().contentType("application/json")
		.when().get("public/v1/users/123/posts")
		.then()
		.header("Server","nginx")
		.and()
		.statusCode(200);
		System.out.println("Get all post API's are working");
		
		
	}
}
