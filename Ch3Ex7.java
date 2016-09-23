
public class Ex7{

	public static void main(String[] args) {
		
		Account defaultAccount = new Account();
		
		// set variables
		int id = 0;
		
		Account.createAccount(1122, 20000);
		
		defaultAccount.setAnnualInterestRate(4.5);
		
		defaultAccount.withdraw(2500);
		
		
		defaultAccount.deposit(3000);
		
		id = defaultAccount.getId();
		
		String date = defaultAccount.getDateCreated();

		double balance = defaultAccount.getBalance();
		
		double monthlyInterest = defaultAccount.getMonthlyInterest();
		
		System.out.println("Account Number " + id + " was created " + date);
		System.out.println("Balance: $" + balance);
		System.out.println("Monthly interest: $" + monthlyInterest);	
	}	

}
