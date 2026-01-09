package com.javahongkong.bootcamp.exercise;

public class Transaction implements AccountInterface {
	private Long accountNumber;
	private Bank bank;

	/**
	 *
	 * @param bank The bank where the account is housed.
	 * @param accountNumber The customer's account number.
	 * @param attemptedPin The PIN entered by the customer.
	 * @throws Exception Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin)
			throws Exception {
		// complete the function
		if (bank.getAccount(accountNumber) == null
				|| !bank.authenticateUser(accountNumber, attemptedPin))
			throw new Exception("Transaction failed");

		this.bank = bank;
		this.accountNumber = accountNumber;

	}

	public double getBalance() {
		// complete the function
		return this.bank.getBalance(this.accountNumber);
	}

	public void credit(double amount) {
		// complete the function
		this.bank.credit(this.accountNumber, amount);
	}

	public boolean debit(double amount) {
		// complete the function
		return this.bank.debit(this.accountNumber, amount);
	}
}
