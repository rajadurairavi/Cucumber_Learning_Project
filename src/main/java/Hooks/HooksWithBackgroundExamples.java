package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksWithBackgroundExamples {

	@Before
	public void beforeScenario() {
		System.out.println("Started learning on Cucumber framework");
	}
	@After
    public void afterScenario() {
		System.out.println("Succesfully completed the Cucumber framework...Happpyyyyyyyy Moments..!!!");
	}

}
