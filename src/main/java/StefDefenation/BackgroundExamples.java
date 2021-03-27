package StefDefenation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundExamples {

	@Given("^Student should join school first$")
	public void student_should_join_school_first() throws Throwable {
	    System.out.println("Student should join school first");
	}

	@Given("^Student should pass elementry school$")
	public void student_should_pass_elementry_school() throws Throwable {
		System.out.println("Student should pass elementry school");
	}

	@Given("^Student has to complete SSLC$")
	public void student_has_to_complete_SSLC() throws Throwable {
		System.out.println("Student has to complete SSLC");
	}

	@When("^Student has to complete Twelth$")
	public void student_has_to_complete_Twelth() throws Throwable {
		System.out.println("Student has to complete Twelth");
	}

	@Then("^Student should join Medical college$")
	public void student_should_join_Medical_college() throws Throwable {
		System.out.println("Student should join Medical college");
	}

	@Given("^Student has to complete highschool$")
	public void student_has_to_complete_highschool() throws Throwable {
		System.out.println("Student has to complete highschool");
	}

	@When("^Student has to complete Higher secondry$")
	public void student_has_to_complete_Higher_secondry() throws Throwable {
		System.out.println("Student has to complete Higher secondry");
	}

	@Then("^Student should join Engineering college$")
	public void student_should_join_Engineering_college() throws Throwable {
		System.out.println("Student should join Engineering college");
	}

}
