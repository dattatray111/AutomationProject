package stepDefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.util.Assert;
import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class SaucedemoBasic extends BaseStepDef {

	@io.cucumber.java.en.Given("^Open saucedemo website$")
	public void open_saucedemo_website() throws Exception {
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless", "--disable-gpu",
		// "--window-size=1920,1080");
		// driver = new ChromeDriver(options);
		System.out.println("IN method one");
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("IN method one");
		Thread.sleep(1000);
	}

	@When("^Login with valid ((.*)) and ((.*))$")
	public void login_with_valid_name_and(String arg1, String arg2) throws Exception {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(arg1);
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys(arg2);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("^User must logged in successfuly$")
	public void user_must_logged_in_successfuly() throws Exception {
		WebElement ele = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		assertTrue(ele.isDisplayed());
	}

	@Then("User logout")
	public void user_logout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//header/div/div/ul/li/span/p")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(5000);
		
	}

}
