package basics;

import org.openqa.selenium.chrome.*;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close(); 
		
		
	
	}

}
