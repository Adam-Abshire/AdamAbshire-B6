package com.noorteck.java.hw22;

/**
 * write a method that takes a String parameter and returns true if the string
 * parameter ends in "ng"
 * 
 * @author chefa
 *
 */
public class Question6 {

	public boolean endsWithNG(String strOne) {
		// check if string is null
		if (strOne == null) {
			return false;
		} else {
			// check if string ends in ng
			if (strOne.endsWith("ng")) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public static void main(String[] args) {
		Question6 obj = new Question6();
		boolean resultOne = obj.endsWithNG(null);
		boolean resultTwo = obj.endsWithNG("I like to practice");
		boolean resultThree = obj.endsWithNG("Everyone is practicing");
		boolean resultFour = obj.endsWithNG("I am studying");
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
		
	}
}
