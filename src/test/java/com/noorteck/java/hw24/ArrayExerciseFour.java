package com.noorteck.java.hw24;
/**
 * Write a method that takes an array of int parameter and return a new array of
 * int containing the first element and last element from the original array
 * 
 * @author chefa
 *
 */
public class ArrayExerciseFour {

	int[] getFirstLast(int[] number) {
		int[] result = {number[0], number[number.length-1]};
		return result;
	}
	
	public static void main(String[] args) {
		ArrayExerciseFour obj = new ArrayExerciseFour();
		
		int[] n1 = {6, 1, 2, 3};
		int[] n2 = {13, 6, 1, 2, 3};
		int[] n3 = {0, 1, 4, 3, 6};
		int[] n4 = {0, 6, 0};
		
		int[] result1 = obj.getFirstLast(n1);
		int[] result2 = obj.getFirstLast(n2);
		int[] result3 = obj.getFirstLast(n3);
		int[] result4 = obj.getFirstLast(n4);
		
		obj.display(result1);
		obj.display(result2);	
		obj.display(result3);
		obj.display(result4);	
		
	}
	
	void display(int[] array) {
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
		System.out.println("********");
	}
}
