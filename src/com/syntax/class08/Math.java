package com.syntax.class08;

public class Math {
	public String name;
	String phone;
	protected String address;
	private int SNN;
	
	
	// this methid can be access from everywhere in the project
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	// this method can be access from inside the package and from everywhere through 
	// inheritance
	protected static int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	//default, when we don't have an access modifier
	//this method 
	static int subtract(int num1, int num2) {
		return num1-num2;
	}
	
	private static int divide(int num1, int num2) {
		if (num2==0) {
		return -1;
		}
		return num1/num2;
	}

	public static void main(String[] args) {
		int result=0;
		result=Math.add(4,7);
		System.out.println("Addition result: "+result);
		
		result=multiply(4,6);
		System.out.println("Multiplication result: "+result);
		
		result=subtract(10,6);
		System.out.println("Subtraction result: "+result);
		
		result=divide(6,3);
		System.out.println("Division result: "+result);
		// first i have to create an object/instance
		
		System.out.println("Now let's test variables");
		Math m=new Math();
		
		m.name="Math";
		m.phone="(123)564646";
		m.address="Virginia USA ";
		m.SNN=524687644;
		
	}
}
