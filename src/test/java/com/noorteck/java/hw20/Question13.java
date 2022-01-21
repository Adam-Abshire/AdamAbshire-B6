package com.noorteck.java.hw20;

/**
 * write a method to check whether a given string starts with th contents of
 * another string
 */
public class Question13 {

	boolean isStartWith(String strOne, String strTwo) {
		boolean result = false;
		// check to see if strTwo is the start of strOne with startsWith() method
		if (strOne.startsWith(strTwo)) {
			// returns true if strTwo starts strOne
			result = true;
		}
		// returns false if not
		return result;
	}

	public static void main(String[] args) {
		Question13 obj = new Question13();
	
		boolean resultOne = obj.isStartWith("java training", "ing");
		boolean resultTwo = obj.isStartWith("java training", "ja");
		boolean resultThree = obj.isStartWith("java training", "java");
		boolean resultFour = obj.isStartWith("java training", "train");
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}
}
