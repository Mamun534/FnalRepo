package Sause_Demo_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
	
	WebDriver driver;
	SauceDemo sd;

	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\geckodriver.exe");
		driver = new ChromeDriver();
		sd = new SauceDemo();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.switchTo().activeElement().click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
