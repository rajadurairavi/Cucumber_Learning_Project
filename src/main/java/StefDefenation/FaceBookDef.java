package StefDefenation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBookDef {
	WebDriver driver;
	
	@Given("^user is in facebook login page$")
	public void user_is_in_facebook_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
		
	}

	@When("^user is entering username$")
	public void user_is_entering_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rajaduraivijay@gmail.com");
	}

	@When("^use is entering password$")
	public void use_is_entering_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Raja7*durai");
		
	}

	@Then("^user is clicking Submit button$")
	public void user_is_clicking_Submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(10000);
		System.out.println("FaceBook Launched Succesfully..Happpyyyyyyyyyy");
		driver.quit();
		
	}



}
