package com.noorteck.java.hw22;

/**
 * write a method to get a substring of a given string between wo specified
 * positions
 * 
 * @author chefa
 *
 */
public class Question4 {

	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		// check if String is null
		if (str == null) {
			return null;
			// check if indices are valid
		} else if (startingIndex < 0 || endingIndex >= str.length()) {
			str = "Given Indices Not Valid";
			// print substring starting at startingIndex and ending at endingIndex
		} else {
			str = str.substring(startingIndex, endingIndex);
		}
		// return new String
		return str;
	}

	public static void main(String[] args) {
		String resultOne = getSubStr(null, 2, 6);
		String resultTwo = getSubStr("java training", 2, 6);
		String resultThree = getSubStr("Software Development Engineer in TEST", 11, 23);
		String resultFour = getSubStr("Software Development Engineer in TEST", 21, 29);
		String resultFive = getSubStr("Software Development Engineer in TEST", 1, 88);

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
		System.out.println(resultFive);
	}
}
