// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num, hundreds, tens, ones;
		// gets the number from the user
		num = Integer.parseInt(args[0]);

		// caculation of the division of hundreds , tens and ones
		hundreds = num / 100;
		tens = (num / 10) % 10;
		ones = num % 10;

		System.out.println( hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
		//0 hundreds, 0 tens, and 8 ones.
	}
}
