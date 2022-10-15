package Section11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L09_Annotationpt2 {
	WebDriver driver;
	
	@BeforeSuite
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nero\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	
	@BeforeMethod
	public void signin() throws InterruptedException {
		driver.get("http://teststore.automationtesting.co.uk/");
		driver.findElement(By.cssSelector("[title] .material-icons")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("nerostica@gmail.com");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("doctor");
		driver.findElement(By.cssSelector("[data-link-action='sign-in']")).click();
		System.out.println("user has logged in");
		Thread.sleep(1500);
				
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.linkText("CLOTHES")).click();
		System.out.println("user has clicked clothes link");
			
		Thread.sleep(1500);
	}
	
	@AfterMethod
	public void signout() throws InterruptedException {
		driver.findElement(By.cssSelector(".user-info [rel='nofollow']:nth-of-type(1)")).click();
		System.out.println("user has logged out");
		Thread.sleep(1500);
	}
	@AfterSuite
	public void end() {
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	}	


