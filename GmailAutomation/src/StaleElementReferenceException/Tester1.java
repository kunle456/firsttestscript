package StaleElementReferenceException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {
	public static void main(String[] args)   {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.actitime.com/");
	WebElement username = driver.findElement(By.id("username"));
	driver.navigate().refresh();
	username.sendKeys("admin");
}
     
      }
