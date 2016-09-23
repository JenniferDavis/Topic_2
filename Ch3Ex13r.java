import java.util.*;


public class Ex13r {

	public static void main(String[] args) {

		// get array rows and columns
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		// fill array
		System.out.println("Enter the array: ");
		
		double[][] locationArray = new double[rows][columns];
		for (int row = 0; row < rows; row++)
		for (int column = 0; column < columns; column++)
		locationArray[row][column] = input.nextDouble();
		
		// print array
		for (int row = 0; row <locationArray.length; row++)
		{
		for (int column = 0; column < locationArray[row].length;column++)
		System.out.print(locationArray[row][column] + " ");
		System.out.println();
		}
		
		
		// run locateLargest method
		double max = Location.locateLargest(locationArray);
		
		
		// get location of max
		double locRow = Location.locationOfLargestRow(locationArray);
		double locCol = Location.locationOfLargestCol(locationArray);
		
		
		//display
		System.out.println("The location of the largest element is " + max + " at " + "(" + (int)locRow + "," + (int)locCol + ")");
		
	}

}
