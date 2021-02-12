package basics;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxGetWindowHandles3 {
		
		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://naukri.com");
			
					
			driver.close();
		}
  }
	
