package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CartContentPanel extends BasePage{
	
	public WebDriver driver;
	
	By removeLink = By.cssSelector("div:nth-of-type(1) > div > ul:nth-of-type(1)  .shopping-item--container--20bda > .shopping-item--horizontal-actions--11OMZ > button:nth-of-type(1) > span");
	By checkoutBtn = By.cssSelector(".checkout-button--checkout-button--1FJES.ud-btn.ud-btn-brand.ud-btn-large.ud-heading-md > span");
	

	public CartContentPanel() throws IOException {
		super();
	}
	
	public WebElement getRemoveLink() {
		this.driver = getDriver();
		return driver.findElement(removeLink);
	}
	public WebElement getCheckoutBtn() {
		this.driver = getDriver();
		return driver.findElement(checkoutBtn);
	}

}
