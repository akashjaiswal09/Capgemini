package com.capgemini.employee;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		System.out.println("ENTER emp id");
		int empid=scr.nextInt();
		System.out.println("ENTER emp first name");
		String fname=scr.next();
		System.out.println("ENTER emp last name");
		String lname=scr.next();
		System.out.println("ENTER emp salary");
		long salary=scr.nextLong();
		System.out.println("ENTER hike");
		int hike=scr.nextInt();
		
		
		employee emp = new employee();
		emp.setEmpid(empid);
		emp.setEmpFirstName(fname);
		emp.setEmpLastName(lname);
		emp.setEmpSalary(salary);
		emp.setHike(hike);
		
		
		employee emp1 = new employee();
		emp1.setEmpid(10003);
		emp1.setEmpName("NEHA");
		
		System.out.println(emp.getFullName());
		System.out.println(emp.getEmpSalary());
//		System.out.println(emp1.getEmpName());
	}

}
