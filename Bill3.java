// Splits a restaurant bill evenly among three diners.

public class Bill3 {
    public static void main(String[] args) {

        String name1 = args[0]; 								// variable for the first name
        String name2 = args[1]; 								// variable for the second name
        String name3 = args[2]; 								// variable for the third name
        double check = Integer.parseInt(args[3]); 				// variable for the check value
        double payment;      								    // variable for the payment for each diner 

        payment= Math.ceil((check/3)); 							// payment caculation

        System.out.println("Dear "+ name3 + ", " + name2 + ", and " + name1 + ": pay " + payment + " Shekels each."); // output stracture
    }
}
