package Interface_project;

public class firefoxDriver implements WebDriver {

	@Override
	public void findElement() {
		
		System.out.println("findElement in firefox");
	}

	@Override
	public void sendkeys() {
		
		System.out.println("sendkeys in firefox");
	}

	@Override
	public void getText() {
		
		System.out.println("getText in firefox");
	}

}
