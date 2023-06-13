package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class ApplicationHooks {
	
	@Before(order=1)
	public void Beforehook() {
		System.out.println("before1 hook");
	}
	
	@BeforeStep
	public void Beforestep() {
		System.out.println("beforestep hook");
	}
	
	@AfterStep
	public void Afterstep() {
		System.out.println("afterstep hook");
	}
	
	@Before(order=2)
	public void Beforehook1() {
		System.out.println("before2 hook");
	}
	
	@After(order=1)
	public void Afterhook() {
		System.out.println("after1 hook");
	}
	

	@After(order=2)
	public void Afterhook1() {
		System.out.println("after2 hook");
	}

}
