package uk.co.automationtesting;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Hooks;
import pageObjects.Homepage;
import pageObjects.OrderFormDelivery;
import pageObjects.OrderFormPersInfo;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomepage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

@Listeners(resources.Listeners.class)

public class OrderCompleteTest extends Hooks {

	public OrderCompleteTest() throws IOException {
		super();		
	}
	
	@Test
	public void endToEndTest() throws IOException {
		
		Homepage home = new Homepage();
		home.getTestStoreLink().click();
		
		ShopHomepage shop = new ShopHomepage();
		shop.getProdOne().click();
		
		ShopProductPage shopprod = new ShopProductPage();
		Select size = new Select (shopprod.getSizeDrpDownBtn());
		size.selectByVisibleText("M");
		shopprod.getQuantityIncrease().click();
		shopprod.getAddToCartBtn().click();
		
		ShopContentPanel contpan = new ShopContentPanel();
		contpan.getCheckoutBtn().click();
		
		ShoppingCart sCart = new ShoppingCart();
		sCart.getHavePromo().click();
		sCart.getPromoTextbox().sendKeys("20OFF");
		sCart.getPromoAddBtn().click();
		sCart.getProceedCheckoutBtn().click();
		
		OrderFormPersInfo pInfo = new OrderFormPersInfo();
		pInfo.getGenderMr().click();
		pInfo.getFirstNameField().sendKeys("oscar");
		pInfo.getLastnameField().sendKeys("oscar");
		pInfo.getEmailField().sendKeys("oscar@gmail.com");
		pInfo.getTermsConditionsCheckbox().click();
		pInfo.getContinueBtn().click();
		
		
		OrderFormDelivery orderDelivery = new OrderFormDelivery();
		orderDelivery.getCompanyField().sendKeys("enotee");
		Select state = new Select (orderDelivery.getStateDropdown());
		state.selectByVisibleText("Alaska");
		orderDelivery.getContinueBtn().click();
	}

}
