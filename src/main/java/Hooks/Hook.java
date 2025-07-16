package Hooks;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.model.ScreenCapture;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import pages.LoginPage;
import selenium.framework.BaseClass;
import stepDefinations.BaseStepDef;
import utility.ExtentManager;

public class Hook  extends BaseStepDef{

	
	static ExtentTest test;
	@SuppressWarnings("deprecation")
	@Before
	public static void setUp(Scenario scenario) {

		//System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
		driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		BaseClass.initReport("ExtentReport.html");
		test = BaseClass.createTest(scenario.getName());
		test.info("Test created");
		

		// BaseClass.flushReport();

	}

	@AfterStep
	public void beforeStep(Scenario scenario) throws Exception {
		
		/*
		 * ScreenCapture media = (ScreenCapture) BaseClass.takeSnapShot1(driver);
		 * test.log(Status.PASS,"test",media);
		 */
	}

	@After
	public static void cleanUp(Scenario scenario) {
		BaseClass.quitDriver();
		driver.quit();
		BaseClass.flushReport();
		driver = null;

	}

}
