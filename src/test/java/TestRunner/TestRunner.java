package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(  
		features = "src/test/java/Feature", //for all tests which are there in feature
		glue="StepDefinition",
		tags= "@Register")
public class TestRunner {



}
