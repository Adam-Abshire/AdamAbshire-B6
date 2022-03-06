package interview.questions;
import java.util.ArrayList;

public class Question05 {

	// 5. Write a java program to remove duplicate character from String?
	
	// create method that returns String without duplicates
	public static String removeDuplicate(String string) {
		// created ArrayList object to add each character from the given String
		ArrayList<Character> characterList = new ArrayList<Character>();
		// created newString object with empty value
		String newString = "";
		
		// loop through given String
		for (int i = 0; i < string.length(); i++) {
			char value = string.charAt(i);
			// if the ArrayList object does not contain the given value
			if (!characterList.contains(value)) {
				// add the value to the ArrayList object
				characterList.add(value);
				// concatinate each unique value to the end of the returning String
				newString = newString + string.charAt(i);
			}
		}
		// return the String
		return newString;
		
	}
	
	public static void main(String[] args) {
		String result = removeDuplicate("ssssooommmmeeettthhhiiinnnggg");
		System.out.println(result);
		
		String resultTwo = removeDuplicate("somesthing");
		System.out.println(resultTwo);
	}
}
