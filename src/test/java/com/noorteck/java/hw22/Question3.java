package com.noorteck.java.hw22;

/**
 * write a method that takes three parameters. One String parameter, 2 character
 * parameters. The method replaces old character (parameter 2) from String
 * parameter with new character (parameter 3) and returns the new String
 * 
 * @author chefa
 *
 */
public class Question3 {

	protected String threeEqual(String str, char oldChar, char newChar) {
		// check to see if String is null
		if(str == null) {
			// return null if it is
			return null;
			// check to see if the 1st character is equal to the oldChar
		} else if (str.charAt(0) == oldChar) {
			// if it is update String to replace newCharacter for oldCharacter
			str = newChar + str.substring(1, str.length());
			// if String != null && String[0] != oldCharacter
		} else {
			// loop through the rest of the indices
			for (int i = 0; i < str.length(); i++) {
				// check each index for the oldCharacter
				if (str.charAt(i) == oldChar) {
					// update String with the newCharacter replacing the oldCharacter
					str = str.substring(0, i) + newChar + str.substring(i+1, str.length());
				}
			}
		}
		// return the updated String
		return str;
	}

	public static void main(String[] args) {
		Question3 obj = new Question3();

		String resultOne = obj.threeEqual(null, 'P', 'B');
		String resultTwo = obj.threeEqual("Java Pro", 'P', 'B');
		String resultThree = obj.threeEqual("Lazy mode", 'm', 'C');
		String resultFour = obj.threeEqual("Training", 'T', ' ');

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}
}
