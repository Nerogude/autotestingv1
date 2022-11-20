package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class WebDriverInstance {
	
	public static ThreadLocal<WebDriver>driver= new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		if(driver.get()==null) {
			try {
				driver.set(createDriver());
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return driver.get();
	}
	public static WebDriver createDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream(System.getProperty("user.dir")+
				"\\src\\main\\java\\resources\\config.properties" );
		prop.load(data);
	}

}
