package com.webdriveruniversity;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjects.HomePage;

@Listeners(resources.Listeners.class)
public class AddToCartTest extends Hooks{

	public AddToCartTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void addToCart() throws IOException {
		ExtentManager.log("Starting AddToCartTest...");
		
		//creating an object of the homepage
		HomePage home = new HomePage();
		home.getCypressWithCucumberLink().click();
	}

}
