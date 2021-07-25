package Module_8;

/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

public class FinanceCalculator {
    private static Integer MONTHS_IN_YEAR = 12;

    public static double calculateFutureValue(double monthlyPayment, double rate, int years) {

        Integer months =  MONTHS_IN_YEAR * years;
    	double interestRate = (1 + rate/100);
    	
    	double presentValue = monthlyPayment * months;
    	double futureValue = (presentValue * (Math.pow(interestRate, months)));
    	 
		return futureValue = Math.round(futureValue*100.0)/100.0;
    }
    
}// end FinanceCalculator
