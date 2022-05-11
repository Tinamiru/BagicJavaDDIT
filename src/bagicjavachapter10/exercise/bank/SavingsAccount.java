package bagicjavachapter10.exercise.bank;

public class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	@Override
	public String getAccountType() {
		return "저축예금";
	}

	public void updateBalance(int period) {
		balance += balance * interestRate * period;
	}
}
