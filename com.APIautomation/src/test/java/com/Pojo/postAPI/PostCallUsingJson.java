package com.Pojo.postAPI;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCallUsingJson {

	@Test
	public void postCallusingJSONfile()
	{
		RestAssured.baseURI="https://gorest.co.in/";
		RequestSpecification request = RestAssured.given().log().all();
	    request.contentType("application/json");
	    request.header("Authorization","Bearer 76ae35ec0bbbcd63ea55de5c3235d99341cfeb4ef53bd44b64d1d878bafe157e");
	    
	   File payload = new File("./src/test/resources/json/userDetails.json");
	   request.body(payload);
	   Response response = request.post("/public/v1/users");
	   System.out.println("Response :" + response.prettyPrint());
	int statuscode = response.getStatusCode();
	System.out.println("Status code: " + statuscode);
	JsonPath jpath = response.jsonPath();
	Object id = jpath.get("id");
	System.out.println("id : "+ id);
	   
	}
}
