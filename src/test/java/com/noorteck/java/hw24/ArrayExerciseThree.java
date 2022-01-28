package com.noorteck.java.hw24;

/**
 * Write a method that takes an array of int parameter and return the sum of all
 * the elements
 * 
 * @author chefa
 *
 */
public class ArrayExerciseThree {

	public static int getTotal(int[] number) {
		int result = 0;
		for ( int i = 0; i < number.length; i++) {
			result += number[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] n1 = {6, 1, 2, 3};
		int[] n2 = {13, 6, 1, 2, 3};
		int[] n3 = {0, 1, 4, 3, 6};
		int[] n4 = {0, 6, 0};
		
		int result1 = getTotal(n1);
		int	result2 = getTotal(n2);
		int result3 = getTotal(n3);
		int result4 = getTotal(n4);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
