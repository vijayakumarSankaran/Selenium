package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayakumar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		// Contains method
		driver.findElement(By.xpath("//input[contains(@id, 'userN')]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[contains(@placeholder, 'example')]")).sendKeys("abc@gmail.com");
		
		// Starts-with method
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Fu')]")).sendKeys("Test");
		
//		// tag name function
//		driver.findElement(By.xpath("//label[text()='Email']")).sendKeys("abc@gmail.com");
		
		// Logical operators
		driver.findElement(By.xpath("//input[@placeholder ='Full Name' and @type = 'text']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//input[@placeholder ='Full Name' or @type = 'text']")).sendKeys("Test");
		
		// Xpath Axis
		
		// Xpath ancestor Axis
		
		driver.findElement(By.xpath("//label[text()='Full Name']/ancestor::form"));
		
		// XPath Child Axis
		driver.findElement(By.xpath("//form[@id='userForm']/child::div[1]//label"));
		
		// XPath Parent Axis
		//driver.findElement(By.xpath("//input[@id='yesRadio']/parent::div"));
		
		// XPath Following Axis
		driver.findElement(By.xpath("//input[@id='userName']/following::textarea")).sendKeys("Test area");
		
		// XPath Following sibling Axis
		driver.findElement(By.xpath("//div[@class='col-md-3 col-sm-12']/following-sibling::div"));
		
		// XPath Preceding Axis
		driver.findElement(By.xpath("//input[@id='userName']/preceding::label"));
	}

}
