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

public class DataTableWithExamplesKeyword {

	WebDriver driver;
	
	@Given("^Rajadurai is exist on OrangeHRM login page$")
	public void rajadurai_is_exist_on_OrangeHRM_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Rajadurai is entering \"([^\"]*)\" and \"([^\"]*)\"$")
	public void rajadurai_is_entering_and(String username, String password) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^Rajadurai is Clicking on Submit button to login$")
	public void rajadurai_is_Clicking_on_Submit_button_to_login() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@When("^Rajadurai is Clicking to logout from OrangeHRM$")
	public void rajadurai_is_Clicking_to_logout_from_OrangeHRM() throws Throwable {
		driver.findElement(By.partialLinkText("Welcome")).click();
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", logout);
	}

	@Then("^Rajadurai user is entered OrangeHRM login page now$")
	public void rajadurai_user_is_entered_OrangeHRM_login_page_now() throws Throwable {
		 boolean status = driver.findElement(By.xpath("//div[text()='LOGIN Panel']")).isDisplayed();
		    
		    Assert.assertTrue(status);
		    System.out.println(status);
		    System.out.println("DataTablesWithExamplesKeyword test completed succesfully...Yeahhh..Happpyyyyy");
		    driver.quit();	
	}

}
