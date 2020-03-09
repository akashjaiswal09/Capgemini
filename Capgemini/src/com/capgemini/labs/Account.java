package com.capgemini.labs;

public abstract class Account {
	
	
	
	private static long accNo=10000;
	protected double balance;
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
	public void Deposit(double amount) {
		balance = this.balance+amount;	
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	}
	
