package com.syntax.class08_1;

import com.syntax.class08.Math;

public class MathDemoOutsidePackage extends Math{
	
	public static void main(String[] args) {
		
		int result=0;
		//this method is accessed 
		result=Math.add(4,7);
		System.out.println("Addition result: "+result);
		
		// this method is access from outside package
		//because of inheritance
		result=Math.multiply(4,6);
		System.out.println("Multiplication result: "+result);
		
		//this method cannot be accessed from outside package
//		result=Math.subtract(10,6);
//		System.out.println("Subtraction result: "+result);
//		
		// this method cannot be accessed from outside Math class
		//result=divide(6,3);
		//System.out.println("Division result: "+result);
		
		
		System.out.println("Now let's test variables");
		Math m=new Math();
		m.name="Math";
		//m.phone="(123)564646"; //cannot be accessed because it is from different package
		//m.address="Virginia USA "; ???? should be accessed
		// m.SNN=524687644;// this variable cannot be accessed because it is private
		
		
		MathDemoOutsidePackage m2=new MathDemoOutsidePackage();
		m2.name="Math";
		//m2.phone="(123)564646";// it's cannot be accessed because default
		m2.address="Virginia USA ";
		//m2.SNN=524687644; it's private cannot be accessed
		
	}

}
