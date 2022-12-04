package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ProductProtectionPage extends BasePage{
	
	public WebDriver driver;
	
	By noThanksBtn = By.cssSelector("#attachSiNoCoverage [type]");
	By addProtectionBtn = By.cssSelector("#attachSiAddCoverage .a-button-input");

	public ProductProtectionPage() throws IOException {
		super();
		
	}
	public WebElement getNoThanksBtn() {
		this.driver=getDriver();
		return driver.findElement(noThanksBtn);
	}
	public WebElement getAddProtectionBtn() {
		this.driver=getDriver();
		return driver.findElement(addProtectionBtn);
		
	}

}
