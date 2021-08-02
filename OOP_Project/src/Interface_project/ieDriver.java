package Interface_project;

public class ieDriver implements WebDriver{

	@Override
	public void findElement() {
		
		System.out.println("findElement in IEDriver");
	}

	@Override
	public void sendkeys() {
		
		System.out.println("sendkeys in IEDriver");
	}

	@Override
	public void getText() {
		
		
		System.out.println("getText in IEDriver");
	}

}
