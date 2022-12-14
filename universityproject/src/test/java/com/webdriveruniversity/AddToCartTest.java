package com.webdriveruniversity;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjects.CartContentPanel;
import pageObjects.HomePage;
import pageObjects.ShopContentPanel;

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
		ExtentManager.pass("Reached the homepage...");
		home.getCypressWithCucumberLink().click();
		
		//creating an object of the ShopContentPanel
		ShopContentPanel shopPanel = new ShopContentPanel();
		ExtentManager.pass("Reached the ShopContentPanel...");
		shopPanel.getGoToCartBtn().click();
		
		//creating an object of the CartContentPanel
		CartContentPanel cartPanel = new CartContentPanel();
		ExtentManager.pass("Reached the CartContentPanel...");
		//cartPanel.getDriver().switchTo().alert().dismiss();
		cartPanel.getCheckoutBtn().click();
		
	}

}
