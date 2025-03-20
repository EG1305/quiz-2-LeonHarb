// SavingsAccount class by Leon Harb

public class SavingsAccount extends BankAccount {
	private double interestRate;
	
	public double applyInterest(double interest) {
		double newBalance = getBalance() * this.interestRate;
		return newBalance;
	}
	
	
}