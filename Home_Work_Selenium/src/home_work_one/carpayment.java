package home_work_one;

public class carpayment {

	public static void main(String[] args) {
		
		//Tesla Car Price Details

	
				double carPrice = 30000;
				double downPayment = 5000;
				double inteRest = 700;
				double creditScore = 700;
				double month = 72;
				double tax = 1000;
				double financingPrice;
				double monthlyPayment;
				double priceAfterDown;
				if(creditScore <700) 
					{
					inteRest = 10.5;
					}
				
				if(creditScore >= 700) 
					{
					inteRest = 2;
					}
				
				priceAfterDown= carPrice-downPayment;
			
				financingPrice = priceAfterDown+tax*(inteRest/72);
				
				monthlyPayment = financingPrice/month;
				
				
				System.out.println(monthlyPayment);
				
				
				
			}

	}


