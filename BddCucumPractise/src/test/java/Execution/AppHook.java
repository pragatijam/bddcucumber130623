package Execution;



import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class AppHook {
	WebDriver driver;
	DriverFactory DF;
	@Before
	public void lunchbrowser() {
		 DF =new DriverFactory();
		driver=DF.initbrowser();
		driver.manage().window().maximize();

     }
	
	@After
	public void closebrowser() {
		driver.quit();
		
	}
}