package com.noorteck.java.hw19;

public class Question20Two {

	public static String removeT(String strOne) {
		String result = "";
		if ((strOne.endsWith("t") || strOne.endsWith("T")) && (strOne.startsWith("t") || strOne.startsWith("T"))) {
			result = strOne.substring(1, strOne.length() -1);
		} else if (strOne.startsWith("t") || strOne.startsWith("T")) {
			result = strOne.substring(1, strOne.length());
		} else if (strOne.endsWith("t") || strOne.endsWith("T")) {
			result = strOne.substring(0, strOne.length()-1);
		} else {
			result = strOne;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String resultOne = removeT("Test Data");
		String resultTwo = removeT("Testcricket");
		String resultThree = removeT("I am studying");
		String resultFour = removeT("Stat");
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}
}
