package CarPack;

public class Car {

	// oop is basically java class.....no need to any lib...

	
	// This a properties of car class, global variable
	// value is not defined.......
	
	public String vinNumber;
	public String color;
	public int PriceTheCar;
	public static String DelarName;
	
	// Method means what car can do .....
	
	public void SartEngine() {
		System.out.println("Sarting the Engine");
	}

	public void StopEngine() {
		System.out.println("Stop the Engine");
	}

	public void accelerat() {
		System.out.println("accelerate the Engine");
	}
	
	// if anything static in the functions that means that properties and functions not
	// copy with any object.....
	// Anything user no need to known that will be static like...NumberofSale
	//and what about related with users that should 
	// be non static......
	
	public static void getNumberofSale() {
		
		
	}
}
