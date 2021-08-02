package Home_Work_Foure_Scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Home_Work_4_Functions.Yahoo_Signup;


public class All_linkTag {

	
	WebDriver driver;
	Yahoo_Signup ys;
	
	
	@Test
	public void SetUpTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
	"C:\\\\Users\\\\Owner\\\\OneDrive\\\\Desktop\\\\program\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		for(int i =0; i<links.size(); i++){
		System.out.println(links.get(i).getAttribute("href"));
		}
	}
}
