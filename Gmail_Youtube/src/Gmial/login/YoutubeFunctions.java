package Gmial.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubeFunctions {

	WebDriver driver;

	public YoutubeFunctions(WebDriver driver) {

		this.driver = driver;
	}

	
	  public WebElement outlook() {
	  
	  WebElement x =
	  driver.findElement(By.xpath("//*[@id=\"createaccounthero\"]/span")); return
	  x; }
	  
	  public WebElement MailAdd() {
	  
	  WebElement x = driver.findElement(By.xpath("//*[@id=\"MemberName\"]"));
	  return x; }
}
