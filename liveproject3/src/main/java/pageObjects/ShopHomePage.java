package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopHomePage extends BasePage{
	
	public WebDriver driver;
	
	By prodOne = By.cssSelector("[alt='Hummingbird printed t-shirt']");
	By prodTwo = By.cssSelector("[alt='Brown bear printed sweater']");
	By prodThree = By.cssSelector("[alt='The best is yet to come\\' Framed poster']");
	By prodFour = By.cssSelector("[alt='Mug The best is yet to come']");
	By prodFive = By.cssSelector("[alt='Today is a good day Framed poster']");
	By prodSix = By.cssSelector("[alt='Mug The best is yet to come']");
	By prodSeven = By.linkText("Mug The Adventure Begins");
	By prodEight = By.linkText("Mug Today Is A Good Day");


	public ShopHomePage() throws IOException {
		super();
		
	}
	
	public WebElement getProdOne() {
		this.driver = getDriver();
		return driver.findElement(prodOne);
	}
	public WebElement getProdTwo() {
		this.driver = getDriver();
		return driver.findElement(prodTwo);
	}
	public WebElement getProdThree() {
		this.driver=getDriver();
		return driver.findElement(prodThree);
	}
	public WebElement getProdFive() {
		this.driver=getDriver();
		return driver.findElement(prodFive);
	}
	public WebElement getProdSix() throws IOException {
		this.driver = getDriver();
		return driver.findElement(prodSix);
	}

	public WebElement getProdSeven() throws IOException {
		this.driver = getDriver();
		return driver.findElement(prodSeven);
	}

	public WebElement getProdEight() throws IOException {
		this.driver = getDriver();
		return driver.findElement(prodEight);
	}

	

}
