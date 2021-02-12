package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}
