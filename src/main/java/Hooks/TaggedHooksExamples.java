package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TaggedHooksExamples {
	
	@Before
	public void beforeAllScenarios() {
		System.out.println("Before all scenarios");
	}

	@After
    public void afterAllScenarios() {
    	System.out.println("After all scenarios");
	}
	@Before("@FirstTaggedHook")
	public void beforeFirstTest() {
		System.out.println("This will run before first scenario");
	}
	@Before("@SecondTaggedHook")
    public void beforeSecondTest() {
		System.out.println("This will run before second scenario");
	}
	@Before("@SecondTaggedHook,@ThirdTaggedHook")
    public void beforeSecondAndThirdTest() {
		System.out.println("This will run before second and Third scenario");
	}
	@Before("@ThirdTaggedHook")
    public void beforeThirdTest() {
	    System.out.println("This will run before third scenario");
    }
	@After("@FirstTaggedHook")
    public void afterFirstTest() {
		System.out.println("This will run after first scenario");
	}
	@After("@SecondTaggedHook")
    public void afterSecondTest() {
		System.out.println("This will run after second scenario");
	}
	@After("@ThirdTaggedHook")
    public void afterThirdTest() {
	    System.out.println("This will run after third scenario");
    }
}
