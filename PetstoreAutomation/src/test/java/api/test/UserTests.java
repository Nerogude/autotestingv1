package api.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.payload.User;
import io.restassured.response.Response;
import junit.framework.Assert;

public class UserTests {
	Faker fake;
	User userPayload;
	
	@BeforeClass
	public void setup() {
		userPayload.setId(fake.idNumber().hashCode());
		userPayload.setUsername(fake.name().username());
		userPayload.setFirstName(fake.name().firstName());
		userPayload.setLastName(fake.name().lastName());
		userPayload.setEmail(fake.internet().safeEmailAddress());
		userPayload.setPassword(fake.internet().password(5, 10));
		userPayload.setPhone(fake.phoneNumber().cellPhone());
		
	}
	@Test(priority=1)
	public void testPostUser()
	{
		Response response = UserEndPoints.createUser(userPayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test
	public void testReadUser()
	{
		Response response = UserEndPoints.readUser(this.userPayload.getUsername());
		response.then().log().all();
		response.statusCode();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
