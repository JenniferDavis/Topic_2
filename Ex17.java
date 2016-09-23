import java.util.*;

public class Ex17 {

	public static void main(String[] args) {
		// Copy Random object
		Random rn = new Random();
		
		// Copy Scanner object
		Scanner input = new Scanner(System.in);
		
		// Get user input
		System.out.println("scissor (0), rock (1), paper (2): ");
		int user = input.nextInt();
		
		// scissor(0), rock(1), paper(2)
		
		// generate random number 0-2
		int computer = rn.nextInt(3);
		
		// assign strings
		String userPick = " ";
		String compPick = " ";		
		
		// set strings
		if (user == 0)
			userPick = "scissors";
			else if (user == 1)
				userPick = "rock";
			else if (user == 2)
				userPick = "paper";
		
		if (computer == 0)
			compPick = "scissors";
			else if (computer == 1)
				compPick = "rock";
			else if (computer == 2)
				compPick = "paper";
			
		
		// compute
		if (user == computer)
			System.out.println("The computer is " + compPick + ". You are " + userPick + " too.  It is a draw.");
		else if ( ( computer > user) && (user != 0))
			System.out.println("The computer is " + compPick + ".  You are " + userPick + ".  Computer wins.");
		else if ( (computer == 0) && (user == 2))
			System.out.println("The computer is " + compPick + ".  You are " + userPick + ".  Computer wins.");
		else if ( ( user > computer) && (computer != 0))
			System.out.println("The computer is " + compPick + ".  You are " + userPick + ".  You win.");
		else if ( (user == 0) && (computer == 2))
			System.out.println("The computer is " + compPick + ".  You are " + userPick + ".  You win.");
		else if ( (user == 0) && (computer == 1))
			System.out.println("The computer is " + compPick + ".  You are " + userPick + ".  Computer wins.");
		else if ( (computer == 0) && (user == 1))
			System.out.println("The computer is " + compPick + ".  You are " + userPick + ".  You win.");
	}

}
