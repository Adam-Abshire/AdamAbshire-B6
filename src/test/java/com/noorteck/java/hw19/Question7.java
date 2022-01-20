package com.noorteck.java.hw19;

/**
 * write a method that takes on String parameter (name) the method returns a new
 * String value appending the name parameter to "Hello"
 * 
 * @author chefa
 *
 */
public class Question7 {

	String helloTo(String strOne) {
		String result = " ";
		// create greeting
		String greeting = "Hello";
		// concatenate a space and then concatenate the name after the greeting
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
