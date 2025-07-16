package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\datta\\eclipse-workspace\\datta.cucucmber.ui\\src\\main\\resources\\features"
		,glue={"stepDefinations","Hooks"}
		,monochrome = false
	    ,tags = "@tag1"
	    ,plugin = {
	            "pretty",
	            "html:target/cucumber-reports.html",
	            "json:target/cucumber.json",
	            "junit:target/cucumber.xml"
	        }
		
		)
public class TestRunner {

}
 