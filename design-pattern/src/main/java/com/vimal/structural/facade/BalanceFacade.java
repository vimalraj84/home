package com.vimal.structural.facade;

import com.vimal.bo.acct.Account;
import com.vimal.bo.acct.AccountType;
import com.vimal.bo.acct.Balance;
import com.vimal.bo.acct.CheckingAccount;
import com.vimal.bo.acct.IraAccount;
import com.vimal.bo.acct.RothIraAccount;
import com.vimal.bo.acct.SavingsAccount;

public class BalanceFacade {

	private Account savingAccount = null;
	private Account rothAccount = null;
	private Account iraAccount = null;
	private Account checkAccount = null;
	
	public BalanceFacade() {
		savingAccount = new SavingsAccount();
		rothAccount = new RothIraAccount();
		iraAccount = new IraAccount();
		checkAccount = CheckingAccount.get(AccountType.CHECKING).create();
	}
	
	
	public Balance getSavingsBalance() {
		return savingAccount.getBalance();
	}
	
	public Balance getCheckingBalance() {
		return checkAccount.getBalance();
	}
	
	public Balance getRothBalance() {
		return rothAccount.getBalance();
	}
	
	public Balance getIraBalance() {
		return iraAccount.getBalance();
	}
}
