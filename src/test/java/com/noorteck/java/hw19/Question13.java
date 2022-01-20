package com.noorteck.java.hw19;

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
		System.out.println(obj.isStartWith("java training", "ing"));
		System.out.println(obj.isStartWith("java training", "ja"));
		System.out.println(obj.isStartWith("java training", "java"));
		System.out.println(obj.isStartWith("java training", "train"));
	}
}
