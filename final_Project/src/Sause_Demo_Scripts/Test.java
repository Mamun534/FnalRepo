package Sause_Demo_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {
	
	WebDriver driver;
	SauceDemo sd;
	
	public void beforetest() {
		
		
		System.setProperty("WebDriver.geckdriver.driver", 
		"‪C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	
		//C:\Users\Owner\OneDrive\Desktop\program\geckodriver.exe
	}
	
	

}
