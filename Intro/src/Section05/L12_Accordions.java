package Section05;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class L12_Accordions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nero\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/accordion.html");
		driver.findElement(By.cssSelector("li:nth-of-type(2) > a")).click();
		
		for(int i=0; i<10; i++)
		{
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
		}
		
		
	
		
		
		
	}

}
