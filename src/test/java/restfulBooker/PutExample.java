package restfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutExample {

	public static void main(String[] args) 
	{
		RestAssured
		.given()
		.log().all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking/2656")
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.body("{\r\n"
				+ "    \"firstname\" : \"JamesNew\",\r\n"
				+ "    \"lastname\" : \"BrownNew\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		.when()
		.put()
		.then()
		.log().all()
		//.assertThat()
		.statusCode(200);

		
	}

}
