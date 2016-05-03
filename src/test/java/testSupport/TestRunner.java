package testSupport;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepDefinitions",
		format = {"pretty", "html:target/cucumberReport"},
		monochrome = true
)
public class TestRunner {

}
//test