package YoutubeScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Gmial.login.YoutubeFunctions;
public class Youtube {

	WebDriver driver;
	YoutubeFunctions yt;

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\OneDrive\\Desktop" + "\\Program Libraries Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		yt = new YoutubeFunctions(driver);
		driver.get("https://account.microsoft.com/account/outlook");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}
	
	@Test
	public void createAccount() throws InterruptedException {
		
		boolean x = yt.outlook().isDisplayed();
		Assert.assertTrue(x);
		yt.outlook().click();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
	}
	
	@Test
	public void MailAdd() {
		
		boolean x = yt.MailAdd().isEnabled();
		Assert.assertTrue(x);
		yt.MailAdd().sendKeys("prank97@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	
	
	
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
