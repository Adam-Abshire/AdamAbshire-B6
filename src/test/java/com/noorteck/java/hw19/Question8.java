package com.noorteck.java.hw19;

public class Question8 {

	public static char getCharacter(String strOne, int indexNum) {
		char result = ' ';
		// checks to see if the indexNum is greater than the number of indexes 
		if (indexNum >= strOne.length()) {
			// if the indexNum is outside the bounds of the length of the String it prints ?
			result = '?';
			// if the indexNum is within the length of the String - the result is updated to the character at that index
		} else {
			result = strOne.charAt(indexNum);
		}
		// returns the value
		return result;
	}

	public static void main(String[] args) {
		System.out.println(getCharacter("java training", 2));
		System.out.println(getCharacter("java training", 5));
		System.out.println(getCharacter("java training", 8));
		System.out.println(getCharacter("java training", 22));
	}
	
}
