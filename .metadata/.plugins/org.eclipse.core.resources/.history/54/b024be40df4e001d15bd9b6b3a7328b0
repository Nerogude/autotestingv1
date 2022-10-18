package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopContentPanel extends BasePage{
	public WebDriver driver;
	
	By continueShoppingBtn = By.cssSelector(".btn.btn-secondary");
	By checkOutBtn = By.cssSelector("PROCEED TO CHECKOUT");

	public ShopContentPanel() throws IOException {
		super();	
	}
	public WebElement getContinueShoppingBtn() {
		this.driver = getDriver();
		return driver.findElement(continueShoppingBtn);
	}
	public WebElement getCheckOutBtn() {
		this.driver = getDriver();
		return driver.findElement(checkOutBtn);
	}

}
