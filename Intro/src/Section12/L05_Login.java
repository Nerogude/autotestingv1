package Section12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L05_Login extends L05_BasePage {

	
	
	
	public L05_Login() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void signin() throws InterruptedException, IOException {
		
		driver = getDriver();
		driver.get(getUrl());
		
		driver.findElement(By.cssSelector("[title] .material-icons")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("nerostica@gmail.com");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("doctor");
		driver.findElement(By.cssSelector("[data-link-action='sign-in']")).click();
		
		takeSnapShot(driver);
		
		System.out.println("user has logged in");
		Thread.sleep(1500);
		
	}

}
