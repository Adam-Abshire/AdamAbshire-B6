package com.noorteck.java.hw19;

/**
 * write a method to get a substring of a given string between two specified
 * positions
 */
public class Question14 {

	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		String result = "";
		// cuts off all characters up to startingIndex
		// cuts off all characters after endingIndex
		// using substring() method
		result = str.substring(startingIndex, endingIndex);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(getSubStr("java training", 2, 6));
		System.out.println(getSubStr("Software Development Engineer in TEST", 11, 23));
		System.out.println(getSubStr("Software Development Engineer in TEST", 21, 29));
	}
}
