package PostCalls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCallUsingLinkedHashMap {

	@Test
	public void createUserWithMap() {
		
		LinkedHashMap<String, Object> map = new LinkedHashMap<String,Object>();
		map.put("name:","Vanraj");
		map.put("job","Tester");
		
		ArrayList<String> skills = new ArrayList<String>();
		skills.add("selenium");
		skills.add("java");
		skills.add("RestAPI");
		
		map.put("skills", skills);
		
		HashMap<String, Object> details = new HashMap<String,Object>();
		details.put("age","45");
		details.put("place","bangalore");
		details.put("phone","6785436765");
		
		map.put("details", details);
		
		Response response = given().auth().none()
		.contentType("application/json")		
		.when()
		.body(map).log().all()
		.post("https://reqres.in/api/users");
		
		Headers headers = response.getHeaders();
		int statuscode = response.getStatusCode();
		
		System.out.println(response.prettyPrint());
		System.out.println("headers" + headers);
		System.out.println("status code " + statuscode);
		

		
	
	
	}
	
}
