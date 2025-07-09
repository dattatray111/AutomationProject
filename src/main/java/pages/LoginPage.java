package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Hooks.Hook;
import io.cucumber.java.Scenario;
import selenium.framework.BaseClass;
import selenium.framework.SelFunctions;

public class LoginPage  {

	
	private static WebDriver driver;
	SelFunctions sf = new SelFunctions(driver);

	public LoginPage(WebDriver driver) {
		this.driver = BaseClass.driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "user-name")
	private static WebElement userNameTextField;

	@FindBy(how = How.ID, using = "password")
	private static WebElement pwdTextField;

	@FindBy(how = How.ID, using = "login-button")
	private static WebElement loginButton;
	
	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	private static WebElement openMenuButton;
	
	@FindBy(how = How.ID, using = "logout_sidebar_link")
	private static WebElement logoutLink;

	public void login(String userName, String password) throws Exception {
		System.out.println("=================Login=======================");

		
	}
	
	public void logOut() throws Exception {
		System.out.println("=================Login=======================");

	
	}

}
