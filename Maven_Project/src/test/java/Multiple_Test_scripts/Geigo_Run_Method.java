package Multiple_Test_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Multiple_Test_Pages.autoBuyPage;

public class Geigo_Run_Method {

	WebDriver driver;
	autoBuyPage ap;

	@BeforeTest

	public void GoToHomePAge() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\OneDrive\\Desktop" + "\\Program Libraries Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		ap = new autoBuyPage(driver);

		driver.get("https://www.geico.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
@BeforeMethod

public void ScreenShots() {
	
	Multiple_Test_Pages.Utility.CaptureScreenshot(driver, "Geigo");
}
	@AfterTest
	public void FinishTest() {

		driver.quit();
	}

	@Test(priority = 0)
	public void TypeZip() throws InterruptedException {

		ap.getZipBox().sendKeys("11369");
		Thread.sleep(1000);

	}

	@Test(priority = 1)
	public void QuoteButton() throws InterruptedException {

		ap.getStartQuoteButton().click();
		Thread.sleep(1000);
	}

	@Test(priority = 2)

	public void clickCondo() {

		ap.clickCondo().click();
	}

	@Test(priority = 2)

	public void clickNext() {

		ap.clickNext().click();
	}

	@Test(priority = 2)

	public void getBirthDate() {

		ap.getBirthDate().getText();
	}
}
