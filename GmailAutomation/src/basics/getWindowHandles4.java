package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles4 {
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
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

	