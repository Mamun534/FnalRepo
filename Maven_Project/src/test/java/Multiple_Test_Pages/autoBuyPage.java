package Multiple_Test_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class autoBuyPage {

	WebDriver driver;
	autoBuyPage invp;

	public autoBuyPage(WebDriver driver) {

		this.driver = driver;
	}
	
	public WebElement getZipBox() {

		WebElement x = driver.findElement(By.id("zip"));
		return x;

	}
	
	
	public WebElement getStartQuoteButton() {

		WebElement x = driver.findElement(By.xpath("//*[@id=\"submitBtn\"]"));

		return x;
	}

	public WebElement clickCondo() {

		WebElement x = driver.findElement(By.xpath("//*[@id=\"Id_GivePropertyLobs_61084\"]/div[3]/span"));
		return x;

	}

	public WebElement clickNext() {

		WebElement x = driver.findElement(By.xpath("//*[@id=\"Id_ComboActivity_22789Button\"]"));
		return x;
	}


	public WebElement getBirthDate() {

		WebElement x = driver.findElement(By.id("Id_GiveDateOfBirth_64119"));

		return x;

	}

	public WebElement getNextButton1() {

		WebElement x = driver.findElement(By.xpath("//*[@id=\"Id_NEXT_41807Button\"]"));

		return x;

	}

}
