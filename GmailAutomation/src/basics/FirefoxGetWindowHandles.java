package basics;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;
//Program to print all the window titles 

public class FirefoxGetWindowHandles {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://naukri.com");
		
		Set<String> windowIds=driver.getWindowHandles();
		System.out.println(windowIds);
		
		for(String windowId:windowIds) {
			driver.switchTo() .window(windowId);
			System.out.println(driver.getTitle());
			
		}
	}

}
