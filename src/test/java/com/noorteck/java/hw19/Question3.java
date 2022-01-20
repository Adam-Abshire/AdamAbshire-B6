package com.noorteck.java.hw19;

/**
 * compares the length of two Strings if they are equal length it concatenates
 * the two Strings w/o a space in between if strOne is greater - i converts all
 * characters in the String to upper case and prints the value if strTwo is
 * greater - it converts all characters in the String to lower case and prints
 * the value after each - you will print a space and the length of the String
 */
public class Question3 {

	public static void isEqualLength(String strOne, String strTwo) {
		// sees if the lengths of strOne & strTwo are Equal
		if (strOne.length() == strTwo.length()) {
			// concatenates strTwo to strOne via concat() method - value stored in newStr
			String newStr = strOne.concat(strTwo);
			// prints out newStr + length
			System.out.println(newStr + " " + newStr.length());
			// sees if the length of strOne is less than strTwo
		} else if (strOne.length() > strTwo.length()) {
			// if true, converts strOne all to upper case and prints along with String
			// Length
			System.out.println(strOne.toUpperCase() + " " + strOne.length());
			// if prior if statements are not met, then strOne is less than strTwo by
			// default
		} else {
			// converts all characters in strTwo to lower case and prints the length of
			// strTwo
			System.out.println(strTwo.toLowerCase() + " " + strTwo.length());
		}
	}

	public static void main(String[] args) {
		isEqualLength("Pro", "Ali");
		isEqualLength("java", "LearNinG");
		isEqualLength("java training", "java");
	}
}
