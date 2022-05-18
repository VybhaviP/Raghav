package nestedPOJO;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class PostBooking {

	public void bookingdetails()
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		RequestSpecification request = RestAssured.given().log().all();
		request.contentType("application/json");
		
		Booking_dates bookingdates = new Booking_dates("2022-05-02","2022-06-07");
		Booking_details bookingdetails = new Booking_details("Tiger","Sharoff","999",false,"dinner",bookingdates);
	
	   request.body(bookingdetails);
	    Response response = request.post("/booking");
	    System.out.println("Response body : " + response.prettyPrint());
	    int statuscode = response.getStatusCode();
	    System.out.println("the status code is : " + statuscode);
	   String sessionID = response.getSessionId();
	   System.out.println("SessionID is : " + sessionID);
	     
	}
	
}
