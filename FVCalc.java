// Computes the future value of a saving investment.

public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args[0]); 								// the invested sum
		double rate = Double.parseDouble(args[1]); 										// the anual intrest
		double n = Double.parseDouble(args[2]); 										// the number of years
        double futureValue; 															// the sum after n years 
        
		rate = rate/100; 																// dividing rate bt 100 to get number value

		futureValue= (Math.pow(rate+1,n)) * currentValue ;  							// futere value formula

		System.out.println("After " + (int)n + " years, $" + (int)currentValue + " saved at " + (rate*100) + "% will yield $" + (int)futureValue); // output stracture
	
		//After 2 years, $100 saved at 10.0% will yield $121
	}
}