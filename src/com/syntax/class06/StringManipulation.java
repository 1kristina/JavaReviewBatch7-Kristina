package com.syntax.class06;

public class StringManipulation {
	public static void main(String[] args) {
		//easiest way/short way
		String str="Hello! ";
		
		//long way
		String str2=new String("HELLO! ");
		
		int size=str.length();
		System.out.println("str has "+size+" characters");
		System.out.println("str has "+str.length()+" characters");// the same 
		
		System.out.println(str.toUpperCase());
		//str did not change because String is immutable
		System.out.println(str+" in original");
		
		//str will be updated
		str=str.toLowerCase();
		System.out.println(str);
		
		if (str.equalsIgnoreCase(str2)) {
			System.out.println("They are equal");
		}else {
			System.out.println("They are not equal");
		}
		String str3="Syntax";
		String str4="Sy";
		boolean start=str3.startsWith(str4);
		System.out.println(str3 +"starts with "+str4 +" : "+start);
		
		//str3.endsWith("tax");
		System.out.println(str3.endsWith("tax"));
		
		//Method chaining
		str3.toUpperCase().endsWith("tax");
		System.out.println("str3.toUpperCase().endsWith(tax) --->"+str3.toUpperCase().endsWith("tax"));
		System.out.println("str3.toUpperCase().endsWith(tax) --->"+str3.toUpperCase().endsWith("TAX"));
		
		char fouthCharacter=str3.charAt(4);
		System.out.println(fouthCharacter);
		System.out.println("--------------------");
		
		char [] charArray=str3.toCharArray();
		for(int i=0; i<charArray.length; i++) {
			System.out.print(charArray[i]);
			
		}
		System.out.println();
		System.out.println("------------------");
		
		
		// This is another way printing the reverse
		for(int i=0; i<charArray.length; i++) {
			System.out.print(charArray[charArray.length-(i+1)]);
		
			// normal way to reverse
//		for(int i=charArray.length-1; i>=0; i--) {
//			System.out.print(charArray[i]);
//			
		}
		System.out.println("---------------------");
		
		int position= str3.indexOf("t");
		System.out.println(position);
		
		int position1=str3.indexOf("ta");
		System.out.println(position1);
		
	    position=str3.indexOf("tax",1);
		System.out.println(position);
		
		System.out.println("--------------------------");
		String exemple="There is something here";
		int pos=exemple.indexOf("re",5);// find "re" in word here
		System.out.println(pos);
		System.out.println("--------------------------");
		
		String [] stringArray=exemple.split(" ");
		for(String s:stringArray) {
			System.out.println(s);
		}
		
		
		
	}

}
