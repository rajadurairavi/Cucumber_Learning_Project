package StefDefenation;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithHeader {

	WebDriver driver;
	@Given("^Prakash is exist on OrangeHRM login page$")
	public void prakash_is_exist_on_OrangeHRM_login_page() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Prakash is entering the below credentials$")
	public void prakash_is_entering_the_below_credentials(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<Map<String, String>> logindetails = dataTable.asMaps(String.class, String.class);
		String username = logindetails.get(0).get("username");
		String password = logindetails.get(0).get("password");
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	   
	}

	@When("^Prakash is Clicking on Submit button to login$")
	public void prakash_is_Clicking_on_Submit_button_to_login() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@When("^Prakash is Clicking to logout from OrangeHRM$")
	public void prakash_is_Clicking_to_logout_from_OrangeHRM() throws Throwable {
		driver.findElement(By.partialLinkText("Welcome")).click();
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", logout);
	}

	@Then("^Prakash user is entered OrangeHRM login page now$")
	public void prakash_user_is_entered_OrangeHRM_login_page_now() throws Throwable {
		boolean status = driver.findElement(By.xpath("//div[text()='LOGIN Panel']")).isDisplayed();
	    
	    Assert.assertTrue(status);
	    System.out.println(status);
	    System.out.println("DataTable With Header test completed succesfully...Yeahhh..Happpyyyyy");
	    driver.quit();
	}

}
