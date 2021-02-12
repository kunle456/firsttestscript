package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheSizeOfWindow {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Dimension dim=driver.manage().window().getSize();
		
		int height=dim.getHeight();
		int width=dim.getWidth();
		
		System.out.println("Width="+width);
		System.out.println("Height="+height);
	}

}
