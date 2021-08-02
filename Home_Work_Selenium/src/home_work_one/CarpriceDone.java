package home_work_one;

import java.util.Scanner;

public class CarpriceDone {

	private static int  totalaprice;

	public static void main(String[] args) {
		
		int carprice;
		int adminfee;
		int interest;
		int tax;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Car Price");
		carprice =sc.nextInt();
		System.out.println("Enter admin fee ");
		adminfee =sc.nextInt();
		System.out.println("Enter interest ");
		interest =sc.nextInt();
		System.out.println("Enter tax");
		tax = sc.nextInt();
		
		
		int totalaprice;
		
		
		totalaprice =carprice + adminfee + interest + tax;
		
		System.out.println("total price of the car");
		System.out.println(totalaprice);
		
		double mothlypayment;
		
		mothlypayment = totalaprice/72;
		
		System.out.println("your monthly payment is...");
		
		System.out.println(mothlypayment);
		
		
	}
}
