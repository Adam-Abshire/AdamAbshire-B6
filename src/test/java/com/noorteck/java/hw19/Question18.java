package com.noorteck.java.hw19;

/**
 * write a method that takes two string parameters the method append them
 * together and return the result if the strings are different lengths, omit
 * chars from the beginning of longer string and make them equal length
 * 
 * @author chefa
 *
 */

public class Question18 {

	public String getNewStr(String strOne, String strTwo) {
		String result = "";
		if (strOne.length() == strTwo.length()) {
			// if string lengths are equal - append them together
			result = strOne.concat(strTwo);

		} else if (strOne.length() > strTwo.length()) {
			// if String One is Larger - omit characters from beginning of String One until
			// lengths are equal
			// then append them together
			int length = strTwo.length();
			result = strOne.substring(strOne.length() - length).concat(strTwo);

		} else {
			// if String One is smaller - omit characters from beginning of String Two until
			// lengths are equal
			// then append them together
			int length = strOne.length();
			result = strOne.concat(strTwo.substring(strTwo.length() - length));

		}
		return result;
	}

	public static void main(String[] args) {
		Question18 obj = new Question18();
		System.out.println(obj.getNewStr("Welcome", "home"));
		System.out.println(obj.getNewStr("Java", "door"));
		System.out.println(obj.getNewStr("cooking", "pasta"));
		System.out.println(obj.getNewStr("Pro", "gress"));
	}

}
