package interview.questions;

public class Question07 {

	// 7. Write a java program to remove all the spaces exist in the String?
	
	// create method that returns String value
	public static String removeSpaces(String string) {
		// String that will be returned
		// starts off empty
		String newString = "";
		// loop through the given String
		for (int i = 0; i < string.length(); i++) {
			// if the character at the given index is a space -- skip
			if (string.charAt(i) == ' ') {
				continue;
			} else {
				// if the character is not a space -- concatinate onto newString
				newString += string.charAt(i);
			}
		}
		// return newString
		return newString;
	}
	
	public static void main(String[] args) {
		
		String result = removeSpaces("P r o gr  a   mm i n  g  ");
		System.out.println(result);
		
		String resultTwo = removeSpaces("");
		System.out.println(resultTwo);
		
		String resultThree = removeSpaces("Program");
		System.out.println(resultThree);
		
	}
}
