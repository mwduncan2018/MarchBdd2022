package duncan.hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {

	/*
	 * Cucumber's BeforeAll executes after JUnit's BeforeClass.
	 * Cucumber's AfterAll executes before JUnit's AfterClass.
	 */
	@BeforeAll
	public static void beforeAll() {
		System.out.println("=========== CUCUMBER beforeAll ===========");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("=========== CUCUMBER afterAll ===========");
	}
	
	/*
	 * Tag a hooks for execution with 'value'.
	 */
	@Before(value = "@PrintScenarioInformation")
	public void beforePrintScenarioInformation(Scenario scenario) {
		System.out.println("Scenario Name: " + scenario.getName());
		System.out.println("Scenario Line: " + scenario.getLine());
		System.out.println("Scenario Tags: " + scenario.getSourceTagNames());
		System.out.println("Scenario URI: " + scenario.getUri());
		System.out.println("Scenario Status: " + scenario.getStatus());
		System.out.println("Scenario isFailed: " + scenario.isFailed());		
	}
	
	/*
	 * Before hooks start at 1 and count up.
	 */
	@Before(order = 1)
	public void before1(Scenario scenario) {
		System.out.println("before1");
	}
	@Before(order = 2)
	public void before2(Scenario scenario) {
		System.out.println("before2");
	}

	/*
	 * After hooks count down to 1.
	 * On scenario failure, the after hook still executes.
	 */
	@After(order = 2)
	public void after2(Scenario scenario) {
		System.out.println("after2");
	}	
	@After(order = 1)
	public void after1(Scenario scenario) {
		System.out.println("after1");
	}
	
	/*
	 * Before step and after step cannot be tagged.
	 * On step failure, the after step still executes.
	 */
	@BeforeStep
	public void beforeStep() {
		System.out.println("beforeStep");
	}
	@AfterStep
	public void afterStep() {
		System.out.println("afterStep");
	}
}
