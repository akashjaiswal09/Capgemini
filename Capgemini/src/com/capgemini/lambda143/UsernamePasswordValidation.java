package com.capgemini.lambda143;

import java.util.Scanner;

interface UsernamePassword {
	String userpass(String u,String p);
}

public class UsernamePasswordValidation {
	public static void main(String[] args) {

		UsernamePassword up=(u,p)-> {
			if (u.equals("admin") && p.equals("admin@4141"))
				return "Correct";
			else
				return "Incorrect";

		};
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the Username");
		String str1=scr.next();
		System.out.println("Enter the Password");
		String str2=scr.next();
		System.out.println(up.userpass(str1,str2));
	}
}
