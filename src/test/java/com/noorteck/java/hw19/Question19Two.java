package com.noorteck.java.hw19;

public class Question19Two {

	public static boolean isSame(String strOne) {
		boolean result = false;
		String firstTwo = strOne.substring(0, 2);
		String lastTwo = strOne.substring(strOne.length() - 2, strOne.length());
		if (firstTwo.equals(lastTwo)) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		boolean resultOne = isSame("educated");
		boolean resultTwo = isSame("modified memo");
		boolean resultThree = isSame("I am studying");

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
	}
}
