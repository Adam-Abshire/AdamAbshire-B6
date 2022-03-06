package interview.questions;

public class Question12 {

	// 12. Write a java program to check if string is a palindrome or not?
	
	// method that returns boolean value
	public static boolean isPalindrome(String string) {
		// checks if String is empty
		// if it's empty returns false
		if(string == "") {
			return false;
		}
		
		// loops through given String and removes spaces -- places new value on newString
		String newString = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ' ') {
				continue;
			} else {
				newString += string.charAt(i);
			}
		}
		// loops through half of the length our newString
		for (int i = 0; i <= (newString.length() / 2); i++) {
						
			// if the characters opposite each other do not match returns false
			if (newString.charAt(i) != newString.charAt(newString.length() - 1 - i)) {
				return false;
			} 
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		boolean resultOne = isPalindrome("racecar"); // true
		boolean resultTwo = isPalindrome("hheehh"); // true
		boolean resultThree = isPalindrome("helloo"); // false
		boolean resultFour = isPalindrome(""); // false
		boolean resultFive = isPalindrome("never odd or even"); // true
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
		System.out.println(resultFive);
	}
}
