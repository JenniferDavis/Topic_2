import java.util.*;

public class Location {

	/*
	 * UML Diagram for Location Class
	 * 
	 * (class name)		Location
	 * 
	 * (data fields)	+ row: int
	 * 					+ column: int
	 * 					+ maxValue: double
	 * 					
	 * (constructors)	Location()
	 * 
	 * (methods)		+ locateLargest(double[][] a): static
	 * 
	 */
	

	
	// Construct a Location object
	public Location() {
	}

	public int row;
	public int column;
	public double maxValue = 0;

	
	public static double locateLargest(double[][] a){
  	double [][] array = (a);
	double max = 0;
  	for (int i = array.length - 1; i >= 0; i--) {
		for (int j = array[i].length - 1; j >= 0; j--)		
			if (array[i][j] > max) 
				max = array[i][j];
  		}
	return max;	
	}
	
	public static double locationOfLargestRow(double[][] a){
		double [][] array = (a);
		double locRow = 0;
		int j = 0;
	  	for (int i = array.length - 1; i >= 0; i--) {
			for (j = array[i].length - 1; j >= 0; j--)		
				if (array[i][j] == 45) 
					locRow = i;
	  		}
	  	return locRow;
		}
	
	public static double locationOfLargestCol(double[][] a){
		double [][] array = (a);
	  	double locCol = 0;
		int j = 0;
	  	for (int i = array.length - 1; i >= 0; i--) {
			for (j = array[i].length - 1; j >= 0; j--)		
				if (array[i][j] == 45) 
					locCol = j;
	  		}
	  	return locCol;
		}
	
//end class	
}
