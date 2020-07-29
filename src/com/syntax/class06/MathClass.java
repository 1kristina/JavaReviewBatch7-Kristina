package com.syntax.class06;

public class MathClass {
	public static void main(String[] args) {
		Addition a=new Addition();
		a.add();
		System.out.println("----------");
		
		int result1=a.addWithResult();
		System.out.println(result1);
		System.out.println("-----------");
		
		a.addWithParametrs(5, 5);
		System.out.println("------------");
		
		int result2 =a.addWithParametrsAndResult(5, 6);
		System.out.println(result2);
	}

}
