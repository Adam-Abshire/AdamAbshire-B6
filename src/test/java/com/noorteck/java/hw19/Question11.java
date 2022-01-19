package com.noorteck.java.hw19;

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
		System.out.println(obj.threeEqual("Java Pro", 'P', 'B'));
		System.out.println(obj.threeEqual("Lazy mode", 'm', 'C'));
		System.out.println(obj.threeEqual("Training", 'T', ' '));
	}

}