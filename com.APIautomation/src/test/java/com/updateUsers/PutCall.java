package com.updateUsers;

import java.io.File;
import java.nio.file.Files;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutCall {

	@Test
	public void putcalltodata()
	{
		RestAssured.baseURI="https://gorest.co.in/";
		RequestSpecification request = RestAssured.given().log().all();
		request.contentType("application/json");
		request.header("Authorization","Bearer 76ae35ec0bbbcd63ea55de5c3235d99341cfeb4ef53bd44b64d1d878bafe157e");
	   File payload = new File("./src/test/resources/json/PutCallChangeStatus");	
	   request.body(payload);
	  Response response = request.put("/public/v1/users/3933");
	 System.out.println(response.prettyPrint());
	 int statuscode = response.getStatusCode();
	 System.out.println("status code is : " + statuscode);
	
	}
	
	
	
	
	
	
}
