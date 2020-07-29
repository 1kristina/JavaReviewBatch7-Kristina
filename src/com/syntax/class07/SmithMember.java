package com.syntax.class07;

public class SmithMember {
	String  firstName;
	//This static variable belongs to the class
	static String lastName;
	int age;
	
	public void printInfo() {
		System.out.println(firstName+" "+lastName+" is "+age+" years old!");
	}

}
