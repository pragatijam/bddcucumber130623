package stepss;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileStep {
	
	@Given("user is at the add profile page")
	public void user_is_at_the_add_profile_page() {
	   System.out.println("at profile page");
	}

	@When("user enters the info")
	public void user_enters_the_info() {
		 System.out.println("enter info");
	}

	@Then("user id gets created")
	public void user_id_gets_created() {
		 System.out.println("id is created");
	}

	@When("user click on edit link")
	public void user_click_on_edit_link() {
		 System.out.println("at edit page");
	}

	@When("user update the indo")
	public void user_update_the_indo() {
		 System.out.println("update info");
	}

	@Then("profile get updated")
	public void profile_get_updated() {
		 System.out.println("profile updated");
	}

	@When("user click on delete button")
	public void user_click_on_delete_button() {
		 System.out.println("click delete");
	}

	@Then("profile should get deleted")
	public void profile_should_get_deleted() {
		 System.out.println("profile get deleted");
	}

}
