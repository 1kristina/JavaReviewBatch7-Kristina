package com.syntax.class09;

public class School {
	String name, lastName;
	static String schoolName;
	
	School(String name, String lastName){
		this.name=name;
		this.lastName=lastName;
	}
	
	public void printDetails() {
		System.out.println("Name: "+name);
		System.out.println("Lastname: "+lastName);
	}

}
