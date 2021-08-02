package Home_Work_Foure_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Home_Work_4_Functions.Yahoo_Signup;

public class YahoosignupTestNG {

	WebDriver driver;
	Yahoo_Signup su;

	@BeforeTest

	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\geckodriver.exe");

		driver = new ChromeDriver(); 
		su = new Yahoo_Signup(driver);
		driver.get("https://login.yahoo.com/?");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@AfterMethod

	public void ScreenShots() {

		Home_Work_4_Functions.Utility.CaptureScreenshot(driver, "yahoo");
	}

	@Test(priority = 0)
	public void CrAccount() {

		su.CreateAccount().click();
	}

	@Test(priority = 1)
	public void Signup() throws InterruptedException {

		su.firstname().sendKeys("monald");
		su.lastname().sendKeys("Trump");
		Thread.sleep(1000);
		su.Email().sendKeys("bangladesh534");
		Thread.sleep(1000);
		su.Password().sendKeys("bd87654389");
	}

	// how to create a drop down ....

	@Test(priority = 2)
	public void PhoneNumber() {
		Select cc = new Select(driver.findElement(By.xpath("//*[@id=\"regform\"]/div[3]/div[2]/div/select")));
		cc.selectByIndex(27);

		su.Phnumber().sendKeys("87424565342");
	}

	@Test(priority = 3)
	public void DateofBirth() throws InterruptedException {

		Select dm = new Select(driver.findElement(By.id("usernamereg-month")));
		dm.selectByIndex(10);
		Thread.sleep(1000);

		su.BirthDay().sendKeys("25");
		su.BirthYear().sendKeys("1980");
		su.Gender().sendKeys("Male");
		su.ClickContinue().click();
	}

	@AfterTest
	public void SignUpTest() throws InterruptedException {

		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
		driver.quit();
	}
}
