package Multiple_Test_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Multiple_Test_Pages.Sauce_Demo_inventoryPage;

public class Sauce_Demo_Data_Driven {

	WebDriver driver;
	Sauce_Demo_inventoryPage invp;

	@BeforeTest
	public void Beforetest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\OneDrive\\Desktop" + "\\Program Libraries Selenium\\chromedriver.exe");

		driver = new ChromeDriver();
		invp = new Sauce_Demo_inventoryPage(driver);

		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@AfterTest
	public void endTest() throws InterruptedException {

		Thread.sleep(1000);
		driver.quit();
	}

	@AfterMethod

	public void TakenScreenShots() {

		Multiple_Test_Pages.Utility.CaptureScreenshot(driver, "Sauce_Demo");
	}

	@BeforeMethod

	public void GoToHomePage() {

		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	}

	// Positive & Negative Data test Using Parameters.......

	
@Parameters({"userid","password","expectedvalue"})
	@Test(priority = 0)
	public void validatingLogin(String userid, String password,
			String expectedvalue) throws InterruptedException {

		boolean x = invp.UserId().isEnabled();
		Assert.assertTrue(x);
		invp.UserId().sendKeys("userid");

		boolean y = invp.Password().isEnabled();
		Assert.assertTrue(y);
		invp.Password().sendKeys("password");
		Thread.sleep(1000);

		boolean z = invp.LoginButton().isDisplayed();
		Assert.assertTrue(z);
		invp.LoginButton().click();
		Thread.sleep(2000);
		
		//String expectedValue = "https://www.saucedemo.com/inventory.html";
		
		String actualValue = driver.getCurrentUrl();
		Thread.sleep(1000);
		Assert.assertEquals(actualValue, expectedvalue);
	}

}
