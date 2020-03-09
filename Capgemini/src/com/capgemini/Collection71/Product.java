package com.capgemini.Collection71;

import java.util.Arrays;
import java.util.Scanner;


public class Product {
	
	public void StringArraySort(String[] myArr) {
		
	      int size = myArr.length;

	      for(int i = 0; i<size-1; i++) {
	         for (int j = i+1; j<myArr.length; j++) {
	            if(myArr[i].compareTo(myArr[j])>0) {
	               String temp = myArr[i];
	               myArr[i] = myArr[j];
	               myArr[j] = temp;
	            }
	         }
	      }
	      System.out.println(Arrays.toString(myArr));
	      
	}

	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
		System.out.println("Number of Product");
	    int n = scr.nextInt();
	    System.out.println("Enter Products");
	    String pr= scr.nextLine();
	    String [] names = new String[n];
	    for (int i=0;i<n; i++){
	        names[i] = scr.nextLine();
	        }
	    
	    
	    Product p= new Product();
	    p.StringArraySort(names);

	}	
}


