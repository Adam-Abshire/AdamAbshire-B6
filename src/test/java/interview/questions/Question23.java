package interview.questions;

public class Question23 {

	/**
	 * 	23. Write a java program to get the sum total of int array?
	 */
	
	// method that returns an int value
	public static int total(int[] array) {
		
		int result = 0;
		// iterate through array and add each element to the total (result)
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		
		int[] array = {5, 3, 2, 19, 15, 3, 8, 10, 7};
		int result = total(array);
		System.out.println(result);
		
	}
	
}
