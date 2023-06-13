package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\applications\\loginpage.feature"},
		
		glue = {"stepss"}
		
	
		
		)

public class LoginRunner extends AbstractTestNGCucumberTests {

}
