import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int digit = input.nextInt();
		
		int digit1 = digit / 100;
		int digit3 = ( digit % 100 ) % 10;
		
		if (digit1 == digit3)
			System.out.println(digit + " is a palindrome.");
		else 
			System.out.println(digit + " is not a palindrome.");
		
		
		
	}

}
