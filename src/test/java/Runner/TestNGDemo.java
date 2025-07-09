package Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo {

	@Test
	public static void T1() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			System.out.println("==============execution Started===============");
			driver.get("https://www.flipkart.com/");
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 
			 WebElement element = driver.findElement(By.className("_3ZqtNW"));
			
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", 
                    element, "border: 4px solid red");

	}

}
