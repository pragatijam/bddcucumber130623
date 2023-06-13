package stepss;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginwithDataStep {
	@Given("user at logon page")
	public void user_at_logon_page() {
		 System.out.println("user at logon page");
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String user) {
		 System.out.println("user enters username as "+user);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String pass) {
		 System.out.println("user enters password as "+pass);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		 System.out.println("user click on login button");
	}

	@Then("user should get log into homepage")
	public void user_should_get_log_into_homepage() {
		 System.out.println("user should get log into homepage");
	}

}
