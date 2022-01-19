package com.noorteck.java.hw19;

public class Question4 {

	String toUpper(String strOne) {
		String result = " ";
		result = strOne.toUpperCase();
		return result;
	}

	public static void main(String[] args) {
		Question4 obj = new Question4();
		System.out.println(obj.toUpper("Pro"));
		System.out.println(obj.toUpper("java"));
		System.out.println(obj.toUpper("java training"));
	}
}

/**
	NOTE: there is a mistake in the test data listed on the requirements
	toUpper("java") should return JAVA -- NOT LEARNING
*/