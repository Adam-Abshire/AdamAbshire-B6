package com.noorteck.java.hw19;

public class Question2 {
	
	protected boolean isThreeEqual(String strOne, String strTwo, String strThree) {
		boolean result = false;
		// compares strOne to both strTwo & strThree to see if they are all equal
		// equalsIgnoreCase() method makes the comparison non-case sensitive
		if (strOne.equalsIgnoreCase(strTwo) && strOne.equalsIgnoreCase(strThree)) {
			result = true;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Question2 obj = new Question2();
		System.out.println(obj.isThreeEqual("day", "DAY", "DaY"));
		System.out.println(obj.isThreeEqual("week", "weekend", "monday"));
		System.out.println(obj.isThreeEqual("java", "JAVa", "jaVa"));
		System.out.println(obj.isThreeEqual("javaProgramming", "java Programming", "Programming in Java"));
	}
}

/**
	compares three String values, ignoring case
	if the three strings are equal, prints true
	if the three strings are not equal, prints false
*/