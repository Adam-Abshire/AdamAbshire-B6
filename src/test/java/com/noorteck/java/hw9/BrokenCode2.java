package com.noorteck.java.hw9;

public class BrokenCode2 {
	// the main method is :: public static void main(String[] args) {
	public static void main(String[] args) {
		// need to use double when using decimals
		double tempOne = 84.7;
		int tempTwo = 66;
		// variable result needs to be a boolean in this case
		boolean result;
		// syntax for comparisons is && not &&&
		// int variables do not require quotes
		// <= cannot have a space
		// >= cannot have a space - > must be before =
		if (tempOne <= 0 && tempTwo >= 100) {
			result = true;
			// syntax is else if
			// rogue ;
		} else if (tempOne >= 100 && tempTwo <= 0) {
			result = true;
		} else {
			result = false;
		}
		// variables must be identical - result - not results
		System.out.println(result);
		
		//changed season 
		String season = "fall";

		// no boolean statement for switch statements... just put the variable - compare
		// with cases
		switch (season) {
		// colon after case
		// Strings require ""s
			case "fall":
			System.out.println("Recovering from hot weather");
			break;
			case "winter":
			// need a break to break out so cascade of results doesn't occur
			System.out.println("Toooo cold");
			break;
		// spring is the variable we are looking for
		// colon not semi colon
			case "spring":
			System.out.println("Recovering from cold weather");
			break;
			case "summer":
			System.out.println("Toooo hot");

			default:
			System.out.println("Season does not exist!");
		}

		// for is lower case
		// variable i requires starting value
		// semi colons separate portions of a for loop
		for (int i = 1; i < 10; i++) {
			// == is the syntax - not = =
			// rogue semi colon
			// extra )
			// need { not (
			if (i == 5) {
				// missing semi colon
				System.out.println("I equals to 5");
				// else doesn't require () - there is no boolean expression needed
			} else {
				// Double Quotes are needed to print a String
				System.out.println("i not equals");
			}
		}

	}
//rogue }
}
