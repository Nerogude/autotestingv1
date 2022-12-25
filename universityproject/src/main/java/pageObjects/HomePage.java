package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class HomePage extends BasePage{
	
	public WebDriver driver;
	
	By cypressWithCucumberLink = By.linkText("Cypress with Cucumber BDD - Beginner to Expert in 9 Hours!");
	By seleniumWebdriverNewFeaturesLink = By.cssSelector("p:nth-of-type(2) > a");
	By masteringSelectors = By.cssSelector("p:nth-of-type(2) > a");
	By cypressv11 = By.cssSelector("p:nth-of-type(4) > a");
	By seleniumWebdriverCucumber = By.cssSelector("p:nth-of-type(5) > a");

	public HomePage() throws IOException {
		super();
		
	}

}
