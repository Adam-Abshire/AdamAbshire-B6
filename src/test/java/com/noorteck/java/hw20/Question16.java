package com.noorteck.java.hw20;

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
		// create variable to be equal to the last index of given String
		int lastIndex = strOne.length() - 1;
		// see if last character of strOne & first character of strTwo are the same
		if (strOne.charAt(lastIndex) == strTwo.charAt(0)) {
			// delete the last character of strOne before concatenating
			strOne = strOne.substring(0, lastIndex);
			strOne = strOne.concat(strTwo);
		} else {
			// else concatenate them together normally
			strOne = strOne.concat(strTwo);
		}
		return strOne;
	}

	public static void main(String[] args) {
		Question16 obj = new Question16();

		String resultOne = obj.concatString("java", "awesome");
		String resultTwo = obj.concatString("food", "door");
		String resultThree = obj.concatString("java", "training");
		String resultFour = obj.concatString("Pro", "ogress");

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}

}
