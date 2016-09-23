import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// create Scanner
		Scanner input = new Scanner(System.in);
		
		// get number
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		
		
		if ((number % 6 == 0) && (number % 5 == 0))
			System.out.println("Is " + number + " divisible by 5 and 6? true");
		else 
			System.out.println("Is " + number + " divisible by 5 and 6? false");
		
		if ((number % 6 == 0) || (number % 5 == 0))
			System.out.println("Is " + number + " divisible by 5 or 6? true ");
		else
			System.out.println("Is " + number + " divisible by 5 or 6? false ");


		if ((number % 6 == 0) ^ (number % 5 == 0))
			System.out.println("Is " + number + " divisible by 5 or 6, but not by both? true ");
		else
			System.out.println("Is " + number + " divisible by 5 or 6, but not by both? false");

					

		
	}

}
