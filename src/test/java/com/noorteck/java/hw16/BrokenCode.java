package com.noorteck.java.hw16;

public class BrokenCode {
		// spelled main wrong
	public static void main(String[] args) {
		// addTwoNumbers needed 2 arguments - not 3
		double addResult = addTwoNumbers(4.0, 3.0);
		System.out.println(addResult);
		// i = 0, not i == 0
		// i < 10, not i = 10
		// sections need to be separated by semicolons, not commas
		
		for (int i = 0; i < 10; i++) {
			// System_out.println isn't a thing
			// need a + sign after " not an = sign
			System.out.println("Count: " + i);
		}
		// whoseFavNumber only needs 1 integer argument
		whoseFavNumber(23);
		whoseFavNumber(3);
		// don't want commas in the ()s
		whoseFavNumber(1);
		// can't use syntax String greeting ("John Cena");
		String greeting = "John Cena";
		System.out.println(greeting);
	}

	public static void myName(String name) {
		System.out.println("My name is " + name);
	}
		
	// addTwoNumbers require double argument
	// addTwoNumbers require a return type - double
	static double addTwoNumbers(double numOne, double numTwo) {
		double result = numOne + numTwo;
		System.out.println(numOne + " + " + numTwo + " = " + result);
		return result;
	}
	
	// whoseFavNumber parameter cannot be given value
	// you want to set the return value to String
	public static String whoseFavNumber(int i) {
		String result = "";
		if (i == 1) {
			// String types require double quotes 
			result = "Brook";
			// need to provide double ==s to compare - single = assigns value
			// semicolons...
			// curly braces..
		} else if (i == 2 || i == 4 && i == 4) {
			// spelling error on result
			result = "Dannia";
			// i == 3 to compare not i is 3
		} else if (i == 3) {
			result = "Helen";
			// no ()s after else - there is no boolean to compare
		} else {
			// the return type is String - so we need double quotes ""s
			result = "my favorite number";
		}
		return result;
	}
}