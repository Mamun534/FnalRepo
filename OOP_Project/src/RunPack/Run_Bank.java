package RunPack;

import Bank_package.BankAccount;

public class Run_Bank {

	public static void main(String[] args) {
		
		BankAccount john = new BankAccount("98345678");
		BankAccount mike = new BankAccount("87655943");
		BankAccount jim = new BankAccount("87655943");
		BankAccount tim = new BankAccount(34567987);
		BankAccount kim = new BankAccount("87655943");
		
		System.out.println(john.AccountNumber);
		System.out.println(john.address);
		System.out.println(mike.AccountNumber);
		System.out.println(mike.address);
		
		// its showing address null...the cause of address is bellow..
		
		john.address="new York";
		mike.address = "MarryLand";
		jim.address = "Washington";
		tim.address = "Brooklyn";
		kim.address = "Queens";

		// This is Showing Address ......Console..
		
		System.out.println(john.AccountNumber);
		System.out.println(john.address);
		System.out.println(mike.AccountNumber);
		System.out.println(mike.address);
		System.out.println(tim.AccountNumber); // no value coming null..
		System.out.println(tim.address);
		System.out.println(kim.AccountNumber);
		System.out.println(kim.address);
		
	}

}
