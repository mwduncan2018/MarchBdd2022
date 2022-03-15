package duncan.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.datatable.DataTable;

public class TagsSteps {

	@Given("I print pie")
	public void iPrintPie() {
		System.out.println("3.141592654");
	}
	
	@Given("^I print (.*) and (.*)$")
	public void iPrintFirstNameAndLastName(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}
}
