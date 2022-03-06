package interview.questions;

public class Question15 {
	
	// 15. Write a java program to find sum of all digits of a number?
	
	
	// method that takes 1 integer and adds the digits together
	public static int addDigits(int integer) {
		
		// convert int value to String
		String num = "" + integer;
		// count is the value that will be returned
		int count = 0;
		
		// loop through the String
		for (int i = 0; i < num.length(); i++) {
			// get the value at given index
			char value = num.charAt(i);
			// using wrapper method, convert to Integer
			// valueOf(char) method is how to get the actual value
			Integer number = new Integer(String.valueOf(value));
			// add each number to int count
			count += number;
		}
		// return count
		return count;
	}
	
	public static void main(String[] args) {
		int result = addDigits(145);
		System.out.println(result);
		
		int resultTwo = addDigits(454545);
		System.out.println(resultTwo);
		
		int resultThree = addDigits(0000);
		System.out.println(resultThree);
	}

}
