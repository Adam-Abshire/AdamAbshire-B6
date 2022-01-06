package com.noorteck.java.hw11;

public class Subtraction {
	public static void main(String[] args) {
		int diffTotal = difference21(19);
		System.out.println("19 - 21 = " + diffTotal);
		System.out.println("10 - 21 = " + difference21(10));
		System.out.println("(30 - 21) * 2 = " + difference21(30));
		System.out.println("21 - 21 = " + difference21(21));
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
