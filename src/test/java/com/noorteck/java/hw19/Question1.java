package com.noorteck.java.hw19;

/**
 * compares two strings returns true if they are equal returns false if they are
 * not equal
 */
public class Question1 {

	static boolean isEqual(String strOne, String strTwo) {
		boolean result = false;
		// compare two String values via equals() method
		if (strOne.equals(strTwo)) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(isEqual("sdet", "SDET"));
		System.out.println(isEqual("testing", "testing"));
		System.out.println(isEqual("java", "java"));
		System.out.println(isEqual("java", "java Programming"));
	}
}
