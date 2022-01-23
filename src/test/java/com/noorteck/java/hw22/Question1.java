package com.noorteck.java.hw22;

/**
 * Write a method that takes one String parameter and the method converts the
 * parameter to uppercase and return the new String value
 * 
 * @author chefa
 *
 */
public class Question1 {

	String toUpper(String strOne) {
		// if strOne does not equal null --> convert all characters to upper case and
		// return
		if (strOne != null) {
			return strOne.toUpperCase();
			// else return null
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		Question1 obj = new Question1();
		String resultOne = obj.toUpper("pro");
		String resultTwo = obj.toUpper("java");
		String resultThree = obj.toUpper(null);

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
	}
}
