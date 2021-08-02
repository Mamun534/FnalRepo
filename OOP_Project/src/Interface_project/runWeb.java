package Interface_project;

public class runWeb {

	public static void main(String[] args) {
		
	// what is the benefits of interface .....	
	// if i want to use the chrome i have to do....
		
		WebDriver driver = new chromeDriver();
		driver.getText(); // this coming from Chrome driver class...
		driver.findElement();

		WebDriver driver1 = new firefoxDriver();
		driver1.getText();
		driver1.sendkeys();
	}

}
