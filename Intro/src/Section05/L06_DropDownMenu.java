package Section05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L06_DropDownMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nero\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/dropdown.html");
		//driver.findElement(By.xpath("/html//select[@id='cars']"));
		Select menuitem = new Select(driver.findElement(By.xpath("/html//select[@id='cars']")));
		System.out.println(
		"Number of car options in dropdown is:"+ menuitem.getOptions().size()
		);
		menuitem.selectByIndex(3);
		List <WebElement> cars = menuitem.getOptions();
		for(WebElement e: cars)
		{
			System.out.println(e.getText());
		}
			
		
		
	}

}
