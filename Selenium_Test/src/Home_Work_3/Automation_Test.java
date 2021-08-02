package Home_Work_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\OneDrive\\Desktop" + "\\Program Libraries Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(1000);

		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);

		driver.findElement(By.linkText("Specials")).click();

		String url0 = driver.getCurrentUrl();
		System.out.println(url0);
		Thread.sleep(1000);

		String title0 = driver.getTitle();
		System.out.println(title0);
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.linkText("New products")).click();

		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		Thread.sleep(1000);

		String title1 = driver.getTitle();
		System.out.println(title1);
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.linkText("Best sellers")).click();

		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		Thread.sleep(1000);

		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.linkText("Our stores")).click();

		String url3 = driver.getCurrentUrl();
		System.out.println(url3);
		Thread.sleep(1000);

		String title3 = driver.getTitle();
		System.out.println(title3);
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.linkText("Contact us")).click();

		String url4 = driver.getCurrentUrl();
		System.out.println(url4);
		Thread.sleep(1000);

		String title4 = driver.getTitle();
		System.out.println(title4);
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.linkText("Terms and conditions of use")).click();

		String url5 = driver.getCurrentUrl();
		System.out.println(url5);
		Thread.sleep(1000);

		String title5 = driver.getTitle();
		System.out.println(title5);
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.linkText("About us")).click();

		String url6 = driver.getCurrentUrl();
		System.out.println(url6);
		Thread.sleep(1000);

		String title6 = driver.getTitle();
		System.out.println(title6);
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.linkText("Sitemap")).click();

		String url7 = driver.getCurrentUrl();
		System.out.println(url7);
		Thread.sleep(1000);

		String title7 = driver.getTitle();
		System.out.println(title7);
		Thread.sleep(1000);

		driver.navigate().back();
		driver.navigate().refresh();

		driver.quit();

		System.out.println("Hello Bangladesh");
	}

}
