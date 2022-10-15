package Section11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class L12_Dataprovider {
	WebDriver driver;
	
	@BeforeSuite
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nero\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		
		//data set 1
		data[0][0] = "nerostica@gmail.com";
		data[0][1] = "doctor";
		
		//data set 2
		data[1][0] = "nerostica1@gmail.com";
		data[1][1] = "doctor";
				
		//data set 3
		data[2][0] = "erosa@g.com";
		data[2][1] = "dyyyyyu8";	
		
		return data;
				
				
				
	}
	
	@Test(dataProvider = "getData")
	public void signin(String email, String password) throws InterruptedException {
		driver.get("http://teststore.automationtesting.co.uk/");
		driver.findElement(By.cssSelector("[title] .material-icons")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys(email);
		driver.findElement(By.cssSelector("[name='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("[data-link-action='sign-in']")).click();
		System.out.println("user has logged in");
		Thread.sleep(1500);
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


