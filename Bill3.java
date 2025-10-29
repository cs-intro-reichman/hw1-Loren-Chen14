// Splits a restaurant bill evenly among three diners.
import java.util.Scanner;

public class Bill3 {
    public static void main(String[] args) {
        // To get you started, here is the first line in the program:
        Scanner input = new Scanner(System.in);
        String name1;
        String name2;
        String name3;
        double check;
        double payment;
        System.out.print("enter your names : ");
        name1= input.nextLine();
        name2= input.nextLine();
        name3= input.nextLine();
        System.out.print("enter your check : ");
        check= input.nextDouble();
        payment= Math.ceil((check/3)); 
        System.out.println("Dear "+ name3 + ", " + name2 + ", and " + name1 + ": Pay " + payment + " Shekels each.");
    }
}
