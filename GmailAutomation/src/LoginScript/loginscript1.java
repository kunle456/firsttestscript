package LoginScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginscript1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		WebElement logoutLink=driver.findElement(By.id("logoutLink"));
		if(logoutLink.isDisplayed()) {
			System.out.println("Test Case Passed");
			logoutLink.click();
		} else {
			System.out.println("Test Case Failed");
			
			
		}
		
	}
			
}

