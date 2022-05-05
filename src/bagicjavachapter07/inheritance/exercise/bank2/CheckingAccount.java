package bagicjavachapter07.inheritance.exercise.bank2;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	@Override
	public boolean withdraw(int amount) {
		if (balance < amount) {
			protectedBy.balance -= (amount - balance);
			balance = 0;
			return true;
		}
		return false;

	}

}
