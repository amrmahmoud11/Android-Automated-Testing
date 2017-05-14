package android.cucumber.appium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class AbstractPage {

	protected AndroidDriver driver;
	protected WebDriverWait wait;

	public AbstractPage(AndroidDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}

	protected static void sleep(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	protected void enter(AndroidElement element, String keys) {
		element.clear();
		element.sendKeys(keys);	
	}
	
	
	
	protected void click(AndroidElement element) {
		element.click();
	}
}
