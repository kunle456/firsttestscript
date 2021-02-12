package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
//Program to print all the window titles 

public class getWindowHandles {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();// Starts Server and opens Browser 
		
		Set<String> windowIds=driver.getWindowHandles();
		System.out.println(windowIds);
		
		for(String windowId:windowIds) {
			driver.switchTo() .window(windowId);//Switching from one window to another
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
		}
	}

}
