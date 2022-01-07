package com.noorteck.java.hw12;

/**
 * Return true if the given non-negative number is a multiple of 3 or a multiple
 * of 5. Use the % "mod" operator
 */

public class Part2 {
	public static void main(String[] args) {
		// boolean = true :: prints true when both numbers are negative
		// boolean = true :: also prints true when at least one of the numbers is >0 && divisible by 3 or 5
		System.out.println(posNeg(-1, -1, true)); // true
		System.out.println(posNeg(1, 3, true)); // true
		System.out.println(posNeg(3, 1, true)); // true
		System.out.println(posNeg(1, 4, true)); // false
		System.out.println("*****");
		// boolean = false :: prints true when one of the numbers is positive & one of the numbers is negative
		// boolean = false :: also prints true when at lease one of the numbers is >0 && divisible by 3 or 5
		System.out.println(posNeg(1, -1, false)); // true
		System.out.println(posNeg(-1, 1, false)); // true
		System.out.println(posNeg(1, 3, false)); // true
		System.out.println(posNeg(7, 16, false)); // false
		System.out.println("*****");
	}

	public static boolean posNeg(int valueOne, int valueTwo, boolean isTrue) {
		boolean result = false;
		if (isTrue == true) {
			if (valueOne < 0 && valueTwo < 0) {
				result = true;
			} else {
				result = multipleOf(valueOne, valueTwo);
			}
		} else {
			if ((valueOne < 0 && valueTwo > 0) || (valueOne > 0 && valueTwo < 0)) {
				result = true;
			} else {
				result = multipleOf(valueOne, valueTwo);
			}
		}
		return result;
	}

	public static boolean multipleOf(int valueOne, int valueTwo) {
		boolean result = false;
		if ((valueOne > 0 && valueOne % 3 == 0) || (valueOne > 0 && valueOne % 5 == 0)
				|| (valueTwo > 0 && valueTwo % 3 == 0) || (valueTwo > 0 && valueTwo % 5 == 0)) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
