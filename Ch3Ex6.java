import java.util.*;


public class Ex6 {
// how do I implement the StopWatch class?
	
	public static void main(String[] args) {
		
		StopWatch time = new StopWatch();
		
		// get 100,000 numbers
		// declare array 
		int[] myList = new int[100000];
	 
		// fill array with random numbers
		for (int i = 0; i < myList.length; i++) {
	
			// Generate an index randomly
			int index = (int)(Math.random() * myList.length);
			int temp = myList[i];
			myList[i] = myList[index];
			myList[index] = temp;
		}
	
	
		// get start time	
		long startTime = time.getStartTime();
	
		// sort 100,000 numbers
		SelectionSorter.selectionSort(myList);
 
		// get end time
		long endTime = time.getEndTime();
	
		// display elapsed time
		long elapsedTime = time.getElapsedTime(startTime, endTime);
		System.out.println("Amount of time it took to sort 100,000 numbers: " + elapsedTime + " milliseconds");	
	}
	

	
// begin class SelectionSorter including selectionSort method, getIndexOfSmallest method and interchange method
	
	public static class SelectionSorter {
	/** The method for sorting the numbers */
		public static void selectionSort(int[] list) {				
		
			for (int index = 0; index < list.length - 1; index++) {
		
				// place the correct value in list[index]
				int indexOfNextSmallest = getIndexOfSmallest(index, list);
				interchange (index, indexOfNextSmallest, list);
			}
		}
		
		private static int getIndexOfSmallest(int startIndex, int[] a) {		
			int min = a[startIndex];
			int indexOfMin = startIndex;
			for (int index = startIndex + 1; index < a.length; index++) {
				if (a[index] < min) {
					min = a[index];
					indexOfMin = index;
				}
			}
			return indexOfMin;
		}
		
		private static void interchange(int i, int j, int[] a) { 		//		private static void interchange(int i, int j, int[] a) {
			int temp = a[i];
			a[i] = a[j];
			a[i] = temp; 
		}
	}
// end class SelectionSorter
	
}
