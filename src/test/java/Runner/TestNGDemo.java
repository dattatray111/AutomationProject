package Runner;

import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	static WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.out.println("==============execution Started===============");
		String driverPath = Paths.get("src", "test", "java", "Runner", "chromedriver.exe").toAbsolutePath().toString();
		System.setProperty("webdriver.chrome.driver", driverPath);
		System.out.println("===============" + driverPath);

		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
		System.out.println("==============Script end===============");
	}

	@Test
	public static void T1() throws InterruptedException {

		driver.get("https://www.flipkart.com/");
		System.out.println("==============Url opened===============");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.className("_3ZqtNW"));

		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "border: 4px solid red");
		Thread.sleep(1000);

		System.out.println("====================" + driver.getCurrentUrl() + "======================");

	}

	@Test
	public static void T2() throws InterruptedException {

		driver.get("https://www.amazon.com/");
		System.out.println("==============Url opened===============");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.className("_3ZqtNW"));

		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "border: 4px solid red");
		Thread.sleep(1000);

		System.out.println("====================" + driver.getCurrentUrl() + "======================");

	}

}
