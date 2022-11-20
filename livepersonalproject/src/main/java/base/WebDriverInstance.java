package base;

import java.io.IOException;

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
	}
	

}
