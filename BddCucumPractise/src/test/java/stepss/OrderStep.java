package stepss;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStep {
	

@Given("user should login into app")
public void user_should_login_into_app() {
	System.out.println("Background Given");
 
}

@When("user click on orders button")
public void user_click_on_orders_button() {
	System.out.println("Background When");
  
}

@Then("user should redirect to order page")
public void user_should_redirect_to_order_page() {
	System.out.println("Background Then");

}

@When("user click on orderid")
public void user_click_on_orderid() {
	System.out.println("scenario 1 when statment");
}

@Then("user should track the order")
public void user_should_track_the_order() {
	System.out.println("scenario 1 then statment");
}

@When("user click on past order button")
public void user_click_on_past_order_button() {
	System.out.println("scenario 2 when statment");
}

@Then("user should see the info")
public void user_should_see_the_info() {
	System.out.println("scenario 2 then statment");
}

}
