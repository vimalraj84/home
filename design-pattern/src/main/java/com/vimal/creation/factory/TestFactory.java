package com.vimal.creation.factory;

import com.vimal.bo.acct.Account;

public class TestFactory {

	public static void main(String[] args) {
		Account checkAccount = AccountFactory.accountCreator("CHECKING");
		checkAccount.getBalance();
		
		Account saveAccount = AccountFactory.accountCreator("SAVINGS");
		saveAccount.getBalance();

	}

}
