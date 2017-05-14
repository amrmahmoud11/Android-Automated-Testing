package android.cucumber.appium.features;

import org.junit.Assert;
import android.cucumber.appium.AndroidDriverFactory;
import android.cucumber.appium.pageobjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class TestSteps {
	
	HomePage homepage= new HomePage(AndroidDriverFactory.get());
	
	
	@Given("App is open")
	public void GivenAppIsOpen(){
		homepage.clickSkipSignIn();
	}

	@When("I search for '(.*)'")
	public void searchfor(String value){
		homepage.setSearchBoxValue(value);
	}

	@Then("I should see results")
	public void searchfor(){
		Assert.assertTrue(homepage.resultsNoVisible());
	}
	
}
