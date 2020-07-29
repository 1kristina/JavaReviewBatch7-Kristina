package com.syntax.class09;

public class Student extends School {
	String stuId;
	// Parent --->School class
	// Child---> Student class
	
	public Student(String name, String lastName) {
		super(name, lastName);
		this.stuId=stuId;
	}
	
	public void study() {
	System.out.println(name+" "+lastName+" study at "+schoolName);	
		
	}
	

}
