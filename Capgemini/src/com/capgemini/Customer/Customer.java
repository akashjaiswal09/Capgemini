package com.capgemini.Customer;

public class Customer {

	private String custName;
	private long accNo;
	private long balance;
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName; 
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public long getBalance() {
		return balance;
	}
	public long setBalance(long balance) {
		return this.balance = balance;
	}
	public void Deposit(long damount) {
		balance = this.balance+damount;	
	}
	public boolean Withdraw(long damount) {
		if (balance>=damount)
		{
			balance = this.balance-damount;
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", accNo=" + accNo + ", balance=" + balance + "]";
	}
	
}
