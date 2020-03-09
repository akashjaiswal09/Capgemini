package com.capgemini.person62;

public class AgeException extends Exception{
	public String msg;

	public AgeException(String msg) {
		super(msg);
		this.msg=msg;
//		System.out.println("AgeExceptionFound");
	}
}

