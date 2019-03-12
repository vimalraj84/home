package com.vimal.creation.factory;

import com.vimal.bo.acct.Account;

public class TestFactory {

	public static void main(String[] args) {
		Account checkAccount = AccountFactory.accountCreaor("CHECKING");
		checkAccount.getBalance();
		
		Account saveAccount = AccountFactory.accountCreaor("SAVING");
		saveAccount.getBalance();

	}

}
