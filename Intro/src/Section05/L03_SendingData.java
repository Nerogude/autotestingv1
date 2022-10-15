package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03_SendingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nero\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/contactForm.html");
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("John");
		driver.findElement(By.cssSelector("form#contact_form > input[name='last_name']")).sendKeys("Smith");
		driver.findElement(By.cssSelector("form#contact_form > input[name='email']")).sendKeys("johnsmith@test.com");
		driver.findElement(By.cssSelector("textarea")).sendKeys("this is a message");

	}

}
