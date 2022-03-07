package interview.questions;

public class Question21 {
	
	/**
	 * 	21. Write a java program to find smallest number and largest number in an array?
	 */
	
	// method that turns int array
	public static int[] smallestAndLargest(int[] array){
		
		// result local variable && starting points for int values
		int[] result = new int[2];
		result[0] = array[0];
		result[1] = array[0];
		// iterate through array to find smallest number place in result[0]
		// AND find largest number place in result[1]
		for (int i = 0; i < array.length; i++) {
			if (array[i] < result[0]) {
				result[0] = array[i];
			} else if (array[i] > result[1]) {
				result[1] = array[i];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] array = {5, 3, 2, 19, 15, 3, 8, 10, 7};
		int[] result = smallestAndLargest(array);
		for (Integer numbers : result) {
			System.out.println(numbers);
		}
	}

}
