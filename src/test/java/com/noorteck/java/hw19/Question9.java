package com.noorteck.java.hw19;

public class Question9 {

	private boolean isThere(String strOne, String value) {
		boolean result = false;
		result = strOne.contains(value);
		return result;
	}

	public static void main(String[] args) {
		Question9 obj = new Question9();
		System.out.println(obj.isThere("java training", "ini"));
		System.out.println(obj.isThere("java training", "ava"));
		System.out.println(obj.isThere("java training", "AVA"));
		System.out.println(obj.isThere("java training", "Java"));
	}

}
