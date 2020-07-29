package com.syntax.class08;

public class Doctor {
	public String name;
	public String specialty;
	public int licenceId;
	
	public Doctor() {
		
	}
	
	public Doctor(String name) {
		this.name=name;
		
	}
	
	public Doctor(String name, String specialty, int licenceId) {
		this(name);
		this.specialty=specialty;
		this.licenceId=licenceId;
	
	}
	public void chackUp(String name) {
		// to access the name of the doctor 
		// we have to use this. keyword
		System.out.println("Doctor "+this.name+" ordered blood test for patiant "+ name);
	}
	public void treatPatient() {
		
	}
	public void chargePatient() {
		System.out.println("Gets $200!");
	}
	public void displayInfo() {
	System.out.println("Doctor "+name+" with licence ID "+ licenceId+" is of specialty "+ specialty);	
		
	}
	

}
