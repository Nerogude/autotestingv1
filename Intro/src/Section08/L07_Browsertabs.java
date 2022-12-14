package Section08;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L07_Browsertabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nero\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/browserTabs.html");
		for(int i=0; i<3; i++) 
		{
			driver.findElement(By.cssSelector("[type]")).click();
		}
		
		String Mainwindow = driver.getWindowHandle();
		
		Set<String> handlevalues = driver.getWindowHandles();
		
		
		System.out.println(handlevalues.size());
		
		for(String handle:handlevalues)
		{
			Thread.sleep(1500);
			driver.switchTo().window(handle);
		}
		driver.switchTo().window(Mainwindow);
	}

}
