package com.noorteck.java.hw20;

/**
 * write a method to replace each substring of a given string that matches the
 * given regular expression with the given replacement the method takes 3 String
 * parameters and replaces oldStr (parameter 2) from strOne (parameter 1) with
 * newStr (parameter 3) and prints the new value
 * 
 * @author chefa
 *
 */
public class Question12 {

	public static void replaceStr(String strOne, String oldStr, String newStr) {
		String result = "";
		// convert String to text array using text.split() method
		String[] textArray = strOne.split(" ");
		// using if statement - find if the oldStr matches newStr
		for (int i = 0; i < textArray.length; i++) {
			if (textArray[i].equals(oldStr)) {
				// update oldStr with newStr at that index
				textArray[i] = newStr;
			} else {
				continue;
			}
		}
		// concatenate the String back together from the String Array
		for (int j = 0; j < textArray.length; j++) {
			result = result.concat(textArray[j]).concat(" ");
		}
		// gets rid of the blank space at the end, using trim() method
		result = result.trim();
		// print out the new String
		System.out.println(result);
	}

	public static void main(String[] args) {
		replaceStr("I cannot do it", "cannot", "can"); // will replace cannot with can
		replaceStr("Tomorrow is my day", "Tomorrow", "Today"); // will replace Tomorrow with Today
	}
}
