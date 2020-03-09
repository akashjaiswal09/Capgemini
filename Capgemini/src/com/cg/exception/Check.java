package com.cg.exception;

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);

		while(true) {
		System.out.println("Enter Age");
		int age=scr.nextInt();
		try {
			if(age<15 ){
				throw new AgeException("Age of Person should be above 15");
			}
			break;
		}
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally Statement");
		}
	}
	}
}


