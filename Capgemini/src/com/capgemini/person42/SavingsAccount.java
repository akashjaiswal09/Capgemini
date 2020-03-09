package com.capgemini.person42;

public class SavingsAccount extends Account {
	private final int minBalance=3000;
	public boolean Withdraw(double amount) {
		if (super.getBalance()>=minBalance && super.getBalance()-amount>=minBalance)
		{
			super.setBalance(super.getBalance()-amount);
			return true;
		}
		else return false;
}

}
