package duncan;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// JUnit RunWith
@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@CustomTypeDemo", // Execute tagged features and scenarios
		glue = { "duncan.steps", "duncan.hooks", "duncan.customtypes" }, // Look for step definitions and hooks in these packages
		features = "src/test/resources/features", // Look for features in this folder
		plugin = { "pretty", "html:target/cucumber.html", "json:target/cucumber.json" }, // Write location for the JSON and HTML report
		snippets = CucumberOptions.SnippetType.CAMELCASE, // Generate snippets in camcelcase or with underscores
		dryRun = false, // When Cucumber runs, just print the missing step defs
		monochrome = false // Print to the console without color
		)
public class JUnitRunnerTest {

	// JUnit BeforeClass
	@BeforeClass
	public static void beforeClass() {
		System.out.println("=========== JUNIT beforeClass ===========");
	}

	// JUnit AfterClass
	@AfterClass
	public static void afterClass() {
		System.out.println("=========== JUNII afterClass ===========");
	}

}
