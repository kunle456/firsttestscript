package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxGetPositionOfWindow {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		Dimension dim = new Dimension(100, 300);
		
		Point point=driver.manage().window().getPosition();
		int x=point.getX();
		int y=point.getY();
		System.out.println("X cordinate="+x);
		System.out.println("Y cordinate="+y);

}
   
    }


