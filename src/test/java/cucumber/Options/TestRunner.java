package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",plugin ={"json:target/jsonReports/cucumber-report.json","html:target/cucumber.html"},tags="@DeletePlace",glue= "stepDefinations")
public class TestRunner {
//tags= {"@DeletePlace"}  compile test verify
}


//mvn test -Dcucumber.filter.tags="@DeletePlace" -  Example Command to Run Tests by Tag