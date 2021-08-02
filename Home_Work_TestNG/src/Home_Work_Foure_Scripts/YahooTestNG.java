package Home_Work_Foure_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Home_Work_4_Functions.Yahoo_Signup;

public class YahooTestNG {

	WebDriver driver;
	Yahoo_Signup su;

	@BeforeTest

	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
		driver = new ChromeDriver();
		su = new Yahoo_Signup(driver);
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@BeforeMethod

	public void ScreenShots() {

		Home_Work_4_Functions.Utility.CaptureScreenshot(driver, "yahoo");

	}

	@Test(priority = 0)

	public void Signup() throws InterruptedException {

		su.firstname().sendKeys("Donald");
		su.lastname().sendKeys("Trump");
		Thread.sleep(1000);
		su.Email().sendKeys("asdfghuj34567");
		Thread.sleep(1000);
		su.Password().sendKeys("bd87654389");
	}

	// create a drop down ....

	@Test(priority = 1)
	public void PhoneNumber() throws InterruptedException {
		Select cc = new Select(driver.findElement(By.xpath("//*[@id=\"regform\"]/div[3]/div[2]/div/select")));
		cc.selectByIndex(0);
		cc.getOptions();
		Thread.sleep(1000);
		su.Phnumber().sendKeys("3473224469");
	}

	@Test(priority = 2) // enable test means this one do not run/execute...
	public void Dateofbarth() throws InterruptedException {

		Select dm = new Select(driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]")));
		dm.selectByIndex(5);
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
		Thread.sleep(2000);
		driver.quit();
	}
}
