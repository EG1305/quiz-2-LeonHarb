// Quiz #4 by Leon Harb
// BankAccount class


public class BankAccount {
	private String accountNumber;
	private double balance;
	
	// Method to withdraw money from the account
	public void withdraw(double amount) {
		this.balance = this.balance - amount; 
	}
		
	// Method to deposit money into the account
	public void deposit(double amount) {
		this.balance = this.balance + amount;	
	}

	public double getBalance() {
		return balance;
	}
	
}
