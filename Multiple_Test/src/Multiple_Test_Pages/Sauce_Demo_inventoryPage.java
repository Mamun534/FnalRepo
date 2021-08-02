package Multiple_Test_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sauce_Demo_inventoryPage {

	WebDriver driver;
	Sauce_Demo_inventoryPage invp;

	public Sauce_Demo_inventoryPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement UserId() {

		WebElement username = driver.findElement(By.id("user-name"));
		return username;

	}

	public WebElement Password() {

		WebElement Password = driver.findElement(By.id("password"));
		return Password;

	}

	public WebElement LoginButton() {

		WebElement LoginButton = driver.findElement(By.id("login-button"));
		return LoginButton;

	}

	public WebElement backpackText() {

		WebElement x = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		return x;
	}

	public WebElement backPackPrice() {

		WebElement x = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
		return x;
	}

	public WebElement backPackAddCart() {

		WebElement x = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		return x;
	}

	public WebElement Cart() {

		WebElement x = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		return x;
	}

	public WebElement ContinueShoping() {

		WebElement x = driver.findElement(By.id("continue-shopping"));
		return x;
	}

	public WebElement fleeceJacketText() {

		WebElement x = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
		return x;
	}

	public WebElement FleeceJacketPrice() {

		WebElement x = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div"));
		return x;
	}

	public WebElement FleeceJacketAddCart() {

		WebElement x = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		return x;
	}

	public WebElement FleeceJacketCart() {

		WebElement x = driver.findElement(By.xpath("*[@id=\"shopping_cart_container\"]/a/span"));
		return x;
	}

	public WebElement ClickCheckout() {

		WebElement x = driver.findElement(By.id("checkout"));
		return x;
	}

	public WebElement FirstName() {

		WebElement x = driver.findElement(By.id("first-name"));
		return x;

	}

	public WebElement LastName() {

		WebElement x = driver.findElement(By.id("last-name"));
		return x;

	}

	public WebElement ZipCode() {
		
		WebElement x = driver.findElement(By.id("postal-code"));
		return x;
	}

public WebElement ClickContinue() {
		
		WebElement x = driver.findElement(By.id("continue"));
		return x;
	}
	
	public WebElement TotalPrice() {

		WebElement x = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]"));
		return x;
	}
	
	public WebElement Tax() {

		WebElement x = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]"));
		return x;
	}

	public WebElement FinalPrice() {

		WebElement x = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]"));
		return x;
	}

	public WebElement Finish() {

		WebElement x = driver.findElement(By.id("finish"));
		return x;
	}
	
	public WebElement BackToHome() {

		WebElement x = driver.findElement(By.id("back-to-products"));
		return x;
	}
}