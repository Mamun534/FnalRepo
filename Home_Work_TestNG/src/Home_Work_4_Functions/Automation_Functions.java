package Home_Work_4_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Automation_Functions {

	WebDriver driver;

	public Automation_Functions(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getSpecial() {

		WebElement s = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[1]/a"));
		return s;
	}

	public WebElement getNewProducts() {

		WebElement p = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[2]/a"));
		return p;
	}

	public WebElement getBestSellers() {

		WebElement bs = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[3]/a"));
		return bs;
	}

	public WebElement getOurStores() {

		WebElement os = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[4]/a"));
		return os;
	}

	public WebElement getContactUs() {

		WebElement cu = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[5]/a"));
		return cu;
	}

	public WebElement getTrmsnCondi() {

		WebElement tc = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[6]/a"));
		return tc;
	}

	public WebElement getAboutUs() {

		WebElement au = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[7]/a"));
		return au;
	}

	public WebElement getSiteMap() {

		WebElement sm = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[8]/a"));
		return sm;
	}
}