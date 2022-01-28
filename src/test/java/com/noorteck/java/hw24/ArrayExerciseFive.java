package com.noorteck.java.hw24;

/**
 * Write a method that takes an array of int parameter and return a new array
 * with double the size/length, where its last element value is the same as the
 * original array last element, and all the other element values are 0
 * 
 * @author chefa
 *
 */
public class ArrayExerciseFive {

	private int[] getDouble(int[] number) {
		int[] result = new int[number.length*2];
		for (int i = 0; i < result.length; i++) {
			if (i == result.length-1) {
				result[i] = number[number.length-1];
			} else {
				result[i] = 0;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		ArrayExerciseFive obj = new ArrayExerciseFive();
		
		int[] n1 = {6, 1, 2, 3};
		int[] n2 = {13, 3};
		int[] n3 = {0, 1, 4};
		int[] n4 = {6};
		
		int[] resultOne = obj.getDouble(n1);
		int[] resultTwo = obj.getDouble(n2);
		int[] resultThree = obj.getDouble(n3);
		int[] resultFour = obj.getDouble(n4);
		
		obj.display(resultOne);
		obj.display(resultTwo);
		obj.display(resultThree);
		obj.display(resultFour);
		
	}
	
	void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("***************");
	}
}
