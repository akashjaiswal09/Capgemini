package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImplementation;
import com.cg.eis.service.InsuranceServiceScheme;

public class EmployeeDemo{

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Employee ID");
		String id=scr.next();
		System.out.println("Enter Employee Name");
		String name=scr.next();
		System.out.println("Enter Employee Salary");
		String salary=scr.next();
		System.out.println("Enter Employee Designation");
		String designation=scr.next();
		
		Employee Emp= new Employee(); 
		Emp.setId(Integer.parseInt(id));
		Emp.setName(name);
		Emp.setSalary(Integer.parseInt(salary)); 
		Emp.setDesignation(designation);
		
		EmployeeServiceImplementation Ins=new EmployeeServiceImplementation();
		Emp.setInsuranceScheme(Ins.Scheme(Double.parseDouble(salary),designation));
		System.out.println(Ins.Scheme(Double.parseDouble(salary),designation));
		System.out.println(Emp);

	}

}
