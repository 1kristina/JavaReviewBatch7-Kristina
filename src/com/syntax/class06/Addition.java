package com.syntax.class06;

public class Addition {
	
	//A  Method with no parameter AND no return
	public void add() {
		int a=3;
		int b=4;
		int res=a+b;
		System.out.println(res);
	}
	
	// A method with no parameters AND with return type
	public int addWithResult() {
		int a=4;
		int b=4;
		int res=a+b;
		return res;
	}	
	// A method with parameters AND no return type
	public void addWithParametrs(int num1, int num2) {
		int res1 =num1+num2;
		System.out.println(res1);
		
	}
	// A method with parameters AND return type
		public int addWithParametrsAndResult(int num1, int num2) {
			int result=num1+num2;
			return result;
	
		}
}
