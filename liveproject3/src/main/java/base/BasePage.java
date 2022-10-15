package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	private Properties prop;
	private String url;
	public static String screenShotDestinationPath;
	
	public BasePage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
	}
	public static WebDriver getDriver() {
		return WebDriverInstance.getDriver();
	}
	
	public String url() {
		url = prop.getProperty("url");
		return url;
	}
	
	public static String takeSnapShot (String name) {
		File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		String destFile = System.getProperty("user.dir") + "\\target\\screenshots\\" + timestamp() + ".png";
		screenShotDestinationPath = destFile;
		
		try {FileUtils.copyFile(srcFile, new File(destFile));
		}catch (IOException e) {
			e.printStackTrace();
		}
		return name;
	}
	public static String timestamp() {return new SimpleDateFormat("yyyy-MM-dd-HH-ss").format(new Date());}
	public static String getscreenShotDestinationPath() {return screenShotDestinationPath;}
	
	

}
