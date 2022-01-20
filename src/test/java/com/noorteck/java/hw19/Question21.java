package com.noorteck.java.hw19;

/**
 * Write a method that takes one String parameter. Method should repeat every
 * character twice in the original String and return the new value
 * 
 * @author chefa
 *
 */
public class Question21 {

	static String repeatChar(String str) {
		String result = "";
		// iterate through each character of the String
		for (int i = 0; i < str.length(); i++) {
			// new String adds each letter + letter, each iteration
			result += str.substring(i, i + 1) + str.substring(i, i + 1);
		}
		// return the new String
		return result;
	}

	public static void main(String[] args) {
		System.out.println(repeatChar("welcome"));
		System.out.println(repeatChar("Viorica"));
		System.out.println(repeatChar("Abdul"));
		System.out.println(repeatChar("Malek"));
	}
}
