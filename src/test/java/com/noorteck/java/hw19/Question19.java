package com.noorteck.java.hw19;

/**
 * Write a method to return true from a given String if the first two characters
 * in the string also appear at the end
 * 
 * @author chefa
 *
 */
public class Question19 {

	public static boolean isSame(String strOne) {
		boolean result = false;
		// convert String to array
		char[] charArray = strOne.toCharArray();
		// check to see if the first character is the same as the 2nd to last character
		// && to see if the second character is the same as the last character
		if (charArray[0] == charArray[charArray.length - 2] && charArray[1] == charArray[charArray.length - 1]) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(isSame("educated"));
		System.out.println(isSame("modified memo"));
		System.out.println(isSame("I am studying"));
	}
}
