package StefDefenation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TaggedHooksConcepts {

	@Given("^This is first Testcase$")
	public void this_is_first_Testcase() throws Throwable {
	    System.out.println("This is the first Testcase");
	}

	@When("^This is Second Testcase$")
	public void this_is_Second_Testcase() throws Throwable {
	    System.out.println("This is the second Testcase");
	}

	@When("^This is third Testcase$")
	public void this_is_third_Testcase() throws Throwable {
	    System.out.println("This is the Third Testcase");
	}

}
