package PostCalls;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateNewUser {

	@Test
	public void createnewUser()
	{
		RestAssured.baseURI="https://gorest.co.in/";
		RequestSpecification request = RestAssured.given().log().all();
		request.contentType("application/json");
		request.header("Authorization","Bearer 76ae35ec0bbbcd63ea55de5c3235d99341cfeb4ef53bd44b64d1d878bafe157e");
		
		String payload= "{\"name\":\"Madhu\",\"email\":\"madhu@hotmail.com\",\"gender\":\"female\"	,\"status\":\"Active\"}";
		request.body(payload);
		Response response = request.post("public/v1/users");
		JsonPath jpath = response.jsonPath();
		jpath.prettyPrint();
		int statuscode = response.statusCode();
		System.out.println(statuscode + ":" + "status code");
	}
	
	
	
	
	
}
