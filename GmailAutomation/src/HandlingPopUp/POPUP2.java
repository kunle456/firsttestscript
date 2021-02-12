package HandlingPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUP2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://D:/Java%20Selenium/105/Selenium/Session%2017/index.html");
		
		// Confirmation Pop up/ Clicking on accept or cancel
		Thread.sleep(50000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

}
   
   }
