package ch14;

public class BankAccount {
	public BankAccount(double init) throws IllegalArgumentException{
		if(init >= 0){
			balance = init;
		} else throw new IllegalArgumentException();
	}
	
	public void deposit(double amount) throws IllegalArgumentException{
		if(amount >= 0){
			balance += amount;
		} else throw new IllegalArgumentException();
	}
	
	public void withdraw(double amount) throws IllegalArgumentException{
		if(amount >= 0){
			if(balance > amount){
				balance -= amount;				
			} else throw new IllegalArgumentException();
		} else throw new IllegalArgumentException();
	}
	
	public double getBalance(){
		return balance;
	}
	
	double balance;
}
