package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopContentPanel extends BasePage{
	
	public WebDriver driver;
	
	By continueShoppingBtn = By.cssSelector(".btn.btn-secondary");
	By checkoutBtn = By.cssSelector("btn btn-primary");

	public ShopContentPanel() throws IOException {
		super();
	}
	public WebElement getContShopBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueShoppingBtn);
	}
	public WebElement getCheckoutBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(checkoutBtn);
	}

}
