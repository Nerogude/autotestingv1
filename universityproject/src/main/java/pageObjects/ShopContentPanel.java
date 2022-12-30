package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopContentPanel extends BasePage{
	
	public WebDriver driver;
	
	By goToCartBtn = By.cssSelector(".styles--go-to-cart--2K-KE.ud-btn.ud-btn-large.ud-btn-primary.ud-heading-md > span");
	By addAllToCartBtn = By.cssSelector(".styles--cart-success-modal--GFoaO .bundle-unit--bundle-border--S8wVb .add-to-cart.bundle-unit--add-to-cart--3P_rg.ud-btn.ud-btn-brand.ud-btn-large.ud-heading-md");
	

	public ShopContentPanel() throws IOException {
		super();
	}
	public WebElement getGoToCartBtn() {
		this.driver = getDriver();
		return driver.findElement(goToCartBtn);
	}
	public WebElement getAddAllToCartBtn() {
		this.driver = getDriver();
		return driver.findElement(addAllToCartBtn);
	}

}
