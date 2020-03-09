package com.capgemini.lambda142;

import java.util.Scanner;

interface StringSpace {
	String space(String str);
}

public class SpaceBetweenString {
	public static void main(String[] args) {

		StringSpace sa=(str)-> str.replace(""," ").trim();
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=scr.next();
		System.out.println(sa.space(str1));
	}
}
