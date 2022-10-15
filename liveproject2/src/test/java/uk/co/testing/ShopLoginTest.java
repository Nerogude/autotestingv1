package uk.co.testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomepage;
import pageObjects.ShopLoginPage;
import pageObjects.ShopProductPage;
import pageObjects.ShopYourAccount;
import pageObjects.ShoppingCart;

@Listeners(resources.Listeners.class)

public class ShopLoginTest extends Hooks {

	public ShopLoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void addRemoveItem() throws IOException, InterruptedException {
		
		ExtentManager.log("Starting ShopLoginTest...");
		
		// creating an object of the automationtesting.co.uk webpage
		Homepage home = new Homepage();
		home.getTestStoreLink().click();

		// creating an object of the test store homepage
		ShopHomepage shopHome = new ShopHomepage();
		shopHome.getLoginBtn().click();
		
		FileInputStream workbookLocation =  new FileInputStream(System.getProperty("user.dir") + 
				"\\src\\main\\java\\resources\\credentials.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(workbookLocation);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Row row1 = sheet.getRow(1);
		Cell cellR1C0 = row1.getCell(0);
		Cell cellR1C1 = row1.getCell(1);
		
		String emailRow1 = cellR1C0.toString();
		String passwordRow1 = cellR1C1.toString();
		
		ShopLoginPage shop = new ShopLoginPage();
		shop.getEmail().sendKeys(emailRow1);
		shop.getPassword().sendKeys(passwordRow1);
		
		Thread.sleep(3000);
		
		shop.getSubmitBtn().click();
		
		ShopYourAccount yourAcc = new ShopYourAccount();
		
		try {
			
			yourAcc.getSignOut().click();
			ExtentManager.pass("user HAS signed in");
		}catch (Exception e) {
			ExtentManager.fail("user could NOT sign in");
			Assert.fail();
		}
		
		
		
		Row row2 = sheet.getRow(2);
		Cell cellR2C0 = row2.getCell(0);
		Cell cellR2C1 = row2.getCell(1);
		
		String emailRow2 = cellR2C0.toString();
		String passwordRow2 = cellR2C1.toString();
		
		shop.getEmail().sendKeys(emailRow2);
		shop.getPassword().sendKeys(passwordRow2);
		
		Thread.sleep(5000);
		shop.getSubmitBtn().click();
		
		try {
			yourAcc.getSignOut().click();
			ExtentManager.pass("user HAS signed in");
		}catch (Exception e) {
			ExtentManager.fail("user could NOT sign in");
			Assert.fail();
		}
		
		
		
		
	}
}













