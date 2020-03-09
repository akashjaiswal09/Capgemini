package com.capgemini.person;

import java.util.Scanner;
enum Gender{
	M,F
};

public class PersonMain {


	public static void main(String[] args) {
		Scanner scr2 = new Scanner(System.in);
		System.out.println("Enter First Name");
		String fname=scr2.next(); 
		System.out.println("Enter Last Name");
		String lname=scr2.next(); 
		System.out.println("Enter Gender");
		String gender=scr2.next();
		System.out.println("Enter Age");
		int age=scr2.nextInt();
	
		if((gender.equals("M")) || (gender.equals("F"))){

		Person p1 = new Person();
		p1.setFirstName(fname);
		p1.setLastName(lname);
		p1.setGender(gender.charAt(0));
		p1.setAge(age);
		System.out.println(p1);
		}	
		else {
			System.out.println("Enter correct gender value");
		}
	}
}

