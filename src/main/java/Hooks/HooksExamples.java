package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksExamples {

	/*
	Hook : Will perform before and after scenarios
	@Before : Accending order 0,1,2 *** @After : Dessending order 2,1,0
	
	*/
	

	@Before(order=1)
	public void firstStepOfTest() {
		
		System.out.println("Going to implement Hooks Concepts");	
	}
	@After(order=1)
    public void lastStepOfTest() {
		
		System.out.println("Hooks concepts implemented succesfully");
	}
	@Before(order=0)
	public void firstStepOfSuite() {
		System.out.println("Going to Learn Cucumber Concepts");
	}
	@After(order=0)
    public void lastStepOfSuite() {
		System.out.println("Learned Cucumber concepts succesfully");
	}

}
