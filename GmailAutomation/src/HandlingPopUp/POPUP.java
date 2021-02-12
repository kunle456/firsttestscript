package HandlingPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUP {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://D:/Java%20Selenium/105/Selenium/Session%2017/index.html");
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

}

     }