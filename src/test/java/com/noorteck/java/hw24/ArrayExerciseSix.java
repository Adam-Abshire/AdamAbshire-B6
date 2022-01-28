package com.noorteck.java.hw24;

/**
 * Write a method that takes an array of int parameter and return true if the
 * array contains value 2 twice, or value 5 twice
 * 
 * @author chefa
 *
 */
public class ArrayExerciseSix {

	protected static boolean checkNum(int[] number) {
		boolean result = false;
		int totalTwos = 0;
		int totalFives = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == 2) {
				totalTwos += 1;
			} else if (number[i] == 5) {
				totalFives +=1;
			}
			if (totalTwos == 2 || totalFives == 2) {
				result = true;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] n1 = {6, 1, 2, 3};
		int[] n2 = {13, 2, 3, 4, 6, 1, 2, 3};
		int[] n3 = {3, 3, 0, 1, 4, 3, 6};
		int[] n4 = {2, 6, 2};
		
		boolean resultOne = checkNum(n1);
		boolean resultTwo = checkNum(n2);
		boolean resultThree = checkNum(n3);
		boolean resultFour = checkNum(n4);
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}
}
