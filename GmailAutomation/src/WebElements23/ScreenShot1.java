package WebElements23;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1 {
	
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome,driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("demo.actitime.com");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
	}

}
