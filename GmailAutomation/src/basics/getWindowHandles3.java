package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles3 {
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://naukri.com");
			
					
			driver.close();
		}
  }
	

	


