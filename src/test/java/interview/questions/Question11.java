package interview.questions;
import java.util.HashMap;

public class Question11 {

	/**
	 * 		11. Write a java program to check whether two strings are anagram or not?
				a. If two strings contain same set of characters but in different order, then the two
				strings are called anagrams
	 */
	
	// method that returns boolean expression
	// compares two strings to see if they contain the same amounts of the same characters
	public static boolean isAnagram(String stringOne, String stringTwo) {
		
		// checks to see if its the same exact word
		// an exact match is not an anagram - returns false
		if (stringOne.equalsIgnoreCase(stringTwo)) {
			return false;
			// checks if the amount of characters is the same
			// if the amount of characters is different it cannot be an anagram
		} else if (stringOne.length() != stringTwo.length()) {
			return false;
		} else {
			// two Map objects are created to hold the key (each unique character) and Integer (number
			// of occurences of that character
			HashMap<Character, Integer> characterMapOne = new HashMap<Character, Integer>();
			HashMap<Character, Integer> characterMapTwo = new HashMap<Character, Integer>();
			
			// loop through the 1st given String
			for (int i = 0; i < stringOne.length(); i++) {
				char key = stringOne.charAt(i);
				// if Map object contains the key increase the value by 1
				if (characterMapOne.containsKey(key)) {
					int counter = characterMapOne.get(key);
					characterMapOne.put(key, counter + 1);
					// if Map object does not contain the key -- add the key and set value to 1
				} else {
					characterMapOne.put(key, 1);
				}
			}
			
			// same logic for second String -- add entries to 2nd Map object
			for (int i = 0; i < stringTwo.length(); i++) {
				char key = stringTwo.charAt(i);

				if (characterMapTwo.containsKey(key)) {
					int counter = characterMapTwo.get(key);
					characterMapTwo.put(key, counter + 1);
				} else {
					characterMapTwo.put(key, 1);
				}
			}
			// if the entrySet for  Map object 1 is the same as Map object 2 return true
			if (characterMapOne.equals(characterMapTwo)) {
				return true;
			}

		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
		boolean resultOne = isAnagram("hellho", "llheoh");
		System.out.println(resultOne);
		
		boolean resultTwo = isAnagram("what on earth", "htrae no thaw");
		System.out.println(resultTwo);
		
		boolean resultThree = isAnagram("hello", "whatl");
		System.out.println(resultThree);
		
		boolean resultFour = isAnagram("Tulip", "Tulip");
		System.out.println(resultFour);
	}
}
