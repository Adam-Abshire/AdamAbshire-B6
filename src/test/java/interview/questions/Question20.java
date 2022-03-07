package interview.questions;
import java.util.TreeSet;

public class Question20 {
	
	/**
	 * 	20. Write a java program to find second largest number in an integer array?
	 */
	
	// method that returns an int value
	public static int secondLargest(int[] array) {
		
		// TreeSet used so that the numbers are stored in ascending order
		TreeSet<Integer> numSet = new TreeSet<Integer>();
		int result;
		
		for (int i = 0; i < array.length; i++) {
			numSet.add(array[i]);
		}
		// result = 2nd to last number
		result = numSet.floor(numSet.last()-1);
		return result;
		
	}
	
	public static void main(String[] args) {
		int[] array = {1, 3, 5, 2, 3, 9, 6};
		int result = secondLargest(array);
		System.out.println(result);
	}

}
