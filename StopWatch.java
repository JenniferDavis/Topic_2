import java.util.Date;

public class StopWatch {
	/*
	 * UML Diagram for Stock Class
	 * 
	 * (class name)		StopWatch
	 * 
	 * (data fields)	-startTime: double  // - denotes private
	 * 					-endTime: double	// - denotes private
	 * 				
	 * 					
	 * (constructors)	StopWatch()
	 * 					StartTime()			// initializes StartTime with the current time
	 * 
	 * (methods)		start()				// resets the startTime to the current time.
	 * 					stop()				// sets the endTime to the current time.
	 * 					getElapsedTime() 	// returns the elapsed time for the stopWatch in milliseconds
	 * 					getStartTime()		// returns startTime set to current time
	 * 					getEndTime()		// returns endTime set to current time
	 * 					getCurrentTime()	// returns current time
	 * 
	 */

	
	// get data fields
	private long startTime;		// use getter method
	private long endTime;			// use getter method
	
	// Construct a Stock object
	public void StopWatch() {
	}
	
	// Constructor that initializes startTime with the current time
	public long CurrentTime (){
		
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long currentTime = System.currentTimeMillis();
				  
		 // Display results
		return currentTime;
	}

		
	// getter methods for startTime and endTime
	public long getStartTime(){  			
		long startTime = start();
		return startTime;
	}
	
	public long getEndTime(){
		long endTime = stop();  			
		return endTime;
	}
	
	// method that resets the startTime to the current time
	public long start(){
		long startTime = CurrentTime();  			
		return startTime;
	}
	
	// method that sets the endTime to the current time
	public long stop(){
		long endTime = CurrentTime();  			
		return endTime;
	}
				
	// method that returns the elapsed time for the stopWatch in milliseconds
	public long getElapsedTime(long start, long end){
			return (end - start);
	}
}





/*
 * // Obtain the total milliseconds since midnight, Jan 1, 1970
 * long totalMilliseconds = System.currentTimeMillis();
 * 
 * // Obtain the total seconds since midnight, Jan 1, 1970
 * long totalSeconds = totalMilliseconds / 1000;
 * 
 * // Compute the current second in the minute in the hour
 * long currentSecond = totalSeconds % 60;
 * // Obtain the total minutes
 * long totalMinutes = totalSeconds / 60;
 * // Compute the current minute in the hour
 * long currentMinute = totalMinutes % 60;
 * 
 * // Obtain the total hours
 * long totalHours = totalMinutes / 60;
 * 
 * // Compute the current hour
 * long currentHour = totalHours % 24;
 * 
 * // Display results
 * System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
 */





// obtain current time
//public long getCurrentTime(){
	 
	// Obtain the total milliseconds since midnight, Jan 1, 1970
	// long currentTime = System.currentTimeMillis();
	  
	 // Display results
	 //return currentTime;	
//}
