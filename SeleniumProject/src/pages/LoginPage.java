package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigate() {
		driver.get("https://www.google.com");
	}
}
