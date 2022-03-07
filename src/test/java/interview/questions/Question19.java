package interview.questions;

public class Question19 {
	
	/**
	 * 19. Write a java program to reverse an int Array in java?
	 */
	
	// method that returns an int array and takes an int array Parameter
	public static int[] reverseArray(int[] array) {
		
		// create new int array with size of the given array's length
		int[] result = new int[array.length];
		// iterate through the array
		for (int i = 0; i < array.length; i++) {
			// add the elements in reverse order
			result[i] = array[array.length-1-i];
		}
		// return new array
		return result;
		
	}
	
	public static void main(String[] args) {
		int[] arrayOne = {1, 2, 3, 4, 5};
		int[] result = reverseArray(arrayOne);
		
		for (int i = 0; i < result.length; i++) {
			if (i == result.length-1) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}
	}

}
