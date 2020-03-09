package com.cg.exception;

class NameException extends Exception{
	String msg;
	public NameException(String msg) {
		super(msg);
		this.msg=msg;
		System.out.println("NameExceptionFound");
	}
	
	@Override
	public String getMessage() {
		return this.msg;
	}
}

class AgeException extends Exception{
	private String msg2;

	public AgeException(String msg2) {
		super(msg2);
		this.msg2=msg2;
		System.out.println("AgeExceptionFound");
	}
}
