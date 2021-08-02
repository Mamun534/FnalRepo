package Home_Work_Foure_Scripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Home_Work_4_Functions.PhpRegisterPage;

public class PhpSignupTestNG {

	WebDriver driver;
	PhpRegisterPage  rp;

	@BeforeTest
	public void SetUpTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\OneDrive\\Desktop" + "\\Program Libraries Selenium\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.phptravels.net/register");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
	}
@BeforeMethod

public void ScreenShots() {
	
	Home_Work_4_Functions.Utility.CaptureScreenshot(driver, "php");
}

	@Test(priority = 0)

	public void FirstName() {
		rp.getFirstName().sendKeys("Michel");
	}

	@Test(priority = 1)

	public void LaststName() {
		rp.getLastName().sendKeys("Jhon");
	}

	@Test(priority = 2)

	public void MobileNUmber() {
		rp.getMobileNumber().sendKeys("8976543219");
	}

	@Test(priority = 3)

	public void Email() {
		rp.getEmailAddress().sendKeys("Michlejhon123@gmail.com");
	}

	@Test(priority = 4)

	public void Password() {
		rp.getPassword().sendKeys("Michel12345@");
	}

	@Test(priority = 5)

	public void ConfirmPassword() {
		rp.getConfirmPassword().sendKeys("Michel12345@");
	}
//	
//	@Test(priority = 6)
//	
//	public void SignUpButton() {
//		rp.SignUpButton().click();
//	}

	@AfterTest
	public void EndTest() {
		//driver.quit();
	}
}
