package step;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class stepDefination {
	static WebDriver driver;
	@Given("^Open the Firefox and launch the application$")
	public void Open_the_Firefox_and_launch_the_application() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("Hi");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayakumar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//Assertion
	    assertEquals(driver.getTitle(), "Google");
	    //throw new PendingException();
	}

	@When("^Enter the Username and Password$")
	public void Enter_the_Username_and_Password() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("Hello");
		driver.findElement(By.name("q")).sendKeys("Selenium"+Keys.TAB);
	    //throw new PendingException();
	}

	@Then("^Reset the credential$")
	public void Reset_the_credential() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("How are you");
		driver.quit();
	    //throw new PendingException();
	}
}
