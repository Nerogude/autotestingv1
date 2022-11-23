package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	private String url;
	private Properties prop;
	public static String screenShotDestinationPath;
	
	public BasePage() throws IOException {
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream(System.getProperty("user.dir")+ 
				"\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
	}
	public static WebDriver getDriver() {
		return WebDriverInstance.getDriver();
	}
	public String getUrl() {
		url=prop.getProperty("url");
		return url;
	}
	public static String takeSnapShot(String name) {
		File srcFile=((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		String destFile= System.getProperty("user.dir")+"\\target\\screenshots\\" + timestamp() + ".png";
	}
	

}
