package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank {
	private LinkedHashMap<Long, Account> accounts; // object reference

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
		// return -1L;
		Long accountNumber = (Long) this.accounts.size() + 1;
		CommercialAccount newAccount =
				CommercialAccount(company, accountNumber, pin, startingDeposit);
		this.accounts.put(accountNumber, newAccount);
		return accountNumber;
	}

	public Long openConsumerAccount(Person person, int pin,
			double startingDeposit) {
		// complete the function
		Long accountNumber = (Long) this.accounts.size() + 1;
		ConsumerAccount newAccount =
				new ConsumerAccount(person, accountNumber, pin, startingDeposit);
		this.accounts.put(accountNumber, newAccount);
		return accountNumber;

		// return -1L;

	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		return this.accounts.get(accountNumber).validatePin(pin);
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		return this.accounts.get(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		this.accounts.get(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		return this.accounts.get(accountNumber).debitAccount(amount);
	}
}
