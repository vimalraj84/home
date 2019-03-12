package com.vimal.creation.abstractfactory;

import com.vimal.bo.acct.Account;
import com.vimal.bo.acct.AccountType;
import com.vimal.bo.acct.CheckingAccount;
import com.vimal.bo.acct.Name;
import com.vimal.bo.acct.SavingsAccount;

public class RegularAccountFactory implements AccountAbstractFactory {

	@Override
	public Account accountCreator(String acctType) {
		if("SAVINGS".equalsIgnoreCase(acctType)) 
			return new SavingsAccount();
		else if ("CHECKING".equalsIgnoreCase(acctType)) {
			Account checkingAccount = CheckingAccount.get(AccountType.CHECKING).atBranch("Concord").forOwner(new Name("Alexis","Sky")).withOverDraftProtection(true).withPaperless(true).create();
			return checkingAccount;
		}
		else return null;
	}

}
