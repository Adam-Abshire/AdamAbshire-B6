package com.noorteck.java.hw20;

/**
 * Write a method that takes two parameters, one String and one Int The method
 * should return the character at the given index within the String if the
 * indexNum is more than the length of the String then return "?" mark
 * 
 * @author chefa
 *
 */
public class Question8 {

	public static char getCharacter(String strOne, int indexNum) {
		char result = ' ';
		// checks to see if the indexNum is greater than the number of indexes
		if (indexNum >= strOne.length()) {
			// if the indexNum is outside the bounds of the length of the String it prints ?
			result = '?';
			// if the indexNum is within the length of the String - the result is updated to
			// the character at that index
		} else {
			result = strOne.charAt(indexNum);
		}
		// returns the value
		return result;
	}

	public static void main(String[] args) {
		
		char resultOne = getCharacter("java training", 2);
		char resultTwo = getCharacter("java training", 5);
		char resultThree = getCharacter("java training", 8);
		char resultFour = getCharacter("java traingin", 22);
	
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}

}
