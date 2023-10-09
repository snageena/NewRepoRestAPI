package restfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteExample {

	//200(0k) 204(No content) 202(Accepted)
	
	public static void main(String[] args) {
		
		RestAssured
		.given()
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com/booking/3")
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.contentType(ContentType.JSON)
		.when()
		.delete()
		.then()
		.log().all()
		.assertThat()
		.statusCode(201);
		
	}

}
