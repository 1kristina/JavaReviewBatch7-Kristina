package com.syntax.class07;

public class FamilyDemo {
	public static void main(String[] args) {
		
		// The last name does not need the object
		SmithMember.lastName="Smith";
		
		SmithMember member1=new SmithMember();
		member1.firstName="Adam";
		member1.age=45;
		member1.printInfo();
		
		SmithMember member2=new SmithMember();
		member2.firstName="Mary";
		member2.age=42;
		member2.printInfo();
		
	
		System.out.println("We are changing Last Name of the family");
		SmithMember.lastName="Jordan";
		
		member1.printInfo();
		member2.printInfo();
		
		System.out.println("Baby is coming");
		
		SmithMember baby=new SmithMember();
		
		baby.firstName="Ali";
		// I dont't need to assing the lastName of the baby
		baby.age=0;
		baby.printInfo();
		
	}

}
