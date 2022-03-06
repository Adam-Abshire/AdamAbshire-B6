package interview.questions;

public class Question08 {

	// 8. Write a java program to remove specific characters in the String?
	
	// create method that returns String value
	public static String removeCharacters(char charOne, char charTwo, String string) {
		// create String object -- empty value
		String newString = "";
		// loop through given String
		for (int i = 0; i < string.length(); i++) {
			// if the character at given index is given character - skip
			if (string.charAt(i) == charOne || string.charAt(i) == charTwo) {
				continue;
			}
			else {
				// if the character is not one of the given characters - concatinate onto newString
				newString += string.charAt(i);
			}
		}
		// return newString
		return newString;
	}
	
	
	public static void main(String[] args) {
		
		String result = removeCharacters('m', 'J', "Java Programming");
		System.out.println(result);
		
		String resultTwo = removeCharacters('g', 'r', "Java Programming");
		System.out.println(resultTwo);
	}
}
