package com.capgemini.person42;

public abstract class Account {
	
	private static long accNo=1000;
	private double balance;
	private Person accHolder;
	public abstract boolean Withdraw(double amount);
	
	Account(){
		accNo++;
	}
	
	
	public static long getAccNo() {
		return accNo;
	}
	public static void setAccNo(long accNo) {
		Account.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}

}
