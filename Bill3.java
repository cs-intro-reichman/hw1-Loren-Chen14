// Splits a restaurant bill evenly among three diners.
import java.util.Scanner;

public class Bill3 {
    public static void main(String[] args) {
        // To get you started, here is the first line in the program:
        Scanner input = new Scanner(System.in);
        String name1; // variable for the first name
        String name2; // variable for the second name
        String name3; // variable for the third name
        double check; // variable for the check value
        double payment; // variable for the payment for each diner 

        name1= input.nextLine(); // gets the fist name from user
        name2= input.nextLine(); // gets the second name from user
        name3= input.nextLine(); // gets the third name from user
        check= input.nextDouble(); // gets the check value from user

        payment= Math.ceil((check/3)); // payment caculation
        System.out.println("Dear "+ name3 + ", " + name2 + ", and " + name1 + ": pay " + payment + " Shekels each."); // output stracture
    }
}
