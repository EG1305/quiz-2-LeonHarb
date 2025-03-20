// CheckingAccount class by Leon Harb

public class CheckingAccount extends BankAccount {
	private double overdraftLimit;

	@Override
	public void withdraw(double amount) {
		double balance = getBalance();
		double limit = balance + this.overdraftLimit; 
		if(amount > limit) {
			
		}
		
	} 
	
	
	
	
}
