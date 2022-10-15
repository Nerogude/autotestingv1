package Section05;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class L11_Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nero\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/popups.html");
		driver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();
		Set <String> handlevalues = driver.getWindowHandles();
		for(String handle: handlevalues)
		{
			driver.switchTo().window(handle).close();
		}
		
	
		
		
		
	}

}
