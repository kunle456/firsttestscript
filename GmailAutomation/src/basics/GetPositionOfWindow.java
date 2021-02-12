package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositionOfWindow {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Dimension dim = new Dimension(400,300);
		
		Point point=driver.manage().window().getPosition();
		int x=point.getX();
		int y=point.getY();
		System.out.println("X cordinate="+x);
		System.out.println("Y cordinate="+y);

}
   
    }
