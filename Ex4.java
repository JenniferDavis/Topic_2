import java.util.Random;

public class Ex4 {

	public static void main(String[] args) {
	// Create Random object from class Random
		Random randomNumber = new Random();
		
		/*
		 * month = 1 = January
		 * month = 1 = February
		 * month = 1 = March
		 * month = 1 = April
		 * month = 1 = May
		 * month = 1 = June
		 * month = 1 = July
		 * month = 1 = August
		 * month = 1 = September
		 * month = 1 = October
		 * month = 1 = November
		 * month = 1 = December
		 */
		
		int month = randomNumber.nextInt(12) + 1;
		
		// see what the random number is
		System.out.print("The random number chosen is " + month + " ");
		
		// print out the month
		if (month == 1)
			System.out.println("making the random month chosen January.");	
		else if (month == 2) 
			System.out.println("making the random month chosen February.");
		else if (month == 3)
			System.out.println("making the random month chosen March.");
		else if (month == 4) 
			System.out.println("making the random month chosen April.");
		else if (month == 5)
			System.out.println("making the random month chosen May.");
		else if (month == 6) 
			System.out.println("making the random month chosen June.");
		else if (month == 7)
			System.out.println("making the random month chosen July.");
		else if (month == 8) 
			System.out.println("making the random month chosen August.");
		else if (month == 9)
			System.out.println("making the random month chosen September.");
		else if (month == 10) 
			System.out.println("making the random month chosen October.");
		else if (month == 11)
			System.out.println("making the random month chosen November.");
		else if (month == 12)
			System.out.println("making the random month chosen December.");
	}

}
