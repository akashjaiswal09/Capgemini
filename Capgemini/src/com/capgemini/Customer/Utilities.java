package com.capgemini.Customer;

import com.cg.exception.NameException;

public class Utilities {
	
public static void nameValidation(String name) throws NameException {
		
		String pattern="[A-za-z]{3,10}";
		if(!name.matches(pattern))
			throw new NameException("I am Akash");
	}

public static boolean accountValidation(String accNo) {
	
	String pattern="[0-9]{3,10}";
	if(accNo.matches(pattern))
		return true;
	else
		return false;
}

public static boolean balanceValidation(String balance) {
	
	String pattern="[0-9]{1,}";
	if(balance.matches(pattern))
		return true;
	else
		return false;
}

public static boolean depositValidation(String deposit) {
	
	String pattern="[1-9]{1}[0-9]{3}";
	if(deposit.matches(pattern))
		return true;
	else
		return false;
}
}
