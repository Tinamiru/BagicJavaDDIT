package bagicjavachapter10.exercise.bank;

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
		if (amount < 0 || amount > balance) {
			throw new IllegalArgumentException();
		} else if (otherAccount == null) {
			throw new NullPointerException();
		}

		if (balance > amount) {
			balance -= amount;
			otherAccount.balance += amount;
			return true;
		}
		return false;
	}

	abstract String getAccountType();

	@Override
	public String toString() {
		return formatter.format(balance);
	}

}
