package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	WebDriver driver;
	String expectedTittle;

	@Test
	public void hardAssert() {
		System.out.println("hardAssert Method Was Started");
		expectedTittle = "google";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayakumar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String actualTittle = driver.getTitle();
		System.out.println(actualTittle);
		Assert.assertEquals(expectedTittle, actualTittle);
		System.out.println("hardAssert Method Will not Execute");
		driver.findElement(By.partialLinkText("mail")).click();
	}

	@Test
	public void softAssert() {
		SoftAssert softAssertion = new SoftAssert();
		System.out.println("softAssert Method Was Started");
		expectedTittle = "google";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayakumar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String actualTittle = driver.getTitle();
		System.out.println(actualTittle);
		softAssertion.assertEquals(expectedTittle, actualTittle);
		System.out.println("softAssert Method will execute");
		driver.findElement(By.partialLinkText("mail")).click();
	}
}
