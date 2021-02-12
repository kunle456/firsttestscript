package basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetThePositionOfWindow {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Point point = new Point (100, 400);//100 is x cordinate and 300 is the y cordinate 
		driver.manage().window().setPosition(point);

}
     
     }
