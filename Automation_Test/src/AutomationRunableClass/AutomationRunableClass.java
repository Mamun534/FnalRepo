package AutomationRunableClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AutomationFunctions.MyAccountsTest;
import AutomationFunctions.Utility;

public class AutomationRunableClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
		
		Utility.CaptureScreenshot(driver, "automation");

		MyAccountsTest mt = new MyAccountsTest(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		mt.Signin().click();
		
		mt.CreatAccount().sendKeys("asdrt0687f@gmail.com");

		mt.CreatAnAccount().click();

		mt.Title().click();

		mt.FirstName().sendKeys("Komola");

		mt.LastName().sendKeys("Haris");

		mt.Password().sendKeys("komla12345");
		
		Thread.sleep(1000);

		mt.Day().sendKeys("5");

		mt.Month().sendKeys("February");

		mt.Year().sendKeys("1982");

		mt.signinoffers().click();
		
		Thread.sleep(1000);

		mt.RsopOffer().click();

		mt.company().sendKeys("Uber Technology");

		mt.Address().sendKeys("1287 80th st");

		mt.Address2().sendKeys("8723 Harri Ave");

		mt.city().sendKeys("Queens");

		mt.state().sendKeys("New York");

		mt.ZipCode().sendKeys("23465");
		
		Thread.sleep(1000);
		
		mt.Country().sendKeys("United State of america");

		mt.AddInfo().sendKeys("Everything is Done");

		mt.HomePh().sendKeys("3459863548");

		mt.MobilePh().sendKeys("9876543298");

		mt.Assing().sendKeys("Mr Anik");
		
		Thread.sleep(1000);

		mt.Register().click();
		
		driver.quit();
	}

}
