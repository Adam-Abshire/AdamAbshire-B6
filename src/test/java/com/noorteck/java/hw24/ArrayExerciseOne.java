package com.noorteck.java.hw24;

/**
 * write a method that takes an array of int prameter and return true if 6
 * appears as either the first element or last element in the array, otherwise
 * return false
 * 
 * @author chefa
 *
 */
public class ArrayExerciseOne {

	static boolean isFirstLast(int[] number) {
		boolean result = false;
		if (number[0] == 6 || number[number.length - 1] == 6) {
			result = true;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] numOne = {6, 1, 2, 3};
		int[] numTwo = {13, 6, 1, 2, 3};
		int[] numThree = {0, 1, 4, 3, 6};
		int[] numFour = {0, 6, 0};
		
		boolean resultOne = isFirstLast(numOne);
		boolean resultTwo = isFirstLast(numTwo);
		boolean resultThree = isFirstLast(numThree);
		boolean resultFour = isFirstLast(numFour);
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}
}
