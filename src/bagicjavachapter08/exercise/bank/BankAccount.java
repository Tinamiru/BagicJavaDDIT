package bagicjavachapter08.exercise.bank;

import java.text.DecimalFormat;

public abstract class BankAccount {
	protected int balance;

	DecimalFormat formatter = new DecimalFormat("###,###");

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public boolean withdraw(int amount) {
		if (balance > amount) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (balance > amount) {
			balance -= amount;
			otherAccount.balance += amount;
			return true;
		}
		return false;
	}

	public String getAccountType() {
		return null;
		
	}
	
	@Override
	public String toString() {
		return formatter.format(balance);
	}

}
