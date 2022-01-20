package com.noorteck.java.hw19;

/**
 * write a method that takes a String parameter. Check if the first or last
 * characters in the String parameter are 't' return the string with those 't'
 * otherwise return the string unchanged
 * 
 * @author chefa
 *
 */
public class Question20 {

	public static String removeT(String strOne) {
		String result = "";
		// create an array to compare indices 
		char[] charArray = strOne.toCharArray();
		// see if first and last character are t's
		if ((charArray[0] == 't' || charArray[0] == 'T') && charArray[charArray.length - 1] == 't'
				|| charArray[charArray.length - 1] == 'T') {
			// delete both beginning and ending character
			result = strOne.substring(1, strOne.length() - 1);
			
			// see if first character has a t
		} else if(charArray[0] == 't' || charArray[0] == 'T') {
			// delete beginning character
			result = strOne.substring(1);
			
			// see if the last character has a t
		} else if(charArray[charArray.length - 1] == 't' || charArray[charArray.length - 1] == 'T') {
			// delete ending character
			result = strOne.substring(0, strOne.length()-1);
			
		} else {
			// keep the same if there are no beginning or ending t's
			result = strOne;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(removeT("Test Data"));
		System.out.println(removeT("Testcricket"));
		System.out.println(removeT("I am studying"));
		System.out.println(removeT("ends int"));
	}
}
