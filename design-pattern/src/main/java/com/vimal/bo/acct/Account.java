package com.vimal.bo.acct;

import java.util.List;

public interface Account {
	
	Balance getBalance();
	
	List<Transaction> getTransactions();

}
