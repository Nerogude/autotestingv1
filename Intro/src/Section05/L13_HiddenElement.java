package Section05;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class L13_HiddenElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nero\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/accordion.html");
		driver.findElement(By.cssSelector("li:nth-of-type(11) > a")).click();
		System.out.println(driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(3)")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("#main [class] p:nth-child(3)")).isDisplayed());
		
		
	
		
		
		
	}

}
