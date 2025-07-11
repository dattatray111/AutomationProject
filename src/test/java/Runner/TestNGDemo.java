package Runner;

import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNGDemo {

	@Test
	public static void T1() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); // or "--headless"
		options.addArguments("--disable-gpu");
		options.addArguments("--window-size=1920,1080");
		
		String driverPath = Paths.get("src", "test", "java", "Runner", "chromedriver.exe").toAbsolutePath().toString();
		System.setProperty("webdriver.chrome.driver", driverPath);
		System.out.println("===============" + driverPath);
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver(options);
		System.out.println("==============execution Started===============");
		driver.get("https://www.flipkart.com/");
		System.out.println("==============Url opened===============");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.className("_3ZqtNW"));

		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "border: 4px solid red");
		Thread.sleep(1000);
		driver.close();
		System.out.println("===================="+driver.getCurrentUrl()+"======================");
		System.out.println("==============Script end===============");
	}

}
