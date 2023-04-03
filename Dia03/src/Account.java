
public class Account {
	private double balance;
	
	
	public Account() {
		 balance = 0.0;
	}
	
	public Account( double initial_deposit) {
		balance = initial_deposit;
		
	}
	
	public void depositFunds (double funds) {
		balance += funds;
	}
	
	public double withrawFunds(double funds) {
		
		if(funds > balance) {
			
			double newFunds = balance;
			
			balance = 0.0;
			
			return newFunds;
			
		} else {
			
			balance  = balance - funds;
			
			return funds;
		}
		
	}
	
	
	public  double getBalance(){
		return balance; 
	}
	
}
