package Section12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L02_Login {
WebDriver driver;
	
	@BeforeSuite
	public void setup() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nero\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream("C:\\Users\\Nero\\Desktop\\Resources\\workspace\\Intro\\src\\Section12\\L02_config.properties");
		prop.load(data);
		
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void signin() throws InterruptedException {
		
		driver.findElement(By.cssSelector("[title] .material-icons")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("nerostica@gmail.com");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("doctor");
		driver.findElement(By.cssSelector("[data-link-action='sign-in']")).click();
		System.out.println("user has logged in");
		Thread.sleep(1500);
		
	}

}
