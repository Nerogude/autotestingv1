package Section04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewPracticePro {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://goo.gl/RVdKM9");
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println("Title of page is:" + pageTitle);
		
		String url = driver.getCurrentUrl();
		System.out.println("url of page is:" + url);
		
		//Firstname
		driver.findElement(By.cssSelector("input[name='RESULT_TextField-1']")).sendKeys("nero");
		
		//Lastname
		driver.findElement(By.cssSelector("input[name='RESULT_TextField-2']")).sendKeys("ogud");
		
		//Email
		driver.findElement(By.cssSelector("input[name='RESULT_TextField-6']")).sendKeys("123test.com");
		
		//Dropdown
		Select dropdown = new Select (driver.findElement(By.cssSelector(".drop_down")));
		System.out.println(dropdown.getOptions().size());
		dropdown.selectByIndex(1);
		List <WebElement> options =  dropdown.getOptions();
		for (WebElement e:options) {
			System.out.println(e.getText());
		}
		//System.out.println(driver.findElement(By.cssSelector(".drop_down")).getText());
		
		WebElement radioBtn = driver.findElement(By.cssSelector("[for='RESULT_RadioButton-7_0']"));
		WebElement radioBtns = driver.findElement(By.cssSelector(".highlight > label"));
		
		System.out.println("Assert btn is displayed:" + radioBtn.isDisplayed());
		System.out.println("Assert btn is selected:" + radioBtn.isSelected());
		//driver.findElement(By.cssSelector("[for='RESULT_RadioButton-7_0']")).click();
		driver.findElement(By.cssSelector(".highlight > label")).click();
		System.out.println("Assert btn is selected:" + radioBtns.isSelected());
		System.out.println("Assert btn is enabled:" + radioBtn.isEnabled());
		
		
		

	}

}
