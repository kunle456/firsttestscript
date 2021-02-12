package basics;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndFullScreenWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Window win = driver.manage().window();
		
		win.maximize();
		
		win.fullscreen(); 
		
		driver.quit();
	}

}
