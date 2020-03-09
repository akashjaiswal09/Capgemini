package com.capgemini.employee;

public class employee {
	private int empid;
	private int hike;
	private long empSalary;
	private String empName;
	private String empFirstName;
	private String empLastName;
	
	public int getEmpid() {
		return empid;
	}
	public int getHike() {
		return hike;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setHike(int hike) {
		this.hike = hike;
	}
	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpName() {
		return empName;
	}
	
	public String getEmpFirstName() {
		return empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public String getFullName() {
		return this.empFirstName+" "+this.empLastName;
	}
	public long getEmpSalary() {
		return (long) (this.empSalary+this.empSalary*(this.getHike()*.01));
	}
	public void setEmpFullName(String empFullName) {
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

}
