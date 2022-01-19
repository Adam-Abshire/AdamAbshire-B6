package com.noorteck.java.hw19;

public class Question8 {

	public static char getCharacter(String strOne, int indexNum) {
		char result = ' ';
		if (indexNum >= strOne.length()) {
			result = '?';
		} else {
			result = strOne.charAt(indexNum);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(getCharacter("java training", 2));
		System.out.println(getCharacter("java training", 5));
		System.out.println(getCharacter("java training", 8));
		System.out.println(getCharacter("java training", 22));
	}
	
}
