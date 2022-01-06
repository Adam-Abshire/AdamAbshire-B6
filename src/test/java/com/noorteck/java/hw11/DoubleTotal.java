package com.noorteck.java.hw11;

public class DoubleTotal {
	public static void main(String[] args) {
		int myTotal = sumDouble(2, 2);
		System.out.println("(2 + 2) * 2 = " + myTotal);
		System.out.println("1 + 3 = " + sumDouble(1, 3));
		System.out.println("14 + 20 = " + sumDouble(14, 20));
		System.out.println("(13 + 13) * 2 = " + sumDouble(13, 13));
		System.out.println("(0 + 0) * 2 = " + sumDouble(0, 0));
		System.out.println("-3 + -5 = " + sumDouble(-3, -5));
		System.out.println("-4 + 5 = " + sumDouble(-4, 5));
	}

	public static int sumDouble(int valueOne, int valueTwo) {
		int result = 0;
		if (valueOne == valueTwo) {
			result = (valueOne + valueTwo) * 2;
		} else {
			result = valueOne + valueTwo;
		}
		return result;
	}
}
