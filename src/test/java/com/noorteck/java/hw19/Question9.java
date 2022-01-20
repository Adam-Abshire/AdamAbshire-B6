package com.noorteck.java.hw19;

public class Question9 {

	private boolean isThere(String strOne, String value) {
		boolean result = false;
		// sees if the value is within the strOne String via the contains() method
		result = strOne.contains(value);
		// returns true if value is in strOne
		// returns false if the value is not in strOne
		return result;
	}

	public static void main(String[] args) {
		Question9 obj = new Question9();
		System.out.println(obj.isThere("java training", "ini"));
		System.out.println(obj.isThere("java training", "ava"));
		System.out.println(obj.isThere("java training", "AVA"));
		System.out.println(obj.isThere("java training", "Java"));
	}

}
