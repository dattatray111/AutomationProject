package stepDefinations;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class SaucedemoBasic extends BaseStepDef
{
	
	@io.cucumber.java.en.Given("^Open saucedemo website$")
	public void open_saucedemo_website() throws Exception {
		driver.get("https://chatgpt.com/");
	}

	
	  @When("^Login with valid ((.*)) and ((.*))$") 
	  public void login_with_valid_name_and(String arg1, String arg2) throws Exception {
	  loginpage.login(arg1, arg2);
	  
	  }
	 

	@Then("^User must logged in successfuly$")
	public void user_must_logged_in_successfuly() throws Exception {
		loginpage.logOut();
	}

}
