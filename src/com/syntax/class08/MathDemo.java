package com.syntax.class08;

public class MathDemo {
	public static void main(String[] args) {
		
		int result=0;
		result=Math.add(4,7);
		System.out.println("Addition result: "+result);
		
		result=Math.multiply(4,6);
		System.out.println("Multiplication result: "+result);
		
		result=Math.subtract(10,6);
		System.out.println("Subtraction result: "+result);
		
		// this method cannot be accessed from outside Math class
		//result=Math.divide(6,3);
		//System.out.println("Division result: "+result);
		
		
		System.out.println("Now let's test variables");
		Math m=new Math();
		m.name="Math";
		m.phone="(123)564646";
		m.address="Virginia USA ";
		// m.SNN=524687644;// this variable cannot be accessed because it is private
		
	}

}
