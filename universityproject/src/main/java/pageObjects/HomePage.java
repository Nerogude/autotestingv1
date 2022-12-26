package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class HomePage extends BasePage{
	
	public WebDriver driver;
	
	By cypressWithCucumberLink = By.linkText("Cypress with Cucumber BDD - Beginner to Expert in 9 Hours!");
	By seleniumWebdriverNewFeaturesLink = By.cssSelector("p:nth-of-type(2) > a");
	By masteringSelectorsLink = By.cssSelector("p:nth-of-type(2) > a");
	By cypressv11Link = By.cssSelector("p:nth-of-type(4) > a");
	By seleniumWebdriverCucumberLink = By.cssSelector("p:nth-of-type(5) > a");
	By webdriverIoLink = By.cssSelector("p:nth-of-type(6) > a");
	By contactUsLink = By.cssSelector("a#contact-us h1");
	By loginPortalLink = By.cssSelector("a#login-portal h1");
	By buttonClicksLink = By.cssSelector("a#button-clicks h1");
	By toDoListLink = By.cssSelector("a#to-do-list h1");
	By pageObjectModelLink = By.cssSelector("body [class='col-md-12']:nth-of-type(5) h1");
	By accordionLink = By.cssSelector("div:nth-of-type(6) > a#page-object-model h1");
	By dropdownCheckboxesLink = By.cssSelector("a#dropdown-checkboxes-radiobuttons h1");
	By ajaxLoaderLink = By.cssSelector("a#ajax-loader h1");
	By actionsLink = By.cssSelector("a#ajax-loader h1");
	By scrollingAroundLink = By.cssSelector("a#ajax-loader h1");
	By popupsLink = By.cssSelector("a#popup-alerts h1");
	By iframeLink = By.cssSelector("a#iframe h1");
	By hiddenElementsLink = By.cssSelector("a#hidden-elements h1");
	By dataTablesLink = By.cssSelector("a#data-table h1");
	By autocompleteTextfieldLink = By.cssSelector("a#autocomplete-textfield h1");
	By fileUploadLink = By.cssSelector("a#file-upload h1");
	By datepickerLink = By.cssSelector("a#datepicker h1");
	By automationteststoreLink = By.cssSelector("[class='col-lg-12'] p");

	public HomePage() throws IOException {
		super();	
	}
	public WebElement getCypressWithCucumberLink() {
		this.driver=getDriver();
		return driver.findElement(cypressWithCucumberLink);
	}
	public WebElement getSeleniumWebdriverNewFeaturesLink() {
		this.driver = getDriver();
		return driver.findElement(seleniumWebdriverNewFeaturesLink);
	}
	public WebElement getMasteringSelectorsLink() {
		this.driver = getDriver();
		return driver.findElement(masteringSelectorsLink);
	}
	public WebElement getCypressv11Link() {
		this.driver = getDriver();
		return driver.findElement(cypressv11Link);
	}
	public WebElement getSeleniumWebdriverCucumberLink() {
		this.driver = getDriver();
		return driver.findElement(seleniumWebdriverCucumberLink);
	}
	public WebElement getWebdriverIoLink() {
		this.driver = getDriver();
		return driver.findElement(webdriverIoLink);
	}
	public WebElement getContactUsLink() {
		this.driver = getDriver();
		return driver.findElement(contactUsLink);
	}
	public WebElement getLoginPortalLink() {
		this.driver = getDriver();
		return driver.findElement(loginPortalLink);
	}
	public WebElement getButtonClicksLink() {
		this.driver = getDriver();
		return driver.findElement(buttonClicksLink);
	}
	public WebElement getToDoListLink() {
		this.driver = getDriver();
		return driver.findElement(toDoListLink);
	}

}
