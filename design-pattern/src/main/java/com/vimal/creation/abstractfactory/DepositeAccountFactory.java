package com.vimal.creation.abstractfactory;

import com.vimal.bo.acct.Account;
import com.vimal.bo.acct.CdAccount;

public class DepositeAccountFactory implements AccountAbstractFactory {

	@Override
	public Account accountCreator(String acctType) {
		if("CD".equalsIgnoreCase(acctType)) {
			return new CdAccount();
		}
		return null;
	}


}
