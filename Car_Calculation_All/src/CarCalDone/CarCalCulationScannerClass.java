package CarCalDone;

import java.util.Scanner;

public class CarCalCulationScannerClass {
	
	// This Is how To Use Scanner In Same Software Like Car Calculation.....
	// Main Run Method 
	// This is copy From There. Which is connect with Function Class.
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//This is How To Enter as a value By scanner.nextDouble();
		
		System.out.println("Enter The Base price of The Car....");
		double basePrice = sc.nextDouble();
		
		System.out.println("Enter DownPayment of The Car....");
		double downPayment = sc.nextDouble();
		double inteRest =0;
		
		System.out.println("Enter The CreditScore...");
		double creditScore = sc.nextDouble();
		double tax = 8;
		
		System.out.println("Enter The Months....");
		double months =sc.nextDouble();
		
		
		System.out.println("Do You Want To Warrenty?....");
		boolean warenty =sc.nextBoolean();

		CarUtility cu = new CarUtility();

		double totalPrice = cu.gettotalPrice(basePrice, tax, warenty);
		//System.out.println(totalPrice);
		double finprice = cu.getFinancePrice(totalPrice, downPayment);
		//System.out.println(finprice);
		
		double apr = cu.getApr(creditScore);
		double totalFinprice = cu.gettotalFinprice(finprice,apr);
		double MonthlyPay = cu.getMonthlyPayment(totalFinprice, months);
		
		System.out.println("Total Monthly Payment is....");
		System.out.println(MonthlyPay);

		if (creditScore < 700) {

			inteRest = 10.5;
		}

		if (creditScore >= 700) {

			inteRest = 2;
		}
	}

}
