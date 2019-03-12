package com.vimal.creation.factory;

import com.vimal.bo.acct.Account;
import com.vimal.bo.acct.AccountType;
import com.vimal.bo.acct.CdAccount;
import com.vimal.bo.acct.CheckingAccount;
import com.vimal.bo.acct.IraAccount;
import com.vimal.bo.acct.Name;
import com.vimal.bo.acct.SavingsAccount;

public class AccountFactory {

	public static Account accountCreaor(String acctType) {
		
		switch(acctType) {
		case "IRA":
			return new IraAccount();
		case "SAVINGS":
			return new SavingsAccount(); 
		case "CHECKING":
			return CheckingAccount.get(AccountType.CHECKING).forOwner(new Name("Aira", "Piper")).atBranch("New York").withOverDraftProtection(true).withPaperless(false).create();
		case "CD":
			return new CdAccount();
		default:
			System.out.println("Please mention the Account Type");
			return null;
		}
		
	}
}
