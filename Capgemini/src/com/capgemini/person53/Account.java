package com.capgemini.person53;

public abstract class Account {
	
	public static long accNo=1000;
	public double balance;
	public Person accHolder;
	public abstract void Withdraw(double amount);
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
	public void Deposit(double amount) {
		balance = this.balance+amount;	
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}

}
