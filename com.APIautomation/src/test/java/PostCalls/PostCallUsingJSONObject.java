package PostCalls;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
public class PostCallUsingJSONObject {

	
	@Test
	public void createuserwithJsonObject()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("name","Saahil");
		jobj.put("job","Developer");
		
		JSONArray skills = new JSONArray();
		skills.put("Java");
		skills.put("C++");
		skills.put("Visual Basic");
		
		jobj.put("details",skills);
		 
		JSONObject Details = new JSONObject();
		Details.put("company","Infosys");
        Details.put("email","saahil@hotmail.com");

        jobj.put("Details", Details);
		
 Response response = given().auth().none()
		 .contentType("application/json")
		.when()
		.body(jobj.toString()).log().all()
		.post("https://reqres.in/api/users");
 
 System.out.println("Response body is : " + response.prettyPrint());
 System.out.println(response.statusCode() + ": Status code");
 
		
		
	}
}
