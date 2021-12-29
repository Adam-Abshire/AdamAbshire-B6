package com.noorteck.java.hw9;

public class BrokenCode {
	//public needs to be lower case
	//String needs to be upper case
public static void main(String [] args) {
		
	//String needs to be upper case
	//String values need to be in ""
		String firstName = "John";
		//camelCase naming convention needs to be used
		//Strings needs to be declared as String
		String lastName = "Cena";
		
		//variable i needs to be declared
		//semi-colons separate sections of for loop
		//semi-colons end a line - you don't want that if you are entering a forloop or if statement
		for( int i = 1; i <=20; i++){
			//System needs capitalization
			System.out.println(i);
			
		}
		

				//these are both integers - use int to declare
		// no "" are required for int values
		int scoreOne = 88;
		// you need a semi-colon to end a line of code
		int scoreTwo = 77;
				
		//semi-colons end a line - you don't want that if you are entering a forloop or if statement
		if(scoreOne > scoreTwo) {
			System.out.println("Team 1 has higher average score ");
			//use + to concatenate
			System.out.println("Team 1: "  + scoreOne);
			System.out.println("Team 2: " + scoreTwo);
			// semi-colons end a line - you don't want that if you are entering a forloop or if statement
		} else if (scoreOne < scoreTwo) {
 			System.out.println("Score: "+ scoreOne);
			System.out.println("Score: " + scoreTwo);
			//no () are needed for else - there is no boolean statement to evaluate
		} else {
			//"" are required for Strings
 			System.out.println("Score: " + scoreOne);
			System.out.println("Score: " + scoreTwo);
		}		
	}

}
