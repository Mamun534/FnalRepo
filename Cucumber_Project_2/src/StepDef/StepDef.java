package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Functions.FaceBookSignUp;
import Functions.sauceDemologinPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	WebDriver driver;
	sauceDemologinPage lp;
	FaceBookSignUp fs;


	// This call hooks annotation....inn cucumber
	
	@Before
	public void configureSetUp() {

		System.setProperty("webdriver.chrome.driver",		
		"C:\\Users\\Owner\\OneDrive\\Desktop\\program\\chromedriver.exe");
			driver = new ChromeDriver();
	}

	// This call hook annotation....inn cucumber
	
	@After
	public void FinishTest() {
		driver.quit();
	}

	@Given("^user are in the login page$")
	public void user_are_in_the_login_page() throws Throwable {

		lp = new sauceDemologinPage(driver);
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@When("^user are able to type user name$")
	public void user_are_able_to_type_user_name() throws Throwable {

		boolean x = lp.getUserId().isEnabled();
		Assert.assertTrue(x);
		lp.getUserId().sendKeys("standard_user");
		Thread.sleep(1000);

	}

	@When("^user are able to type password$")
	public void user_are_able_to_type_password() throws Throwable {
		boolean y = lp.getPassword().isEnabled();
		Assert.assertTrue(y);
		lp.getPassword().sendKeys("secret_sauce");
		Thread.sleep(1000);

	}

	@Then("^user able to click on login button$")
	public void user_able_to_click_on_login_button() throws Throwable {
		boolean z = lp.LoginButton().isDisplayed();
		Assert.assertTrue(z);
		lp.LoginButton().click();
		Thread.sleep(1000);
		String expected = "https://www.saucedemo.com/inventory.html";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expected);
	}

	@Then("^user are able to see the backpackText$")
	public void user_are_able_to_see_the_backpackText() throws Throwable {

		boolean x = lp.backpackText().isDisplayed();
		Assert.assertTrue(x);
		String backpackText = lp.backpackText().getText();
		System.out.println(backpackText);
		Thread.sleep(1000);
	}

	@Then("^user are able to see the back pack price$")
	public void user_are_able_to_see_the_back_pack_price() throws Throwable {
		boolean c = lp.backPackPrice().isDisplayed();
		Assert.assertTrue(c);
		String backPackPrice = lp.backPackPrice().getText();
		System.out.println(backPackPrice);

	}

	@When("^user are able to backPack add  to Cart$")
	public void user_are_able_to_backPack_add_to_Cart() throws Throwable {
		boolean d = lp.backPackAddCart().isDisplayed();
		Assert.assertTrue(d);
		lp.backPackAddCart().click();
		Thread.sleep(1000);

	}

	@When("^user are able to add cart$")
	public void user_are_able_to_add_cart() throws Throwable {
		boolean e = lp.Cart().isDisplayed();
		Assert.assertTrue(e);
		lp.Cart().click();
		Thread.sleep(1000);

		String expected = "https://www.saucedemo.com/cart.html";
		String actualValue = driver.getCurrentUrl();
		Assert.assertEquals(actualValue, expected);

	}

	@When("^user are able to click on continue shopping$")
	public void user_are_able_to_click_on_continue_shopping() throws Throwable {
		boolean q = lp.ContinueShoping().isDisplayed();
		Assert.assertTrue(q);
		lp.ContinueShoping().click();

		String expected1 = "https://www.saucedemo.com/inventory.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);

	}

	@When("^user are able to see the fleece Jacket Text$")
	public void user_are_able_to_see_the_fleece_Jacket_Text() throws Throwable {
		boolean y = lp.fleeceJacketText().isDisplayed();
		Assert.assertTrue(y);
		String fleeceJacketText = lp.fleeceJacketText().getText();
		System.out.println(fleeceJacketText);
		Thread.sleep(1000);

	}

	@When("^user are able to see fleece Jacket parice$")
	public void user_are_able_to_see_fleece_Jacket_parice() throws Throwable {
		boolean q = lp.FleeceJacketPrice().isDisplayed();
		Assert.assertTrue(q);
		String FleeceJacketPrice = lp.FleeceJacketPrice().getText();
		System.out.println(FleeceJacketPrice);

	}

	@Then("^user are able to Fleece Jacket add to Cart$")
	public void user_are_able_to_Fleece_Jacket_add_to_Cart() throws Throwable {
		boolean z = lp.FleeceJacketAddCart().isDisplayed();
		Assert.assertTrue(z);
		lp.FleeceJacketAddCart().click();
		Thread.sleep(1000);

	}

	@Then("^user able to add Cart$")
	public void user_able_to_add_Cart() throws Throwable {
		boolean e = lp.Cart().isDisplayed();
		Assert.assertTrue(e);
		lp.Cart().click();

	}

	@Then("^user are able to Click Check out$")
	public void user_are_able_to_Click_Check_out() throws Throwable {
		boolean co = lp.ClickCheckout().isDisplayed();
		Assert.assertTrue(co);
		lp.ClickCheckout().click();
		Thread.sleep(1000);

		String expected1 = "https://www.saucedemo.com/checkout-step-one.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);

	}

	@Given("^user have to type First Name$")
	public void user_have_to_type_First_Name() throws Throwable {
		boolean x = lp.FirstName().isEnabled();
		Assert.assertTrue(x);
		lp.FirstName().sendKeys("Mike");
		Thread.sleep(1000);

	}

	@Given("^user have type Last Name$")
	public void user_have_type_Last_Name() throws Throwable {
		boolean y = lp.LastName().isEnabled();
		Assert.assertTrue(y);
		lp.LastName().sendKeys("Hadson");
		Thread.sleep(1000);

	}

	@When("^user type zipcode$")
	public void user_type_zipcode() throws Throwable {
		boolean z = lp.ZipCode().isEnabled();
		Assert.assertTrue(z);
		lp.ZipCode().sendKeys("11367");
		Thread.sleep(1000);

	}

	@Then("^user are able to Click Continue$")
	public void user_are_able_to_Click_Continue() throws Throwable {
		boolean q = lp.ClickContinue().isDisplayed();
		Assert.assertTrue(q);
		lp.ClickContinue().click();

		String expected1 = "https://www.saucedemo.com/checkout-step-two.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);

	}

	@Then("^user are able to see Total Price$")
	public void user_are_able_to_see_Total_Price() throws Throwable {
		boolean x = lp.TotalPrice().isDisplayed();
		Assert.assertTrue(x);
		String totalprice = lp.TotalPrice().getText();
		System.out.println(totalprice);
		Thread.sleep(1000);

	}

	@Then("^user also see the Tax$")
	public void user_also_see_the_Tax() throws Throwable {
		boolean q = lp.Tax().isDisplayed();
		Assert.assertTrue(q);
		String tax = lp.Tax().getText();
		System.out.println(tax);

	}

	@When("^user see trhe Final Price$")
	public void user_see_trhe_Final_Price() throws Throwable {

		boolean c = lp.FinalPrice().isDisplayed();
		Assert.assertTrue(c);
		String fp = lp.FinalPrice().getText();
		System.out.println(fp);

	}

	@When("^user can finish the shopping$")
	public void user_can_finish_the_shopping() throws Throwable {
		boolean y = lp.Finish().isDisplayed();
		Assert.assertTrue(y);
		lp.Finish().click();

		String expected1 = "https://www.saucedemo.com/checkout-complete.html";
		String actualValue1 = driver.getCurrentUrl();
		Assert.assertEquals(actualValue1, expected1);

	}

	@Then("^user are able to go Back To Home page$")
	public void user_are_able_to_go_Back_To_Home_page() throws Throwable {
		boolean bt = lp.BackToHome().isDisplayed();
		Assert.assertTrue(bt);
		lp.BackToHome().click();
	}

	@Given("^user are able to go the yahoo page$")
	public void user_are_able_to_go_the_yahoo_page() throws Throwable {

		driver.get("https://login.yahoo.com/");// url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@When("^user are able to click on create an account$")
	public void user_are_able_to_click_on_create_an_account() throws Throwable {

		WebElement x = driver.findElement(By.xpath("//*[@id=\"createacc\"]"));
		x.click();
	}

	@Then("^user are able to type first name$")
	public void user_are_able_to_type_first_name() throws Throwable {

		WebElement fn = driver.findElement(By.name("firstName"));
		fn.sendKeys("Donald45");
	}

	@Then("^user are able to type last name$")
	public void user_are_able_to_type_last_name() throws Throwable {

		WebElement lm = driver.findElement(By.name("lastName"));
		lm.sendKeys("Trump");
	}

	@When("^user are able to type email$")
	public void user_are_able_to_type_email() throws Throwable {

		WebElement eml = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
		eml.sendKeys("DonaldTrump1923");
	}

	@When("^user are able to type psswoord$")
	public void user_are_able_to_type_psswoord() throws Throwable {

		WebElement pa = driver.findElement(By.id("usernamereg-password"));
		pa.sendKeys("CrazyTrump123@");
	}

	@When("^user have to provide a country code$")
	public void user_have_to_provide_a_country_code() throws Throwable {

		Select cc = new Select(driver.findElement(By.name("shortCountryCode")));
		cc.selectByIndex(46);
	}

	@Then("^user have to provede a phone number$")
	public void user_have_to_provede_a_phone_number() throws Throwable {

		WebElement x1 = driver.findElement(By.id("usernamereg-phone"));
		x1.sendKeys("87424565342");
	}

	@Given("^user have to provide the Birth of Month$")
	public void user_have_to_provide_the_Birth_of_Month() throws Throwable {

		Select mt = new Select(driver.findElement(By.id("usernamereg-month")));
		mt.selectByIndex(5);
	}

	@Then("^user have to provide Birth of Day$")
	public void user_have_to_provide_Birth_of_Day() throws Throwable {

		WebElement x1 = driver.findElement(By.id("usernamereg-day"));
		x1.sendKeys("24");
	}

	@When("^user provide Birth of Year$")
	public void user_provide_Birth_of_Year() throws Throwable {

		WebElement x2 = driver.findElement(By.id("usernamereg-year"));
		x2.sendKeys("1986");
	}

	@Then("^user are able to choose the gender$")
	public void user_are_able_to_choose_the_gender() throws Throwable {

		WebElement x = driver.findElement(By.id("usernamereg-freeformGender"));
		x.sendKeys("Male");
	}

	@Then("^user are able to click on help button$")
	public void user_are_able_to_click_on_help_button() throws Throwable {

		WebElement hl = driver.findElement(By.xpath("//*[@id=\"login-body\"]/div[1]/span[2]/a"));
		hl.click();
	}

	@Then("^user have to click on back tab$")
	public void user_have_to_click_on_back_tab() throws Throwable {

		driver.navigate().back();
	}

	@Then("^user able to closed the application$")
	public void user_able_to_closed_the_application() throws Throwable {

	}

	@Then("^driver quit$")
	public void driver_quit() throws Throwable {
	 
	}
	// .'.'.'.'.'Scenario for Sauce Demo Positive DataTest.'.'.'.'.'.'.'

	
	@Given("^user in the login page$")
	public void user_in_the_login_page() throws Throwable {

		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@When("^user text box is enable$")
	public void user_text_box_is_enable() throws Throwable {

		driver.findElement(By.id("user-name")).isEnabled();

	}

	@Then("^user enters right username$")
	public void user_enters_right_username() throws Throwable {

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

	}

	@When("^usertext box is enable$")
	public void usertext_box_is_enable() throws Throwable {
		driver.findElement(By.id("password")).isDisplayed();
	}

	@Then("^users enters right password$")
	public void users_enters_right_password() throws Throwable {

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@When("^user able to see click button$")
	public void user_able_to_see_click_button() throws Throwable {

		driver.findElement(By.id("login-button")).isDisplayed();
	}

	@When("^users click on the login button$")
	public void users_click_on_the_login_button() throws Throwable {

		driver.findElement(By.id("login-button")).click();

	}

	@Then("^user should able to login$")
	public void user_should_able_to_login() throws Throwable {

		String Url = driver.getCurrentUrl();
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", Url);
		System.out.println(Url);
		Thread.sleep(1000);
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {

	}

	// .'.'.'.'.'.'.'.'.'.Sauce Demo Negative Data Test.'.'.'.'.'.'.'.'.'.

	@Then("^user enters wrong username$")
	public void user_enters_wrong_username() throws Throwable {

		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");

	}

	@Then("^users enters wrong password$")
	public void users_enters_wrong_password() throws Throwable {

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

	}

	@Then("^user should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {

		String url1 = driver.getCurrentUrl();
		Assert.assertEquals(url1, "https://www.saucedemo.com/");
		System.out.println(url1);
	}
	
//.................................................................
	
//.......................Face Book Sign Up Validating..............
	

	@Given("^user in the facebook sign up page$")
	public void user_in_the_facebook_sign_up_page() throws Throwable {
	  
		fs = new FaceBookSignUp(driver);
		driver.get("https://www.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@Then("^user enters the first Name$")
	public void user_enters_the_first_Name() throws Throwable {
	   
		fs.getFirstName().sendKeys("Michel");
	}

	@When("^user can enter the last Name$")
	public void user_can_enter_the_last_Name() throws Throwable {
	   
		fs.getLastName().sendKeys("Clark");
	}

	@Then("^users enters the email$")
	public void users_enters_the_email() throws Throwable {
	  
		fs.getEmail().sendKeys("MichleClark23@gmai.com");
	}

	@When("^user re-enter the email$")
	public void user_re_enter_the_email() throws Throwable {
	 
		fs.getReEnterEmail().sendKeys("MichleClark23@gmai.com");
	}

	@When("^user are able type password$")
	public void user_are_able_type_password() throws Throwable {
	   
		fs.getPassword().sendKeys("MichleClark23");
	}

	@Then("^user have to put Birth Month$")
	public void user_have_to_put_Birth_Month() throws Throwable {
	   
		Select bm = new Select(driver.findElement(By.name("birthday_month")));
		bm.selectByIndex(3);
	}

	@Then("^user have to put Birth Day$")
	public void user_have_to_put_Birth_Day() throws Throwable {
	 
		Select bm = new Select(driver.findElement(By.name("birthday_day")));
		bm.selectByIndex(5);
		
	}

	@When("^user have to put Birth Year$")
	public void user_have_to_put_Birth_Year() throws Throwable {
	 
		Select bm = new Select(driver.findElement(By.name("birthday_year")));
		bm.selectByIndex(12);
	}

	@When("^user are able to select gender$")
	public void user_are_able_to_select_gender() throws Throwable {
	 
		driver.findElement(By.xpath("//*[@id=\"u_0_5_X6\"]")).click();
				
	}

	@Then("^users click on the sign up button$")
	public void users_click_on_the_sign_up_button() throws Throwable {
	
		fs.ClickSignUp().click();
	}
}