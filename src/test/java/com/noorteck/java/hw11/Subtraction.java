package com.noorteck.java.hw11;

public class Subtraction {
	public static void main(String[] args) {
		int diffTotal = difference21(19);
		System.out.println(diffTotal);
		System.out.println(difference21(10));
		System.out.println(difference21(30));
		System.out.println(difference21(21));
	}

	public static int difference21(int number) {
		int result = 0;
		if (number > 21) {
			result = (number - 21) * 2;
		} else {
			result = number - 21;
		}
		return result;
	}
}
