package Inheritance_Project;

public class checkingAccount extends bankAccount{
	
	// how to connect multiple class using subclass,
	// for link the class i have to use extends then classname
	// for now checkinhAccount class become sub/child class of the bankAccount class
	
	
public void depositMoney() {
	
	// this idea is method overriding means child class functions have as parent class
	// thats why its no gonna print in console....
	
	
		super.depositMoney();
		
		System.out.println("This functions have as same in parent class");
		
		
		
	}
	

}
