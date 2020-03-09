package com.capgemini.person41;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Details for Smith\n");	
		
		Person p1 = new Person();
		p1.setName("Smith");
		p1.setAge(25);
		
		Account a1=new Account();
		Account.setAccNo(Account.getAccNo());
		a1.setAccHolder(p1);
		a1.setBalance(2000);
		System.out.println(a1);
		
		a1.Deposit(2000);
		System.out.println("After Deposit Your Updated Balance is "+a1.getBalance());
		
		
		System.out.println("\nDetails for Kathy\n");	
		
		Person p2 = new Person();
		p2.setName("Kathy");
		p2.setAge(23);
		
		Account a2=new Account();
		Account.setAccNo(Account.getAccNo());
		a2.setAccHolder(p2);
		a2.setBalance(3000);
		System.out.println(a2);
		
		a2.Withdraw(2000);
		System.out.println("After Withdraw Your Updated Balance is "+a2.getBalance());
		
	}

}
