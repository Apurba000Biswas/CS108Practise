package practise_set_02_unit_testing;

import java.text.DecimalFormat;

public class BankAccount {
	public final DecimalFormat MONEY = new DecimalFormat("$#,##0.00");
	
	private int balance;
	
	public BankAccount() {
		balance = 0;
	}
	public BankAccount(int initialBalance) {
		deposite(initialBalance);
	}
	
	
	public void deposite(int amount) {
		if(amount < 0) {
			throw new NegativeAmountException("Deposite amount must be positive");
		}else {
			balance += amount;
		}
	}
	
	public void withdraw(int amount) {
		if(amount < 0)
			throw new NegativeAmountException("withdrawal amount must be positive");
		if(amount > balance) {
			throw new NotSufficientBalanceException("Can't get grester than the balance");
		}else {
			balance -= amount;
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		return ("balance is " + MONEY.format(balance));
	}
}

class NegativeAmountException extends RuntimeException {
	
	public NegativeAmountException(String message) {
		super(message);
	}
}

class NotSufficientBalanceException extends RuntimeException {
	
	public NotSufficientBalanceException(String message) {
		super(message);
	}
}
