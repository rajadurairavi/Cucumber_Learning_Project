package StefDefenation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksConcepts {
	
	@Given("^JD is the character name of Vijay in master movie$")
	public void jd_is_the_character_name_of_Vijay_in_master_movie() throws Throwable {
	    System.out.println("JD is the character name of Vijay in master movie");
	}

	@When("^Bhavani is the villian of the movie$")
	public void bhavani_is_the_villian_of_the_movie() throws Throwable {
	    System.out.println("Bhavani is the villian of the movie");
	}

	@When("^Bhavani has the powerul screenplay than Master vijay$")
	public void bhavani_has_the_powerul_screenplay_than_Master_vijay() throws Throwable {
	    System.out.println("Bhavani has the powerul screenplay than Master vijay");
	}

	@Then("^Bhavani and Master has performed well$")
	public void bhavani_and_Master_has_performed_well() throws Throwable {
	   System.out.println("Bhavani and Master has performed well"); 
	}

}
