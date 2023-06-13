package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applications\\Profile.feature"},
		glue = {"stepss"},
		tags = "@sanity or @functional"
		
				
		)

public class ProfileRunner extends AbstractTestNGCucumberTests {

}
