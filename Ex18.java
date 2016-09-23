import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//get input weight
		System.out.print("What is the weight of your package? ");
		int weight = input.nextInt();
		double shipping = 0;
		
		if (weight > 50)
			System.out.println("The package cannot be shipped.");
			else if (weight <= 1 && weight > 0){ 
			shipping = 3.5 * weight;
			System.out.print("Shipping Costs: $" + shipping);
			}
			else if (weight <= 3 && weight > 1) {
				shipping = 5.5;
				System.out.print("Shipping Costs: $" + shipping);
			}
			else if (weight <= 10 && weight > 3) {
				shipping = 8.5;
				System.out.print("Shipping Costs: $" + shipping);
			}
			else if (weight <= 20 && weight > 10) {
				shipping = 10.5;
				System.out.print("Shipping Costs: $" + shipping);
			}
			else if (weight <= 30 && weight > 20) {
				shipping = 12.5;
				System.out.print("Shipping Costs: $" + shipping);
			}
			else if (weight <= 40 && weight > 30) {
				shipping = 14.5;
				System.out.print("Shipping Costs: $" + shipping);
			}
			else if (weight < 50 && weight > 40) {
				shipping = 16.5;				
				System.out.print("Shipping Costs: $" + shipping);
			}
		
		
		
		
	}

}
