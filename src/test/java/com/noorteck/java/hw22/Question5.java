package com.noorteck.java.hw22;
/**
 * write a method to trim any leading or trailing whitespace from a given string
 * @author chefa
 *
 */
public class Question5 {
	
	public static String removeSpace(String strOne) {
		// check if string is null
		if(strOne == null) {
			return null;
			// if not --> trim the spaces at the beginning and end
		} else {
			strOne = strOne.trim();
		}
		return strOne;
	}
	
	public static void main(String[] args) {
		String resultOne = removeSpace(null);
		String resultTwo = removeSpace("  Java Training      ");
		String resultThree = removeSpace("    I   like   to practice    ");
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
	}
}
