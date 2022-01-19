package com.noorteck.java.hw19;

public class Question6 {

	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {
		String result = " ";
		String newOne = strOne.toUpperCase();
		String newTwo = strTwo.toLowerCase();
		String newThree = strThree.toUpperCase();
		String newFour = strFour.toLowerCase();
		result = newOne.concat(newTwo).concat(newThree).concat(newFour);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(combineStr("day", "ONE", "work", "HOURS"));
		System.out.println(combineStr("week", "weekend", "monday", "Tuesday"));
		System.out.println(combineStr("restoN", "vA", "baltiMORE", "MD"));
		System.out.println(combineStr("java", "is", "fun", "LEARNING"));
	}

}
