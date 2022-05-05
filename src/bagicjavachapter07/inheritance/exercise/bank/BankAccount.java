package bagicjavachapter07.inheritance.exercise.bank;

public class BankAccount {
	private int balance;

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

}
