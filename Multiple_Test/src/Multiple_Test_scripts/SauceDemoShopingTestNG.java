package Multiple_Test_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Multiple_Test_Pages.Sauce_Demo_inventoryPage;

public class SauceDemoShopingTestNG {

	WebDriver driver;
	Sauce_Demo_inventoryPage invp;

	@BeforeTest
	public void setupTest() throws InterruptedException {

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

	@AfterMethod
	public void Screenshots() {

		Multiple_Test_Pages.Utility.CaptureScreenshot(driver, "SauceDemo");
	}

	@AfterTest
	public void endTest() {

		driver.quit();
	}

	@Test(priority = 0)

	public void LoginData() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean x = invp.UserId().isEnabled();
		Assert.assertTrue(x);
		invp.UserId().sendKeys("standard_user");
		Thread.sleep(1000);

		boolean y = invp.Password().isEnabled();
		Assert.assertTrue(y);
		invp.Password().sendKeys("secret_sauce");
		Thread.sleep(1000);

		boolean z = invp.LoginButton().isDisplayed();
		Assert.assertTrue(z);
		invp.LoginButton().click();
		Thread.sleep(1000);

		String expected = "https://www.saucedemo.com/inventory.html";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expected);
	}

	@Test(priority = 1)

	public void Shopping() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		boolean x = invp.backpackText().isDisplayed();
		Assert.assertTrue(x);
		String backpackText = invp.backpackText().getText();
		System.out.println(backpackText);
		Thread.sleep(1000);

		boolean c = invp.backPackPrice().isDisplayed();
		Assert.assertTrue(c);
		String backPackPrice = invp.backPackPrice().getText();
		System.out.println(backPackPrice);

		boolean d = invp.backPackAddCart().isDisplayed();
		Assert.assertTrue(d);
		invp.backPackAddCart().click();
		Thread.sleep(1000);

		boolean e = invp.Cart().isDisplayed();
		Assert.assertTrue(e);
		invp.Cart().click();
		Thread.sleep(1000);

		String expected = "https://www.saucedemo.com/cart.html";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expected);

		boolean q = invp.ContinueShoping().isDisplayed();
		Assert.assertTrue(q);
		invp.ContinueShoping().click();

		String expected1 = "https://www.saucedemo.com/inventory.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);
	}

	@Test(priority = 2)

	public void ContinueShoping() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		boolean y = invp.fleeceJacketText().isDisplayed();
		Assert.assertTrue(y);
		String fleeceJacketText = invp.fleeceJacketText().getText();
		System.out.println(fleeceJacketText);
		Thread.sleep(1000);

		boolean q = invp.FleeceJacketPrice().isDisplayed();
		Assert.assertTrue(q);
		String FleeceJacketPrice = invp.FleeceJacketPrice().getText();
		System.out.println(FleeceJacketPrice);

		boolean z = invp.FleeceJacketAddCart().isDisplayed();
		Assert.assertTrue(z);
		invp.FleeceJacketAddCart().click();
		Thread.sleep(1000);

		boolean e = invp.Cart().isDisplayed();
		Assert.assertTrue(e);
		invp.Cart().click();

		boolean co = invp.ClickCheckout().isDisplayed();
		Assert.assertTrue(co);
		invp.ClickCheckout().click();
		Thread.sleep(1000);

		String expected1 = "https://www.saucedemo.com/checkout-step-one.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);
	}

	@Test(priority = 3)

	public void UserInformation() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		boolean x = invp.FirstName().isEnabled();
		Assert.assertTrue(x);
		invp.FirstName().sendKeys("Mike");
		Thread.sleep(1000);

		boolean y = invp.LastName().isEnabled();
		Assert.assertTrue(y);
		invp.LastName().sendKeys("Hadson");
		Thread.sleep(1000);

		boolean z = invp.ZipCode().isEnabled();
		Assert.assertTrue(z);
		invp.ZipCode().sendKeys("11367");
		Thread.sleep(1000);

		boolean q = invp.ClickContinue().isDisplayed();
		Assert.assertTrue(q);
		invp.ClickContinue().click();

		String expected1 = "https://www.saucedemo.com/checkout-step-two.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);
	}

	@Test(priority = 4)

	public void TotalPrice() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		boolean x = invp.TotalPrice().isDisplayed();
		Assert.assertTrue(x);
		String totalprice = invp.TotalPrice().getText();
		System.out.println(totalprice);
		Thread.sleep(1000);

		boolean q = invp.Tax().isDisplayed();
		Assert.assertTrue(q);
		String tax = invp.Tax().getText();
		System.out.println(tax);

		boolean c = invp.FinalPrice().isDisplayed();
		Assert.assertTrue(c);
		String fp = invp.FinalPrice().getText();
		System.out.println(fp);

		boolean y = invp.Finish().isDisplayed();
		Assert.assertTrue(y);
		invp.Finish().click();

		String expected1 = "https://www.saucedemo.com/checkout-complete.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);

		boolean bt = invp.BackToHome().isDisplayed();
		Assert.assertTrue(bt);
		invp.BackToHome().click();
	}
}
