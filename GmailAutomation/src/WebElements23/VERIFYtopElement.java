package WebElements23;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VERIFYtopElement {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		Rectangle usernameRect = username.getRect();
		int usernameStartY = usernameRect.getY();
		int usernameHeight = usernameRect.getHeight();
		
		int usernameEndY = usernameStartY + usernameHeight + 5;
		int passwordStartY = password.getLocation().getY();
		
		System.out.println("usernamEndY::"+usernameEndY);
		System.out.println("passwordStartY::"+passwordStartY);
		
		if(passwordStartY >= usernameEndY) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		
		}
		
		driver.quit();
		

}
    }