package com.noorteck.java.hw19;

/**
 * write a method that takes two String parameters Method checks if a given
 * String contains the specified sequence of character values return true if it
 * contains value otherwise false
 * 
 * @author chefa
 *
 */
public class Question9 {

	private boolean isThere(String strOne, String value) {
		boolean result = false;
		// sees if the value is within the strOne String via the contains() method
		result = strOne.contains(value);
		// returns true if value is in strOne
		// returns false if the value is not in strOne
		return result;
	}

	public static void main(String[] args) {
		Question9 obj = new Question9();
		boolean resultOne = obj.isThere("java training", "ini");
		boolean resultTwo = obj.isThere("java training", "ava");
		boolean resultThree = obj.isThere("java training", "AVA");
		boolean resultFour = obj.isThere("java training", "Java");
		
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}

}
