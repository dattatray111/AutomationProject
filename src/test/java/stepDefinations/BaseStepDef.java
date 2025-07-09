package stepDefinations;


import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import selenium.framework.BaseClass;

public class BaseStepDef {

		public LoginPage loginpage;
		public WebDriver driver;
		
		public BaseStepDef() {
	       driver = BaseClass.driver;
	       loginpage = new LoginPage(driver);
	    }
}
