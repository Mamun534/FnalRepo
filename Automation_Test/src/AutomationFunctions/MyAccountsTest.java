package AutomationFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountsTest {
	


	WebDriver driver;
	
public MyAccountsTest(WebDriver driver) {
	
	this.driver = driver;
	}

public WebElement Signin() {
	
	WebElement Y = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
	return Y;	
	}

public WebElement CreatAccount() {
	
	WebElement x = driver.findElement(By.name("email_create"));
	return x;
	
	}

public WebElement CreatAnAccount() {
	
	WebElement x = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
	return x;
	
	}

public WebElement Title() {
	
	WebElement x = driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[2]/label"));
	return x;
	
	}

public WebElement FirstName() {
	
	WebElement x = driver.findElement(By.id("customer_firstname"));
	return x;
	
	}

public WebElement LastName() {
	
	WebElement x = driver.findElement(By.id("customer_lastname"));
	return x;
	
	}


public WebElement Password() {
	
	WebElement x = driver.findElement(By.id("passwd"));
	return x;
	
	}

public WebElement Day() {
	
	WebElement x = driver.findElement(By.id("days"));
	return x;
	
	}



public WebElement Month() {
	
	WebElement x = driver.findElement(By.id("months"));
	return x;
	
	}


public WebElement Year() {
	
	WebElement x = driver.findElement(By.id("years"));
	return x;
	
	}


public WebElement signinoffers() {
	
	WebElement x = driver.findElement(By.id("newsletter"));
	return x;
	
	}


public WebElement RsopOffer() {
	
	WebElement x = driver.findElement(By.id("optin"));
	return x;
	
	}


public WebElement company() {
	
	WebElement x = driver.findElement(By.id("company"));
	return x;
	
	}

public WebElement Address() {
	
	WebElement x = driver.findElement(By.id("address1"));
	return x;
	}

public WebElement Address2() {
	
	WebElement x = driver.findElement(By.id("address2"));
	return x;
	
	}

public WebElement city() {
	
	WebElement x = driver.findElement(By.id("city"));
	return x;
	
	}

public WebElement state() {
	
	WebElement x = driver.findElement(By.id("id_state"));
	return x;
	
	}


public WebElement ZipCode() {
	
	WebElement x = driver.findElement(By.id("postcode"));
	return x;
	
	}


public WebElement Country() {
	
	WebElement x = driver.findElement(By.id("id_country"));
	return x;	
	}

public WebElement AddInfo() {
	
	WebElement x = driver.findElement(By.id("other"));
	return x;	
	}

public WebElement HomePh() {
	
	WebElement x = driver.findElement(By.id("phone"));
	return x;	
	}

public WebElement MobilePh() {
	
	WebElement x = driver.findElement(By.id("phone_mobile"));
	return x;	
	}


public WebElement Assing() {
	
	WebElement x = driver.findElement(By.id("alias"));
	return x;	
	}

public WebElement Register() {
	
	WebElement x = driver.findElement(By.id("submitAccount"));
	return x;	
	}

public WebElement Email() {
	
	WebElement x = driver.findElement(By.id("email"));
	return x;	
	}

public WebElement Pass() {
	
	WebElement x = driver.findElement(By.id("passwd"));
	return x;	
	}

public WebElement SignIn() {
	
	WebElement x = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
	return x;	
	}

}
