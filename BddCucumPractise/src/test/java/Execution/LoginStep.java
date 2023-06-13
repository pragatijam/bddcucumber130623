package Execution;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.DriverFactory;

public class LoginStep {
	
	LoginPage loginpage = new LoginPage(DriverFactory.GetDriver());
	 static String title;
	@Given("user is at landing page")
	public void user_is_at_landing_page() {
	   WebDriver driver = DriverFactory.GetDriver();
	  
	  driver.get("https://www.amazon.in/");
	    
	}

	@When("user gets the title of page")
	public void user_gets_the_title_of_page() {
	    title = loginpage.getTitleOfPage();
	}

	@Then("page title should have word {string}")
	public void page_title_should_have_word(String string) {
	   
		boolean ispresent = title.contains(string);
		
		assertEquals(ispresent, true);
	}

	@Then("cart icon should get display")
	public void cart_icon_should_get_display() {
	   
		boolean isdisplay = loginpage.isCartdisplaying();
		assertEquals(isdisplay, true);
		
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
	   loginpage.enterUsername(string);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
	   loginpage.enterPassword(string);
	}

	@When("user confirms signin")
	public void user_confirms_signin() {
	    loginpage.finalSignin();
	}	}
