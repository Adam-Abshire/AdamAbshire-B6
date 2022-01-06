package com.noorteck.java.hw11;

public class DoubleTotal {
	public static void main(String[] args) {
		int myTotal = sumDouble(2, 2);
		System.out.println(myTotal);
		System.out.println(sumDouble(1, 3));
		System.out.println(sumDouble(14, 20));
		System.out.println(sumDouble(13, 13));
		System.out.println(sumDouble(0, 0));
		System.out.println(sumDouble(-3, -5));
		System.out.println(sumDouble(-4, 5));
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
