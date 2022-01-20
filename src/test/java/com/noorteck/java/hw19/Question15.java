package com.noorteck.java.hw19;

/**
 * write a method to trim any leading or trailing whitespace from a given String
 * 
 * @author chefa
 *
 */
public class Question15 {

	public static String removeSpace(String strOne) {
		String result = "";
		// use trim method to get rid of blank space before first non-space character
		// also gets rid of spaces after last non-space character
		result = strOne.trim();
		return result;
	}

	public static void main(String[] args) {
		System.out.println(removeSpace(" Java Training      "));
		System.out.println(removeSpace("     I   like to  practice     "));
	}
}
