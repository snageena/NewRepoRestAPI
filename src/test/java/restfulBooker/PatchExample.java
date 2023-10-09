package restfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PatchExample {

	public static void main(String[] args) 
	{
		
		RestAssured
		.given()
		.log().all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking/2656")
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.body("{\r\n"
				+ "    \"firstname\" : \"James\",\r\n"
				+ "    \"lastname\" : \"Brown\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		.when()
		.patch()
		.then()
		.log().all()
		//.assertThat()
		.statusCode(200);
	}

}
