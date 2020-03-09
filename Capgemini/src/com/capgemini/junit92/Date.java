package com.capgemini.junit92;

public class Date {
	private int Month;
	private int Year;
	private int Day;
	// Constructor
	Date(int intDay, int intMonth, int intYear)  	{
		this.Day = intDay;
		this.Month = intMonth;
		this.Year = intYear;
	}
	// setter and getter methods
	void setDay(int intDay)	
	{
		this.Day = Day;
	}
	int getDay( )		
	{
		return  this.Day;
	}
	
	void setMonth(int intMonth)
	{
		this.Month = Month;
	}

	int getMonth( )
	{
		return  this.Month;
	}

	void setYear(int Year)
	{
		this.Year=Year;
	}



	int getYear( )
	{
		return  this.Year;
	}
	public String toString() //converts date obj to string.    
	{
		return	"Date is "+Day+"/"+Month+"/"+Year; 
	}
	} // Date class
