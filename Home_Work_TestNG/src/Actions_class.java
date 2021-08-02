import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Home_Work_4_Functions.Yahoo_Signup;

public class Actions_class {

	WebDriver driver;
	Yahoo_Signup su;

	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
		driver = new ChromeDriver();
		su = new Yahoo_Signup(driver);
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void Signup() throws InterruptedException {

		su.firstname().sendKeys("Donald");
		su.lastname().sendKeys("Trump");
		Thread.sleep(1000);
		su.Email().sendKeys("asdfghuj34567");
		Thread.sleep(1000);
		su.Password().sendKeys("bd87654389");
	}

}
