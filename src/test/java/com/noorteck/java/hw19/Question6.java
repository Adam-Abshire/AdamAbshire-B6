package com.noorteck.java.hw19;

/**
 * write a method that takes four String parameters a. converts parameter 1 and
 * parameter 3 to upper case b. converts parameter 2 and parameter 4 to lower
 * case c. then the method concatenates all four parameters and return the new
 * String value
 * 
 * @author chefa
 *
 */
public class Question6 {

	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {
		String result = " ";
		// converts to upper or lower case via toUpperCase() method or toLowerCase()
		// method
		String newOne = strOne.toUpperCase();
		String newTwo = strTwo.toLowerCase();
		String newThree = strThree.toUpperCase();
		String newFour = strFour.toLowerCase();
		// concatenates the four Strings together with no spaces between
		result = newOne.concat(newTwo).concat(newThree).concat(newFour);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(combineStr("day", "ONE", "work", "HOURS"));
		System.out.println(combineStr("week", "weekend", "monday", "Tuesday"));
		System.out.println(combineStr("restoN", "vA", "baltiMORE", "MD"));
		System.out.println(combineStr("java", "is", "fun", "LEARNING"));
	}

}
