package com.noorteck.java.hw19;

public class Question3 {
	
	public static void isEqualLength(String strOne, String strTwo) {
		if (strOne.length() == strTwo.length()) {
			String newStr = strOne.concat(strTwo);
			System.out.println(newStr + " " + newStr.length());
		} else if (strOne.length() > strTwo.length()) {
			System.out.println(strOne.toUpperCase() + " " + strOne.length());
		} else {
			System.out.println(strTwo.toLowerCase() + " " + strTwo.length());
		}
	}

	public static void main(String[] args) {
		isEqualLength("Pro", "Ali");
		isEqualLength("java", "LearNinG");
		isEqualLength("java training", "java");
	}
}
