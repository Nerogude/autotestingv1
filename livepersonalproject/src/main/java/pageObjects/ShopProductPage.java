package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopProductPage extends BasePage{
	
	public WebDriver driver;
	
	By sizeOption = By.cssSelector("select[name='group[1]']");
	By quantityIncrease = By.cssSelector(".touchspin-up");
	By quantityDecrease = By.cssSelector(".touchspin-down");
	By addToCartBtn = By.cssSelector("[data-button-action]");
	By homePageLink = By.cssSelector("ol > li:nth-of-type(1) > a > span");

	public ShopProductPage() throws IOException {
		super();
	}
	public WebElement getSizeOption() throws IOException {
		this.driver = getDriver();
		return driver.findElement(sizeOption);
	}

}
