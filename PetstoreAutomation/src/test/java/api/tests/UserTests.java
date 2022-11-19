package api.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endPoint.userEndPoints;
import api.payload.User;
import io.restassured.response.Response;


public class UserTests {
	User userPayload;
	Faker fake;
	
	@BeforeClass
	public void setupData() {
		
		
		userPayload= new User();
		fake= new Faker();
		
		userPayload.setId(fake.idNumber().hashCode());
		userPayload.setUsername(fake.name().username());
		userPayload.setFirstName(fake.name().firstName());
		userPayload.setLastName(fake.name().lastName());
		userPayload.setEmail(fake.internet().safeEmailAddress());
		userPayload.setPassword(fake.internet().password(5, 10));
		userPayload.setPhone(fake.phoneNumber().cellPhone());
		
	}
	
	
	@Test(priority=1)
	public void test_postUser() {
			
		Response response =userEndPoints.createUser(userPayload);
		response.then().log().all();
		Assert.assertEquals(response.statusCode(), 200);
		
	}

}
