package doselectpack;

import java.util.HashMap;

public abstract class Account{
	Person accHolder;
	Integer accNumber;
	Integer balance;
	String accountType;
	
	HashMap<String, Account> map = new HashMap<>(); 
	
	public abstract void setAccountDetails(Person accHolder,Integer AccNumber,Integer Balance,String accountType);
	public abstract void setBalance(Integer balance);
	public abstract Integer getBalance();
	public abstract String debit(Integer amount);
	public abstract String credit(Integer amount);
	
	public static String createSavingAccount(Person accHolder,Integer accNumber,Integer balance,String accountType) {
		
		HashMap<Integer,Account> savingsaccount = new HashMap<Integer,Account>();
		
		if(balance>=1000) {
			return "Savings Account Successfully Created!";
		}
		else {
			return "Validation Failed";
		}
			
	}
	
	public static String createCurrentAccount(Person accHolder,Integer AccNumber,Integer Balance,String accountType) {
		return accountType;
		
	}
}