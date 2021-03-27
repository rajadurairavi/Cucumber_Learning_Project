package StefDefenation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExpressionDef {
	
	// Integer whole numbers regular expressions is : \d+ in Eclipse it is : \\d+
	
	@Given("^Raja gave me (\\d+) rupees$")
	public void raja_gave_me_rupees(int name) throws Throwable {
	    System.out.println(name);
	}

	// just remove the two brackets and and make 1 parameter with float data type
	
	@When("^Prakash gave (\\d+\\.\\d+) to Raja$")
	public void prakash_gave_to_Raja(float value) throws Throwable {
	    System.out.println(value);
	}

	
	// Expression for Sting is:        \"(.*?)\" == \"([^\"]*)\"
	// We can write in below snippet as well for String
	//@When("^Murugan bought one \"([^\"]*)\" and \"([^\"]*)\"$")
	
	@When("^Murugan bought one \"(.*?)\" and \"(.*?)\"$")
	public void murugan_bought_one_and(String name1, String name2) throws Throwable {
	    System.out.println(name1+"and" +name2);
	}

	@Then("^These guys are friend itseems\\.$")
	public void these_guys_are_friend_itseems() throws Throwable {
	    System.out.println("Expression session completed..Happpyyyyyy");
	}

}
