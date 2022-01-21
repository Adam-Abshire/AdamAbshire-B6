package com.noorteck.java.hw20;

/**
 * write a method that takes three parameters one String parameter and 2 Char
 * parameters The method replaces old characer (parameter 2) from String
 * parameter with new character (parameter 3) and returns the new String
 * 
 * @author chefa
 *
 */
public class Question11 {

	protected String threeEqual(String str, char oldChar, char newChar) {
		String result = " ";
		// find index of old character
		int indexOfOldChar = str.indexOf(oldChar);	
		// convert String to character array
		char[] strArray = str.toCharArray();
		// update the array to replace oldChar w/ newChar
		strArray[indexOfOldChar] = newChar;
		// turn char array back into a String
		result = new String(strArray);
		// return new string value
		return result;
	}

	public static void main(String[] args) {
		Question11 obj = new Question11();
		
		String resultOne = obj.threeEqual("Java Pro", 'P', 'B');
		String resultTwo = obj.threeEqual("Lazy Mode", 'M', 'C');
		String resultThree = obj.threeEqual("Training", 'T', ' ');
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
	}

}
