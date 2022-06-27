package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	private static WebDriver driver;

	@DataProvider(name = "Authentication")

	public static Object[][] credentials() {

		return new Object[][] { { "Pen" }, { "Apple" }, { "Book" } };

	}

// Here we are calling the Data Provider object with its Name

	@Test(dataProvider = "Authentication")

	public void test(String Search) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayakumar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys(Search);
		driver.quit();
	}
}