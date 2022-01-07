package com.noorteck.java.hw12;

/**
 * Given 2 int values and 1 boolean value, return true if one is negative and
 * one is positive and boolean value is false. Except if the boolean parameter
 * is true, then return true only if both are negative.
 */

public class QuestionOne {
	public static void main(String[] args) {
		// boolean = false :: prints true when one value is positive & one value is negative
		System.out.println(posNeg(1, -1, false));
		System.out.println(posNeg(-1, 1, false));
		System.out.println(posNeg(-1, -3, false));
		System.out.println(posNeg(1, 3, false));
		System.out.println("*****");

		// boolean = true :: prints true when both values are negative
		System.out.println(posNeg(-4, -5, true));
		System.out.println(posNeg(-4, 2, true));
		System.out.println(posNeg(3, -1, true));
		System.out.println(posNeg(4, 5, true));
		System.out.println("*****");
	}

	public static boolean posNeg(int valueOne, int valueTwo, boolean isTrue) {
		boolean result = false;
		if (isTrue == true) {
			if (valueOne < 0 && valueTwo < 0) {
				result = true;
			} else {
				result = false;
			}
		} else {
			if ((valueOne < 0 && valueTwo > 0) || (valueOne > 0 && valueTwo < 0)) {
				result = true;
			} else {
				result = false;
			}
		}
		return result;
	}
}
