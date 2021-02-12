package basics;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxGetWindowHandles4 {
		
		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://naukri.com");
			
			String parentWindowId=driver.getWindowHandle();
			
			Set<String> allWindowIds=driver.getWindowHandles();
			allWindowIds.remove(parentWindowId);
			
			
			for(String windowId:allWindowIds) {
				driver.switchTo() .window(windowId);
				driver.close();
	
					
				}
			}
	}