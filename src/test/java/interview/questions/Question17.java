package interview.questions;

public class Question17 {

	
	// 17. Write a java program to check if two arrays are equal or not?
	
	// method that returns a boolean value
	public static boolean isEqual(String[] stringOne, String[] stringTwo) {
		// if the given Strings have different lengths - then they are not equal
		if (stringOne.length != stringTwo.length) {
			return false;
		}
		// loop set to go from 0 to given string lengths
		for (int i = 0; i < stringOne.length; i++) {
			// compare each string to see if they are equal
			if (stringOne[i] != stringTwo[i]) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		String[] arrayOne = {"Adam", "MD", "Addy", "Abdul"};
		String[] arrayTwo = {"Adam", "MD", "Addy", "Abdul"};
		String[] arrayThree = {"Saidal", "Shahid", "Jawad"};
		String[] arrayFour = {"Saidal", "Shahid", "Jawad"};
		String[] arrayFive = {"MD", "Adam", "Abdul", "Addy"};
		
		boolean result = isEqual(arrayOne, arrayTwo);
		boolean resultTwo = isEqual(arrayOne, arrayThree);
		boolean resultThree = isEqual(arrayThree, arrayFour);
		boolean resultFour = isEqual(arrayOne, arrayFive);
		
		System.out.println(result); // true
		System.out.println(resultTwo); // false
		System.out.println(resultThree); // true
		System.out.println(resultFour); // false
	}
}
