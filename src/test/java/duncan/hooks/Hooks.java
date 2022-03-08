package duncan.hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {

	// Cucumber BeforeAll
	@BeforeAll
	public static void beforeAll() {
		System.out.println("=========== CUCUMBER beforeAll ===========");
	}

	// Cucumber AfterAll
	@AfterAll
	public static void afterAll() {
		System.out.println("=========== CUCUMBER afterAll ===========");
	}

}
