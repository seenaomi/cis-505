package Module_8;

public class FinanceCalculator {
    private static Integer MONTHS_IN_YEAR = 12;

    public static double calculateFutureValue(double monthlyPayment, double rate, int years) {

        Integer months =  MONTHS_IN_YEAR * years;
    	double interestRate = (1+rate/100);
    	
    	double presentValue = monthlyPayment * months;
    	double futureValue = (presentValue * (Math.pow(interestRate, months)));
    	 
		return futureValue;
    }
    
}
