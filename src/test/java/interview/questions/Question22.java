package interview.questions;

public class Question22 {
	
	/**
	 * 	22. Write a program to find the number of even and odd integers in a given array?
	 */
	
	public static int[] evenOdd(int[] array) {
		
		int[] result = new int[2];
		int evens = 0;
		int odds = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evens += 1;
			} else {
				odds += 1;
			}
		}
		
		result[0] = evens;
		result[1] = odds;
		return result;
		
	}
	
	public static void main(String[] args) {
		
		int[] array = {5, 3, 2, 19, 15, 3, 8, 10, 7};
		int[] result = evenOdd(array);
		
		System.out.println("Number of Evens: " + result[0]);
		System.out.println("Number of Odds: " + result[1]);
	}

}
