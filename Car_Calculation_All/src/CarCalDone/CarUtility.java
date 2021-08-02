package CarCalDone;

public class CarUtility {

	public double gettotalPrice(double basePrice, double tax, boolean warenty) {

		double x = basePrice + (basePrice*(tax/100));
		
		if (warenty) {

			x = x+1500;
		}
		return x;
	}

	public double getFinancePrice(double totalPrice, double downpayment) {

		double fPrice = totalPrice - downpayment;
		return fPrice;
	}
	
	public double getApr(double creditScore) {
		
		 double apr = 0;
		
		if (creditScore<700) {
			apr = 10.5;
		}

		if (creditScore<=700 && creditScore>=650) {
			apr = 2;
		}

		if (creditScore>650) {
			apr = 3;
		}
		return apr;
	}

	public double gettotalFinprice(double finprice, double apr) {

		double totalfinprice = finprice + finprice * (apr / 100);
		return totalfinprice;
	}
	
	public double getMonthlyPayment(double totalfinPrice, double Months) {
		
	double MonthlyPayment = totalfinPrice/Months;
	
		return MonthlyPayment;
	}
}
