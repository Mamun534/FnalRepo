package Home_Work_3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleiumGrid {

	public static void main(String[] args) throws MalformedURLException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String url = " http://127.0.0.1:4444/wd/hub";
		DesiredCapabilities desr = new DesiredCapabilities();

		desr.setBrowserName("Chrome");
		desr.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver((new URL(url)), desr);
		driver.get("https://scrolltest.com");
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
