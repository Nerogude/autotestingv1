package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ProductContentPage extends BasePage{
	
	public WebDriver driver;
	
	By dropDownBtn = By.cssSelector("#quantity");
	By addToBasketBtn = By.cssSelector(".attach-dss-atc");

	public ProductContentPage() throws IOException {
		super();
	}
	public WebElement getDropDownBtn() {
		this.driver=getDriver();
		return driver.findElement(dropDownBtn);
	}
	public WebElement getAddToBasketBtn() {
		this.driver=getDriver();
		return driver.findElement(addToBasketBtn);
	}

}
