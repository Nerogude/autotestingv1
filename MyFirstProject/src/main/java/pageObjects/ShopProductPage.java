package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopProductPage extends BasePage{
	
	public WebDriver driver;
	
	By prodOne = By.cssSelector("img[alt^='Sponsored Ad – ASUS Vivobook 15 M1502IA 15.6\" Full HD Laptop']");
	By prodTwo = By.cssSelector("[srcset='https\\:\\/\\/m\\.media-amazon\\.com\\/images\\/I\\/71BxzF3S3CL\\._AC_UY218_\\.jpg 1x\\, https\\:\\/\\/m\\.media-amazon\\.com\\/images\\/I\\/71BxzF3S3CL\\._AC_UY327_FMwebp_QL65_\\.jpg 1\\.5x\\, https\\:\\/\\/m\\.media-amazon\\.com\\/images\\/I\\/71BxzF3S3CL\\._AC_UY436_FMwebp_QL65_\\.jpg 2x\\, https\\:\\/\\/m\\.media-amazon\\.com\\/images\\/I\\/71BxzF3S3CL\\._AC_UY545_FMwebp_QL65_\\.jpg 2\\.5x\\, https\\:\\/\\/m\\.media-amazon\\.com\\/images\\/I\\/71BxzF3S3CL\\._AC_UY654_FMwebp_QL65_\\.jpg 3x']");
	
	public ShopProductPage() throws IOException {
		super();
	}
	public WebElement getProdOne() throws IOException {
		this.driver=getDriver();
		return driver.findElement(prodOne);
	}
	public WebElement getProdTwo() throws IOException {
		this.driver=getDriver();
		return driver.findElement(prodTwo);
	}

}
