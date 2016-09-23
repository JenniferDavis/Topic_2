
 public class Stock {

	/*
	 * UML Diagram for Stock Class
	 * 
	 * (class name)		Stock
	 * 
	 * (data fields)	+ symbol: String
	 * 					+ name: String
	 * 					+ previousClosingPrice: double
	 * 					+ currentPrice: double
	 * 					
	 * (constructors)	Stock()
	 * 
	 * (methods)		getChangePercent(double change): void
	 * 
	 */
	

	
	// Construct a Stock object
	public Stock() {
	}

	public String name;
	public String symbol;
	
	public double currentPrice;
	public double previousClosingPrice;
	
	// Return the price change percentage
	public double getChangePercent(){
		double change = ( (currentPrice - previousClosingPrice) * 100.0) / previousClosingPrice;
		return change;
		
		
	}
				
	
}
