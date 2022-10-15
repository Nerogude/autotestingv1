package Section09;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class L02_DesiredCapabilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nero\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions option = new ChromeOptions();
		option.merge(cap);
		
		WebDriver driver = new ChromeDriver(option);
		
		
		driver.get("https://expired.badssl.com/");

	}

}
