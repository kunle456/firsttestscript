package PAGEOBJECTMODEL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Constructor created below
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="username")
		private WebElement usernameTB;
		
		@FindBy(name="pwd")
		private WebElement password;
		
		@FindBy(id="loginButton")
		private WebElement login;
		
		public WebElement getUsernameTB() {
			return usernameTB;
		}
		
		public WebElement getPassword() {
			return password;
		}
		
		public WebElement getLogin() {
			return login;
		}

	}



