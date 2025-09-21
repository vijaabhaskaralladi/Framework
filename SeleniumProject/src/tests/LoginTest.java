package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base{
    WebDriver driver = null;
	
	public LoginTest() {
		driver = setUp();
	}
	
	@Test
	public void Login() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.navigate();
	}
	
	
}
