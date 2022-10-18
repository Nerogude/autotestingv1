package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopProductPage extends BasePage{
	
	public WebDriver driver;
	
	By sizeDrpDownBtn = By.cssSelector("[data-product-attribute='1']");
	By quantityIncrease = By.cssSelector(".touchspin-up");
	By addToCartBtn = By.cssSelector("[data-button-action]");
	By homepageLink = By.xpath("//section[@id='wrapper']//nav[@class='breadcrumb hidden-sm-down']/ol//span[.='Home']");

	public ShopProductPage() throws IOException {
		super();
		
	}
	public WebElement getSizeDrpDownBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(sizeDrpDownBtn);
	}
	public WebElement getQuantityIncrease() throws IOException {
		this.driver = getDriver();
		return driver.findElement(quantityIncrease);
	}
	public WebElement getAddToCartBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addToCartBtn);
	}
	public WebElement getHomepageLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(homepageLink);
		
	}

}
