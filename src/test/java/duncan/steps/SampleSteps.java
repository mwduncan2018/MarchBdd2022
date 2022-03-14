package duncan.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import duncan.domainobjects.Foobar;
import duncan.domainobjects.Guitar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;

public class SampleSteps {

	@Given("I do a thing")
	public void iDoAThing( ) {
		System.out.println("... inside iDoAThing()");
	}
	
	@When("something else happens")
	public void somethingElseHappens() {
		System.out.println("... inside somethingElseHappens()");
	}
	
	@Then("the result is good")
	public void theResultIsGood() {
		System.out.println("... inside theResultIsGood()");
	}
	
	@Given("a {foobar} exists")
	public void aFoobarExists(Foobar foobar) {
	}
}