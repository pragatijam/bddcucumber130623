package stepss;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpagesteps {
	

@Given("User is at the login screen")
public void user_is_at_the_login_screen() {
  System.out.println("User is at the login screen");
}

@When("User enters the username")
public void user_enters_the_username() {
    System.out.println("User enters the username");
}

@When("User enters the password")
public void user_enters_the_password() {
   System.out.println("User enters the password");
}

@When("User click on login button")
public void user_click_on_login_button() {
System.out.println("User click on login button");
}

@Then("User should get redirect to the home page")
public void user_should_get_redirect_to_the_home_page() {
  System.out.println("User should get redirect to the home page");
}

@When("User enters the incorrect username")
public void user_enters_the_incorrect_username() {
	 System.out.println("User enters the incorrect username");
}

@When("User enters the incorrect password")
public void user_enters_the_incorrect_password() {
	 System.out.println("User enters the incorrect password");
}

@Then("User should get error message")
public void user_should_get_error_message() {
	 System.out.println("User should get error message");

}
}
