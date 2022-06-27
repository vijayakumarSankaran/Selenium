package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	public WebDriver driver;

	@Test
	public void FirefoxTest() {
		// Initializing the ie driver

		System.setProperty("webdriver.ie.driver", "C:\\Users\\Vijayakumar\\Downloads\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("InternetExplorer");
		driver.quit();
	}

	@Test
	public void ChromeTest() {
		// Initialize the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayakumar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("InternetExplorer");
		driver.quit();
	}
}
