package com.noorteck.java.hw19;

public class Question12 {

	public static void replaceStr(String strOne, String oldStr, String newStr) {
		String result = "";
		// convert String to text array using text.split() method
		String[] textArray = strOne.split(" ");
		// using if statement - find the oldStr that matches newStr
		for (int i = 0; i < textArray.length; i++) {
			if (textArray[i].equals(oldStr)) {
				// update oldStr with newStr at that index
				textArray[i] = newStr;
			} else {
				textArray[i] = textArray[i];
			}
		}		
		// convert text array to String
		for (int i = 0; i < textArray.length; i++) {
			result.concat(textArray[i]).concat(" ");
		}
		// print new String value
		System.out.println(result);
	}

	public static void main(String[] args) {
		replaceStr("I cannot do it", "cannot", "can");
		replaceStr("Tomorrow is my day", "Tomorrow", "Today");
	}
}
