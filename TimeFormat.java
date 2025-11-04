// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		// checking if it PM
		if (hours > 12) {
           hours-=12; 													// changing hour format
		   if(minutes < 10){											// checking if we need to add 0 before minutes print
				System.out.println(hours + ":0" + minutes + " PM");     // printing with adding 0
		   } else System.out.println(hours + ":" + minutes + " PM");    // printing regular
		}

		// checking if its midnight -> AM
		else if (hours == 00) {
			hours = 0;													// changing time format to 12
			if(minutes < 10){											// minutes checking like before
				System.out.println(hours + ":0" + minutes + " AM");
		    } else System.out.println(hours + ":" + minutes + " AM");
		}

		// checking if its noon -> 12 PM
		else if (hours == 12) {										
			if(minutes < 10){											// minutes checking like before
				System.out.println(hours + ":0" + minutes + " PM");
		    } else System.out.println(hours + ":" + minutes + " PM");
		}

		// we remain with hour=<12 means AM checking like before
		else {															
			if(minutes < 10){
				System.out.println(hours + ":0" + minutes + " AM");
		    } else System.out.println(hours + ":" + minutes + " AM");
		}
		
		
	}
}