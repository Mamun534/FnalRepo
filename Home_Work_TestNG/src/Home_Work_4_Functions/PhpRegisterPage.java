package Home_Work_4_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhpRegisterPage {
	
	WebDriver driver;

public void Register(WebDriver driver) {
	
	this.driver = driver;
	}

	public WebElement getFirstName() {
		
		WebElement fn = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[3]/div[1]/div/label/span"));
		return fn;
	}

	public WebElement getLastName() {
		
		WebElement ln = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[3]/div[2]/div/label/span"));
		return ln;
	}

	public WebElement getMobileNumber() {
		
		WebElement mn = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[4]/label/span"));
		return mn;
	}

	public WebElement getEmailAddress() {
		
		WebElement ea = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[5]/label/span"));
		return ea;
	}

	public WebElement getPassword() {
		
		WebElement pw = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[6]/label/span"));
		return pw;
	}

	public WebElement getConfirmPassword() {
		
		WebElement cp = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[7]/label/span"));
		return cp;
	}
	public WebElement SignUpButton() {
		WebElement sb = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button"));
		return sb;
	}
}

