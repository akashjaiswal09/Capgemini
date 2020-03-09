package com.capgemini.person42;

public class CurrentAccount extends Account {
	int overDraftLimit=100000;
	public boolean Withdraw(double amount) {
		if (amount<=overDraftLimit)
		{
			super.setBalance(super.getBalance()-amount);
			return true;
		}
		else return false;
}

}
