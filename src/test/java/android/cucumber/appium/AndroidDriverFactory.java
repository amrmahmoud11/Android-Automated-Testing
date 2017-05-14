package android.cucumber.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

 
public class AndroidDriverFactory {

	public static final long PAGE_LOAD_TIMEOUT_SEC = 30;
	protected static Logger logger;
	public static AndroidDriver driver = null;
	

	public static AndroidDriver get() {
		if (driver != null && isAlive(driver)) {
			return driver;
		} else {
			driver = createDriver();
			return driver;
		}
		
	}

	
	private static boolean isAlive(AndroidDriver driver) {
		return (driver.toString().contains("null")) ? false : true;
	}

	private static AndroidDriver createDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Name (Galaxy S4)");
		capabilities.setCapability("platformVersion", "5.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "de.amazon.mShop.android");
		capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

		try {
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger = Logger.getLogger("WebDriverFactory");
		return driver;
	}

}
