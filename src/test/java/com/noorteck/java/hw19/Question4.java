package com.noorteck.java.hw19;

/**
 * write a method that takes one String parameter method converts parameter to
 * upper case and returns new String value
 * 
 * @author chefa
 *
 */
public class Question4 {

	String toUpper(String strOne) {
		String result = " ";
		// converts all characters in strOne to upper case
		result = strOne.toUpperCase();
		return result;
	}

	public static void main(String[] args) {
		Question4 obj = new Question4();
		System.out.println(obj.toUpper("Pro"));
		System.out.println(obj.toUpper("java"));
		System.out.println(obj.toUpper("java training"));
	}
}

/**
 * NOTE: there is a mistake in the test data listed on the requirements
 * toUpper("java") should return JAVA -- NOT LEARNING
 */