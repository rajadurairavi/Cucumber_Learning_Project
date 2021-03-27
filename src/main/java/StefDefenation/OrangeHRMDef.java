package StefDefenation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMDef {
	WebDriver driver;
	
	@Given("^User is on OrangeHRM login page$")
	public void user_is_on_OrangeHRM_login_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");	
	}

	@When("^User is giving username and password$")
	public void user_is_giving_username_and_password() throws Throwable {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
	   	}

	@When("^User is Click on Submit button to login$")
	public void user_is_Click_on_Submit_button_to_login() throws Throwable {
	    
		driver.findElement(By.id("btnLogin")).click();
	}

	@When("^User is going to logout from OrangeHRM$")
	public void user_is_going_to_logout_from_OrangeHRM() throws Throwable {
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", logout);
		
	}

	@Then("^Again user is on OrangeHRM login page now$")
	public void again_user_is_on_OrangeHRM_login_page_now() throws Throwable {
	    boolean status = driver.findElement(By.xpath("//div[text()='LOGIN Panel']")).isDisplayed();
	    
	    Assert.assertTrue(status);
	    System.out.println(status);
	    System.out.println("OrangeHRM Login test completed succesfully...Yeahhh..Happpyyyyy");
	    driver.quit();
	    
	}



}
