package com.noorteck.java.hw12;

public class QuestionTwo {
	public static void main(String[] args) {
		/**
		 * 2) Return true if the given non-negative number is a multiple of 3 or a
		 * multiple of 5. Use the % "mod" operator multipleOf (3) --- true multipleOf
		 * (10) --- true multipleOf (8) --- false
		 */

		// return true
		System.out.println(multipleOf(6));
		System.out.println(multipleOf(10));
		System.out.println(multipleOf(30));
		System.out.println("*****");

		// return false
		System.out.println(multipleOf(-5));
		System.out.println(multipleOf(11));
		System.out.println(multipleOf(37));
	}

	public static boolean multipleOf(int value) {
		boolean result = false;
		if (value > 0 && (value % 3 == 0 || value % 5 == 0)) {
			result = true;
		}
		return result;
	}
}
