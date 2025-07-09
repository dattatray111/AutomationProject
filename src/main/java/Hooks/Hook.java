package Hooks;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
import utility.ExtentManager;

public class Hook {

	static WebDriver driver;
	static ExtentTest test;
	@Before
	public static void setUp(Scenario scenario) {

		driver = BaseClass.getDriver();

		driver.manage().window().maximize();

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
