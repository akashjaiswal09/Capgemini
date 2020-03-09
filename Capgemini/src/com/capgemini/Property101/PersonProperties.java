package com.capgemini.Property101;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PersonProperties {


	public static void main(String[] args) throws Exception {
		
		Properties p=new Properties();
		p.setProperty("empid", "101");
		p.setProperty("empname", "Akash");
		p.setProperty("salary", "100000");
		p.setProperty("city", "Gorakhpur");
		FileOutputStream out = new FileOutputStream("PersonProps.properties");
		p.store(out,"Prop Stored");
		out.close();
		
		FileInputStream in = new FileInputStream("PersonProps.properties");
		p.load(in);
		System.out.println(p.getProperty("empid"));
		System.out.println(p.getProperty("empname"));
		System.out.println(p.getProperty("salary"));
		System.out.println(p.getProperty("city"));
	}
}


