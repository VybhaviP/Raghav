package com.Pojo.postAPI;

import org.testng.annotations.Test;

import com.API.POJOS.CreatingNewUserPojo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class newUserwithPOJO {

	@Test
	public void createNewUser() throws Exception
	{
		RestAssured.baseURI="https://gorest.co.in/";
		RequestSpecification request = RestAssured.given().log().all();
		request.contentType("application/json");
		request.header("Authorization","Bearer 76ae35ec0bbbcd63ea55de5c3235d99341cfeb4ef53bd44b64d1d878bafe157e");
		CreatingNewUserPojo newuser = new CreatingNewUserPojo("Danny", "danny@hotmail.com","male","active");
		ObjectMapper mapper = new ObjectMapper();
		String bodyvalues = mapper.writeValueAsString(newuser);
		request.body(bodyvalues);
		Response response = request.post("public/v1/users");
		System.out.println(response.prettyPrint());
		JsonPath jpath = response.jsonPath();
		Object statuscode = jpath.get("status");
		System.out.println("the status code is : " + statuscode);
	}
	
	
	
	
	
}
