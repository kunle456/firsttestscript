package HandlingPopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUP4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(50000);
		
		driver.findElement(By.xpath("//input[@placeholder=\'Enter your active Email ID / Username\']"))
		                      .sendKeys("nameishemanth@rediffmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your password \"]"))
        .sendKeys("Testing@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		

}
	}


