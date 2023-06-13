package Execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		//features = {"src\\test\\resources\\Execution"},
		features= {"@target/failrun.txt"},
		glue = {"Execution"},
		plugin = {"pretty","rerun:target/failrun.txt"}
				
		)

public class RunAmazonTest  extends AbstractTestNGCucumberTests {

}
