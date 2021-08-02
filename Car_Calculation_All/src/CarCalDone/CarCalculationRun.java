package CarCalDone;

public class CarCalculationRun {

	public static void main(String[] args) {

		// Tesla Car Price Details

		double basePrice = 50000;
		double downPayment = 9000;
		double inteRest = 7.5;
		double creditScore = 700;
		double months = 72;
		double tax = 8.5;
		boolean warenty = true;

		double priceAfterDown;  // after creating Function class i can delet it 
		double financingPrice;  //after creating Function class i can delet it
		double monthlyPayment;  //after creating Function class i can delet it
		

		CarUtility cu = new CarUtility();

		double totalPrice = cu.gettotalPrice(basePrice, tax, warenty);
		System.out.println(totalPrice);
		double finprice = cu.getFinancePrice(totalPrice, downPayment);
		System.out.println(finprice);
		
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

		
		//after creating Function class i can delet it
		// Here Too
		
			priceAfterDown = basePrice-downPayment;
			tax = (basePrice*tax/100);
			financingPrice = priceAfterDown + priceAfterDown * (inteRest / 100);
			monthlyPayment = financingPrice / months;
			//System.out.println(monthlyPayment);
											
	}
}
