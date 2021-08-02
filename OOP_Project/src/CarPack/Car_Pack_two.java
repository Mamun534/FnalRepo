package CarPack;

public class Car_Pack_two {

	// Accesses Modifier

	public String vinNumber;
	public String color;
	public int PriceTheCar;
	public static String DelarName;

	// protected i use as a public when i change public to protected it not 
	//Accesses to other class.....
	
	protected void SartEngine() {
		
		// protected can be access only from the class and the same package
		// no modifier work as same protected....
		System.out.println("Sarting the Engine");
	}
	
	private void StopTransmission() {
		
	//private can be access only from the same class not even from the 
		//same package..
		//user are not able to Start_transmission
	}

	public void StopEngine() {
		
		StopTransmission();
		
		System.out.println("Stop the Engine");
	}

	public void accelerat() {
		System.out.println("accelerate the Engine");
	}
	
	// This is no modifier.......
	
	void accelerat2() {
		System.out.println("accelerate the Engine");
	}

	// if anything static in the functions that means that properties and functions
	// not
	// copy with any object.....
	// Anything user no need to known that will be static like...NumberofSale
	// and what about related with users that should
	// be non static......

	public static void getNumberofSale() {

	}

}
