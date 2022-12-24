package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class HomePage extends BasePage{
	
	public WebDriver driver;
	
	By addressField= By.cssSelector("public WebDriver driver;");
	By searchDropDown= By.cssSelector(".nav-search-scope");
	By searchInputField= By.cssSelector("[name='field-keywords']");
	By searchSubmitBtn= By.cssSelector("[value='Go']");
	
	public HomePage() throws IOException {
		super();
	}
	public WebElement getAddressField() throws IOException {
		this.driver=getDriver();
		return driver.findElement(addressField);	
	}
	public WebElement getSearchDropDown() throws IOException {
		this.driver=getDriver();
		return driver.findElement(searchDropDown);
	}
	public WebElement getSearchInputField() throws IOException {
		this.driver=getDriver();
		return driver.findElement(searchInputField);
	}
	public WebElement getSearchSubmitBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(searchSubmitBtn);
	}

	
	
	

}
