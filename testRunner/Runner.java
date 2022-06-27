package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		,glue={"step"},tags="@SmokeTest",
				 plugin = {
	                        "pretty",
	                        "json:target/cucumber-report/cucumber.json",
	                        "html:target/cucumber-report/cucumber.html"},
		monochrome = true
		
		)

public class Runner {

}