package com.capgemini.lambda141;

import java.util.Scanner;

interface PowerFinder {
	double power(double a,double b);
}

public class PowerOfNumber {
	public static void main(String[] args) {

		PowerFinder pf=(a,b)-> (Math.pow(a,b));
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter X and Y");
		int x=scr.nextInt();
		int y=scr.nextInt();
		System.out.println("Power = "+pf.power(x,y));
	}
}
