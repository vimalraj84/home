package com.vimal.creation.abstractfactory;

import com.vimal.bo.acct.Account;
import com.vimal.bo.acct.IraAccount;
import com.vimal.bo.acct.RothIraAccount;

public class RetirementAccountFactory implements AccountAbstractFactory {


	@Override
	public Account accountCreator(String acctType) {
		if("ROTH".equalsIgnoreCase(acctType))
			return new RothIraAccount();
		else if("IRA".equalsIgnoreCase(acctType))
			return new IraAccount();
		else
			return null;
	}

}
