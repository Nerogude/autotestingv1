package Section11;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Section11.L17_ITestListener.class)

public class L17_TestClass {
WebDriver driver;
	
	@BeforeSuite
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nero\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");
		Thread.sleep(2000);
	
	}	
	@Test
	public void enterEmail() {
		Assert.fail();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("nerostica@gmail.com");
		
	}
	@Test
	public void enterPassword() {
		
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("doctor");
		
	}
	

}
