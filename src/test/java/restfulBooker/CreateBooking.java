package restfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

//get all information related to URL and payload from below url
//https://restful-booker.herokuapp.com/apidoc/index.html#api-Booking-CreateBooking

public class CreateBooking {

	public static void main(String[] args)
	{
		
		RestAssured.
		given()
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking")
		.body("{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		.post().then().log().all().statusCode(200);
		
//		//createBooking
//		
//		RequestSpecification reqSpec=RestAssured.given();
//		reqSpec.baseUri("https://restful-booker.herokuapp.com/");
//		reqSpec.basePath("booking");
//		
//		reqSpec.body("{\r\n"
//				+ "    \"firstname\" : \"Jim\",\r\n"
//				+ "    \"lastname\" : \"Brown\",\r\n"
//				+ "    \"totalprice\" : 111,\r\n"
//				+ "    \"depositpaid\" : true,\r\n"
//				+ "    \"bookingdates\" : {\r\n"
//				+ "        \"checkin\" : \"2018-01-01\",\r\n"
//				+ "        \"checkout\" : \"2019-01-01\"\r\n"
//				+ "    },\r\n"
//				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
//				+ "}");
//		reqSpec.contentType(ContentType.JSON).log().all();
//		
//		//hit request and get response
//		
//		Response resp=reqSpec.post();
//		
//		//Validate response
//		
//		ValidatableResponse validResp=resp.then().log().all();
//		
//		validResp.statusCode(200);
		
				
		
	}
}
