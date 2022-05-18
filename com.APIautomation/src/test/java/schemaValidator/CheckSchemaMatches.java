package schemaValidator;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CheckSchemaMatches {

	@Test
	public void checkSchemaMatches()
	{
		RestAssured.given().log().all()
		.contentType(ContentType.JSON)
		.get("https://gorest.co.in/public/v1/users/2048")
		.then().log().all()
		.assertThat()
		.body(matchesJsonSchemaInClasspath("CheckSchemaMATCHES.json"));
	}
	
	
	
	
	
}
