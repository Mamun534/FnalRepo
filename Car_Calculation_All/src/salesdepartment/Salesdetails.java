package salesdepartment;

public class Salesdetails {

	public static void main(String[] args) {
		
		//Tesla Car Price Details
		
		double carPrice = 30000;
		double downPayment = 5000;
		double inteRest = 1;
		double creditScore = 700;
		double month = 60;
		double tax = 8.5;
			
		double financingPrice;
		double monthlyPayment;
		double priceAfterDown;
		
		if(creditScore <700) {
			
			inteRest = 10.5;
		}
		
		if(creditScore >= 700) {
			
			inteRest = 2;
			}
		
	priceAfterDown= carPrice-downPayment;
			tax=(carPrice*tax/100); 
	financingPrice = priceAfterDown+priceAfterDown+tax*(inteRest/100);
		
		monthlyPayment = financingPrice/month;
		
		System.out.println(monthlyPayment);
		
	}
}
	
	
	