package com.syntax.class09;

public class TestInheritance {
	public static void main(String[] args) {
		
		Student stu1=new Student("Jimmy", "Jones");
		
		System.out.println(stu1.name);
		System.out.println(stu1.lastName);
		
		Student school=new Student("Indiana","Jones");
		System.out.println(school.name);
		System.out.println(school.lastName);
		
		
	}

}
