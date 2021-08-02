package Home_Work_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Sign_up_Test {

	public static void main(String[] args) throws InterruptedException {

		// Setting up the Properties for browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Owner\\\\OneDrive\\\\Desktop\\\\program\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create");

		Thread.sleep(1000);

		driver.getCurrentUrl();
		Thread.sleep(1000);

		driver.getTitle();
		Thread.sleep(1000);

		driver.findElement(By.linkText("Help")).click();

		Thread.sleep(1000);

		driver.navigate().back();

		Thread.sleep(1000);

		driver.getCurrentUrl();

		driver.getTitle();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		WebElement firstName = driver.findElement(By.name("firstName"));

		firstName.sendKeys("Mamun");

		// firstName.clear();

		WebElement lastName = driver.findElement(By.name("lastName"));

		lastName.sendKeys("Chowdhury");

		// lastName.clear();

		Thread.sleep(1000);

		driver.findElement(By.id("usernamereg-yid")).sendKeys("ChowdhuryMamun07");

		Thread.sleep(1000);

		driver.findElement(By.name("password")).sendKeys("asdfghjkl");

		Thread.sleep(1000);

		driver.findElement(By.id("usernamereg-show-button")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("usernamereg-show-button")).click();

		Thread.sleep(1000);

		driver.findElement(By.name("shortCountryCode")).sendKeys("Bangladesh");

		Thread.sleep(1000);

		driver.findElement(By.id("usernamereg-phone")).sendKeys("1819456787");

		Thread.sleep(1000);

		driver.findElement(By.name("mm")).sendKeys("May");

		Thread.sleep(1000);

		driver.findElement(By.id("usernamereg-day")).sendKeys("20");

		Thread.sleep(1000);

		driver.findElement(By.id("usernamereg-year")).sendKeys("1987");

		Thread.sleep(1000);

		driver.findElement(By.id("usernamereg-freeformGender")).sendKeys("Male");

		Thread.sleep(1000);

		driver.findElement(By.id("reg-submit-button")).click();

		Thread.sleep(1000);
		driver.close();

	}

}
