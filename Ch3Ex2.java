
public class Ex2 {

	public static void main(String[] args) {
		Stock stockObject = new Stock();
		
		stockObject.symbol = "ORCL";
		stockObject.name = "Oracle Corporation";
		
		stockObject.previousClosingPrice = 34.5;
		stockObject.currentPrice = 34.35;
		
		double change = Math.abs(stockObject.getChangePercent());
		
		System.out.println("Symbol: " + stockObject.symbol);
		System.out.println("Company: " + stockObject.name);
		System.out.println("The closing price was " + stockObject.previousClosingPrice);
		System.out.println("The current price is " + stockObject.currentPrice);
		System.out.println("The difference in price is " + ((int)(change * 10)) / 10.0 + "%");
	}



}

