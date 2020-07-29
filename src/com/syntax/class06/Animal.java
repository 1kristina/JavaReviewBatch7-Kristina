package com.syntax.class06;

public class Animal {
	String color;
	int tail;
	int legs;
	String fur;
	String size;
	String name;
	
	void generalInfoOfAnimal(){
		System.out.println("The name of animal is: "+name);
		System.out.println("The "+name+" has "+legs+" legs");
		System.out.println("The fur is "+ fur+" and "+color+" color");
		System.out.println("The size of the "+name+" is "+size);
	}

}
