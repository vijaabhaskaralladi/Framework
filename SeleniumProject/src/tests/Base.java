package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Base {
	WebDriver driver = null;
   
   public WebDriver setUp() {
	  driver = new ChromeDriver(); 
	  return driver;
   }
}
