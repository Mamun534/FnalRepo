package salesdepartment;

import java.util.Scanner;

public class Car_test {

	public static void main(String[] args) {

		new Salesdetails();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("carPrice");
		sc.nextDouble();
		System.out.println("downPayment");
		sc.nextDouble();
		System.out.println("inteRest");
		sc.nextDouble();
		System.out.println("creditScore");
		sc.nextDouble();
		System.out.println("month");
		sc.nextDouble();
		System.out.println("tax");
		double tax = sc.nextDouble();
		System.out.println("Tax value:"+tax);
		
		
	}

}
