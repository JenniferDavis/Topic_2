import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Get input
		System.out.print("Enter today's day (i.e., 0=Sunday, 1=Monday...6=Saturday): ");
			int today = input.nextInt();
			/*
			 * Sunday is 0
			 * Monday is 1
			 * Tuesday is 2
			 * Wednesday is 3
			 * Thursday is 4
			 * Friday is 5
			 * Saturday is 6
			 */
		
		System.out.print("Enter the number of days elapsed since today: ");	
			int elapsed = input.nextInt();
		
		// Correspond numbers with day of week
		String day = " ";
		
		if (today == 0)
			day = "Sunday";
		else if (today == 1)
			day = "Monday";
		else if (today == 2)
			day = "Tuesday";
		else if (today == 3)
			day = "Wednesday";
		else if (today == 4)
			day = "Thursday";
		else if (today == 5)
			day = "Friday";
		else if (today == 6)
			day = "Saturday";
		
		// assign future day to start number
		int future = 0;
		
		// Compute
		if ( (today + elapsed) > 7)
			future = (today + elapsed) % 7;
		else 
			future = today + elapsed;
		
			
		
		// Display
		if (future == 0)
			System.out.println("Today is " + day + " and the future day is Sunday.");
		else if (future == 1)
			System.out.println("Today is " + day + " and the future day is Monday.");
		else if (future == 2)
			System.out.println("Today is " + day + " and the future day is Tuesday.");
		else if (future == 3)
			System.out.println("Today is " + day + " and the future day is Wednesday.");
		else if (future == 4)
			System.out.println("Today is " + day + " and the future day is Thursday.");
		else if (future == 5)
			System.out.println("Today is " + day + " and the future day is Friday.");
		else if (future == 6)
			System.out.println("Today is " + day + " and the future day is Saturday.");
	}	
	
}
