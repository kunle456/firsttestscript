package basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxSetPositionOfWindow {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		Point point = new Point (500, 300);//100 is x cordinate and 300 is the y cordinate 
		driver.manage().window().setPosition(point);


}
     
    }
