package com.noorteck.java.hw19;

/**
 * write a method that takes on String parameter and the method converts the
 * parameter to lower case return new String value
 * 
 * @author chefa
 *
 */
public class Question5 {

	protected String toLower(String strOne) {
		String result = " ";
		// converts all characters in strOne to lower case
		result = strOne.toLowerCase();
		return result;
	}

	public static void main(String[] args) {
		Question5 obj = new Question5();
		System.out.println(obj.toLower("espn"));
		System.out.println(obj.toLower("SOCCER"));
		System.out.println(obj.toLower("STRING CLASS"));
	}

}
