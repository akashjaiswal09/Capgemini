package com.capgemini.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.exception.NameException;

public class DemoCustomer {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		List<Customer> a1 = new ArrayList<Customer>();
		
		while(true) {
		System.out.println("Enter 1 for add Customer\n2 display All Employee\n 3 for Exit");
		String name, account_number, balance, damount, wamount;
		int opt = scr.nextInt();
		switch(opt){
			case 1:
			while (true) {
				System.out.println("ENTER Customer name");
				name = scr.next();
				try {
					Utilities.nameValidation(name);
				} catch (NameException e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
				break;
			}
			while (true) {
				System.out.println("ENTER Customer Account Number");
				account_number = scr.next();
				boolean nameFlag = Utilities.accountValidation(account_number);
				if (!nameFlag)
					System.out.println("Plz enter in numbers only");
				else
					break;
			}
			while (true) {
				System.out.println("ENTER Customer Balance");
				balance = scr.next();
				boolean nameFlag = Utilities.accountValidation(balance);
				if (!nameFlag)
					System.out.println("Plz enter in numbers only");
				else
					break;
			}

			Customer c1 = new Customer();
			c1.setCustName(name);
			c1.setAccNo(Integer.parseInt(account_number));
			c1.setBalance(Integer.parseInt(balance));
			a1.add(c1);
			break;
			
		
		case 2:
			System.out.println(a1);
			break;
		case 3:
			System.exit(1);
			break;

	
		}

	}

}}
