package Home_Work_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTavrelsTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/register");

		driver.manage().window().maximize();

		String url = driver.getCurrentUrl();
		System.out.println(url);

		String Title = driver.getTitle();
		System.out.println(Title);

		driver.findElement(By.name("firstname")).sendKeys("mamun");

		Thread.sleep(1000);

		driver.findElement(By.name("lastname")).sendKeys("Chowdhury");

		Thread.sleep(1000);

		driver.findElement(By.name("phone")).sendKeys("3473224467");

		Thread.sleep(1000);

		driver.findElement(By.name("email")).sendKeys("phptravels123@gmail.com");

		Thread.sleep(1000);

		driver.findElement(By.name("password")).sendKeys("asdfghjkl1234");

		Thread.sleep(1000);

		driver.findElement(By.name("confirmpassword")).sendKeys("asdfghjkl1234");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")).submit();

		Thread.sleep(2000);

		WebElement SignupButton = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button"));

		String signup = SignupButton.getText();

		System.out.println(signup);

		driver.manage().deleteAllCookies();

		driver.close();
	}

}
