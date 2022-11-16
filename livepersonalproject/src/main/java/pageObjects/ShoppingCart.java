package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;



public class ShoppingCart extends BasePage{
	
	public WebDriver driver;
	
	By promoLink = By.linkText("Have a promo code?");
	By checkoutBtn = By.linkText("PROCEED TO CHECKOUT");
	By promoBox = By.cssSelector("input[name='discount_name']");
	By promoAddBtn = By.cssSelector("form[method='post']  span");
	By deleteItemOne = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
	By deleteItemTwo = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
	By totalValue = By.cssSelector(".cart-total .value");

	public ShoppingCart() throws IOException {
		super();
	}
	public WebElement getPromoLink() throws IOException {
		this.driver= getDriver();
		return driver.findElement(promoAddBtn);
	}
	public WebElement getCheckoutBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(checkoutBtn);	
	}
	public WebElement getPromoBox() throws IOException {
		this.driver=getDriver();
		return driver.findElement(promoBox);
	}
	public WebElement getPromoAddBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(promoAddBtn);
	}
	public WebElement getDeleteItemOne() throws IOException {
		this.driver=getDriver();
		return driver.findElement(deleteItemOne);
	}
	public WebElement getDeleteItemTwo() throws IOException {
		this.driver=getDriver();
		return driver.findElement(deleteItemTwo);
	}
	public WebElement getTotalValue() throws IOException {
		this.driver=getDriver();
		return driver.findElement(totalValue);
	}

}
