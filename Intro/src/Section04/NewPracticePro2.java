package Section04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewPracticePro2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10000);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".wikipedia-input-box [type]")).sendKeys("welcome");
		driver.findElement(By.cssSelector("[onclick]")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().frame(0);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='RESULT_TextField-1']")));
		driver.findElement(By.cssSelector("input[name='RESULT_TextField-1']")).sendKeys("advantage");
		
		Select dropdown = new Select (driver.findElement(By.cssSelector(".drop_down")));
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getOptions().size());
		List <WebElement>options = dropdown.getOptions();
		for(WebElement e:options) {
			System.out.println(e.getText());
		}
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement link:links) {
			System.out.println(link.getText());
		}
		String handleValue = driver.getWindowHandle();
		System.out.println(handleValue);
		driver.switchTo().window(handleValue).close();
		

	}

}
