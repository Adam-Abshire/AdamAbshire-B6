package interview.questions;

public class Question01 {

	/**
	 * 	write a Java program to reverse a given String
	 */
	
	// create method that returns the reversed String
	public static String reverseString(String string) {
		// newString is a blank String to work with
		String newString = "";
		
		// loop through the given String backwards and concatinate each character onto the newString
		for(int i = string.length() - 1; i >= 0; i--) {
			newString = newString + string.charAt(i);
		}
		// return the reversed value
		return newString;
	}
	
	
	public static void main(String[] args) {
		
		String reversed = reverseString("Java Program");
		System.out.println(reversed);
		
	}
}
