package uk.co.amazon;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjects.HomePage;

@Listeners(resources.Listeners.class)

public class EndToEndTest extends Hooks{

	public EndToEndTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void endToEndTest() throws IOException, InterruptedException {
	ExtentManager.log("Starting EndToEndTest...");
	
	//creating an object the homepage
	HomePage home= new HomePage();
	ExtentManager.pass("reached shop homepage...");
	home.getSearchInputField().sendKeys("laptop");
	Thread.sleep(3000);
	home.getSearchSubmitBtn().click();
	
	}

}
