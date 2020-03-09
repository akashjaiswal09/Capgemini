package com.capgemini.starter;
class Employee {
	int empId=5;
	Employee(int eid){
		this.empId=eid;
	}
}

class ContractEmployee extends Employee{
	ContractEmployee(){
		super(10);
		int empId=10;
		
		System.out.println(empId);
	}
}

class Starter{
	public static void main() {
		ContractEmployee ce= new ContractEmployee();

	}
}