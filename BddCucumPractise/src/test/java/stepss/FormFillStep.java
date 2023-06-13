package stepss;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormFillStep {
	
	@Given("user should be at registration page")
	public void user_should_be_at_registration_page() {
		System.out.println("Given Statement");
	   
	}

	@When("user enters following info")
	public void user_enters_following_info(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		List<String> firstuser = data.get(0);
		System.out.println(firstuser);
		for( List<String> value:data) {
			System.out.println(value);
		}
	   
	}

	@Then("user should get app id")
	public void user_should_get_app_id() {
		System.out.println("Then statement");
	
	}


}
