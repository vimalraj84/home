package com.vimal.bo.acct;

import java.util.List;

public class SavingsAccount implements Account {

	@Override
	public Balance getBalance() {
		System.out.println("Savings Account Balance");
		return new Balance();
	}

	@Override
	public List<Transaction> getTransactions() {
		// TODO Auto-generated method stub
		return null;
	}

}