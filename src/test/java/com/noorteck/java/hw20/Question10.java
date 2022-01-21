package com.noorteck.java.hw20;

/**
 * write a method to check whether a given string ends with the
 * contents(characters) of another string
 * 
 * @author chefa
 *
 */
public class Question10 {

	boolean isEndWith(String strOne, String strTwo) {
		boolean result = false;
		// checks to see if strTwo is the last character set of strOne
		// uses endsWith() method
		if (strOne.endsWith(strTwo)) {
			return true;
		}
		// returns true if the strTwo characters are the last characters of strOne
		// returns false if not
		return result;
	}

	public static void main(String[] args) {
		Question10 obj = new Question10();
		
		boolean resultOne = obj.isEndWith("java training", "ing");
		boolean resultTwo = obj.isEndWith("java training", "ng");
		boolean resultThree = obj.isEndWith("java training", "java");
		boolean resultFour = obj.isEndWith("java training", "train");
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}

}
