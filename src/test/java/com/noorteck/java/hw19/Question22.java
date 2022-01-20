package com.noorteck.java.hw19;

/**
 * Write a method that takes two parameters, String and char. Count the
 * occurrences of a given character in a String and return the value of how many
 * times a character occured in a String
 * 
 * @author chefa
 *
 */
public class Question22 {

	public static int occurenceCount(String str, char c) {
		int result = 0;
		// break into char array
		char[] charArray = str.toCharArray();
		// iterate through each index
		for (int i = 0; i < charArray.length; i++) {
			// determine if the character at that index is the same as the char value
			if (charArray[i] == c) {
				// keep track of each time the character matches
				result += 1;
			}
		}
		// return the amount
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("There are " + occurenceCount("java training", 'a') + " occurences");
		System.out.println("There are " + occurenceCount("java training", 'i') + " occurences");
		System.out.println("There are " + occurenceCount("I love programming", 'm') + " occurences");
		System.out.println("There are " + occurenceCount("Sunday", 'f') + " occurences");
		
	}
}
