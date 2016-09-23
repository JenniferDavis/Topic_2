import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		QuadraticEquation quadEq = new QuadraticEquation();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for a, b and c: ");
		
		int a1 = input.nextInt();
		int b1 = input.nextInt();
		int c1 = input.nextInt();
		
		double discriminant = quadEq.getDiscriminant(a1, b1, c1);
				
		if (discriminant > 0) {
			double root1 = quadEq.getRoot1(a1, b1, c1);
			double root2 = quadEq.getRoot2(a1, b1, c1);
			if (root1 == root2){
				System.out.println(root1);
			}
			else 
			System.out.println(root1 + " " + root2);
		}
		
		else if (discriminant == 0){
				System.out.println("The equation has no roots.");
		}	
	}
}
