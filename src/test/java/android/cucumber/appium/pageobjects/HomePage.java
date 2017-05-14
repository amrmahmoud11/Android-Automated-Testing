package android.cucumber.appium.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends AbstractPage{
	
	
	public HomePage(AndroidDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "de.amazon.mShop.android:id/skip_sign_in_button")
	private AndroidElement skipSignIn;
	
	@AndroidFindBy(id = "de.amazon.mShop.android:id/search_edit_text")
	private AndroidElement searchBox;
	
	@AndroidFindBy(id ="de.amazon.mShop.android:id/rs_search_src_text")
	private AndroidElement searchBoxText;
	
	@AndroidFindBy(id ="de.amazon.mShop.android:id/rs_result_count_label")
	private AndroidElement resultsNo;
	
	
	public void clickSkipSignIn(){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(skipSignIn));
		skipSignIn.click();
	}
	public void setSearchBoxValue(String value){
		searchBox.click();
		searchBoxText.sendKeys(value+"\n");
	}

	public boolean resultsNoVisible(){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(resultsNo));
		return resultsNo.isDisplayed();
	}
}
