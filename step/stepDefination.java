package step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
//	static WebDriver driver;
//	@Given("^Open the Firefox and launch the application$")
//	public void Open_the_Firefox_and_launch_the_application() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//		System.out.println("Hi");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayakumar\\Downloads\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		//Assertion
//	    assertEquals(driver.getTitle(), "Google");
//	    //throw new PendingException();
//	}
//
//	@When("^Enter the Username and Password$")
//	public void Enter_the_Username_and_Password() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//		System.out.println("Hello");
//		driver.findElement(By.name("q")).sendKeys("Selenium"+Keys.TAB);
//	    //throw new PendingException();
//	}
//
//	@Then("^Reset the credential$")
//	public void Reset_the_credential() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//		System.out.println("How are you");
//		driver.quit();
//	    //throw new PendingException();
//	}
	 static WebDriver driver;
	 
	 @Before
	 public void setUp() {
		 System.out.println("*********" +"Running before hooks" +"*********");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayakumar\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
	 }
	 
	@Given("user navigates to Facebook")
	public void user_navigates_to_Facebook() {
		
		driver.navigate().to("https://www.facebook.com/");
	}

	@When("I enter Username as {string} and Password as {string}")
	public void i_enter_Username_as_and_Password_as(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
		driver.findElement(By.name("login")).click();
	}

	@Then("login should be unsuccessful")
	public void login_should_be_unsuccessful() {
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}
	}

	@After
	public void closeApp() {
		 System.out.println("*********" +"Running after hooks" +"*********");
		driver.close();
	}
}
