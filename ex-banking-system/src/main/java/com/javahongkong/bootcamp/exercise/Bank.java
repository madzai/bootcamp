package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank {
	private LinkedHashMap<Long, Account> accounts; // object reference
	private static Long accountNumberCount = 0L;

	public Bank() {
		// complete the function
		this.accounts = new LinkedHashMap<>();
	}

	public Account getAccount(Long accountNumber) {
		// complete the function
		return this.accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin,
			double startingDeposit) {
		// complete the function

		// Long accountNumber = this.accounts.size() + 1L;
		// CommercialAccount newAccount =
		// new CommercialAccount(company, accountNumber, pin, startingDeposit);

		Long accountNumber = ++accountNumberCount; // ! If multi-thread, you can lock this line
		CommercialAccount newAccount =
				new CommercialAccount(company, accountNumber, pin, startingDeposit);

		this.accounts.put(accountNumber, newAccount);
		return accountNumber;
	}

	public Long openConsumerAccount(Person person, int pin,
			double startingDeposit) {
		// complete the function

		// Long accountNumber = this.accounts.size() + 1L;
		// ConsumerAccount newAccount =
		// new ConsumerAccount(person, accountNumber, pin, startingDeposit);

		Long accountNumber = ++accountNumberCount; // ! If multi-thread, you can lock this line
		ConsumerAccount newAccount =
				new ConsumerAccount(person, accountNumber, pin, startingDeposit);

		this.accounts.put(accountNumber, newAccount);
		return accountNumber;

	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		// return this.accounts.get(accountNumber).validatePin(pin);
		return this.getAccount(accountNumber).validatePin(pin); // .getAccount() is more consistent
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		// return this.accounts.get(accountNumber).getBalance();
		return this.getAccount(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		// this.accounts.get(accountNumber).creditAccount(amount);
		this.getAccount(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		// return this.accounts.get(accountNumber).debitAccount(amount);
		return this.getAccount(accountNumber).debitAccount(amount);
	}
}
