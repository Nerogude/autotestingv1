package uk.co.automationtest;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomepage;
import pageObjects.ShopProductPage;

@Listeners(resources.Listeners.class)

public class AddRemoveItemBasketTest extends Hooks {

	public AddRemoveItemBasketTest() throws IOException {
		super();
	}
	@Test
	public void addRemoveItem() throws IOException, InterruptedException {
		ExtentManager.log("Starting AddRemoveItemBasketTest...");
		
		//creating an object of automationtesting.co.uk webpage
		Homepage home = new Homepage();
		home.getTestStoreLink().click();
		ExtentManager.pass("TestStore link is clicked...");
		
		//creating an object of store homepage
		ShopHomepage shopHome = new ShopHomepage();
		shopHome.getProductOne().click();
		ExtentManager.pass("reached the shop homepage...");
		
		//creating an object of shop products page
		ShopProductPage shopProd = new ShopProductPage();
		Select option = new Select(shopProd.getSizeOption());
		option.selectByVisibleText("M");
		ExtentManager.pass("Successfully selected size...");
		shopProd.getQuantIncrease().click();
		ExtentManager.pass("Successfully increased quantity...");
		Thread.sleep(3000);
		shopProd.getAddToCartBtn().click();
		ExtentManager.pass("Successfully added product to cart...");
		
		//creating an object of shop content panel
		ShopContentPanel cPanel = new ShopContentPanel();
	}

}


