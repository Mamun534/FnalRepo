package Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookSignUp {

	WebDriver driver;

	public FaceBookSignUp(WebDriver x) {

		driver = x;
	}

	public WebElement getFirstName() {

		WebElement y = driver.findElement(By.name("firstname"));
		return y;
	}

	public WebElement getLastName() {

		WebElement y = driver.findElement(By.name("lastname"));
		return y;
	}

	public WebElement getEmail() {

		WebElement y = driver.findElement(By.name("reg_email__"));
		return y;
	}

	public WebElement getReEnterEmail() {

		WebElement y = driver.findElement(By.name("reg_email_confirmation__"));
		return y;
	}

	public WebElement getPassword() {

		WebElement y = driver.findElement(By.name("reg_passwd__"));
		return y;
	}

	public WebElement getBirthMonth() {

		WebElement y = driver.findElement(By.name("birthday_month"));
		return y;
	}

	public WebElement getBirthDay() {

		WebElement y = driver.findElement(By.name("birthday_day"));
		return y;
	}

	public WebElement getBirthYear() {

		WebElement y = driver.findElement(By.name("birthday_year"));
	return y;

	}

	public WebElement getGender() {

		WebElement y = driver.findElement(By.id("u_0_5_X6"));
		return y;

	}

	public WebElement ClickSignUp() {

		WebElement y = driver.findElement(By.xpath("//*[@id=\"u_0_14_Qg\"]"));
		return y;
	}

}
