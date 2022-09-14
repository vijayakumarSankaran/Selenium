package test;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class FileUpload {
 
public static void main(String[] args) throws InterruptedException {
 
System.setProperty("webdriver.chrome.driver","/Users/ankita/Downloads/chromedriver");
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vijayakumar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.monsterindia.com/seeker/registration");
 
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='registerThemeDefault']/div/div[4]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/span")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //for Implicit wait

JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
Thread.sleep(3000);

// FILE UPLOADING USING SENDKEYS ....

WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
//click on ‘Choose file’ to upload the desired file
browse.sendKeys("C:\\Users\\Vijayakumar\\hi.txt"); //Uploading the file using sendKeys
System.out.println("File is Uploaded Successfully");
}
 
}