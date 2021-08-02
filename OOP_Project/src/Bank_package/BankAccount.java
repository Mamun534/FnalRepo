package Bank_package;

public class BankAccount {

	public String firstName;
	public String lastName;
	public String AccountNumber;
	public String address;
	public int totalMoney;

	// this is constructor......

	public BankAccount(String AccountNumber) {

		this.AccountNumber = AccountNumber;

	}

	// We can make as many constructor as we want ..like...
	// This constructor has no input ....

	public BankAccount() {

		System.out.println("This a constractor with out value");
	}
	
	
	public BankAccount(int x) {

		System.out.println("This a constractor with int value");
	}

	
	public void depositMoney() {

		System.out.println("depositMoney");
	}

	public void withDrawMoney() {

		System.out.println("withDrawMoney");

	}

	public void getTotalMoney() {

		System.out.println("getTotalMoney");
  
	}

	public void overDreaft() {

		System.out.println("overDreaft");

	}

}
