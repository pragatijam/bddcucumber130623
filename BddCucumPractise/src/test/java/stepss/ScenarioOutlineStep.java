package stepss;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineStep {
	

@Given("user is at application login screen")
public void user_is_at_application_login_screen() {
	  System.out.println("user at login page");
}

@When("user enters {string} in username field")
public void user_enters_in_username_field(String username) {
	  System.out.println("user enter username"+username);
}

@When("user enters {string} in password field")
public void user_enters_in_password_field(String password) {
	  System.out.println("user enter username"+password);
}

@When("user click on signin button")
public void user_click_on_signin_button() {
	  System.out.println("click signinin button");
}

@Then("user should get login message")
public void user_should_get_login_message() {
    System.out.println("Get error message");
}

}
