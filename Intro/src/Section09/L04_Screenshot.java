package Section09;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class L04_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nero\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationtesting.co.uk/");
		driver.manage().window().maximize();
		
		takeSnapShot(driver);

	}
	public static void takeSnapShot(WebDriver webdriver) throws IOException {
		File srcFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:\\Users\\Nero\\Desktop\\Resources\\Screenshot\\" + timestamp() + ".png");
		
		FileUtils.copyFile(srcFile, destFile);
	}
	
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
