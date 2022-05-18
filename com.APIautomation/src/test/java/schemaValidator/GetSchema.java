package schemaValidator;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GetSchema {

	@Test
	public void checkSchema()
	{
		RestAssured.given().log().all()
		.contentType(ContentType.JSON)
		.header("Authoriztion ", "Bearer 76ae35ec0bbbcd63ea55de5c3.235d99341cfeb4ef53bd44b64d1d878bafe157e")
		.when().log().all()
		.get("https://gorest.co.in/public/v1/users/2087")
		.then().log().all()
		.assertThat()
		.body(matchesJsonSchemaInClasspath("UserSchema.json"));
		
	}
}
