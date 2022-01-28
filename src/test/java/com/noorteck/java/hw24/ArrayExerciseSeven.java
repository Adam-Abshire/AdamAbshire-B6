package com.noorteck.java.hw24;

/**
 * Write a method that takes 2 parameters. an array of int parameter and integer
 * paramete. find the index number of an array element. check if an array has
 * the element value passed as 2nd parameter. if it contains return the index
 * number of that element otherwise return -1
 * 
 * @author chefa
 *
 */
public class ArrayExerciseSeven {

	public static int getIndexNumber(int[] number, int elementValue) {
		int result = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == elementValue) {
				result = i;
				break;
			} else {
				result = -1;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] n1 = {88, 22, 6, 1, 2, 3, 88, 22, 44, 33};
		int[] n2 = {1, 2, 3, 22, 44, 33};
		int[] n3 = {88, 22, 6, 1, 8, 0};
		int[] n4 = {2, 3, 88, 22, 44};
		
		int resultOne = getIndexNumber(n1, 3);
		int resultTwo = getIndexNumber(n2, 12);
		int resultThree = getIndexNumber(n3, 22);
		int resultFour = getIndexNumber(n4, 44);
		
		System.out.println("Index: " + resultOne);
		System.out.println("Index: " + resultTwo);
		System.out.println("Index: " + resultThree);
		System.out.println("Index: " + resultFour);
	}
}
