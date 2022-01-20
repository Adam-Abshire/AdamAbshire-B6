package com.noorteck.java.hw19;

/**
 * write a method that takes a string parameter and return true if the string
 * parameter ends in "ng"
 * 
 * @author chefa
 *
 */
public class Question17 {

	public boolean endsWithNG(String strOne) {
		boolean result = false;
		// check to see if the string ends in the characters ng
		// using endsWith() method
		if (strOne.endsWith("ng")) {
			return true;
		}
		return result;
	}

	public static void main(String[] args) {
		Question17 obj = new Question17();
		System.out.println(obj.endsWithNG("I like to practice"));
		System.out.println(obj.endsWithNG("Everyone is practicing"));
		System.out.println(obj.endsWithNG("I am studying"));
	}
}
