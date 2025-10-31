// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// gets from the user the random numbers limit
		int limit = Integer.parseInt(args[0]);

        // generates 3 random numbers between 0 to limit (not including limit)
		double a = limit * Math.random();
		double b = limit * Math.random();
		double c = limit * Math.random();

		double min, middle, max;

		// getting the min value
		min = Math.min(a, b);
		min = Math.min(min, c);

		// getting the max value
		max = Math.max(a, b);
		max = Math.max(max, c);

		// getting the middle value   
		middle = ( a + b + c ) - (max + min) ; // if we take off the max and min values of the sum a+b+c we get the mid value   

		// printing stracture 
		System.out.println((int)min + " " + (int) middle + " " + (int)max);
	}
}
