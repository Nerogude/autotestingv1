import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DatePicker {
	
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		String Month = "October 2022";
		String day = "13";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/datepicker.html");
		driver.findElement(By.cssSelector("input#basicDate")).click();
		
		Thread.sleep(2000);
		
		
		while(true) 
		{
			String text = driver.findElement(By.cssSelector(".animate.arrowTop.flatpickr-calendar.hasTime  .flatpickr-current-month")).getText();
			if(text.equals(Month))
			{
				break;
			} 
			else 
			{
				driver.findElement(By.cssSelector(".animate.arrowTop.flatpickr-calendar.hasTime  .flatpickr-next-month")).click();
			}
			
		}
		
		driver.findElement(By.cssSelector("body [tabindex='-1']:nth-child(11) [aria-label='October 13\\, 2022']")).click();
	}

}
