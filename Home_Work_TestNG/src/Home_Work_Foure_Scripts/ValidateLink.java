package Home_Work_Foure_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Home_Work_4_Functions.Automation_Functions;

public class ValidateLink {

	WebDriver driver;
	Automation_Functions mc;

	@BeforeTest
	public void ReadTheUrl() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Owner\\\\OneDrive\\\\Desktop\\\\program\\\\chromedriver.exe");

		driver = new ChromeDriver();
		mc = new Automation_Functions(driver);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
	}

@BeforeMethod

public void ScreenShots() {
	
	Home_Work_4_Functions.Utility.CaptureScreenshot(driver, "validatinglink");
}

	@AfterTest
	public void endTest() {

		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
		
	}

	@Test(priority = 0)
	public void Special() throws InterruptedException {

		mc.getSpecial().click();
		String expectedValue = "http://automationpractice.com/index.php?controller=prices-drop";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expectedValue);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void NewProducts() throws InterruptedException {

		mc.getNewProducts().click();
		String expectedValue = "http://automationpractice.com/index.php?controller=new-products";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expectedValue);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
	}

	@Test(priority = 2)
	public void BestSellers() throws InterruptedException {

		mc.getBestSellers().click();
		String expectedValue = "http://automationpractice.com/index.php?controller=best-sales";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expectedValue);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
	}

	@Test(priority = 3)
	public void OurStores() throws InterruptedException {

		mc.getOurStores().click();
		String expectedValue = "http://automationpractice.com/index.php?controller=stores";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expectedValue);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
	}

	@Test(priority = 4)
	public void ContactUs() throws InterruptedException {

		mc.getContactUs().click();
		String expectedValue = "http://automationpractice.com/index.php?controller=contact";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expectedValue);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
	}

	@Test(priority = 5)
	public void TrmsnCondi() throws InterruptedException {

		mc.getTrmsnCondi().click();
		String expectedValue = "http://automationpractice.com/index.php?id_cms=3&controller=cms";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expectedValue);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
	}

	@Test(priority = 6)
	public void AboutUs() throws InterruptedException {

		mc.getAboutUs().click();
		String expectedValue = "http://automationpractice.com/index.php?id_cms=4&controller=cms";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expectedValue);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
	}

	@Test(priority = 7)
	public void SiteMap() throws InterruptedException {

		mc.getSiteMap().click();
		String expectedValue = "http://automationpractice.com/index.php?controller=sitemap";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expectedValue);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
		
	}
}
