// Computes the future value of a saving investment.

import java.util.Scanner;

public class FVCalc {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double currentValue; // the invested sum
		double rate; // the anual intrest
		double n; // the number of years
        double futureValue; // the sum after n years 
        
		currentValue= Double.parseDouble(input.nextLine()); // user current value input
		rate= Double.parseDouble(input.nextLine());// user rate input
		n= Double.parseDouble(input.nextLine()); // user years input

		rate = rate/100; // dividing rate bt 100 to get number value

		futureValue= (Math.pow(rate+1,n)) * currentValue ;  // futere value formula

		System.out.println("After " + n + " years $" + currentValue + " saved at " + rate + "% will yield $" + (int)futureValue);
	
	}
}