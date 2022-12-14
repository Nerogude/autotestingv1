import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/browserTabs.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		for(int i=0; i<3; i++) {
			driver.findElement(By.cssSelector("[type]")).click();
		}
		
		String MainWindow = driver.getWindowHandle();
		System.out.println(MainWindow);
		
		Set <String> handleValues = driver.getWindowHandles();
		
		System.out.println(handleValues.size());
		
		for(String value: handleValues) {
			String title = driver.switchTo().window(value).getTitle();
			Thread.sleep(1500);
			if(!title.contains("Browser Tabs")) {
				Thread.sleep(1500);
				driver.close();
			}
			
			
		}



	}

}
