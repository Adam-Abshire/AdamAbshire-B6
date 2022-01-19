package com.noorteck.java.hw19;

public class Question10 {

	boolean isEndWith(String strOne, String strTwo) {
		boolean result = false;
		if (strOne.endsWith(strTwo)) {
			return true;
		}
		return result;
	}

	public static void main(String[] args) {
		Question10 obj = new Question10();
		System.out.println(obj.isEndWith("java training", "ing"));
		System.out.println(obj.isEndWith("java training", "ng"));
		System.out.println(obj.isEndWith("java training", "java"));
		System.out.println(obj.isEndWith("java training", "train"));
	}

}
