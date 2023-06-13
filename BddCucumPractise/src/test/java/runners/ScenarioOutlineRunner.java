package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\applications\\ScenarioOutline.feature"},
		glue = {"stepss"},
		plugin = {"pretty"}
		
		)


public class ScenarioOutlineRunner extends AbstractTestNGCucumberTests {

}
