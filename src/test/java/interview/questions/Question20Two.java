package interview.questions;

public class Question20Two {

	/**
	 * 	20. Write a java program to find second largest number in an integer array?
	 */
	
	// method that returns an int value
	public static int secondLargest(int[] array) {
		// local variables for the largest number and the result
		int largest = 0;
		int result = 0;
		
		// iterate through the array to find the largest number
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		// iterate through the array to find the largest number that is not the largest number
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > result && array[i] != largest) {
				result = array[i];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] array = {1, 3, 5, 2, 3, 9, 6};
		int result = secondLargest(array);
		System.out.println("Second Largest Number: " + result);
		
	}
	
}
