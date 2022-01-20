package com.noorteck.java.hw19;

public class Question10 {

	boolean isEndWith(String strOne, String strTwo) {
		boolean result = false;
		// checks to see if strTwo is the last character set of strOne
		// uses endsWith() method
		if (strOne.endsWith(strTwo)) {
			return true;
		}
		// returns true if the strTwo characters are the last characters of strOne
		// returns false if not
		return result;
	}

	public static void main(String[] args) {
		Question10 obj = new Question10();
		System.out.println(obj.isEndWith("java training", "ing"));
		System.out.println(obj.isEndWith("java training", "ng"));
		System.out.println(obj.isEndWith("java training", "java"));
		System.out.println(obj.isEndWith("java training", "train"));
	}

}
