package com.vimal.creation.abstractfactory;

import com.vimal.bo.acct.Account;

public interface AccountAbstractFactory {

	Account accountCreator(String acctType);
}
