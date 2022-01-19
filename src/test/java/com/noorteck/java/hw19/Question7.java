package com.noorteck.java.hw19;

public class Question7 {

	String helloTo(String strOne) {
		String result = " ";
		String greeting = "Hello";
		result = greeting.concat(" ").concat(strOne);
		return result;
	}

	public static void main(String[] args) {
		Question7 obj = new Question7();
		System.out.println(obj.helloTo("Denis"));
		System.out.println(obj.helloTo("Malek"));
		System.out.println(obj.helloTo("Sara"));
	}

}
