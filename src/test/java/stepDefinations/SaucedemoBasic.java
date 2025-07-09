package stepDefinations;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.util.Assert;
import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class SaucedemoBasic extends BaseStepDef
{
	
	
	@io.cucumber.java.en.Given("^Open saucedemo website$")
	public void open_saucedemo_website() throws Exception {
	//	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
		// driver = new ChromeDriver(options);
		System.out.println("IN method one");
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		System.out.println("IN method one");
	}

	
	  @When("^Login with valid ((.*)) and ((.*))$") 
	  public void login_with_valid_name_and(String arg1, String arg2) throws Exception {
		  System.out.println("IN method Two");
	  driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("jekins");
	  driver.findElement(By.xpath("(//button[@title='Search'])[1]")).click();
	  
	  }
	 

	@Then("^User must logged in successfuly$")
	
	public void user_must_logged_in_successfuly() throws Exception {
		System.out.println("IN method Three");
		assertEquals("https://www.youtube.com/results?search_query=jenkins", driver.getCurrentUrl(), "Verify current URL");
	}

}
