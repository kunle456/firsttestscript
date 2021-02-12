package basics;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxGetWindowHandles2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://naukri.com");
		
		Set<String> windowIds=driver.getWindowHandles();
		System.out.println(windowIds);
		
		for(String windowId:windowIds) {
			driver.switchTo() .window(windowId);
			System.out.println(driver.getTitle());
			driver.quit();
		}
	// Using quit while for loop is being executed will cause a no such session exception
	// Quit needs to be written outside for loop so all windows can be executed
		
}

}