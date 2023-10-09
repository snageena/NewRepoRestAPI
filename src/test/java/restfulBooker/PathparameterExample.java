package restfulBooker;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class PathparameterExample {

	public static void main(String[] args) {

		RestAssured
		.given()
		.log()
		.all()
		.pathParam("basepath", "booking")
		.when()
		.get("https://restful-booker.herokuapp.com/{basepath}/{bookingid}",1294)
		.then()
		.log().all().statusCode(200);
		
		//or
		//in below code we are giving both basepath and path parameter both in get method
		//if we give basepath in pathparameter and in get statement, it takes first priority as pathparam only
		//then it considers that string as booking id...it does not overirde
		
		RestAssured
		.given()
		.log()
		.all()
		.when()
		.get("https://restful-booker.herokuapp.com/{basepath}/{bookingid}","booking",1294)
		.then()
		.log().all().statusCode(200);
		
		//or
		
		Map<String,Object> pathParameters=new HashMap<>();
		
		pathParameters.put("basepath", "booking");
		pathParameters.put("bookingid", 1294);
		
		//instead of adding more path parameters lines in code, we can use maps to put and add single line in code
		RestAssured
		.given()
		.log().all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("{basepath}/{bookingid}")
		//.pathParam("basepath", "booking")
		//.pathParam("bookingid", 3081)
		.pathParams(pathParameters)
		.when()
		.get()
		.then()
		.log().all()
		.statusCode(200);
		
	}

}
