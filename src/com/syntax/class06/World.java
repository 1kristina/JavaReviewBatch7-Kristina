package com.syntax.class06;

public class World {
	int capacity;
	public static void main(String[] args) {
	
		//Declaring a variable of type baby
		Baby baby1;
		
		//Initializing a variable/creating a baby
		baby1 = new Baby();
		
		//assign values to variables of baby1
		baby1.firstName="Ali";
		baby1.gender='M';
		baby1.lastName="Khan";
		baby1.weight=7;
		// before we assign any hairColor, the default is null
		baby1.hairColor="Brown";
		// reassign value to variables of baby1
		baby1.weight=8;
		System.out.println("The first name of the baby is "+baby1.firstName);
		System.out.println("The weight of the baby is "+baby1.weight);
		String lastNameOfBaby=baby1.lastName;
		System.out.println("The last name is "+lastNameOfBaby);
		
		// accessing the methods of baby1
		baby1.cry();
		baby1.walk();
		baby1.talk(5);
		System.out.println("---------------------------");
		
		// Declaring and initializing the second baby
		Baby baby2=new Baby();
		baby2.firstName="Inci";
		baby2.lastName="Alem";
		baby2.gender='F';
		baby2.hairColor="Yellow";
		baby2.weight=7;
		
		baby2.cry();
		baby2.talk(20);
		System.out.println("-----------------------------");
		baby1.displayInfo();
		System.out.println("---------------------------");
		baby2.displayInfo();
		System.out.println("-----------------------------");
		
		Animal animal1=new Animal();
		
		animal1.color="Yellow";
		animal1.tail=1;
		animal1.legs=4;
		animal1.fur="Short";
		animal1.size="Big";
		animal1.name="Camel";
		animal1.generalInfoOfAnimal();

		
		
		
		
		
		
		
		
	}

}
