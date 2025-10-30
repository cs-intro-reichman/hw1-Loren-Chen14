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
        double payment; // variable for the payment for each one 
        System.out.print("enter your names : "); // statement for all 3 name inputs
        name1= input.nextLine();
        name2= input.nextLine();
        name3= input.nextLine();
        System.out.print("enter your check : "); // statement for the check input
        check= input.nextDouble();
        payment= Math.ceil((check/3)); // payment caculation
        System.out.println("Dear "+ name3 + ", " + name2 + ", and " + name1 + ": Pay " + payment + " Shekels each."); // output stracture
    }
}
