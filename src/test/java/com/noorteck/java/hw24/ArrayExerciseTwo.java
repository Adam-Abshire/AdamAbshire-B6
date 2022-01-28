package com.noorteck.java.hw24;

/**
 * Write a method that takes an array of char parameter and return true if the
 * array size/length is more than 1 and the first element and the last element
 * in the array are equal, otherwise return false
 * 
 * @author chefa
 *
 */
public class ArrayExerciseTwo {

	protected boolean sameFirstLast(char[] c) {
		boolean result = false;
		if (c.length > 1 && c[0] == c[c.length - 1]) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayExerciseTwo obj = new ArrayExerciseTwo();

		char[] c1 = { 'a', 'b', 'x', 'd', 'a', 'd', 'e', 'q', 'a' };
		char[] c2 = { 'x', 'd', 'a', 'd', 'e', 'q', 'a' };
		char[] c3 = { 'e', 'd', 'a', 'd', 'e', 'q', 'a', 'e' };
		char[] c4 = { 'a' };

		boolean resultOne = obj.sameFirstLast(c1);
		boolean resultTwo = obj.sameFirstLast(c2);
		boolean resultThree = obj.sameFirstLast(c3);
		boolean resultFour = obj.sameFirstLast(c4);

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}
}
