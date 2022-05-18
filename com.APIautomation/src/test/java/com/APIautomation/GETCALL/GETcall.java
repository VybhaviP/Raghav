package com.APIautomation.GETCALL;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GETcall {
//Automating RestAPI using BDD approach
	
	@Test
	public void getAllUsers()
	{
		RestAssured.baseURI="https://gorest.co.in/";
		given()
		.contentType("application/json")
		.when().get("public/v1/users")
		.then()
		.statusCode(200)
		.and()
		.header("Server", "nginx");
		
		
	}
	
	
	
	
	
}
