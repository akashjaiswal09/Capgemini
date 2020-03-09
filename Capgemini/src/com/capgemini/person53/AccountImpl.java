package com.capgemini.person53;

public class AccountImpl extends Account{

	@Override
	public void Withdraw(double amount) {
		balance = this.balance-amount;	
	}

}
