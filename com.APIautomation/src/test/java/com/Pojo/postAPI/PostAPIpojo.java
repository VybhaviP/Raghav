package com.Pojo.postAPI;

import org.testng.annotations.Test;

import com.API.POJOS.Credientials;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostAPIpojo {

	@Test
	public void generatetokenusingPOJO() throws Exception
	{
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com/";
		RequestSpecification request = RestAssured.given().log().all();
		request.contentType("application/json");
		
		Credientials cred = new Credientials("admin","password123");
		ObjectMapper body = new ObjectMapper();
		String jsonbody = body.writeValueAsString(cred);
		request.body(jsonbody);
		Response response = request.post("/auth");
		JsonPath jpath = response.jsonPath();
		Object token = jpath.get("token");
		System.out.println("the token is : " + token);
		
	}
}
