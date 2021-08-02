package RunPack;

import CarPack.Car;

public class RunCar {

	public static void main(String[] args) {
		
		Car.getNumberofSale();
		Car.DelarName = "brown fairfax";
		
		// Creating an object of the car class..
		
		Car a = new Car();
					
		// create another object of the car class..
		// declaring the object...

		 Car b = new Car();
		
		//....................................//
		//if i call an object now i can see only the functons like...
		// a.SartEngine();
		// of the  Car calss......if i want to call String vinNumber;
		//String color;
		//int PriceTheCar;
		//..............................................................//
		
		// After that i have to create the properties of the 
		// Car class which is String and int i have to put public 
		// when i do public both of is coming upon called
		// properties  and functions........like
		//a.color
		
		 a.color="Red";
		System.out.println(b.color); // b have no value its showing null
		System.out.println(a.color);
		// now put the value of b.....like
		
		b.color = "Blue"; //Here b have value is blue......
		System.out.println(b.color); 
		
		b.PriceTheCar = 45000;
		System.out.println(b.PriceTheCar); 
	}

}
