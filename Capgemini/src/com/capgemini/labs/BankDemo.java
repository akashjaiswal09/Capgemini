package com.capgemini.labs;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Person Name(for Smith)");
		String name1=scr.next();
		System.out.println("Enter Person Age");
		String age1=scr.next();
		Person p1=new Person();
		p1.setName(name1);
		p1.setAge(Integer.parseInt(age1));

	
		

		System.out.println("Enter Balance");
		String balance1=scr.next();
		

		
//		SavingsAccount a1=new SavingsAccount();
//
//		Account.setAccNo(Account.getAccNo());
//		a1.setBalance(Double.parseDouble(balance1));
//		a1.setAccHolder(p1);
//		
//		System.out.println("Enter Amount to Withdraw to Smith");
//		String wamount=scr.next();
//		boolean test=a1.Withdraw(Double.parseDouble(wamount));
//		if(!test) {
//			System.out.println("Transaction failed");
//		}
//		System.out.println("Your balance is"+ a1.getBalance());
		
		CurrentAccount a1=new CurrentAccount(); 

		Account.setAccNo(Account.getAccNo());
		a1.setBalance(Double.parseDouble(balance1));
		a1.setAccHolder(p1);
		
		System.out.println("Enter Amount to Withdraw to Smith");
		String wamount=scr.next();
		boolean test=a1.Withdraw(Double.parseDouble(wamount));
		if(!test) {
			System.out.println("Transaction failed");
		}
		System.out.println("Your balance is"+ a1.getBalance());

	}
}
