package com.vimal.bo.acct;

import java.util.List;

public class CdAccount implements Account {

	@Override
	public Balance getBalance() {
		System.out.println("CD Account Balance");
		return new Balance();
	}

	@Override
	public List<Transaction> getTransactions() {
		// TODO Auto-generated method stub
		return null;
	}

}
