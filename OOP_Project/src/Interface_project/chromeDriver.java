package Interface_project;

public class chromeDriver implements WebDriver {

	// When i implements web_Driver with this class..
		// then it showing me error and add unimplemented method 
		// then after add unimplemented method its become as bellow....

	@Override
	public void findElement() {
		
		// this functions coming from my web_Driver class...
		
		System.out.println("findElement in chrome");
	}

	@Override
	public void sendkeys() {
		
		System.out.println("sendkeys in chrome");
		
	}

	@Override
	public void getText() {
	
		System.out.println("getText in chrome");
	}
	
}
