package basics;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserHistoryNavigations {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Navigation nav = driver.navigate();
		
		
		//Method Chaining - To avoid too many lines of code
		nav.back();
		nav.forward();
		nav.refresh();
		nav.to("http://www.javatpoint.com"); 
		
		driver.manage().window().maximize(); 
		
		
		
	}

}
