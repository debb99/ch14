package bank;

public class BankAccount {
	public BankAccount(int number, double bal) {
		this.balance = bal;
		this.accountNumber = number;
	}
	
	public String toString(){
		return String.format("Account #%d:%t Balance: %", accountNumber, balance);
	}
	
	private double balance;
	private int accountNumber;
}
