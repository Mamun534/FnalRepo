package Multiple_Test_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Multiple_Test_Pages.Sauce_Demo_inventoryPage;

public class SauceDemoCrossBrowse {

	WebDriver driver;
	Sauce_Demo_inventoryPage invp;

	@Test
	@Parameters("browser")
	public void TestTittle(String browserName) throws InterruptedException {

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.Firefox.driver",
					"C:\\\\Users\\\\Owner\\\\OneDrive\\\\Desktop\\\\program\\\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {

			System.setProperty("Webdriver.Edge.driver",
					"C:\\\\Users\\\\Owner\\\\OneDrive\\\\Desktop\\\\program\\\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();

	}
}