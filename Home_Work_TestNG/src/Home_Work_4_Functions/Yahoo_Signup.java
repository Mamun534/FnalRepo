package Home_Work_4_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Yahoo_Signup {

	WebDriver driver;

	public Yahoo_Signup(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement CreateAccount() {

		WebElement ca = driver.findElement(By.xpath("//*[@id=\"createacc\"]"));
		return ca;
	}

	public WebElement firstname() {

		WebElement fname = driver.findElement(By.name("firstName"));
		return fname;

	}

	public WebElement lastname() {

		WebElement lname = driver.findElement(By.id("usernamereg-lastName"));
		return lname;
	}

	public WebElement Email() {

		WebElement em = driver.findElement(By.id("usernamereg-yid"));
		return em;
	}

	public WebElement Password() {

		WebElement pw = driver.findElement(By.id("usernamereg-password"));
		return pw;
	}

	public WebElement Phnumber() {
		WebElement pn = driver.findElement(By.id("usernamereg-phone"));
		return pn;
	}

	public WebElement BirthDay() {

		WebElement bd = driver.findElement(By.id("usernamereg-day"));
		return bd;
	}

	public WebElement BirthYear() {

		WebElement by = driver.findElement(By.id("usernamereg-year"));
		return by;
	}

	public WebElement Gender() {

		WebElement gr = driver.findElement(By.id("usernamereg-freeformGender"));
		return gr;
	}

	public WebElement ClickContinue() {

		WebElement cn = driver.findElement(By.id("reg-submit-button"));
		return cn;
	}

}
