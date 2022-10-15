package Section08;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L01TravelWebsitePt1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nero\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.easyjet.com/en");
		driver.findElement(By.xpath("//*[@id=\"ensCloseBanner\"]")).click();
		List<WebElement> origins = driver.findElements(By.cssSelector("#ui-id-1 li>a>span"));
		
		for(WebElement origin:origins)
		{
			if(origin.getText().contains("Southend"))
			{
				origin.click();
			}
		}
		
		

	}

}
