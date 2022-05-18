package PostCalls;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateToken {

	@Test
	public void tokenGenerator()
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com/";
		RequestSpecification request = RestAssured.given().log().all();
		request.contentType("application/json");
		
		String payload="{\"username\":\"admin\",\"password\":\"password123\"}";
		request.body(payload);
		Response response = request.post("auth");
		JsonPath body = response.jsonPath();
		Object tokennumber = body.get("token");
		System.out.println(tokennumber + "token");
		Assert.assertNotNull(tokennumber);
		
	}
	
}
