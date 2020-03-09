package com.cg.eis.service;
import com.cg.eis.bean.Employee;

public class EmployeeServiceImplementation implements EmployeeService  {
	public String Scheme(double salary,String designation) {
	
	if (salary>5000 && salary<20000 && designation.equals("System Associate"))
	{
		return "Scheme C";
	}
	else if(salary>=20000 && salary<40000 && designation.equals("Manager"))
	{
		return "Scheme B";
	}
	else if(salary>5000 && designation.equals("Manager"))
	{
		return "Scheme A";
	}
	else if(salary<=5000 &&designation.equals("Clerks"))
	{
		return "No Scheme";
	}
	else
	{
		return "No Scheme";
	}
	
}

}
