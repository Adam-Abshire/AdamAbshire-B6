package com.noorteck.java.hw19;

/**
 * write a method that takes two String parameters if last character of strOne
 * is the same as the first character of strTwo - remove the last character from
 * strOne concatenate strTwo onto strOne if the
 * 
 * @author chefa
 *
 */
public class Question16 {

	String concatString(String strOne, String strTwo) {
		String result = "";
		// use charAtIndex() method to determine if the last character of strOne and the
		// first character of strTwo are the same
		int lastIndex = strOne.length() - 1;
		if (strOne.charAt(lastIndex) == strTwo.charAt(0)) {
			// delete the last character of strOne before concatenating
			String newString = strOne.substring(0, lastIndex) + strOne.substring(lastIndex + 1);
			result = newString.concat(strTwo);
		} else {
			// else concatenate them together normally
			result = strOne.concat(strTwo);
		}

		return result;
	}

	public static void main(String[] args) {
		Question16 obj = new Question16();
		System.out.println(obj.concatString("java", "awesome"));
		System.out.println(obj.concatString("food", "door"));
		System.out.println(obj.concatString("java", "training"));
		System.out.println(obj.concatString("Pro", "ogress"));
	}

}
