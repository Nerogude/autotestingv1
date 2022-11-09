package day1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;


public class ResponseParsing {
	
	@Test
	
	void testJsonResponse() {
		Response res=given()
			.contentType("ContentType.JSON")
		
		.when()
			.get("http://localhost:3000/store");
		//Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertEquals(res.getHeader("Content-Type"),"application/json; charset=utf-8");
		
		
	
	}

}
