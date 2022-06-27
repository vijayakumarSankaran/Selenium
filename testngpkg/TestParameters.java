package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
	WebDriver driver;
	@Parameters({ "search" })
	@Test
	public void testCaseOne(String str) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayakumar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys(str);
	}
}